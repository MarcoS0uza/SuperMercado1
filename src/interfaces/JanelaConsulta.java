/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidade.Cliente;
import entidade.Fornecedor;
import entidade.Produto;
import entidade.Usuario;
import entidade.Vendedor;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author MARCOANTONIO
 */
public class JanelaConsulta<T> extends javax.swing.JFrame {

    T objeto;

    public JanelaConsulta(T objeto) {
        this.objeto = objeto;
        initComponents();
        if (objeto instanceof Cliente) {
            ArrayList<Cliente> clientes = null;
            clientes = Cliente.visãoTabela();
            if (clientes == null) {
                JOptionPane.showMessageDialog(this, "Erro ao recuperar os dados");
            } else {
                tabelaCliente(clientes);
            }
        } else if (objeto instanceof Fornecedor) {
            ArrayList<Fornecedor> fornecedores = null;
            fornecedores = Fornecedor.visãoTabela();
            if (fornecedores == null) {
                JOptionPane.showMessageDialog(this, "Erro ao recuperar os dados");
            } else {
                tabelaFornecedor(fornecedores);
            }
        } else if (objeto instanceof Usuario) {
            ArrayList<Usuario> usuarios = null;
            usuarios = Usuario.visãoTabela();
            if (usuarios == null) {
                JOptionPane.showMessageDialog(this, "Erro ao recuperar os dados");
            } else {
                tabelaUsuario(usuarios);
            }
        } else if (objeto instanceof Vendedor) {
            ArrayList<Vendedor> vendedor = null;
            vendedor = Vendedor.visãoTabela();
            if (vendedor == null) {
                JOptionPane.showMessageDialog(this, "Erro ao recuperar os dados");
            } else {
                tabelaVendedor(vendedor);
            }
        } else if (objeto instanceof Produto) {
            ArrayList<Produto> produto = null;
            produto = Produto.visãoTabela();
            if (produto == null) {
                JOptionPane.showMessageDialog(this, "Erro ao recuperar os dados");
            } else {
                tabelaProduto(produto);
            }
        }

    }

    private void tabelaCliente(ArrayList<Cliente> clientes) {
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"CÓDIGO", "NOME", "CPF/CNPJ", "DATA CADASTRO"}, clientes.size());

        for (int i = 0; i < clientes.size(); i++) {
            modelo.setValueAt(clientes.get(i).getCódigo(), i, 0);
            modelo.setValueAt(clientes.get(i).getNome(), i, 1);
            modelo.setValueAt(formataMascara(clientes.get(i).getN_documento()), i, 2);
            modelo.setValueAt(clientes.get(i).getData_cadastro(), i, 3);

        }

        dadosTable.setModel(modelo);
        dadosTable.getColumnModel().getColumn(0).setPreferredWidth(70);
        dadosTable.getColumnModel().getColumn(1).setPreferredWidth(300);
        dadosTable.getColumnModel().getColumn(2).setPreferredWidth(110);
        dadosTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        setSize(630, getHeight());
        setLocationRelativeTo(null);
    }

    private void tabelaFornecedor(ArrayList<Fornecedor> fornecedores) {
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"CÓDIGO", "NOME", "CNPJ", "DATA CADASTRO"}, fornecedores.size());

        for (int i = 0; i < fornecedores.size(); i++) {
            modelo.setValueAt(fornecedores.get(i).getCódigo(), i, 0);
            modelo.setValueAt(fornecedores.get(i).getNome(), i, 1);
            modelo.setValueAt(formataMascara(fornecedores.get(i).getN_documento()), i, 2);
            modelo.setValueAt(fornecedores.get(i).getData_cadastro(), i, 3);

        }

        dadosTable.setModel(modelo);
        dadosTable.getColumnModel().getColumn(0).setPreferredWidth(70);
        dadosTable.getColumnModel().getColumn(1).setPreferredWidth(300);
        dadosTable.getColumnModel().getColumn(2).setPreferredWidth(110);
        dadosTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        setSize(630, getHeight());
        setLocationRelativeTo(null);

    }

    private void tabelaUsuario(ArrayList<Usuario> usuarios) {
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"CÓDIGO", "NOME", "CARGO"}, usuarios.size());

        for (int i = 0; i < usuarios.size(); i++) {
            modelo.setValueAt(usuarios.get(i).getCódigo(), i, 0);
            modelo.setValueAt(usuarios.get(i).getNome(), i, 1);
            modelo.setValueAt(usuarios.get(i).getCargo(), i, 2);
        }

        dadosTable.setModel(modelo);
        dadosTable.getColumnModel().getColumn(0).setPreferredWidth(70);
        dadosTable.getColumnModel().getColumn(1).setPreferredWidth(200);
        dadosTable.getColumnModel().getColumn(2).setPreferredWidth(110);
        setSize(400, getHeight());
        setLocationRelativeTo(null);

    }

    private void tabelaVendedor(ArrayList<Vendedor> vendedor) {
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"CÓDIGO", "NOME", "COMISSÃO"}, vendedor.size());

        for (int i = 0; i < vendedor.size(); i++) {
            modelo.setValueAt(vendedor.get(i).getCodigo(), i, 0);
            modelo.setValueAt(vendedor.get(i).getNome(), i, 1);
            modelo.setValueAt(vendedor.get(i).getComissao(), i, 2);
        }

        dadosTable.setModel(modelo);
        dadosTable.getColumnModel().getColumn(0).setPreferredWidth(70);
        dadosTable.getColumnModel().getColumn(1).setPreferredWidth(200);
        dadosTable.getColumnModel().getColumn(2).setPreferredWidth(110);
        setSize(400, getHeight());
        setLocationRelativeTo(null);
    }

    private void tabelaProduto(ArrayList<Produto> produtos) {
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"CÓDIGO", "DESCRIÇÃO", "ESTOQUE", "R$ VENDA", "MARCA"}, produtos.size());

        for (int i = 0; i < produtos.size(); i++) {
            modelo.setValueAt(produtos.get(i).getCódigo(), i, 0);
            modelo.setValueAt(produtos.get(i).getNome(), i, 1);
            modelo.setValueAt(produtos.get(i).getEstoque(), i, 2);
            modelo.setValueAt(produtos.get(i).getPreço_venda(), i, 3);
            modelo.setValueAt(produtos.get(i).getMarca(), i, 4);
        }

        dadosTable.setModel(modelo);
        dadosTable.getColumnModel().getColumn(0).setPreferredWidth(70);
        dadosTable.getColumnModel().getColumn(1).setPreferredWidth(300);
        dadosTable.getColumnModel().getColumn(2).setPreferredWidth(90);
        dadosTable.getColumnModel().getColumn(3).setPreferredWidth(90);
        dadosTable.getColumnModel().getColumn(4).setPreferredWidth(110);

        setSize(710, getHeight());
        setLocationRelativeTo(null);
    }

    private String formataMascara(String string) {
        MaskFormatter mf = null;
        String stringFormatada = null;
        try {
            if (string.length() == 11) {
                mf = new MaskFormatter("###.###.###-##");
                mf.setValueContainsLiteralCharacters(false);
                stringFormatada = mf.valueToString(string);
            } else if (string.length() == 14) {
                mf = new MaskFormatter("##.###.###/####-##");
                mf.setValueContainsLiteralCharacters(false);
                stringFormatada = mf.valueToString(string);
            }
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, " Erro ao aplicar máscara : " + ex);
            return null;
        }
        return stringFormatada;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dadosTable = new javax.swing.JTable();
        buscaTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        dadosTable.setAutoCreateRowSorter(true);
        dadosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        dadosTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        dadosTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dadosTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(dadosTable);

        buscaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscaTextFieldKeyReleased(evt);
            }
        });

        jLabel1.setText("Buscar");

        jCheckBox1.setText("Pesquisar por parte do nome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buscaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dadosTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dadosTableMousePressed
        if (evt.getClickCount() == 2) {
            int linha = dadosTable.getSelectedRow();
            if (objeto instanceof Cliente) {
                String codigo_temp = dadosTable.getValueAt(linha, 0).toString();
                int codigo = Integer.valueOf(codigo_temp).intValue();
                Cliente cliente = Cliente.buscarCliente(codigo);
                if (getTitle().equalsIgnoreCase("Clientes")) {
                    JanelaCadastroCliente.mostraDados(cliente);
                    dispose();
                } else if (getTitle().equalsIgnoreCase("Selecione o cliente para a venda")) {
                    JanelaVenda.mostraDadosCliente(cliente);
                    dispose();
                }
            } else if (objeto instanceof Fornecedor) {
                String codigo_tempF = dadosTable.getValueAt(linha, 0).toString();
                int codigoF = Integer.valueOf(codigo_tempF).intValue();
                Fornecedor fornecedor = Fornecedor.buscarFornecedor(codigoF);
                JanelaCadastroFornecedor.mostraDados(fornecedor);
                dispose();
            } else if (objeto instanceof Usuario) {
                String codigo_tempU = dadosTable.getValueAt(linha, 1).toString();
                Usuario usuário = Usuario.buscarUsuário(codigo_tempU);
                if (getTitle().equals("Consulta Usuario")) {
                    JanelaCadastroVendedor.mostraUsuario(usuário);
                } else if (getTitle().equals("Usuário")) {
                    JanelaCadastroUsuário.mostraDados(usuário);
                }
                dispose();
            } else if (objeto instanceof Vendedor) {
                String codigo_temp = dadosTable.getValueAt(linha, 0).toString();
                int codigo = Integer.valueOf(codigo_temp).intValue();
                Vendedor vendedor = Vendedor.buscarVendedor(codigo);
                if (getTitle().equalsIgnoreCase("Vendedor")) {
                    JanelaCadastroVendedor.mostraDados(vendedor);
                    dispose();
                }
                /*
                 }else if (getTitle().equalsIgnoreCase("Selecione o cliente para a venda")){
                 JanelaVenda.mostraDadosCliente(cliente);
                 dispose();
                 }
                 */

            } else if (objeto instanceof Produto) {
                String codigo_temp = dadosTable.getValueAt(linha, 0).toString();
                int codigo = Integer.valueOf(codigo_temp).intValue();
                Produto produto = Produto.buscarProduto(codigo);
                if (getTitle().equals("Consulta Produto")) {
                    JanelaCadastroProduto.mostraDados(produto);
                } else if (getTitle().equals("Selecione o Produto")) {
                    JanelaVenda.mostraDadosProduto(produto);
                }
                dispose();
            }

        }

    }//GEN-LAST:event_dadosTableMousePressed

    private void buscaTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscaTextFieldKeyReleased
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(dadosTable.getModel());
        dadosTable.setRowSorter(sorter);
        if (!jCheckBox1.isSelected()) {
            sorter.setRowFilter(RowFilter.regexFilter("^" + buscaTextField.getText().toUpperCase(), 1));
        } else {
            sorter.setRowFilter(RowFilter.regexFilter(".*" + buscaTextField.getText().toUpperCase(), 1));
        }
    }//GEN-LAST:event_buscaTextFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscaTextField;
    public static javax.swing.JTable dadosTable;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
