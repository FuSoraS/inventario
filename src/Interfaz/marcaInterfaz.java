
package Interfaz;

import Clases.Marca;
import static Conectar.Conecta.user;
import Conectar.DaoMarca;
import java.sql.SQLException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class marcaInterfaz extends javax.swing.JFrame {
    DaoMarca brand = new DaoMarca();
    Marca marcaedit = new Marca();
    
    public marcaInterfaz() {
       
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        categoriaD categoria1 = new categoriaD();
        Marca marca = new Marca();
        marca.setNombre(txtNombre.getText());
        marca.setDescripcion(txtDescripcion.getText());
        try {
            brand.cargarTabla(tablaMarca);
            brand.cargarTabla3(tablaMarca2);
            brand.cargarTabla4(tablaMarca4);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(marcaInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTab = new javax.swing.JTabbedPane();
        Pane_Create = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BtnCrearMarca = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaMarca = new javax.swing.JTable();
        BtnRecargar1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        imgflechafondo1 = new javax.swing.JLabel();
        Pane_Edit = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtDescripcion2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaMarca2 = new javax.swing.JTable();
        BtnModificar = new javax.swing.JButton();
        BtnRecargar2 = new javax.swing.JButton();
        BtnEliminar1 = new javax.swing.JButton();
        imgflechafondo2 = new javax.swing.JLabel();
        Pane_View = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        EditTextBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMarca4 = new javax.swing.JTable();
        BtnRecargar4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pane_Create.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(81, 112, 215));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Descripción");
        jPanel10.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        txtDescripcion.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jPanel10.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 220, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre de la Marca");
        jPanel10.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        txtNombre.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jPanel10.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 220, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gestión de Creación de Marca");
        jPanel10.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        BtnCrearMarca.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtnCrearMarca.setText("Crear");
        BtnCrearMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearMarcaActionPerformed(evt);
            }
        });
        jPanel10.add(BtnCrearMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 110, -1));

        tablaMarca.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tablaMarca);

        jPanel10.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 380, 350));

        BtnRecargar1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtnRecargar1.setText("Recargar");
        BtnRecargar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRecargar1ActionPerformed(evt);
            }
        });
        jPanel10.add(BtnRecargar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        jButton2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, -1, -1));

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton1.setText("Ir Categoría");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, -1, -1));

        imgflechafondo1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        imgflechafondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/flecha.png"))); // NOI18N
        jPanel10.add(imgflechafondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 490, 470));

        Pane_Create.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 800, 480));

        jTab.addTab("Crear", Pane_Create);

        Pane_Edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(81, 112, 215));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descripción");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        txtDescripcion2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jPanel7.add(txtDescripcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 220, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre de la Marca");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 160, -1));

        txtNombre2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jPanel7.add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 220, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gestión de Editar de Marca");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        tablaMarca2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Marca", "Descripción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
        tablaMarca2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMarca2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaMarca2);

        jPanel7.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 380, 330));

        BtnModificar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
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
        jPanel7.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 110, 30));

        BtnRecargar2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtnRecargar2.setText("Recargar");
        BtnRecargar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRecargar2ActionPerformed(evt);
            }
        });
        jPanel7.add(BtnRecargar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 120, 30));

        BtnEliminar1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtnEliminar1.setText("Eliminar");
        BtnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminar1ActionPerformed(evt);
            }
        });
        jPanel7.add(BtnEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 110, 30));

        imgflechafondo2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        imgflechafondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/flecha.png"))); // NOI18N
        jPanel7.add(imgflechafondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 490, 470));

        Pane_Edit.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 800, 480));

        jTab.addTab("Editar", Pane_Edit);

        Pane_View.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(234, 234, 234));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Pane_View.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 240, -1, -1));

        jPanel13.setBackground(new java.awt.Color(81, 112, 215));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Gestión de Visualisación de Marca");
        jPanel13.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        EditTextBusqueda.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        EditTextBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditTextBusquedaActionPerformed(evt);
            }
        });
        EditTextBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EditTextBusquedaKeyReleased(evt);
            }
        });
        jPanel13.add(EditTextBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 320, 30));

        tablaMarca4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Marca", "Descripción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaMarca4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMarca4MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaMarca4);

        jPanel13.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 740, 300));

        BtnRecargar4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtnRecargar4.setText("Recargar");
        BtnRecargar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRecargar4ActionPerformed(evt);
            }
        });
        jPanel13.add(BtnRecargar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Buscar:");
        jPanel13.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        Pane_View.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 490));

        jTab.addTab("visualizar", Pane_View);

        getContentPane().add(jTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRecargar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRecargar4ActionPerformed
        Marca marca = new Marca();
        marca.setNombre(txtNombre.getText());
        marca.setDescripcion(txtDescripcion.getText());
        try {
            brand.cargarTabla4(tablaMarca4);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(marcaInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnRecargar4ActionPerformed

    private void tablaMarca4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMarca4MouseClicked

    }//GEN-LAST:event_tablaMarca4MouseClicked

    private void EditTextBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EditTextBusquedaKeyReleased
        try {
            String buscar = EditTextBusqueda.getText();
            DaoMarca marca = new DaoMarca();
            marca.buscaMarca(buscar, txtNombre, txtDescripcion, tablaMarca4);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(marcaInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EditTextBusquedaKeyReleased

    private void EditTextBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditTextBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditTextBusquedaActionPerformed

    private void BtnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminar1ActionPerformed
        DaoMarca mar = new DaoMarca();
        int id_marca = 0;
        if (tablaMarca2.getSelectedRow() != -1) {
            id_marca = Integer.parseInt(tablaMarca2.getValueAt(tablaMarca2.getSelectedRow(), 0).toString());
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar marca?", "Eliminar Marca", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                    mar.EliminarMarca(id_marca);
                    brand.cargarTabla3(tablaMarca2);
                } catch (ClassNotFoundException | SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Error al intentar eliminar la marca: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una marca para eliminar", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BtnEliminar1ActionPerformed

    private void BtnRecargar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRecargar2ActionPerformed
        Marca marca = new Marca();

        marca.setNombre(txtNombre.getText());
        marca.setDescripcion(txtDescripcion.getText());
        try {
            brand.cargarTabla3(tablaMarca2);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(marcaInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnRecargar2ActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed

    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnModificarMouseClicked
        if (tablaMarca2.getSelectedRow() != -1) {
            int id_marca = Integer.parseInt(tablaMarca2.getValueAt(tablaMarca2.getSelectedRow(), 0).toString());
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Desea modificar esta marca?", "Modificación de Marca", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                    Marca marca = new Marca();
                    DaoMarca mar = new DaoMarca();
                    marca.setId(id_marca);
                    marca.setNombre(txtNombre2.getText().trim());
                    marca.setDescripcion(txtDescripcion2.getText().trim());
                    mar.ModificarMarca(marca);
                    // Actualizar la tabla después de modificar la marca
                    brand.cargarTabla3(tablaMarca2);
                    JOptionPane.showMessageDialog(rootPane, "Marca modificada con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } catch (ClassNotFoundException | SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Error al intentar modificar la marca: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una marca para modificar", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BtnModificarMouseClicked

    private void tablaMarca2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMarca2MouseClicked
        txtNombre2.setText(tablaMarca2.getValueAt(tablaMarca2.getSelectedRow(), 1).toString());
        txtDescripcion2.setText(tablaMarca2.getValueAt(tablaMarca2.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_tablaMarca2MouseClicked

    private void BtnRecargar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRecargar1ActionPerformed
        /*       Marca marca = new Marca();
        marca.setNombre(txtNombre.getText());
        marca.setDescripcion(txtDescripcion.getText());
        try {
            brand.cargarTabla(tablaMarca);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(marcaInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_BtnRecargar1ActionPerformed

    private void BtnCrearMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearMarcaActionPerformed
        Marca marca = new Marca();
        DaoMarca user = new DaoMarca();

        marca.setNombre(txtNombre.getText());
        marca.setDescripcion(txtDescripcion.getText());
        try {
            user.AgregarMarca(marca);
            brand.cargarTabla(tablaMarca);
            //limpiarCamposadd();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(marcaInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.limpiarCampo1();
    }//GEN-LAST:event_BtnCrearMarcaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
categoriaD cat= new categoriaD();
                    dispose();
                    cat.setLocationRelativeTo(null);
                    cat.setVisible(true);     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Login log= new Login();
                    dispose();
                    log.setLocationRelativeTo(null);
                    log.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(marcaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(marcaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(marcaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(marcaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new marcaInterfaz().setVisible(true);
            }
        });
    }

    private void limpiarCampo1(){
txtNombre.setText("");
txtDescripcion.setText("");
} 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCrearMarca;
    private javax.swing.JButton BtnEliminar1;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnRecargar1;
    private javax.swing.JButton BtnRecargar2;
    private javax.swing.JButton BtnRecargar4;
    private javax.swing.JTextField EditTextBusqueda;
    private javax.swing.JPanel Pane_Create;
    private javax.swing.JPanel Pane_Edit;
    private javax.swing.JPanel Pane_View;
    private javax.swing.JLabel imgflechafondo1;
    private javax.swing.JLabel imgflechafondo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTab;
    private javax.swing.JTable tablaMarca;
    private javax.swing.JTable tablaMarca2;
    private javax.swing.JTable tablaMarca4;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDescripcion2;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre2;
    // End of variables declaration//GEN-END:variables
}

