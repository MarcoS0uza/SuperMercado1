    /*Esse arquivo é protegido por leis de copyright internacional, locais e pela lei de Deus, afinal, 
 só Deus sabe como essa merda funciona
 Não apagar dessa linha pra baixo*/
package interfaces;

import controle.ControladorCadastroFornecedor;
import controle.Tools;
import controle.buscaCEP;
import entidade.Cliente;
import entidade.FichaCadastro;
import entidade.Fornecedor;
import entidade.Visão;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author MARCOANTONIO
 */
public class JanelaCadastroFornecedor extends javax.swing.JFrame {

    ControladorCadastroFornecedor controlador;
    ArrayList<Fornecedor> fornecedores;//armazena fornecedores filtrados
    int cont = 0; // controla a navegação no array de fornecedor
    Tools tools = new Tools();
    public JanelaCadastroFornecedor(ControladorCadastroFornecedor controlador) {
        initComponents();
        setLocationRelativeTo(null);
        this.controlador = controlador;
        salvarButton.setVisible(false);
        estadoComboBox.setSelectedIndex(-1);
        salvarButton.setVisible(false);
        buscarButton.setVisible(false);
        imprimirButton.setEnabled(false);
        cancelaButton.setEnabled(false);
        setIconImage(imgJanela());// altera icone do Frame
        limpa();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dadosPanel = new javax.swing.JPanel();
        codigo_fornecedorLabel = new javax.swing.JLabel();
        cnpjLabel = new javax.swing.JLabel();
        nome_fornecedorLabel = new javax.swing.JLabel();
        cod_fornecedorTextField = new javax.swing.JTextField();
        nome_fornecedorTextField = new javax.swing.JTextField();
        email_fornecedorLabel = new javax.swing.JLabel();
        email_fornecedorTextField = new javax.swing.JTextField();
        botões_fornecedorPanel = new javax.swing.JPanel();
        eliminarButton = new javax.swing.JButton();
        novoButton = new javax.swing.JButton();
        buscarButton = new javax.swing.JButton();
        gravarButton = new javax.swing.JButton();
        editar_Button = new javax.swing.JButton();
        salvarButton = new javax.swing.JButton();
        cancelaButton = new javax.swing.JButton();
        imprimirButton = new javax.swing.JButton();
        selecionarButton = new javax.swing.JButton();
        cnpjFormattedTextField = new javax.swing.JFormattedTextField();
        endereço_fornecedorPanel = new javax.swing.JPanel();
        ruaLabel = new javax.swing.JLabel();
        ruaTextField = new javax.swing.JTextField();
        numeroLabel = new javax.swing.JLabel();
        numeroTextField = new javax.swing.JTextField();
        bairroLabel = new javax.swing.JLabel();
        bairroTextField = new javax.swing.JTextField();
        cidadeLabel = new javax.swing.JLabel();
        estadoLabel = new javax.swing.JLabel();
        estadoComboBox = new javax.swing.JComboBox();
        cepLabel = new javax.swing.JLabel();
        cepFormattedTextField = new javax.swing.JFormattedTextField();
        telefoneLabel = new javax.swing.JLabel();
        telefoneFormattedTextField = new javax.swing.JFormattedTextField();
        buscacepjLabel = new javax.swing.JLabel();
        cidadeTextField = new javax.swing.JComboBox();
        dataFormattedTextField = new javax.swing.JFormattedTextField();
        dataLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        primeiroButton = new javax.swing.JButton();
        atrasButton = new javax.swing.JButton();
        frenteButton = new javax.swing.JButton();
        ultimoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Fornecedor");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        dadosPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        codigo_fornecedorLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        codigo_fornecedorLabel.setText("Codigo");

        cnpjLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cnpjLabel.setText("CNPJ");

        nome_fornecedorLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nome_fornecedorLabel.setText("Nome");

        cod_fornecedorTextField.setEditable(false);
        cod_fornecedorTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cod_fornecedorTextField.setEnabled(false);
        cod_fornecedorTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cod_fornecedorTextFieldKeyPressed(evt);
            }
        });

        nome_fornecedorTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nome_fornecedorTextField.setEnabled(false);
        nome_fornecedorTextField.setFocusCycleRoot(true);
        nome_fornecedorTextField.setSelectedTextColor(new java.awt.Color(255, 204, 0));

        email_fornecedorLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        email_fornecedorLabel.setText("Email");

        email_fornecedorTextField.setEnabled(false);

        eliminarButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        eliminarButton.setText("Excluir");
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

        buscarButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buscarButton.setText("Buscar");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
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

        editar_Button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        editar_Button.setText("Editar");
        editar_Button.setEnabled(false);
        editar_Button.setMaximumSize(new java.awt.Dimension(63, 23));
        editar_Button.setMinimumSize(new java.awt.Dimension(63, 23));
        editar_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_ButtonActionPerformed(evt);
            }
        });

        salvarButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        salvarButton.setText("Salvar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        cancelaButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cancelaButton.setText("Cancelar");
        cancelaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelaButtonActionPerformed(evt);
            }
        });

        imprimirButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        imprimirButton.setText("Imprimir");
        imprimirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirButtonActionPerformed(evt);
            }
        });

        selecionarButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        selecionarButton.setText("Selecionar");
        selecionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botões_fornecedorPanelLayout = new javax.swing.GroupLayout(botões_fornecedorPanel);
        botões_fornecedorPanel.setLayout(botões_fornecedorPanelLayout);
        botões_fornecedorPanelLayout.setHorizontalGroup(
            botões_fornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botões_fornecedorPanelLayout.createSequentialGroup()
                .addComponent(imprimirButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(novoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editar_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selecionarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gravarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelaButton)
                .addGap(75, 75, 75))
        );
        botões_fornecedorPanelLayout.setVerticalGroup(
            botões_fornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botões_fornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(gravarButton)
                .addComponent(buscarButton)
                .addComponent(editar_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(salvarButton)
                .addComponent(eliminarButton)
                .addComponent(novoButton)
                .addComponent(cancelaButton)
                .addComponent(imprimirButton)
                .addComponent(selecionarButton))
        );

        try {
            cnpjFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cnpjFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cnpjFormattedTextField.setEnabled(false);
        cnpjFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnpjFormattedTextFieldActionPerformed(evt);
            }
        });

        endereço_fornecedorPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N

        ruaLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ruaLabel.setText("Rua");

        ruaTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ruaTextField.setEnabled(false);
        ruaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruaTextFieldActionPerformed(evt);
            }
        });

        numeroLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        numeroLabel.setText("Nº");

        numeroTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        numeroTextField.setEnabled(false);

        bairroLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bairroLabel.setText("Bairro");

        bairroTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bairroTextField.setEnabled(false);

        cidadeLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cidadeLabel.setText("Cidade");

        estadoLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        estadoLabel.setText("Estado");

        estadoComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        estadoComboBox.setModel(new DefaultComboBoxModel(FichaCadastro.UF.values()));
        estadoComboBox.setEnabled(false);
        estadoComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                estadoComboBoxFocusLost(evt);
            }
        });
        estadoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoComboBoxActionPerformed(evt);
            }
        });
        estadoComboBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                estadoComboBoxKeyPressed(evt);
            }
        });

        cepLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cepLabel.setText("Cep");

        try {
            cepFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cepFormattedTextField.setEnabled(false);

        telefoneLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        telefoneLabel.setText("Fone");

        try {
            telefoneFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneFormattedTextField.setEnabled(false);
        telefoneFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneFormattedTextFieldActionPerformed(evt);
            }
        });

        buscacepjLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buscacepjLabel.setForeground(new java.awt.Color(0, 0, 255));
        buscacepjLabel.setText("Buscar Endereço");
        buscacepjLabel.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        buscacepjLabel.setEnabled(false);
        buscacepjLabel.setText("<html><u>Buscar Endereço</u></html>");
        buscacepjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscacepjLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout endereço_fornecedorPanelLayout = new javax.swing.GroupLayout(endereço_fornecedorPanel);
        endereço_fornecedorPanel.setLayout(endereço_fornecedorPanelLayout);
        endereço_fornecedorPanelLayout.setHorizontalGroup(
            endereço_fornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endereço_fornecedorPanelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(endereço_fornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefoneLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bairroLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ruaLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cepLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(endereço_fornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(endereço_fornecedorPanelLayout.createSequentialGroup()
                        .addComponent(cepFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscacepjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(endereço_fornecedorPanelLayout.createSequentialGroup()
                        .addComponent(bairroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(estadoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estadoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(endereço_fornecedorPanelLayout.createSequentialGroup()
                        .addComponent(ruaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(numeroLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroTextField))
                    .addGroup(endereço_fornecedorPanelLayout.createSequentialGroup()
                        .addComponent(telefoneFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cidadeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cidadeTextField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        endereço_fornecedorPanelLayout.setVerticalGroup(
            endereço_fornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endereço_fornecedorPanelLayout.createSequentialGroup()
                .addGroup(endereço_fornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cepLabel)
                    .addComponent(cepFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscacepjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(endereço_fornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ruaLabel)
                    .addComponent(ruaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroLabel)
                    .addComponent(numeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(endereço_fornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(endereço_fornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(estadoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(estadoLabel))
                    .addGroup(endereço_fornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bairroLabel)
                        .addComponent(bairroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(endereço_fornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneLabel)
                    .addComponent(telefoneFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidadeLabel)
                    .addComponent(cidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        dataFormattedTextField.setEditable(false);
        dataFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        dataFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dataFormattedTextField.setEnabled(false);
        dataFormattedTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        dataLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dataLabel.setText("Data de Cadastro");

        primeiroButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        primeiroButton.setText("<<");
        primeiroButton.setToolTipText("Primeiro");
        primeiroButton.setEnabled(false);
        primeiroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeiroButtonActionPerformed(evt);
            }
        });

        atrasButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        atrasButton.setText("<");
        atrasButton.setToolTipText("Anterior");
        atrasButton.setEnabled(false);
        atrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasButtonActionPerformed(evt);
            }
        });

        frenteButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        frenteButton.setText(">");
        frenteButton.setToolTipText("Próximo");
        frenteButton.setEnabled(false);
        frenteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frenteButtonActionPerformed(evt);
            }
        });

        ultimoButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ultimoButton.setText(">>");
        ultimoButton.setToolTipText("Ultimo");
        ultimoButton.setEnabled(false);
        ultimoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(primeiroButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atrasButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frenteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ultimoButton))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frenteButton)
                    .addComponent(ultimoButton)
                    .addComponent(atrasButton)
                    .addComponent(primeiroButton)))
        );

        javax.swing.GroupLayout dadosPanelLayout = new javax.swing.GroupLayout(dadosPanel);
        dadosPanel.setLayout(dadosPanelLayout);
        dadosPanelLayout.setHorizontalGroup(
            dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPanelLayout.createSequentialGroup()
                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigo_fornecedorLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cnpjLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nome_fornecedorLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(email_fornecedorLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome_fornecedorTextField)
                            .addGroup(dadosPanelLayout.createSequentialGroup()
                                .addComponent(cnpjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(dadosPanelLayout.createSequentialGroup()
                                .addComponent(cod_fornecedorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dataLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dataFormattedTextField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(email_fornecedorTextField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(endereço_fornecedorPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botões_fornecedorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        dadosPanelLayout.setVerticalGroup(
            dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataLabel)
                    .addComponent(cod_fornecedorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigo_fornecedorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnpjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnpjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_fornecedorLabel)
                    .addComponent(nome_fornecedorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_fornecedorLabel)
                    .addComponent(email_fornecedorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endereço_fornecedorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botões_fornecedorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dadosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dadosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static boolean dadosOK(Fornecedor fornecedor) {
        return (fornecedor.getNome().equals(""))
                && (fornecedor.getN_documento().trim().equals(""))
                && (fornecedor.getEmail().equals(""))
                && (fornecedor.getEndereço().equals(""))
                && (fornecedor.getBairro().equals(""))
                && (fornecedor.getNumero() == -1)
                && (fornecedor.getCódigo() == -1)
                && (fornecedor.getCep().trim().equals(""))
                && (fornecedor.getTelefone().trim().equals(""))
                && (fornecedor.getCidade() == null)
                && (fornecedor.getEstado() == null);
    }

    public static void limpa() {
        dataFormattedTextField.setText("");
        cod_fornecedorTextField.setText("");
        nome_fornecedorTextField.setText("");
        cnpjFormattedTextField.setText("");
        email_fornecedorTextField.setText("");
        ruaTextField.setText("");
        numeroTextField.setText("");
        bairroTextField.setText("");
        cepFormattedTextField.setText("");
        telefoneFormattedTextField.setText("");
        cidadeTextField.setSelectedIndex(-1);
        estadoComboBox.setSelectedIndex(-1);
    }

    public static void editarSalvar() {
        salvarButton.setVisible(false);
        editar_Button.setVisible(true);
    }

    public static void setEdição(boolean estado) {
        cod_fornecedorTextField.setEditable(estado);
        dataFormattedTextField.setEditable(estado);
        nome_fornecedorTextField.setEditable(estado);
        cnpjFormattedTextField.setEditable(estado);
        email_fornecedorTextField.setEditable(estado);
        ruaTextField.setEditable(estado);
        numeroTextField.setEditable(estado);
        bairroTextField.setEditable(estado);
        estadoComboBox.setEnabled(estado);
        cepFormattedTextField.setEditable(estado);
        telefoneFormattedTextField.setEditable(estado);
        buscacepjLabel.setEnabled(estado);
        cidadeTextField.setEnabled(estado);
    }
    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        int eliminar = JOptionPane.showConfirmDialog(null, "Deseja realmente apagar este registro", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (eliminar == JOptionPane.YES_OPTION) {
            String mensagem_erro = controlador.removerFornecedor(Integer.valueOf(cod_fornecedorTextField.getText()).intValue());

            if (mensagem_erro != null) {
                JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
            } else {
                fornecedores.remove(cont);
                mostraDados(fornecedores.get(cont));
                eliminarButton.setEnabled(false);
                editar_Button.setEnabled(false);

            }
        }
    }//GEN-LAST:event_eliminarButtonActionPerformed
    public static void setAtivo(boolean estado) {
        cod_fornecedorTextField.setEnabled(estado);
        dataFormattedTextField.setEnabled(estado);
        nome_fornecedorTextField.setEnabled(estado);
        cnpjFormattedTextField.setEnabled(estado);
        email_fornecedorTextField.setEnabled(estado);
        ruaTextField.setEnabled(estado);
        numeroTextField.setEnabled(estado);
        bairroTextField.setEnabled(estado);
        estadoComboBox.setEnabled(estado);
        cepFormattedTextField.setEnabled(estado);
        telefoneFormattedTextField.setEnabled(estado);
        editar_Button.setEnabled(estado);
        eliminarButton.setEnabled(estado);
        gravarButton.setEnabled(estado);
        buscacepjLabel.setEnabled(estado);
        cidadeTextField.setEnabled(estado);
    }
    private void novoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoButtonActionPerformed
        cod_fornecedorTextField.setEditable(false);
        setEdição(true);
        editarSalvar();
        limpa();
        setAtivo(true);
        dataFormattedTextField.setText(FichaCadastro.getDataAtual());
        cnpjFormattedTextField.grabFocus();
        novoButton.setEnabled(false);
        eliminarButton.setEnabled(false);
        selecionarButton.setEnabled(false);
        editar_Button.setEnabled(false);
        cancelaButton.setEnabled(true);
        cod_fornecedorTextField.setText(Fornecedor.id());
        buscacepjLabel.setEnabled(true);
    }//GEN-LAST:event_novoButtonActionPerformed
    static public void mostraDados(Fornecedor fornecedor) {
        limpa();
        setAtivo(true);
        cnpjFormattedTextField.setText(fornecedor.getN_documento());
        gravarButton.setEnabled(false);
        cod_fornecedorTextField.setText(String.valueOf(fornecedor.getCódigo()));
        dataFormattedTextField.setText(fornecedor.getData_cadastro());
        nome_fornecedorTextField.setText(fornecedor.getNome());
        email_fornecedorTextField.setText(fornecedor.getEmail());
        ruaTextField.setText(fornecedor.getEndereço());
        numeroTextField.setText(String.valueOf(fornecedor.getNumero()));
        bairroTextField.setText(fornecedor.getBairro());
        estadoComboBox.setSelectedItem(FichaCadastro.UF.valueOf(fornecedor.getEstado()));
        cepFormattedTextField.setText(fornecedor.getCep());
        telefoneFormattedTextField.setText(fornecedor.getTelefone());
        ArrayList<Visão> cidades = Cliente.getCidades(estadoComboBox.getSelectedItem().toString());
        cidadeTextField.setModel(new DefaultComboBoxModel(cidades.toArray()));
        cidadeTextField.setSelectedItem(fornecedor.getCidade());
        if (fornecedor.getCidade().contains("-")) {
            String[] city = fornecedor.getCidade().split("-");//extrai index do nome da cidade
            int index_cidade = Integer.parseInt(city[0]);//convert o index para inteiro
            cidadeTextField.setSelectedIndex(index_cidade);
        } else {
            cidadeTextField.setSelectedIndex(-1);
        }
        setEdição(false);
        editarSalvar();
        selecionarButton.setVisible(true);
        buscarButton.setVisible(false);

    }
    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        cont = 0;
        if (!cod_fornecedorTextField.getText().isEmpty()) {
            Fornecedor fornecedor = Fornecedor.buscarFornecedor(Integer.parseInt(cod_fornecedorTextField.getText()));
            if (fornecedor == null) {
                JOptionPane.showMessageDialog(this, "Fornecedor não encontrado", "Atenção", JOptionPane.WARNING_MESSAGE);
            } else {
                mostraDados(fornecedor);
                selecionarButton.setVisible(true);
                buscarButton.setVisible(false);
                imprimirButton.setEnabled(true);
                botoesNavegacao(false);
            }
        } else {
            imprimirButton.setEnabled(true);
            botoesNavegacao(true);
            String cidade, uf;
            int cod, numero;

            if (cod_fornecedorTextField.getText().isEmpty()) {
                cod = -1;
            } else {
                cod = Integer.parseInt(cod_fornecedorTextField.getText());
            }

            if (numeroTextField.getText().isEmpty()) {
                numero = -1;
            } else {
                numero = Integer.parseInt(numeroTextField.getText());
            }

            if (estadoComboBox.getSelectedIndex() == -1) {
                uf = null;
            } else {
                uf = estadoComboBox.getSelectedItem().toString();
            }
            if (cidadeTextField.getSelectedIndex() == -1) {
                cidade = null;
            } else {
                cidade = String.valueOf(cidadeTextField.getSelectedIndex()) + "-" + cidadeTextField.getSelectedItem().toString();
            }
            //cria objeto fornecedor com os dados do jFrame
            try {
                Fornecedor fornecedor = new Fornecedor(cod,
                        numero, nome_fornecedorTextField.getText(), dataFormattedTextField.getText(), tools.retiraMascara(cnpjFormattedTextField.getText()),
                        ruaTextField.getText(), bairroTextField.getText(), tools.retiraMascara(telefoneFormattedTextField.getText()),
                        tools.retiraMascara(cepFormattedTextField.getText()), uf,
                        cidade, email_fornecedorTextField.getText());
                System.out.println(fornecedor.toString());
                if (dadosOK(fornecedor)) {
                    fornecedor = null;
                }
                fornecedores = Fornecedor.buscarTodosFornecedores(fornecedor);
                if (fornecedores.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Fornecedor não encontrado", "Atenção", JOptionPane.WARNING_MESSAGE);
                } else {
                    if (fornecedores.size() == 1) {
                        botoesNavegacao(false);
                    }
                    mostraDados(fornecedores.get(0));
                    selecionarButton.setVisible(true);
                    buscarButton.setVisible(false);

                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void gravarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarButtonActionPerformed
        selecionarButton.setEnabled(true);
        cancelaButton.setEnabled(false);
        String mensagem_erro;

        String cidade, uf;
        int cod, numero;

        if (cod_fornecedorTextField.getText().isEmpty()) {
            cod = -1;
        } else {
            cod = Integer.parseInt(cod_fornecedorTextField.getText());
        }

        if (numeroTextField.getText().isEmpty()) {
            numero = -1;
        } else {
            numero = Integer.parseInt(numeroTextField.getText());
        }

        if (estadoComboBox.getSelectedIndex() == -1) {
            uf = null;
        } else {
            uf = estadoComboBox.getSelectedItem().toString();
        }
        if (cidadeTextField.getSelectedIndex() == -1) {
            cidade = null;
        } else {
            cidade = cidadeTextField.getSelectedItem().toString();
        }

        //cria objeto fornecedor com os dados do jFrame
        Fornecedor fornecedor = new Fornecedor(cod,
                        numero, nome_fornecedorTextField.getText(), dataFormattedTextField.getText(), tools.retiraMascara(cnpjFormattedTextField.getText()),
                        ruaTextField.getText(), bairroTextField.getText(), tools.retiraMascara(telefoneFormattedTextField.getText()),
                        tools.retiraMascara(cepFormattedTextField.getText()), uf,
                        cidade, email_fornecedorTextField.getText());

        if (dadosOK(fornecedor)) {//verificada se tem campos em branco
            mensagem_erro = "Não pode conter registros em branco";
        } else {
            mensagem_erro = controlador.inserirFornecedor(fornecedor);//executa sql
        }

        //trata retorno do inserirCliente(fornecedor)
        if (mensagem_erro != null) {
            JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        } else {
            setAtivo(false);
            novoButton.setEnabled(true);
        }


    }//GEN-LAST:event_gravarButtonActionPerformed

    private void editar_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_ButtonActionPerformed
        botoesNavegacao(false);
        editar_Button.setVisible(false);
        salvarButton.setVisible(true);
        cod_fornecedorTextField.setEditable(false);
        nome_fornecedorTextField.grabFocus();
        setEdição(true);
    }//GEN-LAST:event_editar_ButtonActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        String cidade, uf;
        int cod, numero;

        if (cod_fornecedorTextField.getText().isEmpty()) {
            cod = -1;
        } else {
            cod = Integer.parseInt(cod_fornecedorTextField.getText());
        }

        if (numeroTextField.getText().isEmpty()) {
            numero = -1;
        } else {
            numero = Integer.parseInt(numeroTextField.getText());
        }

        if (estadoComboBox.getSelectedIndex() == -1) {
            uf = null;
        } else {
            uf = estadoComboBox.getSelectedItem().toString();
        }
        if (cidadeTextField.getSelectedIndex() == -1) {
            cidade = null;
        } else {
            cidade = String.valueOf(cidadeTextField.getSelectedIndex()) + "-" + cidadeTextField.getSelectedItem().toString();
        }

        Fornecedor fornecedor = new Fornecedor(cod,
                        numero, nome_fornecedorTextField.getText(), dataFormattedTextField.getText(), tools.retiraMascara(cnpjFormattedTextField.getText()),
                        ruaTextField.getText(), bairroTextField.getText(), tools.retiraMascara(telefoneFormattedTextField.getText()),
                        tools.retiraMascara(cepFormattedTextField.getText()), uf,
                        cidade, email_fornecedorTextField.getText());

        String mensagem_erro;
        if (dadosOK(fornecedor)) {
            mensagem_erro = "Algum campo não foi preenchido";
        } else {
            mensagem_erro = controlador.alterarFornecedor(fornecedor);
            fornecedores.set(cont, fornecedor);
        }

        if (mensagem_erro != null) {
            JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        } else {
            setEdição(false);
            editarSalvar();
        }
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void cancelaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelaButtonActionPerformed
        limpa();
        setAtivo(false);
        novoButton.setEnabled(true);
        selecionarButton.setEnabled(true);
        cancelaButton.setEnabled(false);
        gravarButton.setEnabled(false);
        selecionarButton.setVisible(true);
        buscarButton.setVisible(false);
        cod_fornecedorTextField.setEditable(false);
        cod_fornecedorTextField.setEnabled(false);
        editarSalvar();
        cont = 0;
        botoesNavegacao(false);
    }//GEN-LAST:event_cancelaButtonActionPerformed

    private void botoesNavegacao(boolean estado) {
        frenteButton.setEnabled(estado);
        atrasButton.setEnabled(estado);
        ultimoButton.setEnabled(estado);
        primeiroButton.setEnabled(estado);
    }

    private void cnpjFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnpjFormattedTextFieldActionPerformed
    }//GEN-LAST:event_cnpjFormattedTextFieldActionPerformed

    private void ruaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ruaTextFieldActionPerformed

    private void estadoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoComboBoxActionPerformed
    }//GEN-LAST:event_estadoComboBoxActionPerformed

    private void telefoneFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneFormattedTextFieldActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        cont = 0;
        JanelaPrincipal.controleFornecedor = null;
    }//GEN-LAST:event_formWindowClosed

    private void buscacepjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscacepjLabelMouseClicked
        String cep = cepFormattedTextField.getText().replace(".", "").replace("-", "");
        if (cep.equals("        ")) {
            JOptionPane.showMessageDialog(this, "CEP não informado");
        } else {
            try {
                if (buscaCEP.existe(cep)) {
                    ruaTextField.setText(buscaCEP.getEndereco(cep).replace("Ã£", "ã"));
                    bairroTextField.setText(buscaCEP.getBairro(cep).replace("Ã£", "ã"));
                    estadoComboBox.setSelectedItem(FichaCadastro.UF.valueOf(buscaCEP.getUF(cep)));
                    estadoComboBox.grabFocus();
                    numeroTextField.grabFocus();

                } else {
                    JOptionPane.showMessageDialog(this, "Cep " + cep + " não encontrado ");
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao buscar endereço: " + ex);
            }

        }
    }//GEN-LAST:event_buscacepjLabelMouseClicked

    private void estadoComboBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_estadoComboBoxFocusLost
        ArrayList<Visão> cidades = Cliente.getCidades(estadoComboBox.getSelectedItem().toString());
        cidadeTextField.setModel(new DefaultComboBoxModel(cidades.toArray()));
        cidadeTextField.setSelectedIndex(-1);
    }//GEN-LAST:event_estadoComboBoxFocusLost

    private void estadoComboBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_estadoComboBoxKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            telefoneFormattedTextField.grabFocus();
        }
    }//GEN-LAST:event_estadoComboBoxKeyPressed

    private void primeiroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeiroButtonActionPerformed
        mostraDados(fornecedores.get(0));
        cont = 0;
    }//GEN-LAST:event_primeiroButtonActionPerformed

    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasButtonActionPerformed
        if (cont != 0) {
            mostraDados(fornecedores.get(cont - 1));
            cont--;
        }
    }//GEN-LAST:event_atrasButtonActionPerformed

    private void frenteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frenteButtonActionPerformed
        if (cont < fornecedores.size()) {
            mostraDados(fornecedores.get(cont + 1));
            cont++;
        }
    }//GEN-LAST:event_frenteButtonActionPerformed

    private void ultimoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimoButtonActionPerformed
        mostraDados(fornecedores.get(fornecedores.size() - 1));
        cont = fornecedores.size() - 1;
    }//GEN-LAST:event_ultimoButtonActionPerformed

    private void imprimirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirButtonActionPerformed
        //        AbreRelatorio relatorio = new AbreRelatorio(JanelaPrincipal.caminho);
        //        relatorio.rel_fornecedor(clientes);
    }//GEN-LAST:event_imprimirButtonActionPerformed


    private void selecionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarButtonActionPerformed
        limpa();
        setAtivo(true);
        setEdição(true);
        cancelaButton.setEnabled(true);
        cod_fornecedorTextField.grabFocus();
        selecionarButton.setVisible(false);
        buscarButton.setVisible(true);
        cod_fornecedorTextField.setEditable(true);
        cod_fornecedorTextField.setEnabled(true);
        imprimirButton.setEnabled(false);
        novoButton.setEnabled(false);
        eliminarButton.setEnabled(false);
        editar_Button.setEnabled(false);
        gravarButton.setEnabled(false);
    }//GEN-LAST:event_selecionarButtonActionPerformed

    private void cod_fornecedorTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cod_fornecedorTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F2) {
            JanelaConsulta<Fornecedor> consulta = new JanelaConsulta<Fornecedor>(new Fornecedor());
            consulta.setTitle("Forncedores");//muda o titulo da janela, para identificar a classe chamadora
            consulta.setVisible(true);
            limpa();
        }
    }//GEN-LAST:event_cod_fornecedorTextFieldKeyPressed

    private Image imgJanela() {
        try {
            return ImageIO.read(this.getClass().getResource("/imagens/olhodetandera.jpg"));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasButton;
    private javax.swing.JLabel bairroLabel;
    public static javax.swing.JTextField bairroTextField;
    private javax.swing.JPanel botões_fornecedorPanel;
    public static javax.swing.JLabel buscacepjLabel;
    public static javax.swing.JButton buscarButton;
    private javax.swing.JButton cancelaButton;
    public static javax.swing.JFormattedTextField cepFormattedTextField;
    private javax.swing.JLabel cepLabel;
    private javax.swing.JLabel cidadeLabel;
    public static javax.swing.JComboBox cidadeTextField;
    public static javax.swing.JFormattedTextField cnpjFormattedTextField;
    public static javax.swing.JLabel cnpjLabel;
    public static javax.swing.JTextField cod_fornecedorTextField;
    private javax.swing.JLabel codigo_fornecedorLabel;
    private javax.swing.JPanel dadosPanel;
    public static javax.swing.JFormattedTextField dataFormattedTextField;
    private javax.swing.JLabel dataLabel;
    public static javax.swing.JButton editar_Button;
    public static javax.swing.JButton eliminarButton;
    private javax.swing.JLabel email_fornecedorLabel;
    public static javax.swing.JTextField email_fornecedorTextField;
    private javax.swing.JPanel endereço_fornecedorPanel;
    public static javax.swing.JComboBox estadoComboBox;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JButton frenteButton;
    public static javax.swing.JButton gravarButton;
    private javax.swing.JButton imprimirButton;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nome_fornecedorLabel;
    public static javax.swing.JTextField nome_fornecedorTextField;
    public static javax.swing.JButton novoButton;
    private javax.swing.JLabel numeroLabel;
    public static javax.swing.JTextField numeroTextField;
    private javax.swing.JButton primeiroButton;
    private javax.swing.JLabel ruaLabel;
    public static javax.swing.JTextField ruaTextField;
    public static javax.swing.JButton salvarButton;
    public static javax.swing.JButton selecionarButton;
    public static javax.swing.JFormattedTextField telefoneFormattedTextField;
    private javax.swing.JLabel telefoneLabel;
    private javax.swing.JButton ultimoButton;
    // End of variables declaration//GEN-END:variables

}
