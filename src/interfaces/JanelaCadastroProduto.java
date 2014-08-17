/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import controle.ControladorCadastroProduto;
import entidade.FichaCadastro;
import entidade.Produto;
import java.io.File;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author MARCOANTONIO
 */
public class JanelaCadastroProduto extends javax.swing.JFrame {

    ControladorCadastroProduto controlador;

    public JanelaCadastroProduto(ControladorCadastroProduto controlador) {
        this.controlador = controlador;
        initComponents();
        setLocationRelativeTo(null);
        salvarButton.setVisible(false);

    }

    static public void mostraDados(Produto produto) {
        limpa();
        setAtivo(true);
        gravarButton.setEnabled(false);
        cod_produtoTextField.setText(String.valueOf(produto.getCódigo()));
        nome_produtoTextField.setText(produto.getNome());
        custo_produtoTextField.setText(String.valueOf(produto.getPreço_custo()));
        preço_vendaTextField.setText(String.valueOf(produto.getPreço_venda()));
        estoqueTextField.setText(String.valueOf(produto.getEstoque()));
        un_produtoComboBox.setSelectedItem(FichaCadastro.Unidade.valueOf(produto.getUnidade()));
        marcaTextField.setText(produto.getMarca());
        imagem_produtoLabel.setIcon(new ImageIcon(produto.getUrl_imagem()));
        setEdição(false);
        editarSalvar();
        un_produtoComboBox.setEnabled(false);
        escolher_imgButton.setEnabled(false);
        if (produto.getUrl_imagem().equals("")) {
            JOptionPane.showMessageDialog(null, "Erro ao localizar imagem");
        } else {
            url_imagemTextField.setText(produto.getUrl_imagem().replace("\\", "\\\\"));
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dadosPanel = new javax.swing.JPanel();
        cod_produtoLabel = new javax.swing.JLabel();
        cod_produtoTextField = new javax.swing.JTextField();
        nome_produtoLabel = new javax.swing.JLabel();
        nome_produtoTextField = new javax.swing.JTextField();
        custo_produtoLabel = new javax.swing.JLabel();
        custo_produtoTextField = new javax.swing.JTextField();
        preço_vendaLabel = new javax.swing.JLabel();
        preço_vendaTextField = new javax.swing.JTextField();
        un_produtoLabel = new javax.swing.JLabel();
        un_produtoComboBox = new javax.swing.JComboBox();
        estoqueLabel = new javax.swing.JLabel();
        estoqueTextField = new javax.swing.JTextField();
        marcaLabel = new javax.swing.JLabel();
        marcaTextField = new javax.swing.JTextField();
        imagemPanel = new javax.swing.JPanel();
        imagem_produtoLabel = new javax.swing.JLabel();
        url_imagemTextField = new javax.swing.JTextField();
        url_imagemLabel = new javax.swing.JLabel();
        escolher_imgButton = new javax.swing.JButton();
        botões_clientePanel = new javax.swing.JPanel();
        eliminarButton = new javax.swing.JButton();
        novoButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();
        gravarButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        salvarButton = new javax.swing.JButton();
        cancelaButton = new javax.swing.JButton();
        cod_produtoLabel1 = new javax.swing.JLabel();
        cod_produtoTextField1 = new javax.swing.JTextField();
        preço_vendaLabel1 = new javax.swing.JLabel();
        preço_vendaTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produto");
        setResizable(false);

        dadosPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cod_produtoLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cod_produtoLabel.setText("Código");

        cod_produtoTextField.setEditable(false);
        cod_produtoTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cod_produtoTextField.setEnabled(false);

        nome_produtoLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nome_produtoLabel.setText("Nome");

        nome_produtoTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nome_produtoTextField.setEnabled(false);

        custo_produtoLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        custo_produtoLabel.setText("Custo R$");

        custo_produtoTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        custo_produtoTextField.setEnabled(false);

        preço_vendaLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        preço_vendaLabel.setText("Preço R$");

        preço_vendaTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        preço_vendaTextField.setEnabled(false);

        un_produtoLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        un_produtoLabel.setText("Unidade");

        un_produtoComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        un_produtoComboBox.setModel(new DefaultComboBoxModel(FichaCadastro.Unidade.values()));
        un_produtoComboBox.setEnabled(false);

        estoqueLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        estoqueLabel.setText("Estoque");

        estoqueTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        estoqueTextField.setEnabled(false);

        marcaLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        marcaLabel.setText("Marca");

        marcaTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        marcaTextField.setEnabled(false);

        imagemPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagem do Produto"));

        url_imagemTextField.setEditable(false);
        url_imagemTextField.setEnabled(false);

        url_imagemLabel.setText("Url");

        javax.swing.GroupLayout imagemPanelLayout = new javax.swing.GroupLayout(imagemPanel);
        imagemPanel.setLayout(imagemPanelLayout);
        imagemPanelLayout.setHorizontalGroup(
            imagemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagemPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(imagemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagemPanelLayout.createSequentialGroup()
                        .addComponent(url_imagemLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(url_imagemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagem_produtoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        imagemPanelLayout.setVerticalGroup(
            imagemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagemPanelLayout.createSequentialGroup()
                .addComponent(imagem_produtoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(imagemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(url_imagemTextField)
                    .addComponent(url_imagemLabel)))
        );

        escolher_imgButton.setText("Escolher Imagem");
        escolher_imgButton.setEnabled(false);
        escolher_imgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolher_imgButtonActionPerformed(evt);
            }
        });

        eliminarButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        eliminarButton.setText("Eliminar");
        eliminarButton.setEnabled(false);
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        novoButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        novoButton.setText("Novo");
        novoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoButtonActionPerformed(evt);
            }
        });

        consultarButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        consultarButton.setText("Consultar");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarButtonActionPerformed(evt);
            }
        });

        gravarButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        gravarButton.setText("Gravar");
        gravarButton.setEnabled(false);
        gravarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravarButtonActionPerformed(evt);
            }
        });

        editarButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        editarButton.setText("Editar");
        editarButton.setEnabled(false);
        editarButton.setMaximumSize(new java.awt.Dimension(63, 23));
        editarButton.setMinimumSize(new java.awt.Dimension(63, 23));
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        salvarButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        salvarButton.setText("Salvar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        cancelaButton.setText("Cancela");
        cancelaButton.setEnabled(false);
        cancelaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botões_clientePanelLayout = new javax.swing.GroupLayout(botões_clientePanel);
        botões_clientePanel.setLayout(botões_clientePanelLayout);
        botões_clientePanelLayout.setHorizontalGroup(
            botões_clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botões_clientePanelLayout.createSequentialGroup()
                .addComponent(novoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gravarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelaButton))
        );
        botões_clientePanelLayout.setVerticalGroup(
            botões_clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botões_clientePanelLayout.createSequentialGroup()
                .addGroup(botões_clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salvarButton)
                    .addComponent(eliminarButton)
                    .addComponent(novoButton)
                    .addComponent(consultarButton)
                    .addComponent(gravarButton)
                    .addComponent(cancelaButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cod_produtoLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cod_produtoLabel1.setText("Código de Barras");

        cod_produtoTextField1.setEditable(false);
        cod_produtoTextField1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cod_produtoTextField1.setEnabled(false);

        preço_vendaLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        preço_vendaLabel1.setText("Preço minimo R$");

        preço_vendaTextField1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        preço_vendaTextField1.setEnabled(false);

        javax.swing.GroupLayout dadosPanelLayout = new javax.swing.GroupLayout(dadosPanel);
        dadosPanel.setLayout(dadosPanelLayout);
        dadosPanelLayout.setHorizontalGroup(
            dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPanelLayout.createSequentialGroup()
                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dadosPanelLayout.createSequentialGroup()
                                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(un_produtoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(custo_produtoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nome_produtoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cod_produtoLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nome_produtoTextField)
                                    .addGroup(dadosPanelLayout.createSequentialGroup()
                                        .addComponent(cod_produtoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cod_produtoLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cod_produtoTextField1))
                                    .addGroup(dadosPanelLayout.createSequentialGroup()
                                        .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(un_produtoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(custo_produtoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(dadosPanelLayout.createSequentialGroup()
                                                .addComponent(preço_vendaLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(preço_vendaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(preço_vendaLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(preço_vendaTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                                            .addGroup(dadosPanelLayout.createSequentialGroup()
                                                .addComponent(marcaLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(marcaTextField)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(dadosPanelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(estoqueLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estoqueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(imagemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dadosPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(escolher_imgButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botões_clientePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        dadosPanelLayout.setVerticalGroup(
            dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dadosPanelLayout.createSequentialGroup()
                        .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cod_produtoLabel)
                            .addComponent(cod_produtoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cod_produtoLabel1)
                            .addComponent(cod_produtoTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome_produtoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome_produtoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(custo_produtoLabel)
                            .addComponent(custo_produtoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(preço_vendaLabel)
                            .addComponent(preço_vendaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(preço_vendaLabel1)
                            .addComponent(preço_vendaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(un_produtoLabel)
                            .addComponent(un_produtoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marcaLabel)
                            .addComponent(marcaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estoqueLabel)
                            .addComponent(estoqueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escolher_imgButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botões_clientePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dadosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dadosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void limpa() {
        cod_produtoTextField.setText("");
        nome_produtoTextField.setText("");
        custo_produtoTextField.setText("");
        preço_vendaTextField.setText("");
        estoqueTextField.setText("");
        //un_produtoComboBox.setSelectedIndex(0);
        marcaTextField.setText("");
        url_imagemTextField.setText("");
        imagem_produtoLabel.setText("");
    }

    public static void setEdição(boolean estado) {
        nome_produtoTextField.setEditable(estado);
        custo_produtoTextField.setEditable(estado);
        preço_vendaTextField.setEditable(estado);
        estoqueTextField.setEditable(estado);
        marcaTextField.setEditable(estado);
        un_produtoComboBox.setEnabled(true);
    }

    public static void setAtivo(boolean estado) {
        cod_produtoTextField.setEnabled(estado);
        nome_produtoTextField.setEnabled(estado);
        custo_produtoTextField.setEnabled(estado);
        preço_vendaTextField.setEnabled(estado);
        estoqueTextField.setEnabled(estado);
        un_produtoComboBox.setEnabled(estado);
        marcaTextField.setEnabled(estado);
        url_imagemTextField.setEnabled(estado);
        editarButton.setEnabled(estado);
        eliminarButton.setEnabled(estado);
        escolher_imgButton.setEnabled(estado);
        gravarButton.setEnabled(estado);
    }


    private void escolher_imgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolher_imgButtonActionPerformed
        JFileChooser j = new JFileChooser();
        int retorno = j.showOpenDialog(null);
        if (retorno == JFileChooser.APPROVE_OPTION) {
            imagem_produtoLabel.setIcon(new ImageIcon(j.getSelectedFile().getAbsolutePath()));
            url_imagemTextField.setText(j.getSelectedFile().getAbsolutePath().replace("\\", "\\\\"));
            System.out.println(j.getSelectedFile().getAbsolutePath());
            File fileIn = new File(j.getSelectedFile().getAbsolutePath());
            File fileOut = new File("Imagens\\" + fileIn.getName());

        } else {
            JOptionPane.showMessageDialog(this, "Erro ao abrir a imagem");
        }
    }//GEN-LAST:event_escolher_imgButtonActionPerformed
    public static boolean dadosOK(Produto produto) {
        if ((!produto.getNome().equals(""))
                && (produto.getPreço_custo() >= 0)
                && (produto.getPreço_venda() >= 0)
                && (produto.getEstoque() >= 0)
                && (produto.getUnidade() != null)
                && (produto.getCódigo() >= 0)
                && (!produto.getMarca().equals(""))) {
            return true;
        } else {
            return false;
        }
    }
    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        int eliminar = JOptionPane.showConfirmDialog(null, "Deseja realmente apagar este registro", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (eliminar == JOptionPane.YES_OPTION) {
            String mensagem_erro = controlador.removerProduto(Integer.valueOf(cod_produtoTextField.getText()).intValue());

            if (mensagem_erro != null) {
                JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Produto " + nome_produtoTextField.getText() + " eliminado com sucesso", "OK", JOptionPane.INFORMATION_MESSAGE);
                limpa();
                eliminarButton.setEnabled(false);
                editarButton.setEnabled(false);

            }
        }
    }//GEN-LAST:event_eliminarButtonActionPerformed
    public static void editarSalvar() {
        salvarButton.setVisible(false);
        editarButton.setVisible(true);
    }
    private void novoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoButtonActionPerformed
        setEdição(true);
        editarSalvar();
        limpa();
        setAtivo(true);
        nome_produtoTextField.grabFocus();
        novoButton.setEnabled(false);
        eliminarButton.setEnabled(false);
        consultarButton.setEnabled(false);
        editarButton.setEnabled(false);
        cancelaButton.setEnabled(true);
        cod_produtoTextField.setText(Produto.id());
        imagem_produtoLabel.setIcon(null);
    }//GEN-LAST:event_novoButtonActionPerformed

    private void consultarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarButtonActionPerformed
        JanelaConsulta<Produto> jProduto = new JanelaConsulta<Produto>(new Produto());
        jProduto.setTitle("Consulta Produto");
        jProduto.setVisible(true);
        limpa();
    }//GEN-LAST:event_consultarButtonActionPerformed

    private void gravarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarButtonActionPerformed
        consultarButton.setEnabled(true);
        cancelaButton.setEnabled(false);
        String mensagem_erro = null;

        Produto produto = new Produto(Integer.valueOf(cod_produtoTextField.getText()).intValue(),
                Float.valueOf(estoqueTextField.getText()).floatValue(), Float.valueOf(custo_produtoTextField.getText()).floatValue(),
                Float.valueOf(preço_vendaTextField.getText()).floatValue(), nome_produtoTextField.getText(),
                url_imagemTextField.getText(), un_produtoComboBox.getSelectedItem().toString(), marcaTextField.getText());

        if (!dadosOK(produto)) {
            mensagem_erro = "Não pode conter registros em branco";
        } else {
            mensagem_erro = controlador.inserirProduto(produto);
        }
        if (mensagem_erro != null) {
            JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, nome_produtoTextField.getText() + " Cadastrado com sucesso");
        }

        limpa();
        setAtivo(false);
        novoButton.setEnabled(true);
        imagem_produtoLabel.setIcon(null);
    }//GEN-LAST:event_gravarButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        editarButton.setVisible(false);
        salvarButton.setVisible(true);
        escolher_imgButton.setEnabled(true);
        nome_produtoTextField.grabFocus();
        setEdição(true);
    }//GEN-LAST:event_editarButtonActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        Produto produto = new Produto(Integer.valueOf(cod_produtoTextField.getText()).intValue(),
                Float.valueOf(estoqueTextField.getText()).floatValue(), Float.valueOf(custo_produtoTextField.getText()).floatValue(),
                Float.valueOf(preço_vendaTextField.getText()).floatValue(), nome_produtoTextField.getText(),
                url_imagemTextField.getText(), un_produtoComboBox.getSelectedItem().toString(), marcaTextField.getText());
        String mensagem_erro;
        if (!dadosOK(produto)) {
            mensagem_erro = "Não pode conter registros em branco";
        } else {
            mensagem_erro = controlador.alterarProduto(produto);
        }
        if (mensagem_erro != null) {
            JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, nome_produtoTextField.getText() + " alterado com sucesso");
        }

        setEdição(false);
        editarSalvar();
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void cancelaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelaButtonActionPerformed
        limpa();
        setAtivo(false);
        novoButton.setEnabled(true);
        consultarButton.setEnabled(true);
        cancelaButton.setEnabled(false);
        gravarButton.setEnabled(false);
        editarSalvar();
    }//GEN-LAST:event_cancelaButtonActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botões_clientePanel;
    private javax.swing.JButton cancelaButton;
    private javax.swing.JLabel cod_produtoLabel;
    private javax.swing.JLabel cod_produtoLabel1;
    public static javax.swing.JTextField cod_produtoTextField;
    public static javax.swing.JTextField cod_produtoTextField1;
    public static javax.swing.JButton consultarButton;
    private javax.swing.JLabel custo_produtoLabel;
    public static javax.swing.JTextField custo_produtoTextField;
    private javax.swing.JPanel dadosPanel;
    public static javax.swing.JButton editarButton;
    public static javax.swing.JButton eliminarButton;
    public static javax.swing.JButton escolher_imgButton;
    private javax.swing.JLabel estoqueLabel;
    public static javax.swing.JTextField estoqueTextField;
    public static javax.swing.JButton gravarButton;
    private javax.swing.JPanel imagemPanel;
    public static javax.swing.JLabel imagem_produtoLabel;
    private javax.swing.JLabel marcaLabel;
    public static javax.swing.JTextField marcaTextField;
    private javax.swing.JLabel nome_produtoLabel;
    public static javax.swing.JTextField nome_produtoTextField;
    public static javax.swing.JButton novoButton;
    private javax.swing.JLabel preço_vendaLabel;
    private javax.swing.JLabel preço_vendaLabel1;
    public static javax.swing.JTextField preço_vendaTextField;
    public static javax.swing.JTextField preço_vendaTextField1;
    public static javax.swing.JButton salvarButton;
    public static javax.swing.JComboBox un_produtoComboBox;
    private javax.swing.JLabel un_produtoLabel;
    private javax.swing.JLabel url_imagemLabel;
    public static javax.swing.JTextField url_imagemTextField;
    // End of variables declaration//GEN-END:variables
}
