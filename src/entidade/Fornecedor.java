    /*Esse arquivo é protegido por leis de copyright internacional, locais e pela lei de Deus, afinal, 
 só Deus sabe como essa merda funciona
 Não apagar dessa linha pra baixo*/
package entidade;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import persistencia.BD;

/**
 *
 * @author MARCOANTONIO
 */
public class Fornecedor extends FichaCadastro {

    /* Inicio dos métodos para manipulação do BD.
     ============================================================================================================================================================
     */
    //Retorna null se sucesso ou mensagem do SQLException caso caia na excessão
    public static String inserirFornecedor(Fornecedor fornecedor) {
        
        DateFormat dc = new SimpleDateFormat("yyyy-MM-dd");//Formata data para o formato Mysql
        String sql = "INSERT INTO fornecedor(nome_fornecedor,data_cadastro_fornecedor,"
                + "cnpj_fornecedor,endereco_fornecedor,numero_fornecedor,"
                + "bairro_fornecedor,cep_fornecedor,telefone_fornecedor,estado_fornecedor,cidade_fornecedor,email_fornecedor)VALUES"
                + "('" + fornecedor.getNome() + "','" + dc.format(Date.parse((fornecedor.getData_cadastro()))) + "','"
                + fornecedor.getN_documento() + "','" + fornecedor.getEndereço() + "',"
                + fornecedor.getNumero() + ",'" + fornecedor.getBairro() + "','" + fornecedor.getCep() + "','" + fornecedor.getTelefone() + "','"
                + fornecedor.getEstado() + "','" + fornecedor.getCidade() + "','" + fornecedor.getEmail() + "')";
        //dn.format(Date.parse(fornecedore.getData_cadastro())) = converte data_cadastro para Date() e também para o formato de data do Mysql com a função format()
        try {
            BD.comando.executeUpdate(sql);
            return null;
        } catch (SQLException ex) {
            return "Erro de inserção no Banco de Dados:  " + ex;
        }
    }



    public static ArrayList<Fornecedor> buscarTodosFornecedores(Fornecedor fornecedor) {
        DateFormat dn = new SimpleDateFormat("dd/MM/yyyy");//Formato da função format() para converter o formato Mysql para o usual no Brasil
        String sql;
        if (fornecedor == null){
            sql = "SELECT * FROM fornecedor";
        }else{
            sql = "SELECT * FROM fornecedor where";
                
            if (!fornecedor.getNome().equals("")){sql+=" and nome_fornecedor like '"+fornecedor.getNome()+"%'";}
            if (!fornecedor.getN_documento().trim().equals("")){sql+=" and cnpj_fornecedor = '"+fornecedor.getN_documento()+"'";}
            if (!fornecedor.getData_cadastro().equals("")){sql+=" and data_cadastro_fornecedor = '"+fornecedor.getData_cadastro()+"'";}
            if (!fornecedor.getEmail().equals("")){sql+=" and email_fornecedor like '"+fornecedor.getEmail()+"%'";}
            if (!fornecedor.getEndereço().equals("")){sql+=" and endereco_fornecedor like '"+fornecedor.getEndereço()+"%'";}
            if (!fornecedor.getBairro().equals("")){sql+=" and bairro_fornecedor like '"+fornecedor.getBairro()+"%'";}
            if (fornecedor.getNumero() != -1){sql+=" and numero_fornecedor = "+fornecedor.getNumero();}
            if (!fornecedor.getCep().trim().equals("")){sql+=" and cep_fornecedor = '"+fornecedor.getCep()+"'";}
            if (!fornecedor.getTelefone().trim().equals("")){sql+=" and telefone_fornecedor = '"+fornecedor.getTelefone()+"'";}
            if (fornecedor.getCidade() != null){sql+=" and cidade_fornecedor = '"+fornecedor.getCidade()+"'";}
            if (fornecedor.getEstado() != null){sql+=" and estado_fornecedor = '"+fornecedor.getEstado()+"'";}

        }

        ResultSet lista_resultados;
        ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
        Fornecedor fornecedor2 = null;
        try {
            lista_resultados = BD.comando.executeQuery(sql.replace("where and", "where"));
            while (lista_resultados.next()) {

                fornecedor2 = new Fornecedor(
                        lista_resultados.getInt("cod_fornecedor"),
                        lista_resultados.getInt("numero_fornecedor"),
                        lista_resultados.getString("nome_fornecedor"),
                        dn.format(lista_resultados.getDate("data_cadastro_fornecedor")).toString(),//Pega um Date() formata a data e coverte para String
                        lista_resultados.getString("cnpj_fornecedor"),
                        lista_resultados.getString("endereco_fornecedor"),
                        lista_resultados.getString("bairro_fornecedor"),
                        lista_resultados.getString("telefone_fornecedor"),
                        lista_resultados.getString("cep_fornecedor"),
                        lista_resultados.getString("estado_fornecedor"),
                        lista_resultados.getString("cidade_fornecedor"),
                        lista_resultados.getString("email_fornecedor"));
                
                fornecedores.add(fornecedor2);
            }
            lista_resultados.close();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());
            fornecedor2 = null;
        }
        return fornecedores;
    }
    //retorna objeto Fornecedor conforme parametro código, ou null se cair na excessão
    public static Fornecedor buscarFornecedor(int código) {
        DateFormat dc = new SimpleDateFormat("dd/MM/yyyy");//Formato da função format() para converter o formato Mysql para o usual no Brasil
        String sql = "SELECT * FROM fornecedor WHERE cod_fornecedor = '" + código + "'";
        ResultSet lista_resultados;
        Fornecedor fornecedor = null;
        try {
            lista_resultados = BD.comando.executeQuery(sql);
            while (lista_resultados.next()) {

                fornecedor = new Fornecedor(
                        lista_resultados.getInt("cod_fornecedor"),
                        lista_resultados.getInt("numero_fornecedor"),
                        lista_resultados.getString("nome_fornecedor"),
                        dc.format(lista_resultados.getDate("data_cadastro_fornecedor")).toString(),//Pega um Date() formata a data e coverte para String
                        lista_resultados.getString("cnpj_fornecedor"),
                        lista_resultados.getString("endereco_fornecedor"),
                        lista_resultados.getString("bairro_fornecedor"),
                        lista_resultados.getString("telefone_fornecedor"),
                        lista_resultados.getString("cep_fornecedor"),
                        lista_resultados.getString("estado_fornecedor"),
                        lista_resultados.getString("cidade_fornecedor"),
                        lista_resultados.getString("email_fornecedor"));
            }
            lista_resultados.close();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());
        }
        return fornecedor;
    }
    public static String verificaDocCadastro(String cnpj) {
        String sql = "SELECT cod_fornecedor,cnpj_fornecedor,nome_fornecedor FROM fornecedor WHERE cnpj_fornecedor = '" + cnpj + "'";
        ResultSet lista_resultados;
        String nome = null;
        String result = null;
        int cod = 0;
        try {
            lista_resultados = BD.comando.executeQuery(sql);
            
            while (lista_resultados.next()) {
                        cod = lista_resultados.getInt("cod_fornecedor");
                        nome = lista_resultados.getString("nome_fornecedor");
            }
            lista_resultados.close();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());    
        }
        if(cod != 0 && nome != null){
            result = "CNPJ "+cnpj+" já cadastrado: \n"+cod+" - "+nome;
        }
        
        return  result;
    }

    //retorna novo cod para inserir no BD (o maior codigo do fornecedor + 1), já convertido em String ou mensagem do SQLException caso caia na excessão
    public static String id() {
        String codigo = null;
        try {
            String sql = "select max(cod_fornecedor) from fornecedor;";
            ResultSet rs = (ResultSet) BD.comando.executeQuery(sql);
            while (rs.next()) {
                codigo = String.valueOf((rs.getInt(1) + 1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return codigo;
    }

    //retorna objeto Fornecedor reduzido para ser mostrado na tabela ou mensagem do SQLException caso caia na excessão
    public static ArrayList<Fornecedor> visãoTabela() {
        DateFormat dc = new SimpleDateFormat("dd/MM/yyyy");//Formato da função format() para converter o formato Mysql para o usual no Brasil
        String sql = "Select cod_fornecedor,nome_fornecedor,cnpj_fornecedor,data_cadastro_fornecedor from fornecedor";
        ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();// Cria um ArrayList de Objetos Fornecedor
        try {
            ResultSet rs = BD.comando.executeQuery(sql);
            while (rs.next()) {//cria objeto com dados do fornecedor salvos no BD
                Fornecedor fornecedor = new Fornecedor(rs.getInt("cod_fornecedor"),
                        rs.getString("nome_fornecedor"), dc.format(rs.getDate("data_cadastro_fornecedor")).toString(),
                        rs.getString("cnpj_fornecedor"));
                fornecedores.add(fornecedor);//adiciona objeto fornecedore no Array
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
        return fornecedores;
    }
    

    //altera (Update) dados do fornecedor no BD
    public static String alterarFornecedor(Fornecedor fornecedor) {
        DateFormat dc = new SimpleDateFormat("yyyy-MM-dd");//Formata data para o formato Mysql
        String sql = "UPDATE fornecedor SET nome_fornecedor='" + fornecedor.getNome().toUpperCase()
                + "',data_cadastro_fornecedor='" + dc.format(Date.parse((fornecedor.getData_cadastro())))
                + "',cnpj_fornecedor='" + fornecedor.getN_documento()
                + "',email_fornecedor='" + fornecedor.getEmail().toUpperCase()
                + "',endereco_fornecedor='" + fornecedor.getEndereço().toUpperCase() + "',numero_fornecedor=" + fornecedor.getNumero()
                + ",bairro_fornecedor='" + fornecedor.getBairro().toUpperCase() + "',cep_fornecedor='" + fornecedor.getCep()
                + "',telefone_fornecedor='" + fornecedor.getTelefone() + "',estado_fornecedor='" + fornecedor.getEstado()
                + "',cidade_fornecedor='" + fornecedor.getCidade().toUpperCase() + "' WHERE cod_fornecedor=" + fornecedor.getCódigo() + ";";
        //.toUpperCase() para salvar os dados em maiusculo no BD
        try {
            BD.comando.executeUpdate(sql);
            return null;
        } catch (SQLException e) {
            return "Erro na alteração do Fornecedor no Banco de Dados\n" + e.getMessage();
        }
    }

    //Exclui linha Fornecedor conforme parametro código
    public static String eleminarFornecedor(int código) {
        String sql = "DELETE FROM fornecedor WHERE cod_fornecedor=" + código + ";";
        try {
            BD.comando.executeUpdate(sql);
            return null;
        } catch (SQLException ex) {
            return "Erro na Remoção do Fornecedor no Banco de Dados\n" + ex.getMessage();
        }
    }

    /* Fim dos métodos para manipulação do BD.
     ============================================================================================================================================================
     */
    
    
    //construtor completo
    public Fornecedor(int código, int numero, String nome, String data_cadastro, String n_documento, String endereço, String bairro, String telefone, String cep, String estado, String cidade, String email) {
        super(código, numero, nome, data_cadastro, n_documento, endereço, bairro, telefone, cep, estado, cidade, email);//Herdados da classe FichaCadastro
    }

    //Construtor para ser mostrado na tabela
    public Fornecedor(int código, String nome, String data_cadastro, String n_documento) {
        super(código, nome, data_cadastro, n_documento);
    }

    public Fornecedor() {
    }
    
//métodos get
    public int getCódigo() {
        return código;
    }

    public String getEmail() {
        return email;
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

    public String getEstado() {
        return estado;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return "FichaCadastro{" + "c\u00f3digo=" + código + ", numero=" + numero + ", nome=" + nome + ", n_documento=" + n_documento + ", endere\u00e7o=" + endereço + ", bairro=" + bairro + ", telefone=" + telefone + ", cep=" + cep + ", estado=" + estado + ", cidade=" + cidade + ", email=" + email + ", data_cadastro=" + data_cadastro + '}';
    }
    
    
}
