/*Esse arquivo é protegido por leis de copyright internacional, locais e pela lei de Deus, afinal, 
 só Deus sabe como essa merda funciona
 Não apagar dessa linha pra baixo*/
package interfaces;

import controle.ControladorCadastroCliente;
import controle.ControladorCadastroFornecedor;
import controle.ControladorCadastroProduto;
import controle.ControladorCadastroUsuário;
import controle.ControladorVenda;
import controle.ControleAutenticacao;
import entidade.Usuario;
import java.awt.Image;
import java.awt.Label;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import org.ini4j.Wini;
import persistencia.BD;
import relatorios.AbreRelatorio;

/**
 *
 * @author MARCOANTONIO
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    Wini ini;
    static String caminho;
    static Label nome_userLabel = new Label("", 1);
    public static ControladorCadastroCliente controleCliente = null;
    public static ControladorCadastroFornecedor controleFornecedor = null;
    public static ControladorCadastroProduto controleProduto = null;
    public static ControladorCadastroUsuário controleUsuário = null;
    public static ControladorVenda controleVenda = null;

    public JanelaPrincipal() {
        initComponents();
        setIconImage(imgJanela());
        setExtendedState(MAXIMIZED_BOTH);//maximiza janela
        try {
            ini = new Wini(new File("Config.ini"));
            caminho = ini.get("RELATORIOS", "caminho");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        jMenuBar1.add(nome_userLabel);
        // jMenuBar1.putClientProperty(Options.HEADER_STYLE_KEY, HeaderStyle.BOTH);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        cadastroMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        movimentaçãoMenu = new javax.swing.JMenu();
        vendaMenuItem = new javax.swing.JMenuItem();
        compraMenuItem = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        relatóriosMenu = new javax.swing.JMenu();
        rel_cadastroMenu = new javax.swing.JMenu();
        cad_clienteMenuItem = new javax.swing.JMenuItem();
        cad_fornecedorMenuItem = new javax.swing.JMenuItem();
        cad_produtosMenuItem = new javax.swing.JMenuItem();
        cad_usuarioMenuItem = new javax.swing.JMenuItem();
        rel_vendaMenuItem = new javax.swing.JMenuItem();
        rel_compraMenuItem = new javax.swing.JMenuItem();
        backupMenu = new javax.swing.JMenu();
        backupMenuItem = new javax.swing.JMenuItem();
        restoreMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        sairMenu = new javax.swing.JMenu();
        logoutMenuItem = new javax.swing.JMenuItem();
        sairMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Supermarket System");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(300, 314));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N

        cadastroMenu.setText("Cadastro");
        cadastroMenu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jMenuItem1.setText("Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirCliente(evt);
            }
        });
        cadastroMenu.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jMenuItem2.setText("Fornecedor");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirFornecedor(evt);
            }
        });
        cadastroMenu.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jMenuItem3.setText("Produto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirProduto(evt);
            }
        });
        cadastroMenu.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jMenuItem4.setText("Usuário");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirUsuario(evt);
            }
        });
        cadastroMenu.add(jMenuItem4);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jMenuItem14.setText("Vendedor");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        cadastroMenu.add(jMenuItem14);

        jMenuBar1.add(cadastroMenu);

        movimentaçãoMenu.setText("Movimentação");
        movimentaçãoMenu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        vendaMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        vendaMenuItem.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        vendaMenuItem.setText("Venda");
        vendaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendaMenuItemActionPerformed(evt);
            }
        });
        movimentaçãoMenu.add(vendaMenuItem);

        compraMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        compraMenuItem.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        compraMenuItem.setText("Compra");
        compraMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraMenuItemActionPerformed(evt);
            }
        });
        movimentaçãoMenu.add(compraMenuItem);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jMenuItem13.setText("Ajuste de Estoque");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        movimentaçãoMenu.add(jMenuItem13);

        jMenuBar1.add(movimentaçãoMenu);

        relatóriosMenu.setText("Relatórios");
        relatóriosMenu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        rel_cadastroMenu.setText("Cadastro");
        rel_cadastroMenu.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N

        cad_clienteMenuItem.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        cad_clienteMenuItem.setText("Cliente");
        cad_clienteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad_clienteMenuItemActionPerformed(evt);
            }
        });
        rel_cadastroMenu.add(cad_clienteMenuItem);

        cad_fornecedorMenuItem.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        cad_fornecedorMenuItem.setText("Fornecedor");
        rel_cadastroMenu.add(cad_fornecedorMenuItem);

        cad_produtosMenuItem.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        cad_produtosMenuItem.setText("Produtos");
        rel_cadastroMenu.add(cad_produtosMenuItem);

        cad_usuarioMenuItem.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        cad_usuarioMenuItem.setText("Usuários");
        rel_cadastroMenu.add(cad_usuarioMenuItem);

        relatóriosMenu.add(rel_cadastroMenu);

        rel_vendaMenuItem.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        rel_vendaMenuItem.setText("Venda");
        relatóriosMenu.add(rel_vendaMenuItem);

        rel_compraMenuItem.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        rel_compraMenuItem.setText("Compra");
        rel_compraMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rel_compraMenuItemActionPerformed(evt);
            }
        });
        relatóriosMenu.add(rel_compraMenuItem);

        jMenuBar1.add(relatóriosMenu);

        backupMenu.setText("Backup");
        backupMenu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        backupMenuItem.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        backupMenuItem.setText("Backup");
        backupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backupMenuItemActionPerformed(evt);
            }
        });
        backupMenu.add(backupMenuItem);

        restoreMenuItem.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        restoreMenuItem.setText("Restore");
        restoreMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoreMenuItemActionPerformed(evt);
            }
        });
        backupMenu.add(restoreMenuItem);

        jMenuBar1.add(backupMenu);

        jMenu1.setText("Configurações");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jMenuItem5.setText("Configurações");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        sairMenu.setText("Sair");
        sairMenu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        logoutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        logoutMenuItem.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        logoutMenuItem.setText("Logout");
        logoutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuItemActionPerformed(evt);
            }
        });
        sairMenu.add(logoutMenuItem);

        sairMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        sairMenuItem.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        sairMenuItem.setText("Sair do Sistema");
        sairMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairMenuItemActionPerformed(evt);
            }
        });
        sairMenu.add(sairMenuItem);

        jMenuBar1.add(sairMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //define os acessos dos usuários

    public static void usuario(Usuario user) {
//        nome_userLabel.setBackground(new Color(240, 240, 240));
        nome_userLabel.setText(user.getNome());

        switch (user.getCargo()) {
            case "Caixa":
                cadastroMenu.setEnabled(false);
                compraMenuItem.setEnabled(false);
                relatóriosMenu.setEnabled(false);
                break;
            case "Gerente":
                vendaMenuItem.setEnabled(false);
                rel_vendaMenuItem.setEnabled(false);
            case "Administrador":

        }
    }
    
    private void abrirCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirCliente
        if (controleCliente == null) {
            controleCliente = new ControladorCadastroCliente();
        }else{
            JOptionPane.showMessageDialog(null, "Janela cadastro de cliente já foi aberta");
        }
        
    }//GEN-LAST:event_abrirCliente

    private void rel_compraMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rel_compraMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rel_compraMenuItemActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        BD.fecharComandoConexão();
    }//GEN-LAST:event_formWindowClosing

    private void abrirFornecedor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirFornecedor
        new ControladorCadastroFornecedor();
    }//GEN-LAST:event_abrirFornecedor

    private void abrirProduto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirProduto
        new ControladorCadastroProduto();
    }//GEN-LAST:event_abrirProduto

    private void abrirUsuario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirUsuario
        new ControladorCadastroUsuário();
    }//GEN-LAST:event_abrirUsuario

    private void logoutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuItemActionPerformed
        dispose();
        new ControleAutenticacao();
    }//GEN-LAST:event_logoutMenuItemActionPerformed

    private void vendaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendaMenuItemActionPerformed
        new ControladorVenda(caminho);
    }//GEN-LAST:event_vendaMenuItemActionPerformed

    private void sairMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairMenuItemActionPerformed
        System.exit(1);
    }//GEN-LAST:event_sairMenuItemActionPerformed

    private void compraMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compraMenuItemActionPerformed

    private void cad_clienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad_clienteMenuItemActionPerformed
        new AbreRelatorio(caminho).rel_cliente(null);
    }//GEN-LAST:event_cad_clienteMenuItemActionPerformed

    private void backupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backupMenuItemActionPerformed
        new JanelaBackup().setVisible(true);
    }//GEN-LAST:event_backupMenuItemActionPerformed

    private void restoreMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoreMenuItemActionPerformed
        new JanelaRestore().setVisible(true);
    }//GEN-LAST:event_restoreMenuItemActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        new JanelaCadastroVendedor().setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new JanelaConfiguração(this).setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    public Image imgJanela() {
        try {
            return ImageIO.read(this.getClass().getResource("/imagens/olhodetandera.jpg"));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu backupMenu;
    private javax.swing.JMenuItem backupMenuItem;
    private javax.swing.JMenuItem cad_clienteMenuItem;
    private javax.swing.JMenuItem cad_fornecedorMenuItem;
    private javax.swing.JMenuItem cad_produtosMenuItem;
    private javax.swing.JMenuItem cad_usuarioMenuItem;
    public static javax.swing.JMenu cadastroMenu;
    public static javax.swing.JMenuItem compraMenuItem;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem logoutMenuItem;
    public static javax.swing.JMenu movimentaçãoMenu;
    public static javax.swing.JMenu rel_cadastroMenu;
    public static javax.swing.JMenuItem rel_compraMenuItem;
    public static javax.swing.JMenuItem rel_vendaMenuItem;
    public static javax.swing.JMenu relatóriosMenu;
    private javax.swing.JMenuItem restoreMenuItem;
    private javax.swing.JMenu sairMenu;
    private javax.swing.JMenuItem sairMenuItem;
    public static javax.swing.JMenuItem vendaMenuItem;
    // End of variables declaration//GEN-END:variables
}
