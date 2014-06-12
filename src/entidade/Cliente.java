    /*Esse arquivo é protegido por leis de copyright internacional, locais e pela lei de Deus, afinal, 
 só Deus sabe como essa merda funciona
 Não apagar dessa linha pra baixo*/
package entidade;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import persistencia.BD;

/**
 *
 * @author MARCOANTONIO
 */
public class Cliente extends FichaCadastro {

    /* Inicio dos métodos para manipulação do BD.
     ============================================================================================================================================================
     */
    public static ArrayList<Visão> getCidades(String uf) {
        String sql = "SELECT NOME from cidade_vila where UF='"+uf+"'"
                + "ORDER BY 1";
        ResultSet lista_resultados = null;
        ArrayList<Visão> cidades = new ArrayList<Visão>();
        try {
            lista_resultados = BD.comando.executeQuery(sql);
            while (lista_resultados.next()) {
                cidades.add(new Visão(lista_resultados.getString("NOME")));
            }
            lista_resultados.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return cidades;
    }

    //Retorna null se sucesso ou mensagem do SQLException caso caia na excessão
    public static String inserirCliente(Cliente cliente) {
        DateFormat dn = new SimpleDateFormat("yyyy-MM-dd");//Formata data para o formato Mysql
        String sql = "INSERT INTO clientes(nome_cliente,data_cadastro_cliente,"
                + "tipo_cliente,n_documento_cliente,sexo,endereco_cliente,numero_cliente,"
                + "bairro_cliente,cep_cliente,telefone_cliente,estado_cliente,cidade_cliente,email_cliente)VALUES"
                + "('" + cliente.getNome().toUpperCase() + "','" + dn.format(Date.parse(cliente.getData_cadastro())) + "','" + cliente.getTipo_cliente() + "','"
                + cliente.getN_documento() + "','" + cliente.getSexo() + "','" + cliente.getEndereço().toUpperCase() + "',"
                + cliente.getNumero() + ",'" + cliente.getBairro().toUpperCase() + "','" + cliente.getCep() + "','" + cliente.getTelefone() + "','"
                + cliente.getEstado() + "','" + cliente.getCidade().toUpperCase() + "','" + cliente.getEmail().toUpperCase() + "')";
        //dn.format(Date.parse(cliente.getData_cadastro())) = converte data_cadastro para Date() e também para o formato de data do Mysql com a função format()
        try {
            BD.comando.executeUpdate(sql);
            return null;
        } catch (SQLException ex) {
            return "Erro de inserção no Banco de Dados:  " + ex.getMessage();
        }
    }

    //retorna objeto Cliente conforme parametro código, ou null se cair na excessão
    public static Cliente buscarCliente(int código) {
        DateFormat dn = new SimpleDateFormat("dd/MM/yyyy");//Formato da função format() para converter o formato Mysql para o usual no Brasil
        String sql = "SELECT * FROM clientes WHERE cod_cliente = '" + código + "'";
        ResultSet lista_resultados;
        Cliente cliente = null;
        try {
            lista_resultados = BD.comando.executeQuery(sql);
            while (lista_resultados.next()) {

                cliente = new Cliente(
                        lista_resultados.getString("tipo_cliente"),
                        lista_resultados.getString("sexo"),
                        lista_resultados.getInt("cod_cliente"),
                        lista_resultados.getInt("numero_cliente"),
                        lista_resultados.getString("nome_cliente"),
                        dn.format(lista_resultados.getDate("data_cadastro_cliente")).toString(),//Pega um Date() formata a data e coverte para String
                        lista_resultados.getString("n_documento_cliente"),
                        lista_resultados.getString("endereco_cliente"),
                        lista_resultados.getString("bairro_cliente"),
                        lista_resultados.getString("telefone_cliente"),
                        lista_resultados.getString("cep_cliente"),
                        lista_resultados.getString("estado_cliente"),
                        lista_resultados.getString("cidade_cliente"),
                        lista_resultados.getString("email_cliente"));
            }
            lista_resultados.close();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());
            cliente = null;
        }
        return cliente;
    }

    //retorna novo cod para inserir no BD (o maior codigo do cliente + 1), já convertido em String ou mensagem do SQLException caso caia na excessão
    public static String id() {
        String codigo = null;
        try {
            String sql = "select max(cod_cliente) from clientes;";
            ResultSet rs = (ResultSet) BD.comando.executeQuery(sql);
            while (rs.next()) {
                codigo = String.valueOf((rs.getInt(1) + 1));
            }
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return codigo;
    }

    //retorna objeto Cliente reduzido para ser mostrado na tabela ou mensagem do SQLException caso caia na excessão
    public static ArrayList<Cliente> visãoTabela() {
        SimpleDateFormat dn = new SimpleDateFormat("dd/MM/yyyy");//Formato da função format() para converter o formato Mysql para o usual no Brasil
        String sql = "Select cod_cliente,nome_cliente,n_documento_cliente,data_cadastro_cliente from clientes";
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();// Cria um ArrayList de Objetos Cliente
        try {
            ResultSet rs = BD.comando.executeQuery(sql);
            while (rs.next()) {//cria objeto com dados do cliente salvos no BD
                Cliente cliente = new Cliente(rs.getInt("cod_cliente"),
                        rs.getString("nome_cliente"),
                        dn.format(rs.getDate("data_cadastro_cliente")).toString(),
                        rs.getString("n_documento_cliente")
                );
                clientes.add(cliente);//adiciona objeto cliente no Array
            }
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
        return clientes;
    }

    //altera (Update) dados do cliente no BD
    public static String alterarCliente(Cliente clientes) {
        DateFormat dn = new SimpleDateFormat("yyyy-MM-dd");//Formata data para o formato Mysql
        String sql = "UPDATE clientes SET nome_cliente='" + clientes.getNome().toUpperCase()
                + "',data_cadastro_cliente='" + dn.format(Date.parse(clientes.getData_cadastro()))
                + "',tipo_cliente='" + clientes.getTipo_cliente() + "',n_documento_cliente='" + clientes.getN_documento()
                + "',email_cliente='" + clientes.getEmail().toUpperCase() + "',sexo='" + clientes.getSexo()
                + "',endereco_cliente='" + clientes.getEndereço().toUpperCase() + "',numero_cliente=" + clientes.getNumero()
                + ",bairro_cliente='" + clientes.getBairro().toUpperCase() + "',cep_cliente='" + clientes.getCep()
                + "',telefone_cliente='" + clientes.getTelefone() + "',estado_cliente='" + clientes.getEstado()
                + "',cidade_cliente='" + clientes.getCidade().toUpperCase() + "' WHERE cod_cliente=" + clientes.getCódigo() + ";";
        //.toUpperCase() para salvar os dados em maiusculo no BD
        try {
            BD.comando.executeUpdate(sql);
            return null;
        } catch (SQLException e) {
            return "Erro na alteração do Cliente no Banco de Dados\n" + e.getMessage();
        }
    }

    //Exclui linha Cliente conforme parametro código
    public static String eleminarCliente(int código) {
        String sql = "DELETE FROM clientes WHERE cod_cliente=" + código + ";";
        try {
            BD.comando.executeUpdate(sql);
            return null;
        } catch (SQLException ex) {
            return "Erro na Remoção do Cliente no Banco de Dados\n" + ex.getMessage();
        }
    }

    /* Fim dos métodos para manipulação do BD.
     ============================================================================================================================================================
     */
    //variáveis exclusivas do Cliente
    private String tipo_cliente, sexo;

    //construtor completo
    public Cliente(String tipo_cliente, String sexo, int código, int numero, String nome, String data_cadastro, String n_documento, String endereço, String bairro, String telefone, String cep, String estado, String cidade, String email) {
        super(código, numero, nome, data_cadastro, n_documento, endereço, bairro, telefone, cep, estado, cidade, email);//Herdados da classe FichaCadastro
        this.tipo_cliente = tipo_cliente;
        this.sexo = sexo;
    }

    //Construtor para ser mostrado na tabela
    public Cliente(int código, String nome, String data_cadastro, String n_documento) {
        super(código, nome, data_cadastro, n_documento);
    }

    //Construtor com apenas o codigo para ser inserido na venda
    public Cliente(int código) {
        super(código);
    }

    public Cliente() {
    }

    //métodos get
    public String getTipo_cliente() {
        return tipo_cliente;
    }

    public String getSexo() {
        return sexo;
    }

    public int getCódigo() {
        return código;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    public String getN_documento() {
        return n_documento;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getBairro() {
        return bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCep() {
        return cep;
    }

    public String getEmail() {
        return email;
    }

    public String getEstado() {
        return estado;
    }

    public String getCidade() {
        return cidade;
    }
}
