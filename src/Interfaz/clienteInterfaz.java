package Interfaz;

import Clases.Utils;


public class clienteInterfaz extends javax.swing.JFrame {

    public clienteInterfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Cliente = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        LabelTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        LabelNombreCompleto = new javax.swing.JLabel();
        txtNombreCompleto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BtnCrearCliente = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaClienteCrear = new javax.swing.JTable();
        BtnRecargar1 = new javax.swing.JButton();
        BtnCerrarSesion = new javax.swing.JButton();
        BtnProducto = new javax.swing.JButton();
        BtnVenta = new javax.swing.JButton();
        LabelDireccion1 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        imgflechafondo1 = new javax.swing.JLabel();
        Visualizar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtDescripcion2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaClienteEditar = new javax.swing.JTable();
        BtnModificar = new javax.swing.JButton();
        BtnRecargar2 = new javax.swing.JButton();
        BtnEliminar1 = new javax.swing.JButton();
        BtnCerrarSesion2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtDescripcion3 = new javax.swing.JTextField();
        imgflechafondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cliente.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(81, 112, 215));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelTelefono.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LabelTelefono.setForeground(new java.awt.Color(255, 255, 255));
        LabelTelefono.setText("Telefono:");
        jPanel10.add(LabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jPanel10.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 220, -1));

        LabelNombreCompleto.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LabelNombreCompleto.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombreCompleto.setText("Nombre Completo:");
        jPanel10.add(LabelNombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txtNombreCompleto.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jPanel10.add(txtNombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 220, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gestión de Creación de Cliente");
        jPanel10.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        BtnCrearCliente.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtnCrearCliente.setText("Crear");
        BtnCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearClienteActionPerformed(evt);
            }
        });
        jPanel10.add(BtnCrearCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 110, -1));

        tablaClienteCrear.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablaClienteCrear);

        jPanel10.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 380, 350));

        BtnRecargar1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtnRecargar1.setText("Recargar");
        BtnRecargar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRecargar1ActionPerformed(evt);
            }
        });
        jPanel10.add(BtnRecargar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 13, 110, 30));

        BtnCerrarSesion.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnCerrarSesion.setText("Cerrar sesión");
        BtnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel10.add(BtnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 420, 140, 30));

        BtnProducto.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnProducto.setText("Ir Producto");
        BtnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProductoActionPerformed(evt);
            }
        });
        jPanel10.add(BtnProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 130, 30));

        BtnVenta.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnVenta.setText("Ir Venta");
        BtnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVentaActionPerformed(evt);
            }
        });
        jPanel10.add(BtnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 420, 100, 30));

        LabelDireccion1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LabelDireccion1.setForeground(new java.awt.Color(255, 255, 255));
        LabelDireccion1.setText("Direccion:");
        jPanel10.add(LabelDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        txtDireccion.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jPanel10.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 220, -1));

        imgflechafondo1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        imgflechafondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/flecha.png"))); // NOI18N
        jPanel10.add(imgflechafondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 490, 470));

        javax.swing.GroupLayout ClienteLayout = new javax.swing.GroupLayout(Cliente);
        Cliente.setLayout(ClienteLayout);
        ClienteLayout.setHorizontalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
            .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ClienteLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ClienteLayout.setVerticalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ClienteLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Crear", Cliente);

        Visualizar.setBackground(new java.awt.Color(81, 112, 215));
        Visualizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefono");
        Visualizar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        txtDescripcion2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Visualizar.add(txtDescripcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 220, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre del cliente");
        Visualizar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, -1));

        txtNombre2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Visualizar.add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 220, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Editar de Cliente");
        Visualizar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        tablaClienteEditar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Direccion", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClienteEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClienteEditarMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaClienteEditar);

        Visualizar.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 380, 330));

        BtnModificar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtnModificar.setText("Modificar");
        BtnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnModificarMouseClicked(evt);
            }
        });
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        Visualizar.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 110, 30));

        BtnRecargar2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtnRecargar2.setText("Recargar");
        BtnRecargar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRecargar2ActionPerformed(evt);
            }
        });
        Visualizar.add(BtnRecargar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 120, 30));

        BtnEliminar1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtnEliminar1.setText("Eliminar");
        BtnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminar1ActionPerformed(evt);
            }
        });
        Visualizar.add(BtnEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 110, 30));

        BtnCerrarSesion2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnCerrarSesion2.setText("Cerrar sesión");
        BtnCerrarSesion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarSesion2ActionPerformed(evt);
            }
        });
        Visualizar.add(BtnCerrarSesion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 140, 30));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Direccion");
        Visualizar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        txtDescripcion3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Visualizar.add(txtDescripcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 220, -1));

        imgflechafondo2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        imgflechafondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/flecha.png"))); // NOI18N
        Visualizar.add(imgflechafondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 490, 470));

        jTabbedPane1.addTab("Editar", Visualizar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVentaActionPerformed
        Utils.AbrirVenta(this);
    }//GEN-LAST:event_BtnVentaActionPerformed

    private void BtnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProductoActionPerformed
        Utils.AbrirProducto(this);
    }//GEN-LAST:event_BtnProductoActionPerformed

    private void BtnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarSesionActionPerformed
        Utils.AbrirLogin(this);
    }//GEN-LAST:event_BtnCerrarSesionActionPerformed

    private void BtnRecargar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRecargar1ActionPerformed

    }//GEN-LAST:event_BtnRecargar1ActionPerformed

    private void BtnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearClienteActionPerformed
    }//GEN-LAST:event_BtnCrearClienteActionPerformed

    private void tablaClienteEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClienteEditarMouseClicked

    }//GEN-LAST:event_tablaClienteEditarMouseClicked

    private void BtnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnModificarMouseClicked

    }//GEN-LAST:event_BtnModificarMouseClicked

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed

    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnRecargar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRecargar2ActionPerformed

    }//GEN-LAST:event_BtnRecargar2ActionPerformed

    private void BtnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminar1ActionPerformed

    }//GEN-LAST:event_BtnEliminar1ActionPerformed

    private void BtnCerrarSesion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarSesion2ActionPerformed
        Utils.AbrirLogin(this);
    }//GEN-LAST:event_BtnCerrarSesion2ActionPerformed

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
            java.util.logging.Logger.getLogger(clienteInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clienteInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clienteInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clienteInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clienteInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrarSesion;
    private javax.swing.JButton BtnCerrarSesion2;
    private javax.swing.JButton BtnCrearCliente;
    private javax.swing.JButton BtnEliminar1;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnProducto;
    private javax.swing.JButton BtnRecargar1;
    private javax.swing.JButton BtnRecargar2;
    private javax.swing.JButton BtnVenta;
    private javax.swing.JPanel Cliente;
    private javax.swing.JLabel LabelDireccion1;
    private javax.swing.JLabel LabelNombreCompleto;
    private javax.swing.JLabel LabelTelefono;
    private javax.swing.JPanel Visualizar;
    private javax.swing.JLabel imgflechafondo1;
    private javax.swing.JLabel imgflechafondo2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaClienteCrear;
    private javax.swing.JTable tablaClienteEditar;
    private javax.swing.JTextField txtDescripcion2;
    private javax.swing.JTextField txtDescripcion3;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtNombreCompleto;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
