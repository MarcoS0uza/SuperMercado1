/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import com.jgoodies.looks.plastic.PlasticXPLookAndFeel;
import entidade.Usuario;
import interfaces.JanelaConfiguração;
import interfaces.JanelaLogin;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.ini4j.Wini;
import persistencia.BD;

/**
 *
 * @author Marco Antonio
 */
public class ControleAutenticacao {
    static Tools tools = new Tools();
    
    
    public static void main() {
        try {
            Wini ini = new Wini(new File("Config.ini"));
            BD bd = new BD();
            bd.setURL_BANCO("jdbc:mysql://"+ini.get("BANCO", "host")+":"+ini.get("BANCO", "porta")+"/"+ini.get("BANCO", "nome_banco"));
            bd.setUSER(ini.get("BANCO", "user"));
            bd.setSENHA(tools.decripta(ini.get("BANCO", "senha")));
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException | IOException | BadPaddingException | NoSuchPaddingException | IllegalBlockSizeException | InvalidKeyException | NoSuchAlgorithmException | InvalidAlgorithmParameterException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        if (BD.testaConexao()) {
            new ControleAutenticacao();
        } else {
            new JanelaConfiguração(null).setVisible(true);
        }
    }

    public ControleAutenticacao() {
        new JanelaLogin(this).setVisible(true);

    }

    public int autenticaçaoUsuário(Usuario user) {
        String sql = "SELECT COUNT(cod_user)FROM usuarios WHERE nome_user='" + user.getNome() + "' AND senha_user='" + user.getSenha() + "';";
        int resultado = 0;
        try {
            ResultSet resultado_busca = BD.comando.executeQuery(sql);
            while (resultado_busca.next()) {
                resultado = resultado_busca.getInt(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return -1;
        }
        return resultado;
    }

   

    public static void main(String[] args) {
        try {
            Wini ini = new Wini(new File("Config.ini"));
            BD bd = new BD();
            bd.setURL_BANCO("jdbc:mysql://"+ini.get("BANCO", "host")+":"+ini.get("BANCO", "porta")+"/"+ini.get("BANCO", "nome_banco"));
            bd.setUSER(ini.get("BANCO", "user"));
            bd.setSENHA(tools.decripta(ini.get("BANCO", "senha")));
            UIManager.setLookAndFeel(new PlasticXPLookAndFeel());
        } catch (UnsupportedLookAndFeelException | IOException | BadPaddingException | NoSuchPaddingException | IllegalBlockSizeException | InvalidKeyException | NoSuchAlgorithmException | InvalidAlgorithmParameterException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        if (BD.testaConexao()) {
            new ControleAutenticacao();
        } else {
            new JanelaConfiguração(null).setVisible(true);
        }

    }
}
