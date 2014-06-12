    /*Esse arquivo é protegido por leis de copyright internacional, locais e pela lei de Deus, afinal, 
 só Deus sabe como essa merda funciona
 Não apagar dessa linha pra baixo*/
package interfaces;

import controle.ControladorCadastroCliente;
import controle.buscaCEP;
import entidade.Cliente;
import entidade.FichaCadastro;
import entidade.Visão;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author MARCOANTONIO
 */
public class JanelaCadastroCliente_ extends javax.swing.JFrame {

    ControladorCadastroCliente controlador;
    private String tipo;//armazena o tipo do cliente(Fisica ou Juridica)

    public JanelaCadastroCliente_(ControladorCadastroCliente controlador) {
        this.controlador = controlador;
        initComponents();
        estadoComboBox.setSelectedIndex(-1);
        setLocationRelativeTo(null);
        salvarButton.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pessoabuttonGroup = new javax.swing.ButtonGroup();
        dadosPanel = new javax.swing.JPanel();
        codigoLabel = new javax.swing.JLabel();
        cpfcnpjLabel = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        cod_clienteTextField = new javax.swing.JTextField();
        nome_clienteTextField = new javax.swing.JTextField();
        email_clienteLabel = new javax.swing.JLabel();
        email_clienteTextField = new javax.swing.JTextField();
        sexoLabel = new javax.swing.JLabel();
        botões_clientePanel = new javax.swing.JPanel();
        eliminarButton = new javax.swing.JButton();
        novo_clienteButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();
        gravar_clienteButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        salvarButton = new javax.swing.JButton();
        cancelaButton = new javax.swing.JButton();
        tipo_pessoaLabel = new javax.swing.JLabel();
        fisicaRadioButton = new javax.swing.JRadioButton();
        juridicaRadioButton = new javax.swing.JRadioButton();
        cnpjCpfFormattedTextField = new javax.swing.JFormattedTextField();
        endereço_clientePanel = new javax.swing.JPanel();
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
        sexoComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setResizable(false);

        dadosPanel.setBackground(new java.awt.Color(255, 255, 255));
        dadosPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Cadastro de Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        codigoLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        codigoLabel.setText("Codigo");

        cpfcnpjLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cpfcnpjLabel.setText("Cpf");

        nomeLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nomeLabel.setText("Nome");

        cod_clienteTextField.setEditable(false);
        cod_clienteTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cod_clienteTextField.setEnabled(false);

        nome_clienteTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nome_clienteTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nome_clienteTextField.setEnabled(false);
        nome_clienteTextField.setFocusCycleRoot(true);
        nome_clienteTextField.setSelectedTextColor(new java.awt.Color(255, 204, 0));

        email_clienteLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        email_clienteLabel.setText("Email");

        email_clienteTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        email_clienteTextField.setEnabled(false);

        sexoLabel.setBackground(new java.awt.Color(0, 0, 0));
        sexoLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sexoLabel.setText("Sexo");

        botões_clientePanel.setBackground(new java.awt.Color(255, 255, 255));

        eliminarButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        eliminarButton.setText("Eliminar");
        eliminarButton.setEnabled(false);
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        novo_clienteButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        novo_clienteButton.setText("Novo");
        novo_clienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novo_clienteButtonActionPerformed(evt);
            }
        });

        consultarButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        consultarButton.setText("Consultar");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarButtonActionPerformed(evt);
            }
        });

        gravar_clienteButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        gravar_clienteButton.setText("Gravar");
        gravar_clienteButton.setEnabled(false);
        gravar_clienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravar_clienteButtonActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(novo_clienteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gravar_clienteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelaButton))
        );
        botões_clientePanelLayout.setVerticalGroup(
            botões_clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botões_clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(gravar_clienteButton)
                .addComponent(consultarButton)
                .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(salvarButton)
                .addComponent(eliminarButton)
                .addComponent(novo_clienteButton)
                .addComponent(cancelaButton))
        );

        tipo_pessoaLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tipo_pessoaLabel.setText("Pessoa");

        fisicaRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        pessoabuttonGroup.add(fisicaRadioButton);
        fisicaRadioButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        fisicaRadioButton.setText("Física");
        fisicaRadioButton.setEnabled(false);
        fisicaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fisicaRadioButtonActionPerformed(evt);
            }
        });

        juridicaRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        pessoabuttonGroup.add(juridicaRadioButton);
        juridicaRadioButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        juridicaRadioButton.setText("Juridica");
        juridicaRadioButton.setEnabled(false);
        juridicaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juridicaRadioButtonActionPerformed(evt);
            }
        });

        try {
            cnpjCpfFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cnpjCpfFormattedTextField.setEnabled(false);
        cnpjCpfFormattedTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        endereço_clientePanel.setBackground(new java.awt.Color(255, 255, 255));
        endereço_clientePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N

        ruaLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ruaLabel.setText("Rua");

        ruaTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ruaTextField.setEnabled(false);

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
        telefoneLabel.setText("Telefone");

        try {
            telefoneFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneFormattedTextField.setEnabled(false);

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscacepjLabelMouseEntered(evt);
            }
        });

        cidadeTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cidadeTextField.setEnabled(false);
        cidadeTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cidadeTextFieldFocusLost(evt);
            }
        });

        javax.swing.GroupLayout endereço_clientePanelLayout = new javax.swing.GroupLayout(endereço_clientePanel);
        endereço_clientePanel.setLayout(endereço_clientePanelLayout);
        endereço_clientePanelLayout.setHorizontalGroup(
            endereço_clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endereço_clientePanelLayout.createSequentialGroup()
                .addComponent(bairroLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(endereço_clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(endereço_clientePanelLayout.createSequentialGroup()
                        .addComponent(telefoneLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefoneFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cidadeLabel))
                    .addComponent(bairroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(endereço_clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(endereço_clientePanelLayout.createSequentialGroup()
                        .addComponent(estadoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estadoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(cidadeTextField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(endereço_clientePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(endereço_clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(endereço_clientePanelLayout.createSequentialGroup()
                        .addComponent(ruaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ruaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numeroLabel))
                    .addGroup(endereço_clientePanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(cepLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cepFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscacepjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        endereço_clientePanelLayout.setVerticalGroup(
            endereço_clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, endereço_clientePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(endereço_clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cepLabel)
                    .addComponent(cepFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscacepjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(endereço_clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ruaLabel)
                    .addComponent(ruaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroLabel)
                    .addComponent(numeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(endereço_clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bairroLabel)
                    .addComponent(bairroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estadoLabel)
                    .addComponent(estadoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(endereço_clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneLabel)
                    .addComponent(cidadeLabel)
                    .addComponent(telefoneFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidadeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        dataFormattedTextField.setEditable(false);
        dataFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        dataFormattedTextField.setEnabled(false);
        dataFormattedTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        dataLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dataLabel.setText("Data de Cadastro");

        sexoComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sexoComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));
        sexoComboBox.setEnabled(false);

        javax.swing.GroupLayout dadosPanelLayout = new javax.swing.GroupLayout(dadosPanel);
        dadosPanel.setLayout(dadosPanelLayout);
        dadosPanelLayout.setHorizontalGroup(
            dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(endereço_clientePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(dadosPanelLayout.createSequentialGroup()
                        .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeLabel)
                            .addComponent(codigoLabel)
                            .addComponent(sexoLabel)
                            .addComponent(email_clienteLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome_clienteTextField)
                            .addComponent(email_clienteTextField)
                            .addGroup(dadosPanelLayout.createSequentialGroup()
                                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dadosPanelLayout.createSequentialGroup()
                                        .addComponent(cod_clienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dataLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dataFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(dadosPanelLayout.createSequentialGroup()
                                        .addComponent(sexoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                        .addComponent(tipo_pessoaLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fisicaRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(juridicaRadioButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(cpfcnpjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cnpjCpfFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botões_clientePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        dadosPanelLayout.setVerticalGroup(
            dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cod_clienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoLabel)
                    .addComponent(dataFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataLabel))
                .addGap(6, 6, 6)
                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(nome_clienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(sexoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexoLabel)
                    .addComponent(cnpjCpfFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tipo_pessoaLabel)
                        .addComponent(fisicaRadioButton)
                        .addComponent(juridicaRadioButton)
                        .addComponent(cpfcnpjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_clienteLabel)
                    .addComponent(email_clienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(endereço_clientePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botões_clientePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(dadosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //apaga o conteúdo dos jtextfield
    public static void limpa() {
        dataFormattedTextField.setText("");
        cod_clienteTextField.setText("");
        nome_clienteTextField.setText("");
        cnpjCpfFormattedTextField.setText("");
        email_clienteTextField.setText("");
        ruaTextField.setText("");
        numeroTextField.setText("");
        bairroTextField.setText("");
        cepFormattedTextField.setText("");
        telefoneFormattedTextField.setText("");
        //cidadeTextField.setText("");
    }

    //controla se o elemento vai ser editavel ou não
    public static void setEdição(boolean estado) {
        cod_clienteTextField.setEditable(estado);
        dataFormattedTextField.setEditable(estado);
        nome_clienteTextField.setEditable(estado);
        cnpjCpfFormattedTextField.setEditable(estado);
        email_clienteTextField.setEditable(estado);
        sexoComboBox.setEnabled(estado);
        ruaTextField.setEditable(estado);
        numeroTextField.setEditable(estado);
        bairroTextField.setEditable(estado);
        estadoComboBox.setEnabled(estado);
        cepFormattedTextField.setEditable(estado);
        telefoneFormattedTextField.setEditable(estado);
        fisicaRadioButton.setEnabled(estado);
        juridicaRadioButton.setEnabled(estado);
        buscacepjLabel.setEnabled(estado);
        cidadeTextField.setEnabled(estado);

    }

    //controla se o elemento vai ficar ativo ou não
    public static void setAtivo(boolean estado) {
        cod_clienteTextField.setEnabled(estado);
        dataFormattedTextField.setEnabled(estado);
        fisicaRadioButton.setEnabled(estado);
        juridicaRadioButton.setEnabled(estado);
        nome_clienteTextField.setEnabled(estado);
        cnpjCpfFormattedTextField.setEnabled(estado);
        email_clienteTextField.setEnabled(estado);
        sexoComboBox.setEnabled(estado);
        ruaTextField.setEnabled(estado);
        numeroTextField.setEnabled(estado);
        bairroTextField.setEnabled(estado);
        estadoComboBox.setEnabled(estado);
        cepFormattedTextField.setEnabled(estado);
        telefoneFormattedTextField.setEnabled(estado);
        //cidadeTextField.setEnabled(estado);
        editarButton.setEnabled(estado);
        eliminarButton.setEnabled(estado);
        gravar_clienteButton.setEnabled(estado);
        buscacepjLabel.setEnabled(estado);
    }

    //evento quando o radiobutton cnpj for selecionado
    private void juridicaRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juridicaRadioButtonActionPerformed
        if (juridicaRadioButton.isSelected()) {
            cpfcnpjLabel.setText("Cnpj");//muda nome do Label
            sexoComboBox.setEnabled(false);//desabilita combobox sexo
            sexoComboBox.setVisible(false);
            cnpjCpfFormattedTextField.setValue("");// apaga conteúdo anterior
            //muda mascara do campo 
            try {
                cnpjCpfFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_juridicaRadioButtonActionPerformed

    //evento quando o radiobutton cpf for selecionado
    private void fisicaRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fisicaRadioButtonActionPerformed
        if (fisicaRadioButton.isSelected()) {
            cpfcnpjLabel.setText("Cpf");//muda nome do Label
            sexoComboBox.setEnabled(true);//habilita combobox sexo
            sexoComboBox.setVisible(true);
            cnpjCpfFormattedTextField.setValue("");// apaga conteúdo anterior
            //muda mascara do campo 
            try {
                cnpjCpfFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_fisicaRadioButtonActionPerformed

    //controla a visibilidade dos botões editar e salvar
    public static void editarSalvar() {
        salvarButton.setVisible(false);
        editarButton.setVisible(true);
    }

    //evento cancelar
    private void cancelaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelaButtonActionPerformed
        limpa();
        setAtivo(false);
        novo_clienteButton.setEnabled(true);
        consultarButton.setEnabled(true);
        cancelaButton.setEnabled(false);
        gravar_clienteButton.setEnabled(false);
        editarSalvar();
    }//GEN-LAST:event_cancelaButtonActionPerformed

    //evento salvar (Update)
    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        //captura o tipo do cliente
        if (juridicaRadioButton.isSelected()) {
            tipo = juridicaRadioButton.getText();
        } else if (fisicaRadioButton.isSelected()) {
            tipo = fisicaRadioButton.getText();
        }

        //captura o sexo do cliente, caso seja juridica sexo = "9"
        String sexo = "";
        if (cpfcnpjLabel.getText().equalsIgnoreCase("Cnpj")) {
            sexo = "9";
        } else {
            sexo = sexoComboBox.getSelectedItem().toString();
        }

        //cria objeto cliente com os dados do jFrame
        Cliente cliente = new Cliente(tipo, sexo.toString(),
                Integer.valueOf(cod_clienteTextField.getText()).intValue(),//convert int
                Integer.valueOf(numeroTextField.getText()).intValue(),//convert int
                nome_clienteTextField.getText(), dataFormattedTextField.getText(),
                cnpjCpfFormattedTextField.getText().replace(".", "").replace("/", "").replace("-", "")/*replace() retira mascara*/, ruaTextField.getText(),
                bairroTextField.getText(), telefoneFormattedTextField.getText().replace("(", "").replace(")", "").replace("-", "")/*replace() retira mascara*/,
                cepFormattedTextField.getText().replace(".", "").replace("-", "")/*replace() retira mascara*/, estadoComboBox.getSelectedItem().toString(),
                String.valueOf(cidadeTextField.getSelectedIndex()) + "-" + cidadeTextField.getSelectedItem().toString(), email_clienteTextField.getText());

        String mensagem_erro;
        if (!dadosOK(cliente)) {//verificada se tem campos em branco
            mensagem_erro = "Algum atributo do cliente não foi preenchido";
        } else {
            mensagem_erro = controlador.alterarCliente(cliente);
        }

        //trata retorno do inserirCliente(cliente)
        if (mensagem_erro != null) {
            JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Cliente " + cliente.getNome() + " alterado com sucesso", "OK", JOptionPane.INFORMATION_MESSAGE);
        }

        setEdição(
                false);
        editarSalvar();
    }//GEN-LAST:event_salvarButtonActionPerformed

    //evento editar
    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        editarButton.setVisible(false);
        salvarButton.setVisible(true);
        cod_clienteTextField.setEditable(false);
        nome_clienteTextField.grabFocus();
        setEdição(true);
    }//GEN-LAST:event_editarButtonActionPerformed

    //evento gravar(Insert)
    private void gravar_clienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravar_clienteButtonActionPerformed
        consultarButton.setEnabled(true);
        cancelaButton.setEnabled(false);
        String mensagem_erro;

        //somado com a função dadosOk verificada se tem campos em branco
        if (numeroTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Não pode conter registros em branco", "Atenção", JOptionPane.WARNING_MESSAGE);
        }

        //captura o sexo do cliente, caso seja juridica sexo = "9"
        String sexo;
        if (cpfcnpjLabel.getText().equalsIgnoreCase("Cnpj")) {
            sexo = "9";
        } else {
            sexo = sexoComboBox.getSelectedItem().toString();
        }

        //cria objeto cliente com os dados do jFrame
        Cliente cliente = new Cliente(tipo, sexo,
                Integer.valueOf(cod_clienteTextField.getText()).intValue(),//convert int
                Integer.valueOf(numeroTextField.getText()).intValue(),//convert int
                nome_clienteTextField.getText(), dataFormattedTextField.getText(),
                cnpjCpfFormattedTextField.getText().replace(".", "").replace("/", "").replace("-", "")/*replace() retira mascara*/, ruaTextField.getText(),
                bairroTextField.getText(), telefoneFormattedTextField.getText().replace("(", "").replace(")", "").replace("-", "")/*replace() retira mascara*/,
                cepFormattedTextField.getText().replace(".", "").replace("-", ""), estadoComboBox.getSelectedItem().toString(),
                cidadeTextField.getSelectedItem().toString(), email_clienteTextField.getText());

        if (!dadosOK(cliente)) {//verificada se tem campos em branco
            mensagem_erro = "Não pode conter registros em branco";
        } else {
            mensagem_erro = controlador.inserirCliente(cliente);//executa sql
        }

        //trata retorno do inserirCliente(cliente)
        if (mensagem_erro != null) {
            JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, nome_clienteTextField.getText() + " Cadastrado com sucesso");
        }

        limpa();
        setAtivo(false);
        novo_clienteButton.setEnabled(true);
        pessoabuttonGroup.clearSelection();
        estadoComboBox.setSelectedIndex(0);
        sexoComboBox.setSelectedIndex(0);

    }//GEN-LAST:event_gravar_clienteButtonActionPerformed

    //chama janela responsavel por consulta no BD (Select)
    private void consultarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarButtonActionPerformed
        JanelaConsulta<Cliente> consulta = new JanelaConsulta<Cliente>(new Cliente());
        consulta.setTitle("Clientes");//muda o titulo da janela, para identificar a classe chamadora
        consulta.setVisible(true);
        limpa();
    }//GEN-LAST:event_consultarButtonActionPerformed

    //verifica se se há campos em branco, se tiver retorna false senão true
    public static boolean dadosOK(Cliente clientes) {
        if ((!clientes.getNome().equals(""))
                && (!clientes.getN_documento().equals(""))
                && (!clientes.getEmail().equals(""))
                && (!clientes.getEndereço().equals(""))
                && (!clientes.getBairro().equals(""))
                && (clientes.getNumero() >= 0)
                && (clientes.getCódigo() >= 0)
                && (!clientes.getCep().equals(""))
                && (!clientes.getTelefone().equals(""))
                && (!clientes.getCidade().equals(""))) {
            return true;
        } else {
            return false;
        }
    }

    //evento novo, prepara a janela para inserir um cadastro
    private void novo_clienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novo_clienteButtonActionPerformed
        setEdição(true);
        editarSalvar();
        tipo = fisicaRadioButton.getText();
        fisicaRadioButton.setSelected(true);
        limpa();
        setAtivo(true);
        dataFormattedTextField.setText(FichaCadastro.getDataAtual());
        nome_clienteTextField.grabFocus();
        novo_clienteButton.setEnabled(false);
        eliminarButton.setEnabled(false);
        consultarButton.setEnabled(false);
        editarButton.setEnabled(false);
        cancelaButton.setEnabled(true);
        cod_clienteTextField.setText(Cliente.id());
    }//GEN-LAST:event_novo_clienteButtonActionPerformed

    //preenche os campos do jFrame, com o objeto cliente criado na JanelaConsultaCliente
    static public void mostraDados(Cliente cliente) {
        limpa();
        setAtivo(true);
        cnpjCpfFormattedTextField.setText(cliente.getN_documento());
        gravar_clienteButton.setEnabled(false);
        cod_clienteTextField.setText(String.valueOf(cliente.getCódigo()));
        dataFormattedTextField.setText(cliente.getData_cadastro());
        nome_clienteTextField.setText(cliente.getNome());
        email_clienteTextField.setText(cliente.getEmail());

        if (cliente.getSexo().equals("9")) {
            sexoComboBox.setVisible(false);
            sexoLabel.setVisible(false);
        } else {
            sexoComboBox.setSelectedItem(FichaCadastro.Sexo.valueOf(cliente.getSexo()));
            sexoComboBox.setVisible(true);
            sexoLabel.setVisible(true);
        }
        ruaTextField.setText(cliente.getEndereço());
        numeroTextField.setText(String.valueOf(cliente.getNumero()));
        bairroTextField.setText(cliente.getBairro());
        estadoComboBox.setSelectedItem(FichaCadastro.UF.valueOf(cliente.getEstado()));
        cepFormattedTextField.setText(cliente.getCep());
        telefoneFormattedTextField.setText(cliente.getTelefone());
        ArrayList<Visão> cidades = Cliente.getCidades(estadoComboBox.getSelectedItem().toString());
        cidadeTextField.setModel(new DefaultComboBoxModel(cidades.toArray()));
        cidadeTextField.setSelectedItem(cliente.getCidade());
        if (cliente.getCidade().contains("-")) {
            String[] city = cliente.getCidade().split("-");//extrai index do nome da cidade
            int index_cidade = Integer.valueOf(city[0]).intValue();//convert o index para inteiro
            cidadeTextField.setSelectedIndex(index_cidade);
        }else{
            cidadeTextField.setSelectedIndex(-1);
        }

        if ("Fisica".equals(cliente.getTipo_cliente())) {
            pessoabuttonGroup.setSelected(fisicaRadioButton.getModel(), true);
            try {
                cnpjCpfFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
            } catch (ParseException ex) {
                JOptionPane.showConfirmDialog(null, ex.getMessage());
            }

            cpfcnpjLabel.setText("Cpf");
            cnpjCpfFormattedTextField.setText(cliente.getN_documento());

        } else if ("Juridica".equals(cliente.getTipo_cliente())) {
            pessoabuttonGroup.setSelected(juridicaRadioButton.getModel(), true);
            try {
                cnpjCpfFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
            } catch (ParseException ex) {
                JOptionPane.showConfirmDialog(null, ex.getMessage());
            }
            cpfcnpjLabel.setText("Cnpj");
            cnpjCpfFormattedTextField.setText(cliente.getN_documento());
        }

        setEdição(false);
        editarSalvar();

    }

    //evento eliminar
    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        //mensagem de sim ou não
        int eliminar = JOptionPane.showConfirmDialog(null, "Deseja realmente apagar este registro", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (eliminar == JOptionPane.YES_OPTION) {//se sim
            String mensagem_erro = controlador.removerCliente(Integer.valueOf(cod_clienteTextField.getText()).intValue());//sql delete

            //trata retorno .removerCliente()
            if (mensagem_erro != null) {
                JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Cliente " + nome_clienteTextField.getText() + " eliminado com sucesso", "OK", JOptionPane.INFORMATION_MESSAGE);
                limpa();
                eliminarButton.setEnabled(false);
                editarButton.setEnabled(false);
            }
        }
    }//GEN-LAST:event_eliminarButtonActionPerformed

    //consulta Cep
    private void buscacepjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscacepjLabelMouseClicked
        cidadeTextField.setSelectedIndex(-1);
        String cep = cepFormattedTextField.getText().replace(".", "").replace("-", "");
        if (cep.equals("        ")) {
            JOptionPane.showMessageDialog(this, "CEP não informado");
        } else {
            try {
                if (buscaCEP.existe(cep)) {
                    ruaTextField.setText(buscaCEP.getEndereco(cep).replace("Ã£", "ã"));
                    bairroTextField.setText(buscaCEP.getBairro(cep).replace("Ã£", "ã"));
                    estadoComboBox.setSelectedItem(FichaCadastro.UF.valueOf(buscaCEP.getUF(cep)));
                     //.setText(buscaCEP.getCidade(cep).replace("Ã£", "ã").toUpperCase());
                     estadoComboBox.grabFocus();
                     //Robot rob = new Robot();
                     //rob.keyPress(KeyEvent.VK_ENTER);
                     //rob.delay(1000);
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

    private void cidadeTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cidadeTextFieldFocusLost
        System.out.println(cidadeTextField.getSelectedIndex() + "-" + cidadeTextField.getSelectedItem());
    }//GEN-LAST:event_cidadeTextFieldFocusLost

    private void buscacepjLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscacepjLabelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_buscacepjLabelMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairroLabel;
    public static javax.swing.JTextField bairroTextField;
    private javax.swing.JPanel botões_clientePanel;
    public static javax.swing.JLabel buscacepjLabel;
    private javax.swing.JButton cancelaButton;
    public static javax.swing.JFormattedTextField cepFormattedTextField;
    private javax.swing.JLabel cepLabel;
    private javax.swing.JLabel cidadeLabel;
    public static javax.swing.JComboBox cidadeTextField;
    public static javax.swing.JFormattedTextField cnpjCpfFormattedTextField;
    public static javax.swing.JTextField cod_clienteTextField;
    private javax.swing.JLabel codigoLabel;
    public static javax.swing.JButton consultarButton;
    public static javax.swing.JLabel cpfcnpjLabel;
    private javax.swing.JPanel dadosPanel;
    public static javax.swing.JFormattedTextField dataFormattedTextField;
    private javax.swing.JLabel dataLabel;
    public static javax.swing.JButton editarButton;
    public static javax.swing.JButton eliminarButton;
    private javax.swing.JLabel email_clienteLabel;
    public static javax.swing.JTextField email_clienteTextField;
    private javax.swing.JPanel endereço_clientePanel;
    public static javax.swing.JComboBox estadoComboBox;
    private javax.swing.JLabel estadoLabel;
    public static javax.swing.JRadioButton fisicaRadioButton;
    public static javax.swing.JButton gravar_clienteButton;
    public static javax.swing.JRadioButton juridicaRadioButton;
    private javax.swing.JLabel nomeLabel;
    public static javax.swing.JTextField nome_clienteTextField;
    public static javax.swing.JButton novo_clienteButton;
    private javax.swing.JLabel numeroLabel;
    public static javax.swing.JTextField numeroTextField;
    public static javax.swing.ButtonGroup pessoabuttonGroup;
    private javax.swing.JLabel ruaLabel;
    public static javax.swing.JTextField ruaTextField;
    public static javax.swing.JButton salvarButton;
    public static javax.swing.JComboBox sexoComboBox;
    public static javax.swing.JLabel sexoLabel;
    public static javax.swing.JFormattedTextField telefoneFormattedTextField;
    private javax.swing.JLabel telefoneLabel;
    public static javax.swing.JLabel tipo_pessoaLabel;
    // End of variables declaration//GEN-END:variables
}
