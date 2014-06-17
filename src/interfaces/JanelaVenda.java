package interfaces;

import controle.ControladorVenda;
import entidade.Cliente;
import entidade.FichaCadastro;
import entidade.ItensVenda;
import entidade.Produto;
import entidade.Venda;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import relatorios.AbreRelatorio;

public class JanelaVenda extends javax.swing.JFrame {

    ControladorVenda controlador;

    public JanelaVenda(ControladorVenda controlador) {
        this.controlador = controlador;
        initComponents();
        setLocationRelativeTo(null);
        //iniciaTabela();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cod_venda_Label = new javax.swing.JLabel();
        data_vendaLabel = new javax.swing.JLabel();
        hora_vendaLabel = new javax.swing.JLabel();
        cod_vendaTextField = new javax.swing.JTextField();
        dataFormattedTextField = new javax.swing.JFormattedTextField();
        horaFormattedTextField = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        cpfLabel = new javax.swing.JLabel();
        nome_clienteTextField = new javax.swing.JTextField();
        documentoFormattedTextField = new javax.swing.JFormattedTextField();
        cod_clienteTextField = new javax.swing.JTextField();
        buscar_clienteButton = new javax.swing.JButton();
        ruaLabel = new javax.swing.JLabel();
        ruaTextField = new javax.swing.JTextField();
        numeroLabel = new javax.swing.JLabel();
        numeroTextField = new javax.swing.JTextField();
        bairroLabel = new javax.swing.JLabel();
        bairroTextField = new javax.swing.JTextField();
        telefoneFormattedTextField = new javax.swing.JFormattedTextField();
        telefoneLabel = new javax.swing.JLabel();
        pessoaLabel = new javax.swing.JLabel();
        botões_vendaPanel = new javax.swing.JPanel();
        eliminar_vendaButton = new javax.swing.JButton();
        concluirvendaButton = new javax.swing.JButton();
        reabrirButton = new javax.swing.JButton();
        salvarvendaButton = new javax.swing.JButton();
        novavendaButton = new javax.swing.JButton();
        cancelavendaButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        itensTable = new javax.swing.JTable();
        quantTextField = new javax.swing.JTextField();
        preçoTextField = new javax.swing.JTextField();
        totalTextField = new javax.swing.JTextField();
        lançarButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        codTextField = new javax.swing.JTextField();
        totalvendabrutoLabel = new javax.swing.JLabel();
        acrescimoLabel = new javax.swing.JLabel();
        descontoLabel = new javax.swing.JLabel();
        consultarButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        descricaoTextField = new javax.swing.JTextField();
        acrescimoTextField = new javax.swing.JFormattedTextField();
        descontoTextField = new javax.swing.JFormattedTextField();
        valor_total_venda_liqLabel = new javax.swing.JLabel();
        totalvendaLiqLabel1 = new javax.swing.JLabel();
        valor_total_venda_btLabel = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vendas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14), java.awt.Color.black)); // NOI18N

        cod_venda_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cod_venda_Label.setText("N° Venda");

        data_vendaLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        data_vendaLabel.setText("Data");

        hora_vendaLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        hora_vendaLabel.setText("Hora");

        cod_vendaTextField.setEditable(false);
        cod_vendaTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cod_vendaTextField.setEnabled(false);

        dataFormattedTextField.setEditable(false);
        dataFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        dataFormattedTextField.setEnabled(false);
        dataFormattedTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        horaFormattedTextField.setEditable(false);
        horaFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance())));
        horaFormattedTextField.setEnabled(false);
        horaFormattedTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        horaFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaFormattedTextFieldActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10), new java.awt.Color(0, 0, 0))); // NOI18N

        cpfLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cpfLabel.setText("CPF");

        nome_clienteTextField.setEditable(false);
        nome_clienteTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nome_clienteTextField.setText("AO CONSUMIDOR");
        nome_clienteTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nome_clienteTextField.setEnabled(false);
        nome_clienteTextField.setFocusCycleRoot(true);
        nome_clienteTextField.setSelectedTextColor(new java.awt.Color(255, 204, 0));

        documentoFormattedTextField.setEditable(false);
        try {
            documentoFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        documentoFormattedTextField.setEnabled(false);
        documentoFormattedTextField.setFocusable(false);
        documentoFormattedTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        documentoFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoFormattedTextFieldActionPerformed(evt);
            }
        });

        cod_clienteTextField.setEditable(false);
        cod_clienteTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cod_clienteTextField.setText("2720");
        cod_clienteTextField.setEnabled(false);

        buscar_clienteButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buscar_clienteButton.setText("Buscar Cliente");
        buscar_clienteButton.setEnabled(false);
        buscar_clienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_clienteButtonActionPerformed(evt);
            }
        });

        ruaLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ruaLabel.setText("Rua");

        ruaTextField.setEditable(false);
        ruaTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ruaTextField.setEnabled(false);
        ruaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruaTextFieldActionPerformed(evt);
            }
        });

        numeroLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        numeroLabel.setText("Nº");

        numeroTextField.setEditable(false);
        numeroTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        numeroTextField.setEnabled(false);

        bairroLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bairroLabel.setText("Bairro");

        bairroTextField.setEditable(false);
        bairroTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bairroTextField.setEnabled(false);

        telefoneFormattedTextField.setEditable(false);
        try {
            telefoneFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneFormattedTextField.setEnabled(false);

        telefoneLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        telefoneLabel.setText("Telefone");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(cod_clienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome_clienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpfLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(documentoFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pessoaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(ruaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ruaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bairroLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bairroTextField))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(telefoneLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefoneFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscar_clienteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(451, 451, 451))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cod_clienteTextField)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cpfLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(documentoFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pessoaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nome_clienteTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ruaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ruaLabel)
                        .addComponent(numeroLabel)
                        .addComponent(numeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bairroLabel)
                        .addComponent(bairroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneLabel)
                    .addComponent(telefoneFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_clienteButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botões_vendaPanel.setBackground(new java.awt.Color(255, 255, 255));

        eliminar_vendaButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        eliminar_vendaButton.setText("Eliminar");
        eliminar_vendaButton.setEnabled(false);
        eliminar_vendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_vendaButtonActionPerformed(evt);
            }
        });

        concluirvendaButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        concluirvendaButton.setText("Concluir");
        concluirvendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concluirvendaButtonActionPerformed(evt);
            }
        });

        reabrirButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        reabrirButton.setText("Reabrir");
        reabrirButton.setEnabled(false);
        reabrirButton.setMaximumSize(new java.awt.Dimension(63, 23));
        reabrirButton.setMinimumSize(new java.awt.Dimension(63, 23));
        reabrirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reabrirButtonActionPerformed(evt);
            }
        });

        salvarvendaButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        salvarvendaButton.setText("Salvar");
        salvarvendaButton.setEnabled(false);
        salvarvendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarvendaButtonActionPerformed(evt);
            }
        });

        novavendaButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        novavendaButton.setText("Novo");
        novavendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novavendaButtonActionPerformed(evt);
            }
        });

        cancelavendaButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cancelavendaButton.setText("Cancelar");
        cancelavendaButton.setEnabled(false);
        cancelavendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelavendaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botões_vendaPanelLayout = new javax.swing.GroupLayout(botões_vendaPanel);
        botões_vendaPanel.setLayout(botões_vendaPanelLayout);
        botões_vendaPanelLayout.setHorizontalGroup(
            botões_vendaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botões_vendaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(novavendaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eliminar_vendaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvarvendaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reabrirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(concluirvendaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelavendaButton)
                .addContainerGap())
        );
        botões_vendaPanelLayout.setVerticalGroup(
            botões_vendaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botões_vendaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(concluirvendaButton)
                .addComponent(reabrirButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(salvarvendaButton)
                .addComponent(eliminar_vendaButton)
                .addComponent(novavendaButton)
                .addComponent(cancelavendaButton))
        );

        itensTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itensTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Produto", "Quantidade", "Preço Unit", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Short.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(itensTable);
        if (itensTable.getColumnModel().getColumnCount() > 0) {
            itensTable.getColumnModel().getColumn(0).setMinWidth(50);
            itensTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            itensTable.getColumnModel().getColumn(0).setMaxWidth(50);
            itensTable.getColumnModel().getColumn(2).setMinWidth(70);
            itensTable.getColumnModel().getColumn(2).setPreferredWidth(70);
            itensTable.getColumnModel().getColumn(2).setMaxWidth(70);
            itensTable.getColumnModel().getColumn(3).setMinWidth(70);
            itensTable.getColumnModel().getColumn(3).setPreferredWidth(70);
            itensTable.getColumnModel().getColumn(3).setMaxWidth(70);
            itensTable.getColumnModel().getColumn(4).setMinWidth(80);
            itensTable.getColumnModel().getColumn(4).setPreferredWidth(80);
            itensTable.getColumnModel().getColumn(4).setMaxWidth(80);
        }

        quantTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        quantTextField.setEnabled(false);
        quantTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quantTextFieldKeyPressed(evt);
            }
        });

        preçoTextField.setEditable(false);
        preçoTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        totalTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        totalTextField.setEnabled(false);

        lançarButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lançarButton.setText("Lançar");
        lançarButton.setEnabled(false);
        lançarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lançarButtonActionPerformed(evt);
            }
        });
        lançarButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lançarButtonKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Codigo Produto");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Quant");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Preço R$");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Total");

        codTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        codTextField.setEnabled(false);
        codTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codTextFieldKeyPressed(evt);
            }
        });

        totalvendabrutoLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        totalvendabrutoLabel.setText("Total Bruto");

        acrescimoLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        acrescimoLabel.setText("Acréscimo");

        descontoLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        descontoLabel.setText("Desconto");

        consultarButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        consultarButton.setText("Consultar Vendas");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarButtonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("Cancelar Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecione o item e clique no botão ao lado");

        descricaoTextField.setEditable(false);
        descricaoTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        descricaoTextField.setEnabled(false);

        acrescimoTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        acrescimoTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        acrescimoTextField.setText("0,00");
        acrescimoTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        acrescimoTextField.setEnabled(false);
        acrescimoTextField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        acrescimoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acrescimoTextFieldActionPerformed(evt);
            }
        });
        acrescimoTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                acrescimoTextFieldFocusLost(evt);
            }
        });
        acrescimoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                acrescimoTextFieldKeyPressed(evt);
            }
        });

        descontoTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        descontoTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        descontoTextField.setText("0,00");
        descontoTextField.setEnabled(false);
        descontoTextField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        descontoTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                descontoTextFieldFocusLost(evt);
            }
        });
        descontoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                descontoTextFieldKeyPressed(evt);
            }
        });

        valor_total_venda_liqLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        valor_total_venda_liqLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        valor_total_venda_liqLabel.setText("0,00");

        totalvendaLiqLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        totalvendaLiqLabel1.setText("Total Liquido");

        valor_total_venda_btLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        valor_total_venda_btLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        valor_total_venda_btLabel.setText("0,00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(consultarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botões_vendaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(acrescimoLabel)
                            .addComponent(descontoLabel))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(acrescimoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(descontoTextField))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(totalvendaLiqLabel1)
                            .addComponent(totalvendabrutoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valor_total_venda_liqLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valor_total_venda_btLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cod_venda_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cod_vendaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(data_vendaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hora_vendaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(horaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(238, 238, 238))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(codTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descricaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(preçoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(totalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(lançarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cod_venda_Label)
                    .addComponent(data_vendaLabel)
                    .addComponent(hora_vendaLabel)
                    .addComponent(cod_vendaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lançarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(totalTextField)
                            .addComponent(preçoTextField)
                            .addComponent(quantTextField)
                            .addComponent(descricaoTextField)
                            .addComponent(codTextField))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(acrescimoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(totalvendabrutoLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(valor_total_venda_btLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(totalvendaLiqLabel1)
                    .addComponent(descontoLabel)
                    .addComponent(valor_total_venda_liqLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botões_vendaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultarButton))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(428, 428, 428)
                        .addComponent(descontoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(acrescimoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void documentoFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoFormattedTextFieldActionPerformed
    }//GEN-LAST:event_documentoFormattedTextFieldActionPerformed

    public static void editarSalvar() {
        salvarvendaButton.setVisible(false);
        reabrirButton.setVisible(true);
    }

    public static void mostraDadosCliente(Cliente cliente) {
        pessoaLabel.setText("Pessoa " + cliente.getTipo_cliente());
        cod_clienteTextField.setText(String.valueOf(cliente.getCódigo()));
        nome_clienteTextField.setText(cliente.getNome());
        ruaTextField.setText(cliente.getEndereço());
        numeroTextField.setText(String.valueOf(cliente.getNumero()));
        bairroTextField.setText(cliente.getBairro());
        telefoneFormattedTextField.setText(cliente.getTelefone());
        if ("Fisica".equals(cliente.getTipo_cliente())) {
            try {
                documentoFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
            } catch (ParseException ex) {
                JOptionPane.showConfirmDialog(null, ex.getMessage());
            }

            cpfLabel.setText("CPF");
            documentoFormattedTextField.setText(cliente.getN_documento());

        } else if ("Juridica".equals(cliente.getTipo_cliente())) {
            try {
                documentoFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
            } catch (ParseException ex) {
                JOptionPane.showConfirmDialog(null, ex.getMessage());
            }
            cpfLabel.setText("CNPJ");
            documentoFormattedTextField.setText(cliente.getN_documento());
        }

    }

    public static void setAtivo(boolean estado) {
        cod_vendaTextField.setEnabled(estado);
        dataFormattedTextField.setEnabled(estado);
        horaFormattedTextField.setEnabled(estado);
        codTextField.setEnabled(estado);
        descricaoTextField.setEnabled(estado);
        quantTextField.setEnabled(estado);
        preçoTextField.setEnabled(estado);
        totalTextField.setEnabled(estado);
        lançarButton.setEnabled(estado);
        cod_clienteTextField.setEnabled(estado);
        ruaTextField.setEnabled(estado);
        numeroTextField.setEnabled(estado);
        buscar_clienteButton.setEnabled(estado);
        documentoFormattedTextField.setEnabled(estado);
        nome_clienteTextField.setEnabled(estado);
        bairroTextField.setEnabled(estado);
        telefoneFormattedTextField.setEnabled(estado);
        acrescimoTextField.setEnabled(estado);
        descontoTextField.setEnabled(estado);
        valor_total_venda_liqLabel.setEnabled(estado);
    }
    private void buscar_clienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_clienteButtonActionPerformed
        JanelaConsulta<Cliente> consulta = new JanelaConsulta<Cliente>(new Cliente());
        consulta.setTitle("Selecione o cliente para a venda");
        consulta.setVisible(true);
    }//GEN-LAST:event_buscar_clienteButtonActionPerformed

    private void ruaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ruaTextFieldActionPerformed

    private void horaFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaFormattedTextFieldActionPerformed

    private void eliminar_vendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_vendaButtonActionPerformed
        int eliminar = JOptionPane.showConfirmDialog(null, "Deseja realmente apagar este registro", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (eliminar == JOptionPane.YES_OPTION) {
            String mensagem_erro = controlador.removerVenda(Integer.valueOf(cod_vendaTextField.getText()).intValue());

            if (mensagem_erro != null) {
                JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Venda n° " + cod_vendaTextField.getText() + " eliminado com sucesso", "OK", JOptionPane.INFORMATION_MESSAGE);
                eliminar_vendaButton.setEnabled(false);
                reabrirButton.setEnabled(false);

            }
        }
    }//GEN-LAST:event_eliminar_vendaButtonActionPerformed

    public static void limpaVenda() {
        limpaProduto();
        cod_vendaTextField.setText("");
        dataFormattedTextField.setText("");
        horaFormattedTextField.setText("");
        DefaultTableModel modelo = (DefaultTableModel) itensTable.getModel();
        if (itensTable.getRowCount() > 0) {
            int nLinhas = itensTable.getRowCount();
            for (int i = 0; i < nLinhas; i++) {
                modelo.removeRow(0);
            }
        }
        cod_clienteTextField.setText("2720");
        ruaTextField.setText("");
        numeroTextField.setText("");
        bairroTextField.setText("");
        telefoneFormattedTextField.setText("");
        documentoFormattedTextField.setText("");
        pessoaLabel.setText("");
        nome_clienteTextField.setText("AO CONSUMIDOR");
        acrescimoTextField.setText("0,00");
        descontoTextField.setText("0,00");
        valor_total_venda_liqLabel.setText("0,00");
        concluirvendaButton.setEnabled(false);
        novavendaButton.setEnabled(true);

    }
    private void concluirvendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concluirvendaButtonActionPerformed

        cancelavendaButton.setEnabled(false);
        String mensagem_erro = null;
        if (!cod_clienteTextField.getText().equals("")) {
            Cliente cliente = new Cliente(Integer.valueOf(cod_clienteTextField.getText()).intValue());

            Venda venda = new Venda(Integer.valueOf(cod_vendaTextField.getText()).intValue(),
                    dataFormattedTextField.getText(), horaFormattedTextField.getText(),
                    Float.valueOf(valor_total_venda_liqLabel.getText()).floatValue(), cliente,
                    "F", Float.valueOf(acrescimoTextField.getText().replace(",", ".")).floatValue(),
                    Float.valueOf(descontoTextField.getText().replace(",", ".")).floatValue(),
                    Float.valueOf(valor_total_venda_btLabel.getText().replace(",", ".")).floatValue());
            
            
            System.out.print("1- " + Float.valueOf(valor_total_venda_liqLabel.getText()).floatValue());
            int confirmar = JOptionPane.showConfirmDialog(null, "Comfirma o fechamento da Venda", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (confirmar == JOptionPane.YES_OPTION) {
                mensagem_erro = controlador.inserirVenda(venda);
                if (mensagem_erro != null) {
                    JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
                } else {

                    ItensVenda itens;
                    String erro = null;
                    for (int i = 0; i < itensTable.getRowCount(); i++) {
                        Produto produto = new Produto(Integer.valueOf(itensTable.getValueAt(i, 0).toString()));
                        itens = new ItensVenda(Float.valueOf(itensTable.getValueAt(i, 2).toString()), Float.parseFloat(itensTable.getValueAt(i, 3).toString()),
                                Float.parseFloat(itensTable.getValueAt(i, 4).toString()), venda, produto);
                        if (itens != null) {
                            erro = ItensVenda.insereVendaItem(itens);
                        } else {
                            JOptionPane.showMessageDialog(this, "É preciso ter produtos para concluir a Venda ");
                        }
                    }
                    if (erro.equals("")) {
                        int imprimir = JOptionPane.showConfirmDialog(null, "Deseja imprimir o pedido da venda", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                        if (imprimir == JOptionPane.YES_OPTION) {
                            AbreRelatorio.pedido(venda);
                            cont = 0;
                            limpaVenda();

                        }

                    } else {
                        JOptionPane.showMessageDialog(this, erro);
                    }

                }

            }

        } else {
            JOptionPane.showMessageDialog(this, "Não foi informado Cliente");
        }

    }//GEN-LAST:event_concluirvendaButtonActionPerformed

    private void reabrirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reabrirButtonActionPerformed
        reabrirButton.setVisible(false);
        salvarvendaButton.setVisible(true);
        cod_clienteTextField.setEditable(false);
        nome_clienteTextField.grabFocus();
    }//GEN-LAST:event_reabrirButtonActionPerformed

    private void salvarvendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarvendaButtonActionPerformed

        /*if (juridicaRadioButton.isSelected()) {
         tipo = juridicaRadioButton.getText();
         } else if (fisicaRadioButton.isSelected()) {
         tipo = fisicaRadioButton.getText();
         }
         Cliente cliente = new Cliente(tipo, sexoComboBox.getSelectedItem().toString(),
         Integer.valueOf(cod_clienteTextField.getText()).intValue(),
         Integer.valueOf(numeroTextField.getText()).intValue(),
         nome_clienteTextField.getText(), dataFormattedTextField.getText(),
         documentoFormattedTextField.getText(), ruaTextField.getText(),
         bairroTextField.getText(), telefoneFormattedTextField.getText(),
         cepFormattedTextField.getText(), estadoComboBox.getSelectedItem().toString(),
         cidadeTextField.getText(), email_clienteTextField.getText());

         String mensagem_erro = null;
         if (!dadosOK(cliente)) {
         mensagem_erro = "Algum atributo do cliente não foi preenchido";
         } else {
         mensagem_erro = controlador.alterarCliente(cliente);
         }
         if (mensagem_erro != null) {
         JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
         } else {
         JOptionPane.showMessageDialog(this, "Cliente " + cliente.getNome() + " alterado com sucesso", "OK", JOptionPane.INFORMATION_MESSAGE);
         }

         setEdição(
         false);
         editarSalvar();
         */
    }//GEN-LAST:event_salvarvendaButtonActionPerformed

    public static String formataFloat(float n) {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(n).replace(",", ".");
    }


    private void quantTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            float preço = Float.parseFloat(preçoTextField.getText());
            float quant = Float.parseFloat(quantTextField.getText());
            float total = preço * quant;
            totalTextField.setText(formataFloat(total));
            lançarButton.grabFocus();
        }
    }//GEN-LAST:event_quantTextFieldKeyPressed
    public static void limpaProduto() {
        codTextField.setText("");
        descricaoTextField.setText("");
        quantTextField.setText("");
        totalTextField.setText("");
        preçoTextField.setText("");
    }
    int cont = 0;
    float total_liq;
    private void lançarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lançarButtonActionPerformed
        if (codTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Selecione um produto");
        } else {

            ItensVenda itens = new ItensVenda(Float.parseFloat(quantTextField.getText()), Float.parseFloat(preçoTextField.getText()), Float.parseFloat(totalTextField.getText()), new Produto(Integer.valueOf(codTextField.getText()), descricaoTextField.getText()));
            DefaultTableModel modelo = (DefaultTableModel) itensTable.getModel();
            modelo.addRow(new Object[]{"", "", "", "", ""});
            modelo.setValueAt(itens.getProduto().getCódigo(), cont, 0);
            modelo.setValueAt(itens.getProduto().getNome(), cont, 1);
            modelo.setValueAt(itens.getQuantidade(), cont, 2);
            modelo.setValueAt(itens.getValor_unit(), cont, 3);
            modelo.setValueAt(itens.getValor_total_itens(), cont, 4);
            concluirvendaButton.setEnabled(true);
            total_liq = total_liq + itens.getValor_total_itens();
            valor_total_venda_btLabel.setText(formataFloat(total_liq));
            valor_total_venda_liqLabel.setText(formataFloat(total_liq));

            cont++;
            limpaProduto();
            codTextField.grabFocus();
        }

    }//GEN-LAST:event_lançarButtonActionPerformed

    public static void mostraDadosProduto(Produto produto) {
        codTextField.setText(String.valueOf(produto.getCódigo()));
        descricaoTextField.setText(produto.getNome());
        preçoTextField.setText(String.valueOf(produto.getPreço_venda()));
        quantTextField.grabFocus();
    }
    private void novavendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novavendaButtonActionPerformed

        setAtivo(true);
        cod_vendaTextField.setText(Venda.id());
        dataFormattedTextField.setText(FichaCadastro.getDataAtual());
        horaFormattedTextField.setText(FichaCadastro.getHoraAtual());
        novavendaButton.setEnabled(false);
        cancelavendaButton.setEnabled(true);
        codTextField.grabFocus();


    }//GEN-LAST:event_novavendaButtonActionPerformed

    private void cancelavendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelavendaButtonActionPerformed

        setAtivo(false);
        novavendaButton.setEnabled(true);
        consultarButton.setEnabled(true);
        cancelavendaButton.setEnabled(false);
        concluirvendaButton.setEnabled(false);
        editarSalvar();
    }//GEN-LAST:event_cancelavendaButtonActionPerformed

    private void consultarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultarButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) itensTable.getModel();
        float vtotal = Float.parseFloat(valor_total_venda_liqLabel.getText().replace(",", "."));
        float vCancelado = Float.valueOf(modelo.getValueAt(itensTable.getSelectedRow(), 4).toString());
        modelo.removeRow(itensTable.getSelectedRow());
        valor_total_venda_liqLabel.setText(formataFloat(vtotal - vCancelado));
        cont--;
        codTextField.grabFocus();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void codTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            totalTextField.setText("");
            quantTextField.setText("");
            int cod_prod = Integer.valueOf(codTextField.getText());
            Produto produto = Produto.buscarProduto(cod_prod);
            if (produto != null) {
                descricaoTextField.setText(produto.getNome());
                preçoTextField.setText(String.valueOf(produto.getPreço_venda()));
                codTextField.setText(String.valueOf(produto.getCódigo()));
                quantTextField.grabFocus();
                //concluirvendaButton.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(this, "Produto não Cadastrado");
                codTextField.setText("");
                descricaoTextField.setText("");
                preçoTextField.setText("");
                codTextField.grabFocus();
            }

        }
        if (evt.getKeyCode() == KeyEvent.VK_F2) {
            JanelaConsulta<Produto> jProduto = new JanelaConsulta<Produto>(new Produto());
            jProduto.setTitle("Selecione o Produto");
            jProduto.setVisible(true);
            limpaProduto();

        }
    }//GEN-LAST:event_codTextFieldKeyPressed

    private void acrescimoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acrescimoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acrescimoTextFieldActionPerformed
    float ultAcrescimo;
    private void acrescimoTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_acrescimoTextFieldFocusLost
        float vTotal = Float.parseFloat(valor_total_venda_liqLabel.getText().replace(",", "."));
        float vAcres;

        if (acrescimoTextField.getText().equals("")) {
            vAcres = 0;
        } else {
            vAcres = Float.parseFloat(acrescimoTextField.getText().replace(",", "."));
        }
        if (vAcres == 0.00) {
            valor_total_venda_liqLabel.setText(formataFloat(vTotal - ultAcrescimo));
            ultAcrescimo = 0;
        } else {
            valor_total_venda_liqLabel.setText(formataFloat((vTotal - ultAcrescimo) + vAcres));
            ultAcrescimo = vAcres;
        }

    }//GEN-LAST:event_acrescimoTextFieldFocusLost

    private void acrescimoTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_acrescimoTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            descontoTextField.grabFocus();
        }
    }//GEN-LAST:event_acrescimoTextFieldKeyPressed
    float ultDesconto;
    private void descontoTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descontoTextFieldFocusLost
        float vTotal = Float.parseFloat(valor_total_venda_liqLabel.getText().replace(",", "."));
        float vDesc;

        if (descontoTextField.getText().equals("")) {
            vDesc = 0;
        } else {
            vDesc = Float.parseFloat(descontoTextField.getText().replace(",", "."));
        }
        if (vDesc == 0.00) {
            valor_total_venda_liqLabel.setText(formataFloat(vTotal + ultDesconto));
            ultDesconto = 0;
        } else {
            valor_total_venda_liqLabel.setText(formataFloat((vTotal + ultDesconto) - vDesc));
            ultDesconto = vDesc;
        }
    }//GEN-LAST:event_descontoTextFieldFocusLost

    private void descontoTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descontoTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            concluirvendaButton.grabFocus();
        }
    }//GEN-LAST:event_descontoTextFieldKeyPressed

    private void lançarButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lançarButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (codTextField.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Selecione um produto");
            } else {

                ItensVenda itens = new ItensVenda(Float.parseFloat(quantTextField.getText()), Float.parseFloat(preçoTextField.getText()), Float.parseFloat(totalTextField.getText()), new Produto(Integer.valueOf(codTextField.getText()), descricaoTextField.getText()));
                DefaultTableModel modelo = (DefaultTableModel) itensTable.getModel();
                modelo.addRow(new Object[]{"", "", "", "", ""});
                modelo.setValueAt(itens.getProduto().getCódigo(), cont, 0);
                modelo.setValueAt(itens.getProduto().getNome(), cont, 1);
                modelo.setValueAt(itens.getQuantidade(), cont, 2);
                modelo.setValueAt(itens.getValor_unit(), cont, 3);
                modelo.setValueAt(itens.getValor_total_itens(), cont, 4);
                total_liq = total_liq + itens.getValor_total_itens();
                valor_total_venda_liqLabel.setText(formataFloat(total_liq));
                cont++;
                limpaProduto();
                codTextField.grabFocus();
            }
        }
    }//GEN-LAST:event_lançarButtonKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acrescimoLabel;
    public static javax.swing.JFormattedTextField acrescimoTextField;
    private javax.swing.JLabel bairroLabel;
    public static javax.swing.JTextField bairroTextField;
    private javax.swing.JPanel botões_vendaPanel;
    public static javax.swing.JButton buscar_clienteButton;
    private javax.swing.JButton cancelavendaButton;
    public static javax.swing.JTextField codTextField;
    public static javax.swing.JTextField cod_clienteTextField;
    public static javax.swing.JTextField cod_vendaTextField;
    private javax.swing.JLabel cod_venda_Label;
    public static javax.swing.JButton concluirvendaButton;
    private javax.swing.JButton consultarButton;
    public static javax.swing.JLabel cpfLabel;
    public static javax.swing.JFormattedTextField dataFormattedTextField;
    private javax.swing.JLabel data_vendaLabel;
    private javax.swing.JLabel descontoLabel;
    public static javax.swing.JFormattedTextField descontoTextField;
    public static javax.swing.JTextField descricaoTextField;
    public static javax.swing.JFormattedTextField documentoFormattedTextField;
    public static javax.swing.JButton eliminar_vendaButton;
    public static javax.swing.JFormattedTextField horaFormattedTextField;
    private javax.swing.JLabel hora_vendaLabel;
    public static javax.swing.JTable itensTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JButton lançarButton;
    public static javax.swing.JTextField nome_clienteTextField;
    public static javax.swing.JButton novavendaButton;
    private javax.swing.JLabel numeroLabel;
    public static javax.swing.JTextField numeroTextField;
    public static javax.swing.JLabel pessoaLabel;
    public static javax.swing.JTextField preçoTextField;
    public static javax.swing.JTextField quantTextField;
    public static javax.swing.JButton reabrirButton;
    private javax.swing.JLabel ruaLabel;
    public static javax.swing.JTextField ruaTextField;
    public static javax.swing.JButton salvarvendaButton;
    public static javax.swing.JFormattedTextField telefoneFormattedTextField;
    private javax.swing.JLabel telefoneLabel;
    public static javax.swing.JTextField totalTextField;
    private javax.swing.JLabel totalvendaLiqLabel1;
    private javax.swing.JLabel totalvendabrutoLabel;
    public static javax.swing.JLabel valor_total_venda_btLabel;
    public static javax.swing.JLabel valor_total_venda_liqLabel;
    // End of variables declaration//GEN-END:variables
}
