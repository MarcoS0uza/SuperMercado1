    /*Esse arquivo é protegido por leis de copyright internacional, locais e pela lei de Deus, afinal, 
 só Deus sabe como essa merda funciona
 Não apagar dessa linha pra baixo*/
package interfaces;

import controle.ControladorCadastroCliente;
import controle.buscaCEP;
import entidade.Cliente;
import entidade.FichaCadastro;
import entidade.Visão;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import relatorios.AbreRelatorio;

/**
 *
 * @author MARCOANTONIO
 */
public class JanelaCadastroCliente_ extends javax.swing.JFrame {

    ControladorCadastroCliente controlador;
    private String tipo;//armazena o tipo do cliente(Fisica ou Juridica)
    ArrayList<Cliente> clientes;

    public JanelaCadastroCliente_(ControladorCadastroCliente controlador) {
        this.controlador = controlador;
        initComponents();
        estadoComboBox.setSelectedIndex(-1);
        setLocationRelativeTo(null);
        salvarButton.setVisible(false);
        buscarButton.setVisible(false);
        imprimirButton.setEnabled(false);
        cancelaButton.setEnabled(true);
        setIconImage(imgJanela());
        limpa();
     
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
        selecionarButton = new javax.swing.JButton();
        gravar_clienteButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        salvarButton = new javax.swing.JButton();
        cancelaButton = new javax.swing.JButton();
        buscarButton = new javax.swing.JButton();
        imprimirButton = new javax.swing.JButton();
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
        jPanel2 = new javax.swing.JPanel();
        primeiroButton = new javax.swing.JButton();
        atrasButton = new javax.swing.JButton();
        frenteButton = new javax.swing.JButton();
        ultimoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        dadosPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        codigoLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        codigoLabel.setText("Codigo");

        cpfcnpjLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cpfcnpjLabel.setText("Cpf");

        nomeLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nomeLabel.setText("Nome");

        cod_clienteTextField.setEditable(false);
        cod_clienteTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cod_clienteTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cod_clienteTextField.setEnabled(false);
        cod_clienteTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cod_clienteTextFieldKeyPressed(evt);
            }
        });

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

        eliminarButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        eliminarButton.setText("Excluir");
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

        selecionarButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        selecionarButton.setText("Selecionar");
        selecionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarButtonActionPerformed(evt);
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

        cancelaButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cancelaButton.setText("Cancelar");
        cancelaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelaButtonActionPerformed(evt);
            }
        });

        buscarButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buscarButton.setText("Buscar");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        imprimirButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        imprimirButton.setText("Imprimir");
        imprimirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botões_clientePanelLayout = new javax.swing.GroupLayout(botões_clientePanel);
        botões_clientePanel.setLayout(botões_clientePanelLayout);
        botões_clientePanelLayout.setHorizontalGroup(
            botões_clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botões_clientePanelLayout.createSequentialGroup()
                .addComponent(imprimirButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(novo_clienteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(selecionarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gravar_clienteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelaButton))
        );
        botões_clientePanelLayout.setVerticalGroup(
            botões_clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botões_clientePanelLayout.createSequentialGroup()
                .addGroup(botões_clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gravar_clienteButton)
                    .addComponent(selecionarButton)
                    .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salvarButton)
                    .addComponent(eliminarButton)
                    .addComponent(novo_clienteButton)
                    .addComponent(cancelaButton)
                    .addComponent(buscarButton)
                    .addComponent(imprimirButton))
                .addGap(0, 0, 0))
        );

        tipo_pessoaLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tipo_pessoaLabel.setText("Pessoa");

        pessoabuttonGroup.add(fisicaRadioButton);
        fisicaRadioButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        fisicaRadioButton.setText("Fisica");
        fisicaRadioButton.setEnabled(false);
        fisicaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fisicaRadioButtonActionPerformed(evt);
            }
        });

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
        telefoneLabel.setText("Fone");

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
                .addGap(2, 2, 2)
                .addGroup(endereço_clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefoneLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bairroLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ruaLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cepLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(endereço_clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(endereço_clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(endereço_clientePanelLayout.createSequentialGroup()
                            .addComponent(bairroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(endereço_clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(endereço_clientePanelLayout.createSequentialGroup()
                                    .addComponent(estadoLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(estadoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(cidadeTextField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(endereço_clientePanelLayout.createSequentialGroup()
                            .addGroup(endereço_clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(endereço_clientePanelLayout.createSequentialGroup()
                                    .addComponent(cepFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(buscacepjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(endereço_clientePanelLayout.createSequentialGroup()
                                    .addComponent(ruaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(numeroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(numeroTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))
                    .addGroup(endereço_clientePanelLayout.createSequentialGroup()
                        .addComponent(telefoneFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cidadeLabel)
                        .addGap(341, 341, 341))))
        );
        endereço_clientePanelLayout.setVerticalGroup(
            endereço_clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, endereço_clientePanelLayout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
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
        dataFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dataFormattedTextField.setEnabled(false);
        dataFormattedTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        dataLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dataLabel.setText("Data de Cadastro");

        sexoComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sexoComboBox.setModel(new DefaultComboBoxModel(FichaCadastro.Sexo.values())
        );
        sexoComboBox.setEnabled(false);

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
                        .addGap(12, 12, 12)
                        .addComponent(codigoLabel)
                        .addGap(4, 4, 4)
                        .addComponent(cod_clienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(dataLabel)
                        .addGap(4, 4, 4)
                        .addComponent(dataFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dadosPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(nomeLabel)
                        .addGap(4, 4, 4)
                        .addComponent(nome_clienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dadosPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(sexoLabel)
                        .addGap(4, 4, 4)
                        .addComponent(sexoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(tipo_pessoaLabel)
                        .addGap(0, 0, 0)
                        .addComponent(fisicaRadioButton)
                        .addGap(0, 0, 0)
                        .addComponent(juridicaRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(cpfcnpjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(cnpjCpfFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dadosPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(endereço_clientePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dadosPanelLayout.createSequentialGroup()
                                .addComponent(email_clienteLabel)
                                .addGap(4, 4, 4)
                                .addComponent(email_clienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(dadosPanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(botões_clientePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        dadosPanelLayout.setVerticalGroup(
            dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(codigoLabel))
                    .addGroup(dadosPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(cod_clienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dadosPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(dataLabel))
                    .addGroup(dadosPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(dataFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(nomeLabel))
                    .addComponent(nome_clienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(sexoLabel))
                    .addGroup(dadosPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(sexoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dadosPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(tipo_pessoaLabel))
                    .addComponent(fisicaRadioButton)
                    .addComponent(juridicaRadioButton)
                    .addGroup(dadosPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(cpfcnpjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dadosPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cnpjCpfFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(email_clienteLabel))
                    .addComponent(email_clienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(endereço_clientePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
            .addComponent(dadosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        cidadeTextField.setSelectedIndex(-1);
        estadoComboBox.setSelectedIndex(-1);
        sexoComboBox.setSelectedIndex(-1);
        pessoabuttonGroup.clearSelection();
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
        selecionarButton.setEnabled(true);
        cancelaButton.setEnabled(false);
        gravar_clienteButton.setEnabled(false);
        selecionarButton.setVisible(true);
        buscarButton.setVisible(false);
        cod_clienteTextField.setEditable(false);
        cod_clienteTextField.setEnabled(false);
        editarSalvar();
        cont = 0;
        botoesNavegacao(false);
    }//GEN-LAST:event_cancelaButtonActionPerformed

    //evento salvar (Update)
    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        //captura o tipo do cliente
        if (juridicaRadioButton.isSelected()) {
            tipo = juridicaRadioButton.getText();
        } else if (fisicaRadioButton.isSelected()) {
            tipo = fisicaRadioButton.getText();
        } else {
            tipo = null;
        }
        String sexo, cidade, uf;
            int cod, numero;
            
            //captura o sexo do cliente, caso seja juridica sexo = "9"
            if (cpfcnpjLabel.getText().equalsIgnoreCase("Cnpj")) {
                sexo = "9";
            } else {
                if (sexoComboBox.getSelectedIndex() == -1) {
                    sexo = null;
                } else {
                    sexo = sexoComboBox.getSelectedItem().toString();
                }
            }
            if (cod_clienteTextField.getText().isEmpty()) {
                cod = -1;
            } else {
                cod = Integer.parseInt(cod_clienteTextField.getText());
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

        //cria objeto cliente com os dados do jFrame
        Cliente cliente = new Cliente(tipo, sexo,
                Integer.parseInt(cod_clienteTextField.getText()),//convert int
        Integer.parseInt(numeroTextField.getText()),//convert int
                nome_clienteTextField.getText(), dataFormattedTextField.getText(),
                cnpjCpfFormattedTextField.getText().replace(".", "").replace("/", "").replace("-", "")/*replace() retira mascara*/, ruaTextField.getText(),
                bairroTextField.getText(), telefoneFormattedTextField.getText().replace("(", "").replace(")", "").replace("-", "")/*replace() retira mascara*/,
                cepFormattedTextField.getText().replace(".", "").replace("-", "")/*replace() retira mascara*/, estadoComboBox.getSelectedItem().toString(),
                String.valueOf(cidadeTextField.getSelectedIndex()) + "-" + cidadeTextField.getSelectedItem().toString(), email_clienteTextField.getText());

        String mensagem_erro;
        System.out.println(dadosOK(cliente));
        if (dadosOK(cliente)) {//verificada se tem campos em branco
            mensagem_erro = "Algum atributo do cliente não foi preenchido";
        } else {
            mensagem_erro = controlador.alterarCliente(cliente);
            clientes.set(cont, cliente);
        }

        //trata retorno do inserirCliente(cliente)
        if (mensagem_erro != null) {
            JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        }

        setEdição(false);
        editarSalvar();
    }//GEN-LAST:event_salvarButtonActionPerformed

    //evento editar
    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        botoesNavegacao(false);
        editarButton.setVisible(false);
        salvarButton.setVisible(true);
        cod_clienteTextField.setEditable(false);
        nome_clienteTextField.grabFocus();
        setEdição(true);
    }//GEN-LAST:event_editarButtonActionPerformed
    
    //evento gravar(Insert)
    private void gravar_clienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravar_clienteButtonActionPerformed
        selecionarButton.setEnabled(true);
        cancelaButton.setEnabled(false);
        String mensagem_erro;

        //captura o tipo do cliente
        if (juridicaRadioButton.isSelected()) {
            tipo = juridicaRadioButton.getText();
        } else if (fisicaRadioButton.isSelected()) {
            tipo = fisicaRadioButton.getText();
        } else {
            tipo = null;
        }

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
        
        if (dadosOK(cliente)) {//verificada se tem campos em branco
            mensagem_erro = "Não pode conter registros em branco";
        } else {
            mensagem_erro = controlador.inserirCliente(cliente);//executa sql
        }

        //trata retorno do inserirCliente(cliente)
        if (mensagem_erro != null) {
            JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        limpa();
        setAtivo(false);
        novo_clienteButton.setEnabled(true);
        pessoabuttonGroup.clearSelection();
        estadoComboBox.setSelectedIndex(0);
        sexoComboBox.setSelectedIndex(0);

    }//GEN-LAST:event_gravar_clienteButtonActionPerformed

    //verifica se se há campos em branco, se tiver retorna false senão true
    public static boolean dadosOK(Cliente clientes) {
        System.out.println(clientes.toString());
        return (clientes.getNome().equals(""))
                && (clientes.getN_documento().trim().equals(""))
                && (clientes.getTipo_cliente() == null)
                && (clientes.getData_cadastro().equals(""))
                && (clientes.getEmail().equals(""))
                && (clientes.getEndereço().equals(""))
                && (clientes.getBairro().equals(""))
                && (clientes.getNumero() == -1)
                && (clientes.getCódigo() == -1)
                && (clientes.getCep().trim().equals(""))
                && (clientes.getSexo() == null)
                && (clientes.getTelefone().trim().equals(""))
                && (clientes.getCidade() == null)
                && (clientes.getEstado() == null);
    }

    //evento novo, prepara a janela para inserir um cadastro
    private void novo_clienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novo_clienteButtonActionPerformed
        cod_clienteTextField.setEditable(false);
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
        selecionarButton.setEnabled(false);
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
        } else {
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
        selecionarButton.setVisible(true);
        buscarButton.setVisible(false);

    }

    //evento eliminar
    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        //mensagem de sim ou não
        int eliminar = JOptionPane.showConfirmDialog(null, "Deseja realmente apagar este registro", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (eliminar == JOptionPane.YES_OPTION) {//se sim
            String mensagem_erro = controlador.removerCliente(Integer.parseInt(cod_clienteTextField.getText()));//sql delete

            //trata retorno .removerCliente()
            if (mensagem_erro != null) {
                JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
            } else {
                clientes.remove(cont);
                mostraDados(clientes.get(cont));
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

    public Image imgJanela() {
        try {
            return ImageIO.read(this.getClass().getResource("/imagens/olhodetandera.jpg")); 
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,ex);
            return null;
        }
    }
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

    private void cod_clienteTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cod_clienteTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F2) {
            JanelaConsulta<Cliente> consulta = new JanelaConsulta<Cliente>(new Cliente());
            consulta.setTitle("Clientes");//muda o titulo da janela, para identificar a classe chamadora
            consulta.setVisible(true);
            limpa();
        }
    }//GEN-LAST:event_cod_clienteTextFieldKeyPressed

    //chama janela responsavel por consulta no BD (Select)
    private void selecionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarButtonActionPerformed
        limpa();
        setAtivo(true);
        setEdição(true);
        cancelaButton.setEnabled(true);
        cod_clienteTextField.grabFocus();
        selecionarButton.setVisible(false);
        buscarButton.setVisible(true);
        cod_clienteTextField.setEditable(true);
        cod_clienteTextField.setEnabled(true);
        imprimirButton.setEnabled(false);
        novo_clienteButton.setEnabled(false);
        eliminarButton.setEnabled(false);
        editarButton.setEnabled(false);
        gravar_clienteButton.setEnabled(false);
    }//GEN-LAST:event_selecionarButtonActionPerformed

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        cont = 0;
        if (!cod_clienteTextField.getText().isEmpty()) {
            Cliente cliente = Cliente.buscarCliente(Integer.parseInt(cod_clienteTextField.getText()));
            if (cliente == null) {
                JOptionPane.showMessageDialog(this, "Cliente não encontrado", "Atenção", JOptionPane.WARNING_MESSAGE);
            } else {
                mostraDados(cliente);
                selecionarButton.setVisible(true);
                buscarButton.setVisible(false);
                imprimirButton.setEnabled(true);
                botoesNavegacao(false);
            }
        } else {
            imprimirButton.setEnabled(true);
            botoesNavegacao(true);
            String sexo, cidade, uf;
            int cod, numero;
            if (juridicaRadioButton.isSelected()) {
                tipo = juridicaRadioButton.getText();
            } else if (fisicaRadioButton.isSelected()) {
                tipo = fisicaRadioButton.getText();
            } else {
                tipo = null;
            }

            //captura o sexo do cliente, caso seja juridica sexo = "9"

                if (sexoComboBox.getSelectedIndex() == -1) {
                    sexo = null;
                } else {
                    sexo = sexoComboBox.getSelectedItem().toString();
                }
            

            if (cod_clienteTextField.getText().isEmpty()) {
                cod = -1;
            } else {
                cod = Integer.parseInt(cod_clienteTextField.getText());
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
            //cria objeto cliente com os dados do jFrame
            try {
                Cliente cliente = new Cliente(tipo, sexo, cod,//convert int
                        numero,//convert int
                        nome_clienteTextField.getText(), dataFormattedTextField.getText(),
                        cnpjCpfFormattedTextField.getText().replace(".", "").replace("/", "").replace("-", "")/*replace() retira mascara*/, ruaTextField.getText(),
                        bairroTextField.getText(), telefoneFormattedTextField.getText().replace("(", "").replace(")", "").replace("-", "")/*replace() retira mascara*/,
                        cepFormattedTextField.getText().replace(".", "").replace("-", ""),
                        uf,
                        cidade,
                        email_clienteTextField.getText());

                if (dadosOK(cliente)) {
                    cliente = null;
                } 
                    clientes = Cliente.buscarTodosCliente(cliente);
                    if(clientes.isEmpty()){
                       JOptionPane.showMessageDialog(this, "Cliente não encontrado", "Atenção", JOptionPane.WARNING_MESSAGE); 
                    }else{
                        if(clientes.size() == 1){
                            botoesNavegacao(false);
                        }
                    mostraDados(clientes.get(0));
                    selecionarButton.setVisible(true);
                    buscarButton.setVisible(false);
                    
                    }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_buscarButtonActionPerformed
    int cont = 0;
    private void frenteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frenteButtonActionPerformed
        if (cont < clientes.size()) {
            mostraDados(clientes.get(cont + 1));
            cont++;
        }

    }//GEN-LAST:event_frenteButtonActionPerformed

    private void botoesNavegacao(boolean estado) {
        frenteButton.setEnabled(estado);
        atrasButton.setEnabled(estado);
        ultimoButton.setEnabled(estado);
        primeiroButton.setEnabled(estado);
    }
    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasButtonActionPerformed
        if (cont != 0) {
            mostraDados(clientes.get(cont - 1));
            cont--;
        }

    }//GEN-LAST:event_atrasButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        cont = 0;
    }//GEN-LAST:event_formWindowClosed

    private void primeiroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeiroButtonActionPerformed
        mostraDados(clientes.get(0));
        cont = 0;
    }//GEN-LAST:event_primeiroButtonActionPerformed

    private void ultimoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimoButtonActionPerformed
        mostraDados(clientes.get(clientes.size() - 1));
        cont = clientes.size() - 1;

    }//GEN-LAST:event_ultimoButtonActionPerformed

    private void imprimirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirButtonActionPerformed
        AbreRelatorio relatorio = new AbreRelatorio(JanelaPrincipal.caminho);
        relatorio.rel_cliente(clientes);
    }//GEN-LAST:event_imprimirButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasButton;
    private javax.swing.JLabel bairroLabel;
    public static javax.swing.JTextField bairroTextField;
    private javax.swing.JPanel botões_clientePanel;
    public static javax.swing.JLabel buscacepjLabel;
    public static javax.swing.JButton buscarButton;
    private javax.swing.JButton cancelaButton;
    public static javax.swing.JFormattedTextField cepFormattedTextField;
    private javax.swing.JLabel cepLabel;
    private javax.swing.JLabel cidadeLabel;
    public static javax.swing.JComboBox cidadeTextField;
    public static javax.swing.JFormattedTextField cnpjCpfFormattedTextField;
    public static javax.swing.JTextField cod_clienteTextField;
    private javax.swing.JLabel codigoLabel;
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
    private javax.swing.JButton frenteButton;
    public static javax.swing.JButton gravar_clienteButton;
    private javax.swing.JButton imprimirButton;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JRadioButton juridicaRadioButton;
    private javax.swing.JLabel nomeLabel;
    public static javax.swing.JTextField nome_clienteTextField;
    public static javax.swing.JButton novo_clienteButton;
    private javax.swing.JLabel numeroLabel;
    public static javax.swing.JTextField numeroTextField;
    public static javax.swing.ButtonGroup pessoabuttonGroup;
    private javax.swing.JButton primeiroButton;
    private javax.swing.JLabel ruaLabel;
    public static javax.swing.JTextField ruaTextField;
    public static javax.swing.JButton salvarButton;
    public static javax.swing.JButton selecionarButton;
    public static javax.swing.JComboBox sexoComboBox;
    public static javax.swing.JLabel sexoLabel;
    public static javax.swing.JFormattedTextField telefoneFormattedTextField;
    private javax.swing.JLabel telefoneLabel;
    public static javax.swing.JLabel tipo_pessoaLabel;
    private javax.swing.JButton ultimoButton;
    // End of variables declaration//GEN-END:variables
}
