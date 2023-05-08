/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras_proyecto2;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joser
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    private TipoInstrumento[] tipos = new TipoInstrumento[100];
    private int contador = 0;
    
    public GUI() {
        initComponents();
        this.labelRTIFullCola.setVisible(false);
        this.labelRTIFullInstrumentos.setVisible(false);
        this.labelRTIDescripcion.setVisible(false);
        this.labelRIFullIntrumentos.setVisible(false);
        this.labelRIDatosVacios.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        txtRTI = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRTAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        labelRTIFullCola = new javax.swing.JLabel();
        btnRTIEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaRTI = new javax.swing.JTable();
        labelRTIFullInstrumentos = new javax.swing.JLabel();
        labelRTIDescripcion = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbRITipoInstrumento = new javax.swing.JComboBox<>();
        txtRINombre = new javax.swing.JTextField();
        cmbRICondicion = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRT = new javax.swing.JTable();
        btnRIAgregar = new javax.swing.JButton();
        labelRI = new javax.swing.JLabel();
        txtRIVAlor = new javax.swing.JTextField();
        btnRIEliminar = new javax.swing.JButton();
        labelRIFullIntrumentos = new javax.swing.JLabel();
        labelRIDatosVacios = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        txtRTI.setToolTipText("");
        txtRTI.setName(""); // NOI18N
        txtRTI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRTIKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Descripción:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Registro Tipo de Instrumento");

        btnRTAgregar.setText("Agregar");
        btnRTAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRTAgregarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));

        labelRTIFullCola.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelRTIFullCola.setForeground(new java.awt.Color(255, 0, 51));
        labelRTIFullCola.setText("¡La cola de tipos de instrumentos se encuentra llena!");

        btnRTIEliminar.setText("Eliminar");
        btnRTIEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRTIEliminarActionPerformed(evt);
            }
        });

        tablaRTI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descripción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaRTI);

        labelRTIFullInstrumentos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelRTIFullInstrumentos.setForeground(new java.awt.Color(255, 51, 51));
        labelRTIFullInstrumentos.setText("¡Debe Eliminar los instrumentos para eliminar el tipo!");

        labelRTIDescripcion.setForeground(new java.awt.Color(255, 51, 0));
        labelRTIDescripcion.setText("¡Debe agregar uns descripción!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(345, 345, 345)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnRTAgregar)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtRTI, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnRTIEliminar)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(labelRTIDescripcion)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRTIFullInstrumentos)
                    .addComponent(labelRTIFullCola))
                .addGap(84, 84, 84))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(labelRTIDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtRTI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnRTAgregar)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRTIEliminar))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(labelRTIFullCola)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelRTIFullInstrumentos)
                .addGap(63, 63, 63))
        );

        jTabbedPane1.addTab("Registro Tipo de Instrumento", jPanel2);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Registro de Instrumento");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Tipo de Instrumento:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Nombre:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Condición:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Valor:");

        cmbRITipoInstrumento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRITipoInstrumentoItemStateChanged(evt);
            }
        });

        txtRINombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRINombreKeyTyped(evt);
            }
        });

        cmbRICondicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nuevo", "Usado", "Reconstruido" }));

        tablaRT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Nombre", "Condición", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaRT);

        btnRIAgregar.setText("Agregar");
        btnRIAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRIAgregarActionPerformed(evt);
            }
        });

        labelRI.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelRI.setText(" ");

        txtRIVAlor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRIVAlorKeyTyped(evt);
            }
        });

        btnRIEliminar.setText("Eliminar");
        btnRIEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRIEliminarActionPerformed(evt);
            }
        });

        labelRIFullIntrumentos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelRIFullIntrumentos.setForeground(new java.awt.Color(255, 51, 0));
        labelRIFullIntrumentos.setText("¡La pila de instrumentos se encuentra llena!");

        labelRIDatosVacios.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelRIDatosVacios.setForeground(new java.awt.Color(255, 0, 0));
        labelRIDatosVacios.setText("¡Debe Ingresar los datos!");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnRIEliminar)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel8))
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addGap(25, 25, 25)
                                                    .addComponent(jLabel5))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))))
                                        .addGap(41, 41, 41)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cmbRITipoInstrumento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtRINombre)
                                            .addComponent(cmbRICondicion, 0, 142, Short.MAX_VALUE)
                                            .addComponent(txtRIVAlor))))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(btnRIAgregar)
                                        .addGap(136, 136, 136))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(labelRIDatosVacios)
                                        .addGap(91, 91, 91)))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(labelRI)
                        .addGap(228, 228, 228))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(labelRIFullIntrumentos)
                        .addGap(101, 101, 101))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelRI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbRITipoInstrumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtRINombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbRICondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtRIVAlor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnRIAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(labelRIDatosVacios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRIEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelRIFullIntrumentos)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registro de Instrumento", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRTAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRTAgregarActionPerformed
        // TODO add your handling code here:
        if(contador>99){
            this.labelRTIFullCola.setVisible(true);
        }else{
            this.labelRTIFullCola.setVisible(false);
            if (this.txtRTI.getText().equals("")){
                // Aqui puedo poner otro label para que diga que el campo debe llenarse
                labelRTIDescripcion.setVisible(true);
            }else{
                labelRTIDescripcion.setVisible(false);
                agregarTipodeInstrumento();
                this.txtRTI.setText("");
            }

        }

    }//GEN-LAST:event_btnRTAgregarActionPerformed

    private void txtRTIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRTIKeyTyped
        // TODO add your handling code here:.
        // Codigo para que la descripción solo acepte 20 caracteres
        if ( this.txtRTI.getText().length() >=  20 ){
            evt.consume();
        }
    }//GEN-LAST:event_txtRTIKeyTyped

    private void btnRTIEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRTIEliminarActionPerformed
        // TODO add your handling code here:
        if (this.tipos[0] != null){
            if (this.tipos[0].getContador() == 0){
                this.labelRTIFullInstrumentos.setVisible(false);
                eliiminarTipoInstrumento();
            }else{
                this.labelRTIFullInstrumentos.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnRTIEliminarActionPerformed
    
    // llena un nuevo elemento en el table para mostrar la Cola
    private void agregarTablaTipoIsntrumentos(){
        DefaultTableModel model = (DefaultTableModel ) this.tablaRTI.getModel();
        model.addRow(new Object[]{tipos[contador].getID(), tipos[contador].getDescripcion()});
    }
    
    private void eliminarTablaTipoInstrumentos(){
        DefaultTableModel model = (DefaultTableModel ) this.tablaRTI.getModel();
        model.removeRow(0);
        for(int i = 0; i<model.getRowCount(); i++){
            model.setValueAt(i+1, i,0);
        }
    }
    
    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
        llenarComboBoxTiposInstrumentos();
        this.labelRTIFullInstrumentos.setVisible(false);
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void cmbRITipoInstrumentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRITipoInstrumentoItemStateChanged
        // TODO add your handling code here:
        mostrarTablaRT();
        this.labelRIFullIntrumentos.setVisible(false);
    }//GEN-LAST:event_cmbRITipoInstrumentoItemStateChanged

    private void btnRIAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRIAgregarActionPerformed
        // TODO add your handling code here:
        if(this.cmbRITipoInstrumento.getSelectedItem() == null || this.txtRINombre.getText().equals("") || this.txtRIVAlor.getText().equals("")){
            this.labelRIDatosVacios.setVisible(true);
        }else{
            this.labelRIDatosVacios.setVisible(false);
            agregarInstrumentos();
            mostrarTablaRT();
            this.txtRINombre.setText("");
            this.txtRIVAlor.setText("");
        }
    }//GEN-LAST:event_btnRIAgregarActionPerformed
// Evento para solo poder escribir numeros
    private void txtRIVAlorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRIVAlorKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean paso = (key >= 48 && key <= 57 ) || (key == 46); // Numeros y punto
        if (!paso){
            evt.consume();
            
        }else if ( this.txtRIVAlor.getText().contains(".") && !(key >= 48 && key <= 57 ) ){ // Si contiene punto ya no puede seguir usando punto
            evt.consume();
        } else if (this.txtRIVAlor.getText().contains(".")){
            if (this.txtRIVAlor.getText().indexOf(".") + 2 < this.txtRIVAlor.getText().length()){ // Limita la cantidad de decimales a 2
                evt.consume();
            }
        }    
    }//GEN-LAST:event_txtRIVAlorKeyTyped
    
    private void eliminarInstrumento(){
        int indexSelec = this.cmbRITipoInstrumento.getSelectedIndex();
        tipos[indexSelec].eliminarInstrumento();
        this.labelRIFullIntrumentos.setVisible(false);
    }
    
    private void txtRINombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRINombreKeyTyped
        // TODO add your handling code here:
        if ( this.txtRINombre.getText().length() >=  20 ){
            evt.consume();
        }
    }//GEN-LAST:event_txtRINombreKeyTyped

    private void btnRIEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRIEliminarActionPerformed
        // TODO add your handling code here:
        if (!(this.cmbRITipoInstrumento.getSelectedItem().toString().equals(""))){
            eliminarInstrumento();
            mostrarTablaRT();
        }
    }//GEN-LAST:event_btnRIEliminarActionPerformed

    // Función que agrega un Tipo de intrumento
    private void agregarTipodeInstrumento(){
        tipos[contador] = new TipoInstrumento(contador+1, this.txtRTI.getText());
        agregarTablaTipoIsntrumentos();
        contador++;
    }
    
    // Función que muestra la tabla según la selección
    private void mostrarTablaRT(){
        int indexSelec = this.cmbRITipoInstrumento.getSelectedIndex();
        this.labelRI.setText((String)this.cmbRITipoInstrumento.getSelectedItem());
        
        DefaultTableModel model = (DefaultTableModel) this.tablaRT.getModel();
        model.setRowCount(0);
        if (this.tipos[indexSelec].getContador() > 0){
            Instrumento[]  arregloAImprimir = this.tipos[indexSelec].getInstrumentos();
            for (int i = 0; i < this.tipos[indexSelec].getContador(); i++ ){
                model.addRow(new Object[]{arregloAImprimir[i].getDni(), arregloAImprimir[i].getNombre(), arregloAImprimir[i].getCondicion(), arregloAImprimir[i].getValor() });
            }
        }
    }
    
    private void eliiminarTipoInstrumento(){
        try{
            for (int i = 0; i < contador; i++){
                tipos[i] = tipos[i+1];
                tipos[i].setID(i+1);
            }
        }catch (Exception ex){
            // Do Nothing
        }
        contador--;
        eliminarTablaTipoInstrumentos();
    }
    
    // LLena el combobox con los intrumentos ya ingresados
    private void llenarComboBoxTiposInstrumentos(){

        try{
            this.cmbRITipoInstrumento.removeAllItems();
            for(TipoInstrumento tipo :tipos){
                this.cmbRITipoInstrumento.addItem(tipo.getDescripcion());
            }
        } catch(Exception ex){
            // Do Nothing
        }
    }
    
    private void agregarInstrumentos(){
        int index = this.cmbRITipoInstrumento.getSelectedIndex();
        Instrumento instrumentoAgregado = new Instrumento(this.txtRINombre.getText(), this.cmbRICondicion.getSelectedItem().toString(), Double.valueOf(this.txtRIVAlor.getText()));
        if(tipos[index].getContador() > 99){
            this.labelRIFullIntrumentos.setVisible(true);
        }
        tipos[index].agregarInstrumento(instrumentoAgregado);
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRIAgregar;
    private javax.swing.JButton btnRIEliminar;
    private javax.swing.JButton btnRTAgregar;
    private javax.swing.JButton btnRTIEliminar;
    private javax.swing.JComboBox<String> cmbRICondicion;
    private javax.swing.JComboBox<String> cmbRITipoInstrumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelRI;
    private javax.swing.JLabel labelRIDatosVacios;
    private javax.swing.JLabel labelRIFullIntrumentos;
    private javax.swing.JLabel labelRTIDescripcion;
    private javax.swing.JLabel labelRTIFullCola;
    private javax.swing.JLabel labelRTIFullInstrumentos;
    private javax.swing.JTable tablaRT;
    private javax.swing.JTable tablaRTI;
    private javax.swing.JTextField txtRINombre;
    private javax.swing.JTextField txtRIVAlor;
    private javax.swing.JTextField txtRTI;
    // End of variables declaration//GEN-END:variables
}
