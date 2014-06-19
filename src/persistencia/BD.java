package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class BD {

    public static String URL_BANCO;
    public static String USER;
    public static String SENHA;
    public static Connection conexão = null;
    public static Statement comando = null;

    
    
    public BD() {
    }

    public BD(String URL_BANCO, String USER, String SENHA) {
        BD.URL_BANCO = URL_BANCO;
        BD.USER = USER;
        BD.SENHA = SENHA;
    }

    public String getURL_BANCO() {
        return URL_BANCO;
    }

    public void setURL_BANCO(String URL_BANCO) {
        BD.URL_BANCO = URL_BANCO;
    }

    public String getUSER() {
        return USER;
    }

    public void setUSER(String USER) {
        BD.USER = USER;
    }

    public String getSENHA() {
        return SENHA;
    }

    public void setSENHA(String SENHA) {
        BD.SENHA = SENHA;
    }

    public Connection getConexão() {
        return conexão;
    }

    public void setConexão(Connection conexão) {
        BD.conexão = conexão;
    }

    public Statement getComando() {
        return comando;
    }

    public void setComando(Statement comando) {
        BD.comando = comando;
    }
    
    
    
    public static void iniciarConexãoComando() {
        try {
            conexão = DriverManager.getConnection(URL_BANCO, USER, SENHA);
            comando = conexão.createStatement();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao conectar no Banco de Dados\n " + ex, "ERRO", JOptionPane.ERROR_MESSAGE);

        }
    }

    public static void fecharComandoConexão() {
        try {
            comando.close();
            conexão.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static boolean testaConexao() {
        try {
            conexão = DriverManager.getConnection(URL_BANCO, USER, SENHA);
            return conexão.isValid(0);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao conectar no Banco de Dados\n " + ex, "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    

    
    

   

}
