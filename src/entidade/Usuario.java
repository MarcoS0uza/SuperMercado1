 package entidade;
 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import persistencia.BD;

 public class Usuario
 {
   private int código;
   private String nome;
   private String senha;
   private String cargo;
 
   public Usuario(int código, String nome, String senha, String cargo)
   {
    this.código = código;
    this.nome = nome;
     this.senha = senha;
     this.cargo = cargo;
   }

    public Usuario(int código, String nome, String cargo) {
        this.código = código;
        this.nome = nome;
        this.cargo = cargo;
    }

    public Usuario(int código, String nome) {
        this.código = código;
        this.nome = nome;
    }
 
   public Usuario(String nome, String senha) {
    this.nome = nome;
     this.senha = senha;
   }

    public Usuario(int código) {
        this.código = código;
    }
 
   public int getCódigo()
   {
    return this.código;
   }
 
   public String getNome() {
    return this.nome;
   }
 
   public String getSenha() {
     return this.senha;
   }
 
   public String getCargo() {
    return this.cargo;
   }

    public void setCódigo(int código) {
        this.código = código;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
 
   
 public static String inserirUsuário(Usuario usuário) {

        String sql = "INSERT INTO usuario(nome_user,senha_user,cargo_user)VALUES"
                + "('" + usuário.getNome() + "','" + usuário.getSenha() + "','" + usuário.getCargo() + "')";
        try {
            BD.comando.executeUpdate(sql);
            return null;
        } catch (SQLException ex) {
            return "Erro de inserção no Banco de Dados:  " + ex.getMessage();
        }
    }
 public static boolean nomeIgual(String nome){
     String sql = "Select count(nome_user) from usuario where nome_user="+nome;
     int cont = 0;
     try {
            ResultSet lista_resultados = BD.comando.executeQuery(sql);
            while(lista_resultados.next()){
                cont = lista_resultados.getInt(1);
            }
            if(cont == 0){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
       
     
 }
    public static Usuario buscarUsuário(String nome) {
        String sql = "SELECT * FROM usuario WHERE nome_user= '" + nome + "'";
        ResultSet lista_resultados;
        Usuario usuário = null;
        try {
            lista_resultados = BD.comando.executeQuery(sql);
            while (lista_resultados.next()) {

                usuário = new Usuario(
                        lista_resultados.getInt("cod_user"),
                        lista_resultados.getString("nome_user"),
                        lista_resultados.getString("senha_user"),
                        lista_resultados.getString("cargo_user"));
            }
            lista_resultados.close();
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
            usuário = null;
        }
        return usuário;
    }
     public static Usuario verificaUsuário(int cod) {
        String sql = "SELECT * FROM usuario WHERE cod_user= '" + cod + "'";
        ResultSet lista_resultados;
        Usuario usuário = null;
        try {
            lista_resultados = BD.comando.executeQuery(sql);
            while (lista_resultados.next()) {

                usuário = new Usuario(
                        lista_resultados.getInt("cod_user"),
                        lista_resultados.getString("nome_user"),
                        lista_resultados.getString("senha_user"),
                        lista_resultados.getString("cargo_user"));
            }
            lista_resultados.close();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar usuário");
            usuário = null;
        }
        return usuário;
    }

    public static String id() {
        String codigo = null;
        try {
            String sql = "select max(cod_user) from usuarios;";
            ResultSet rs = (ResultSet) BD.comando.executeQuery(sql);
            while (rs.next()) {
                codigo = String.valueOf((rs.getInt(1) + 1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return codigo;
    }

    public static ArrayList<Usuario> visãoTabela() {
        String sql = "Select cod_user,nome_user,cargo_user from usuario";
        ArrayList<Usuario> usuários = new ArrayList<Usuario>();
        try {
            ResultSet rs = BD.comando.executeQuery(sql);
            while (rs.next()) {
                Usuario usuário = new Usuario(rs.getInt("cod_user"), rs.getString("nome_user"), rs.getString("cargo_user"));
                usuários.add(usuário);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
        return usuários;
    }

    public static String alterarUsuário(Usuario usuários) {
        String sql = "UPDATE usuario SET nome_user='" + usuários.getNome()
                + "',senha_user='" + usuários.getSenha()+"',cargo_user='" + usuários.getCargo()
                + "' WHERE cod_user=" + usuários.getCódigo() + ";";
        try {
            BD.comando.executeUpdate(sql);
            return null;
        } catch (SQLException e) {
            return "Erro na alteração do Usuário no Banco de Dados\n" + e.getMessage();
        }
    }

    public static String eleminarUsuário(String nome) {
        String sql = "DELETE FROM usuario WHERE nome_user=" + nome + ";";
        try {
            BD.comando.executeUpdate(sql);
            return null;
        } catch (SQLException ex) {
            return "Erro na Remoção do Usuário no Banco de Dados\n" + ex.getMessage();
        }
    }

 }

