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
    String caminho;

    public JanelaVenda(ControladorVenda controlador, String caminho) {
        this.controlador = controlador;
        this.caminho = caminho;
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
        dataFormattedTextField = new javax.swing.JFormattedTextField();
        horaFormattedTextField = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        nome_clienteTextField = new javax.swing.JTextField();
        cod_clienteTextField = new javax.swing.JTextField();
        botões_vendaPanel = new javax.swing.JPanel();
        eliminar_vendaButton = new javax.swing.JButton();
        concluirvendaButton = new javax.swing.JButton();
        reabrirButton = new javax.swing.JButton();
        novavendaButton = new javax.swing.JButton();
        cancelavendaButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        itensTable = new javax.swing.JTable();
        quantTextField = new javax.swing.JTextField();
        preçoTextField = new javax.swing.JTextField();
        totalTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        codTextField = new javax.swing.JTextField();
        consultarButton = new javax.swing.JButton();
        descricaoTextField = new javax.swing.JTextField();
        cod_vendaTextField = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        acrescimoLabel = new javax.swing.JLabel();
        descontoLabel = new javax.swing.JLabel();
        descontoTextField = new javax.swing.JFormattedTextField();
        acrescimoTextField = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        valor_total_venda_btLabel = new javax.swing.JLabel();
        valor_total_venda_liqLabel = new javax.swing.JLabel();
        totalvendaLiqLabel1 = new javax.swing.JLabel();
        totalvendabrutoLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cod_venda_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cod_venda_Label.setText("N° Venda");

        data_vendaLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        data_vendaLabel.setText("Data");

        hora_vendaLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        hora_vendaLabel.setText("Hora");

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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N

        nome_clienteTextField.setEditable(false);
        nome_clienteTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nome_clienteTextField.setText("AO CONSUMIDOR");
        nome_clienteTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nome_clienteTextField.setFocusCycleRoot(true);
        nome_clienteTextField.setSelectedTextColor(new java.awt.Color(255, 204, 0));

        cod_clienteTextField.setEditable(false);
        cod_clienteTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cod_clienteTextField.setText("2720");
        cod_clienteTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cod_clienteTextFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(cod_clienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome_clienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cod_clienteTextField)
            .addComponent(nome_clienteTextField)
        );

        eliminar_vendaButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        eliminar_vendaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        eliminar_vendaButton.setToolTipText("Eliminar");
        eliminar_vendaButton.setEnabled(false);
        eliminar_vendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_vendaButtonActionPerformed(evt);
            }
        });

        concluirvendaButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        concluirvendaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/concluir_venda.png"))); // NOI18N
        concluirvendaButton.setToolTipText("Concluir");
        concluirvendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concluirvendaButtonActionPerformed(evt);
            }
        });

        reabrirButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        reabrirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/reabrir.png"))); // NOI18N
        reabrirButton.setToolTipText("Reabrir");
        reabrirButton.setEnabled(false);
        reabrirButton.setMaximumSize(new java.awt.Dimension(63, 23));
        reabrirButton.setMinimumSize(new java.awt.Dimension(63, 23));
        reabrirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reabrirButtonActionPerformed(evt);
            }
        });

        novavendaButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        novavendaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo.png"))); // NOI18N
        novavendaButton.setToolTipText("Novo");
        novavendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novavendaButtonActionPerformed(evt);
            }
        });

        cancelavendaButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cancelavendaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        cancelavendaButton.setToolTipText("Cancelar");
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
                .addComponent(novavendaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eliminar_vendaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reabrirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(concluirvendaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelavendaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        botões_vendaPanelLayout.setVerticalGroup(
            botões_vendaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botões_vendaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(concluirvendaButton)
                .addComponent(reabrirButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        itensTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itensTableKeyPressed(evt);
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
        totalTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                totalTextFieldKeyPressed(evt);
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

        consultarButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        consultarButton.setText("Consultar Vendas");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarButtonActionPerformed(evt);
            }
        });

        descricaoTextField.setEditable(false);
        descricaoTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        descricaoTextField.setEnabled(false);

        cod_vendaTextField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cod_vendaTextField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vendedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        acrescimoLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        acrescimoLabel.setText("Acréscimo");

        descontoLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        descontoLabel.setText("Desconto");

        descontoTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        descontoTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        descontoTextField.setText("0,00");
        descontoTextField.setEnabled(false);
        descontoTextField.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
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

        acrescimoTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        acrescimoTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        acrescimoTextField.setText("0,00");
        acrescimoTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        acrescimoTextField.setEnabled(false);
        acrescimoTextField.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        acrescimoTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                acrescimoTextFieldFocusLost(evt);
            }
        });
        acrescimoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acrescimoTextFieldActionPerformed(evt);
            }
        });
        acrescimoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                acrescimoTextFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(acrescimoLabel)
                    .addComponent(descontoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(descontoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(acrescimoTextField))
                .addGap(77, 77, 77))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(acrescimoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(acrescimoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(descontoLabel)
                    .addComponent(descontoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        valor_total_venda_btLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        valor_total_venda_btLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        valor_total_venda_btLabel.setText("0,00");

        valor_total_venda_liqLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        valor_total_venda_liqLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        valor_total_venda_liqLabel.setText("0,00");

        totalvendaLiqLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        totalvendaLiqLabel1.setText("Total Liquido");

        totalvendabrutoLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        totalvendabrutoLabel.setText("Total Bruto");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(totalvendabrutoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valor_total_venda_btLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(totalvendaLiqLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valor_total_venda_liqLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valor_total_venda_btLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalvendabrutoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(totalvendaLiqLabel1)
                    .addComponent(valor_total_venda_liqLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Forma de Pagamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N

        jButton1.setText("Definir");
        jButton1.setToolTipText("");

        jButton2.setText("Excluir");
        jButton2.setToolTipText("");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cod_venda_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cod_vendaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(data_vendaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hora_vendaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(horaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(codTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descricaoTextField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(456, 456, 456)))
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
                            .addComponent(totalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(consultarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(300, 300, 300)
                        .addComponent(botões_vendaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cod_venda_Label)
                        .addComponent(data_vendaLabel)
                        .addComponent(hora_vendaLabel)
                        .addComponent(dataFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(horaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cod_vendaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(preçoTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(quantTextField)
                            .addComponent(totalTextField)))
                    .addComponent(descricaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(codTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(consultarButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botões_vendaPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void descontoTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descontoTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            concluirvendaButton.grabFocus();
        }
    }//GEN-LAST:event_descontoTextFieldKeyPressed

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

    private void acrescimoTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_acrescimoTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            descontoTextField.grabFocus();
        }
    }//GEN-LAST:event_acrescimoTextFieldKeyPressed

    private void acrescimoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acrescimoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acrescimoTextFieldActionPerformed

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

    private void consultarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultarButtonActionPerformed

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

    private void totalTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalTextFieldKeyPressed
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
                concluirvendaButton.setEnabled(true);
                total_liq = total_liq + itens.getValor_total_itens();
                valor_total_venda_btLabel.setText(formataFloat(total_liq));
                valor_total_venda_liqLabel.setText(formataFloat(total_liq));

                cont++;
                limpaProduto();
                codTextField.grabFocus();
            }
        }
    }//GEN-LAST:event_totalTextFieldKeyPressed

    private void quantTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            float preço = Float.parseFloat(preçoTextField.getText());
            float quant = Float.parseFloat(quantTextField.getText());
            float total = preço * quant;
            totalTextField.setText(formataFloat(total));
            totalTextField.grabFocus();
        }
    }//GEN-LAST:event_quantTextFieldKeyPressed

    private void cancelavendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelavendaButtonActionPerformed

        setAtivo(false);
        novavendaButton.setEnabled(true);
        consultarButton.setEnabled(true);
        cancelavendaButton.setEnabled(false);
        concluirvendaButton.setEnabled(false);
        editarSalvar();
    }//GEN-LAST:event_cancelavendaButtonActionPerformed

    private void novavendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novavendaButtonActionPerformed

        setAtivo(true);
        cod_vendaTextField.setText(Venda.id());
        dataFormattedTextField.setText(FichaCadastro.getDataAtual());
        horaFormattedTextField.setText(FichaCadastro.getHoraAtual());
        novavendaButton.setEnabled(false);
        cancelavendaButton.setEnabled(true);
        codTextField.grabFocus();

    }//GEN-LAST:event_novavendaButtonActionPerformed

    private void reabrirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reabrirButtonActionPerformed
        reabrirButton.setVisible(false);
        cod_clienteTextField.setEditable(false);
        nome_clienteTextField.grabFocus();
    }//GEN-LAST:event_reabrirButtonActionPerformed

    private void concluirvendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concluirvendaButtonActionPerformed

        cancelavendaButton.setEnabled(false);
        String mensagem_erro = null;
        if (!cod_clienteTextField.getText().equals("")) {
            Cliente cliente = new Cliente(Integer.valueOf(cod_clienteTextField.getText()));

            Venda venda = new Venda(Integer.parseInt(cod_vendaTextField.getText()),
                dataFormattedTextField.getText(), horaFormattedTextField.getText(),
                Float.parseFloat(valor_total_venda_liqLabel.getText()), cliente,
                "F", Float.parseFloat(acrescimoTextField.getText().replace(",", ".")),
                Float.parseFloat(descontoTextField.getText().replace(",", ".")),
                Float.parseFloat(valor_total_venda_btLabel.getText().replace(",", ".")));

            System.out.print("1- " + Float.parseFloat(valor_total_venda_liqLabel.getText()));
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
                            new AbreRelatorio(caminho).pedido(venda);
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

    private void cod_clienteTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cod_clienteTextFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_F2){
            JanelaConsulta<Cliente> consulta = new JanelaConsulta<Cliente>(new Cliente());
            consulta.setTitle("Selecione o cliente para a venda");
            consulta.setVisible(true);
        }
    }//GEN-LAST:event_cod_clienteTextFieldKeyPressed

    private void horaFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaFormattedTextFieldActionPerformed

    private void itensTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itensTableKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_DELETE){
        DefaultTableModel modelo = (DefaultTableModel) itensTable.getModel();
        float vtotal = Float.parseFloat(valor_total_venda_liqLabel.getText().replace(",", "."));
        float vCancelado = Float.valueOf(modelo.getValueAt(itensTable.getSelectedRow(), 4).toString());
        modelo.removeRow(itensTable.getSelectedRow());
        valor_total_venda_liqLabel.setText(formataFloat(vtotal - vCancelado));
        cont--;
        codTextField.grabFocus();
        }
    }//GEN-LAST:event_itensTableKeyPressed

    public static void editarSalvar() {
        reabrirButton.setVisible(true);
    }

    public static void mostraDadosCliente(Cliente cliente) {
        cod_clienteTextField.setText(String.valueOf(cliente.getCódigo()));
        nome_clienteTextField.setText(cliente.getNome());
    }

    public static void setAtivo(boolean estado) {
        dataFormattedTextField.setEnabled(estado);
        horaFormattedTextField.setEnabled(estado);
        codTextField.setEnabled(estado);
        descricaoTextField.setEnabled(estado);
        quantTextField.setEnabled(estado);
        preçoTextField.setEnabled(estado);
        totalTextField.setEnabled(estado);
        cod_clienteTextField.setEnabled(estado);
        nome_clienteTextField.setEnabled(estado);
        acrescimoTextField.setEnabled(estado);
        descontoTextField.setEnabled(estado);
        valor_total_venda_liqLabel.setEnabled(estado);
    }
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
        nome_clienteTextField.setText("AO CONSUMIDOR");
        acrescimoTextField.setText("0,00");
        descontoTextField.setText("0,00");
        valor_total_venda_liqLabel.setText("0,00");
        concluirvendaButton.setEnabled(false);
        novavendaButton.setEnabled(true);
        valor_total_venda_btLabel.setText("");
    }
    public static String formataFloat(float n) {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(n).replace(",", ".");
    }

    public static void limpaProduto() {
        codTextField.setText("");
        descricaoTextField.setText("");
        quantTextField.setText("");
        totalTextField.setText("");
        preçoTextField.setText("");
    }

    public static void mostraDadosProduto(Produto produto) {
        codTextField.setText(String.valueOf(produto.getCódigo()));
        descricaoTextField.setText(produto.getNome());
        preçoTextField.setText(String.valueOf(produto.getPreço_venda()));
        quantTextField.grabFocus();
    }    float ultAcrescimo;    float ultDesconto;
    int cont = 0;
    float total_liq;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acrescimoLabel;
    public static javax.swing.JFormattedTextField acrescimoTextField;
    private javax.swing.JPanel botões_vendaPanel;
    public static javax.swing.JButton cancelavendaButton;
    public static javax.swing.JTextField codTextField;
    public static javax.swing.JTextField cod_clienteTextField;
    public static javax.swing.JLabel cod_vendaTextField;
    private javax.swing.JLabel cod_venda_Label;
    public static javax.swing.JButton concluirvendaButton;
    public static javax.swing.JButton consultarButton;
    public static javax.swing.JFormattedTextField dataFormattedTextField;
    private javax.swing.JLabel data_vendaLabel;
    private javax.swing.JLabel descontoLabel;
    public static javax.swing.JFormattedTextField descontoTextField;
    public static javax.swing.JTextField descricaoTextField;
    public static javax.swing.JButton eliminar_vendaButton;
    public static javax.swing.JFormattedTextField horaFormattedTextField;
    private javax.swing.JLabel hora_vendaLabel;
    public static javax.swing.JTable itensTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField nome_clienteTextField;
    public static javax.swing.JButton novavendaButton;
    public static javax.swing.JTextField preçoTextField;
    public static javax.swing.JTextField quantTextField;
    public static javax.swing.JButton reabrirButton;
    public static javax.swing.JTextField totalTextField;
    private javax.swing.JLabel totalvendaLiqLabel1;
    private javax.swing.JLabel totalvendabrutoLabel;
    public static javax.swing.JLabel valor_total_venda_btLabel;
    public static javax.swing.JLabel valor_total_venda_liqLabel;
    // End of variables declaration//GEN-END:variables
}
