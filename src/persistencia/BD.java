package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class BD {

    //private static final String URL_BD = "jdbc:mysql://localhost:3306/supermercado";
    public static String NOME_BANCO = "supermercado";
    public static String HOST = "localhost";
    public static String PORTA = "3306";
    public static String USER = "root";
    public static String SENHA = "marco";
    public static Connection conexão = null;
    public static Statement comando = null;

    public static void iniciarConexãoComando() {
        try {
            conexão = DriverManager.getConnection("jdbc:mysql://" + HOST + ":" + PORTA + "/" + NOME_BANCO, USER, SENHA);
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
            conexão = DriverManager.getConnection("jdbc:mysql://" + HOST + ":" + PORTA + "/" + NOME_BANCO, USER, SENHA);
            return conexão.isValid(0);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao conectar no Banco de Dados\n " + ex, "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    public BD() {
    }

    public static String getNOME_BANCO() {
        return NOME_BANCO;
    }

    public static void setNOME_BANCO(String NOME_BANCO) {
        BD.NOME_BANCO = NOME_BANCO;
    }

    public static String getHOST() {
        return HOST;
    }

    public static void setHOST(String HOST) {
        BD.HOST = HOST;
    }

    public static String getPORTA() {
        return PORTA;
    }

    public static void setPORTA(String PORTA) {
        BD.PORTA = PORTA;
    }

    public static String getUSER() {
        return USER;
    }

    public static void setUSER(String USER) {
        BD.USER = USER;
    }

    public static String getSENHA() {
        return SENHA;
    }

    public static void setSENHA(String SENHA) {
        BD.SENHA = SENHA;
    }

}
