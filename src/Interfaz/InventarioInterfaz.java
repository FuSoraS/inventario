package Interfaz;

import Clases.Utils;
import Clases.UtilsInventario;
import Conectar.DaoInventario;
import Conectar.DaoProductos;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


public class InventarioInterfaz extends javax.swing.JFrame {
    DaoProductos daoProductos = new DaoProductos();
    DaoInventario inventario = new DaoInventario();
    public InventarioInterfaz() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        UtilsInventario.actualizarFechaModificacion(FechaUltiMo);
        
        try {
            inventario.cargarHistorial(tablaHistorial);
            daoProductos.cargarTabla2(tablaPerdida);
            daoProductos.cargarTabla(tablaBodega);
        } catch (ClassNotFoundException ex) {
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Hisotorial = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaHistorial = new javax.swing.JTable();
        BtnRecargarHis = new javax.swing.JButton();
        BtnCerrarSesion3 = new javax.swing.JButton();
        UltimaModificacion = new javax.swing.JLabel();
        FechaUltiMo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        fondoazuliptitulo1 = new javax.swing.JPanel();
        titulotienda1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPerdida = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtDescripcionPerdido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtStockPerdido = new javax.swing.JTextField();
        LabelNombre = new javax.swing.JLabel();
        BtnGuardarPerdido = new javax.swing.JButton();
        BtnCerrarSesion2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Visualizar = new javax.swing.JPanel();
        BtnMarcaCodi = new javax.swing.JButton();
        BtnProductoCodi = new javax.swing.JButton();
        BtnCerrarSesion1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        fondoazuliptitulo2 = new javax.swing.JPanel();
        titulotienda2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaBodega = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtStockBodega = new javax.swing.JTextField();
        LabelNombre1 = new javax.swing.JLabel();
        BtnGuardarPerdido1 = new javax.swing.JButton();
        BtnCerrarSesion4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Hisotorial.setBackground(new java.awt.Color(255, 255, 255));

        tablaHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaHistorial.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane3.setViewportView(tablaHistorial);

        BtnRecargarHis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnRecargarHis.setText("Recargar");
        BtnRecargarHis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRecargarHisActionPerformed(evt);
            }
        });

        BtnCerrarSesion3.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        BtnCerrarSesion3.setText("Cerrar sesión");
        BtnCerrarSesion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarSesion3ActionPerformed(evt);
            }
        });

        UltimaModificacion.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        UltimaModificacion.setText("Ultima modificacion: ");

        FechaUltiMo.setText("Fecha");

        javax.swing.GroupLayout HisotorialLayout = new javax.swing.GroupLayout(Hisotorial);
        Hisotorial.setLayout(HisotorialLayout);
        HisotorialLayout.setHorizontalGroup(
            HisotorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HisotorialLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(HisotorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HisotorialLayout.createSequentialGroup()
                        .addComponent(UltimaModificacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaUltiMo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnCerrarSesion3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(BtnRecargarHis, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(HisotorialLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))))
        );
        HisotorialLayout.setVerticalGroup(
            HisotorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HisotorialLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(HisotorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(HisotorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnCerrarSesion3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(UltimaModificacion)
                        .addComponent(FechaUltiMo))
                    .addComponent(BtnRecargarHis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jTabbedPane1.addTab("Historial", Hisotorial);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondoazuliptitulo1.setBackground(new java.awt.Color(51, 102, 255));

        titulotienda1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titulotienda1.setForeground(new java.awt.Color(255, 255, 255));
        titulotienda1.setText("Inventario");

        javax.swing.GroupLayout fondoazuliptitulo1Layout = new javax.swing.GroupLayout(fondoazuliptitulo1);
        fondoazuliptitulo1.setLayout(fondoazuliptitulo1Layout);
        fondoazuliptitulo1Layout.setHorizontalGroup(
            fondoazuliptitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoazuliptitulo1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(titulotienda1)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        fondoazuliptitulo1Layout.setVerticalGroup(
            fondoazuliptitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoazuliptitulo1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(titulotienda1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.add(fondoazuliptitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 260, 70));

        tablaPerdida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "NombreProducto", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaPerdida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPerdidaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaPerdida);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 470, 350));

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel4.setText("Descripcion:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        txtDescripcionPerdido.setText("Descripcion..");
        txtDescripcionPerdido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDescripcionPerdidoMousePressed(evt);
            }
        });
        jPanel2.add(txtDescripcionPerdido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 150, 30));

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 3, 14)); // NOI18N
        jLabel5.setText("Producto seleccionado:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel6.setText("Stock perdido:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        txtStockPerdido.setText("0");
        txtStockPerdido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtStockPerdidoMousePressed(evt);
            }
        });
        jPanel2.add(txtStockPerdido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 150, 30));

        LabelNombre.setText("Nombre");
        jPanel2.add(LabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        BtnGuardarPerdido.setText("Guardar");
        BtnGuardarPerdido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarPerdidoActionPerformed(evt);
            }
        });
        jPanel2.add(BtnGuardarPerdido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        BtnCerrarSesion2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtnCerrarSesion2.setText("Cerrar sesión");
        BtnCerrarSesion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarSesion2ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnCerrarSesion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 160, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/flecha.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 450, 520));

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton1.setText("Ir a Venta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 20, 110, 30));

        jTabbedPane1.addTab("Stock perdido", jPanel2);

        Visualizar.setBackground(new java.awt.Color(255, 255, 255));
        Visualizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnMarcaCodi.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtnMarcaCodi.setText("Marca");
        BtnMarcaCodi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMarcaCodiActionPerformed(evt);
            }
        });
        Visualizar.add(BtnMarcaCodi, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 111, 162, 72));

        BtnProductoCodi.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtnProductoCodi.setText("Producto");
        BtnProductoCodi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProductoCodiActionPerformed(evt);
            }
        });
        Visualizar.add(BtnProductoCodi, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 111, 169, 72));

        BtnCerrarSesion1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtnCerrarSesion1.setText("Cerrar sesion");
        BtnCerrarSesion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarSesion1ActionPerformed(evt);
            }
        });
        Visualizar.add(BtnCerrarSesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 140, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Lista de Producto y Marcas");
        Visualizar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 330, 40));

        jTabbedPane1.addTab("Visualizar", Visualizar);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondoazuliptitulo2.setBackground(new java.awt.Color(51, 102, 255));

        titulotienda2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titulotienda2.setForeground(new java.awt.Color(255, 255, 255));
        titulotienda2.setText("Inventario");

        javax.swing.GroupLayout fondoazuliptitulo2Layout = new javax.swing.GroupLayout(fondoazuliptitulo2);
        fondoazuliptitulo2.setLayout(fondoazuliptitulo2Layout);
        fondoazuliptitulo2Layout.setHorizontalGroup(
            fondoazuliptitulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoazuliptitulo2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(titulotienda2)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        fondoazuliptitulo2Layout.setVerticalGroup(
            fondoazuliptitulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoazuliptitulo2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(titulotienda2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(fondoazuliptitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 260, 70));

        tablaBodega.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "NombreProducto", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaBodega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaBodegaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaBodega);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 470, 350));

        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 3, 14)); // NOI18N
        jLabel8.setText("Producto seleccionado:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel9.setText("Stock en la Bodega:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        txtStockBodega.setText("0");
        txtStockBodega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtStockBodegaMousePressed(evt);
            }
        });
        jPanel1.add(txtStockBodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 150, 30));

        LabelNombre1.setText("Nombre");
        jPanel1.add(LabelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        BtnGuardarPerdido1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtnGuardarPerdido1.setText("Guardar");
        BtnGuardarPerdido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarPerdido1ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnGuardarPerdido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 110, 30));

        BtnCerrarSesion4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtnCerrarSesion4.setText("Cerrar sesión");
        BtnCerrarSesion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarSesion4ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCerrarSesion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 160, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/flecha.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 450, 520));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Registrar la Bodega");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 330, 40));

        jTabbedPane1.addTab("Stock Fisico", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCerrarSesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarSesion1ActionPerformed
        Utils.AbrirLogin(this);
    }//GEN-LAST:event_BtnCerrarSesion1ActionPerformed

    private void BtnProductoCodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProductoCodiActionPerformed
        Utils.AbrirProductoCodi(this);
    }//GEN-LAST:event_BtnProductoCodiActionPerformed

    private void BtnMarcaCodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMarcaCodiActionPerformed
        Utils.AbrirMarcaCodi(this);
    }//GEN-LAST:event_BtnMarcaCodiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Utils.AbrirVenta(this);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtnCerrarSesion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarSesion2ActionPerformed
        Utils.AbrirLogin(this);
    }//GEN-LAST:event_BtnCerrarSesion2ActionPerformed

    private void BtnGuardarPerdidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarPerdidoActionPerformed
        UtilsInventario.registrarPerdida(this, tablaPerdida, LabelNombre, txtStockPerdido, txtDescripcionPerdido);
        try {
            inventario.cargarHistorial(tablaHistorial);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InventarioInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BtnGuardarPerdidoActionPerformed

    private void txtStockPerdidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtStockPerdidoMousePressed
        if (txtStockPerdido.getText().equals("0")) {
            txtStockPerdido.setText("");
        }
    }//GEN-LAST:event_txtStockPerdidoMousePressed

    private void txtDescripcionPerdidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescripcionPerdidoMousePressed
        if (txtDescripcionPerdido.getText().equals("Descripcion..")) {
            txtDescripcionPerdido.setText("");
        }
    }//GEN-LAST:event_txtDescripcionPerdidoMousePressed

    private void tablaPerdidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPerdidaMouseClicked
        LabelNombre.setText(tablaPerdida.getValueAt(tablaPerdida.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_tablaPerdidaMouseClicked

    private void BtnCerrarSesion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarSesion3ActionPerformed
        Utils.AbrirLogin(this);
    }//GEN-LAST:event_BtnCerrarSesion3ActionPerformed

    private void BtnRecargarHisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRecargarHisActionPerformed
        try {
            inventario.cargarHistorial(tablaHistorial);
        } catch (ClassNotFoundException ex) {
        }
    }//GEN-LAST:event_BtnRecargarHisActionPerformed

    private void tablaBodegaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaBodegaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaBodegaMouseClicked

    private void txtStockBodegaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtStockBodegaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockBodegaMousePressed

    private void BtnGuardarPerdido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarPerdido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGuardarPerdido1ActionPerformed

    private void BtnCerrarSesion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarSesion4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCerrarSesion4ActionPerformed

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
            java.util.logging.Logger.getLogger(InventarioInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventarioInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventarioInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventarioInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventarioInterfaz().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrarSesion1;
    private javax.swing.JButton BtnCerrarSesion2;
    private javax.swing.JButton BtnCerrarSesion3;
    private javax.swing.JButton BtnCerrarSesion4;
    private javax.swing.JButton BtnGuardarPerdido;
    private javax.swing.JButton BtnGuardarPerdido1;
    private javax.swing.JButton BtnMarcaCodi;
    private javax.swing.JButton BtnProductoCodi;
    private javax.swing.JButton BtnRecargarHis;
    private javax.swing.JLabel FechaUltiMo;
    private javax.swing.JPanel Hisotorial;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelNombre1;
    private javax.swing.JLabel UltimaModificacion;
    private javax.swing.JPanel Visualizar;
    private javax.swing.JPanel fondoazuliptitulo1;
    private javax.swing.JPanel fondoazuliptitulo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaBodega;
    private javax.swing.JTable tablaHistorial;
    private javax.swing.JTable tablaPerdida;
    private javax.swing.JLabel titulotienda1;
    private javax.swing.JLabel titulotienda2;
    private javax.swing.JTextField txtDescripcionPerdido;
    private javax.swing.JTextField txtStockBodega;
    private javax.swing.JTextField txtStockPerdido;
    // End of variables declaration//GEN-END:variables
}
