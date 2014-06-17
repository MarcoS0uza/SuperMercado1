package entidade;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import persistencia.BD;

public class Vendedor {

    private int codigo;
    private float comissao;
    private String nome;
    private Usuario usuario;

    public Vendedor(int codigo, String nome, float comissao, Usuario usuario) {
        this.codigo = codigo;
        this.comissao = comissao;
        this.nome = nome;
        this.usuario = usuario;
    }

    public Vendedor() {
    }

    public Vendedor(int codigo) {
        this.codigo = codigo;
    }

    public Vendedor(int codigo, String nome, float comissao) {
        this.codigo = codigo;
        this.comissao = comissao;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public float getComissao() {
        return comissao;
    }

    public String getNome() {
        return nome;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public static String inserirVendedor(Vendedor vendedor) {
        String sql = null;
        if (vendedor.getUsuario().getCódigo() == 0) {
            sql = "INSERT INTO vendedor(nome)VALUES"
                    + "('" + vendedor.getNome() + "')";
        } else {
            sql = "INSERT INTO vendedor(nome,comissao,cod_usuario)VALUES"
                    + "('" + vendedor.getNome() + "','" + vendedor.getComissao() + "',"
                    + vendedor.getUsuario().getCódigo() + ")";
        }

        try {
            BD.comando.executeUpdate(sql);
            return null;
        } catch (SQLException ex) {
            return "Erro de inserção no Banco de Dados:  " + ex.getMessage();
        }
    }

    public static Vendedor buscarVendedor(int código) {
        String sql = "SELECT v.codigo, v.nome, v.comissao, u.cod_user, u.nome_user FROM vendedor v"
                + " left join usuario u on u.cod_user=v.cod_usuario"
                + " WHERE v.codigo = "+código+";";
        ResultSet rs;
        Vendedor vendedor = null;
        Usuario usuario;
        try {
            rs = BD.comando.executeQuery(sql);
            while (rs.next()) {
                usuario = new Usuario(
                        rs.getInt("cod_user"),
                        rs.getString("nome_user")
                );
    
                vendedor = new Vendedor(
                        rs.getInt("codigo"),
                        rs.getString("nome"),
                        rs.getFloat("comissao"),
                        usuario);
            }
            rs.close();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar vendedor: " + sqle.getMessage());
            vendedor = null;
        }
        return vendedor;
    }

    public static String id() {
        String codigo = null;
        try {
            String sql = "select max(codigo) from vendedor;";
            ResultSet rs = (ResultSet) BD.comando.executeQuery(sql);
            while (rs.next()) {
                codigo = String.valueOf((rs.getInt(1) + 1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return codigo;
    }

    public static ArrayList<Vendedor> visãoTabela() {
        String sql = "Select codigo, nome, comissao from vendedor";
        ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
        Vendedor vendedor;
        try {
            ResultSet rs = BD.comando.executeQuery(sql);
            while (rs.next()) {

                vendedor = new Vendedor(
                        rs.getInt("codigo"),
                        rs.getString("nome"),
                        rs.getFloat("comissao"));
                vendedores.add(vendedor);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
        return vendedores;
    }

    public static String alterarVendedor(Vendedor vendedor) {
        String sql = "UPDATE vendedor SET nome='" + vendedor.getNome()
                + "',comissao=" + vendedor.getComissao()
                + ",cod_usuario=" + vendedor.getUsuario().getCódigo()+" WHERE codigo=" + vendedor.getCodigo() + ";";
        try {
            BD.comando.executeUpdate(sql);
            return null;
        } catch (SQLException e) {
            return "Erro na alteração do vendedor no Banco de Dados\n" + e.getMessage();
        }
    }

    public static String eleminarVendedor(int código) {
        String sql = "DELETE FROM vendedor WHERE codigo=" + código + ";";
        try {
            BD.comando.executeUpdate(sql);
            return null;
        } catch (SQLException ex) {
            return "Erro na Remoção do vendedor no Banco de Dados\n" + ex.getMessage();
        }
    }

}
