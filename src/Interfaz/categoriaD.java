
package Interfaz;

import Interfaz.Menu;
import  java.util.Timer;
import java.util.TimerTask;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import Clases.Categoria;
import Conectar.Conecta;
import Conectar.DaoCategoria;
import static java.lang.Integer.parseInt;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class categoriaD extends javax.swing.JFrame {

     DaoCategoria daoCategoria = new DaoCategoria();
     Categoria categoria = new Categoria();
     Categoria VCategoria = new Categoria();
     
    public categoriaD() {
        initComponents();
        
        
         Categoria cathi = new Categoria();
        
        cathi.setNombre_categoria(txt_nombre_cat_edit.getText());
        cathi.setSub_categoria(txt_subcate_edit.getText());
        cathi.setTipo(txt_tipo_edit.getText());
         try {
            daoCategoria.cargarTablaCreate(jtable_create);
            daoCategoria.cargarTablaEdit(jtable_edit);
            daoCategoria.cargarTablaView(jtable_view);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(categoriaD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        txtcategoria2 = new javax.swing.JLabel();
        txt_nombre_cat_create = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btn_create_cat = new javax.swing.JButton();
        txt_subcate_create = new javax.swing.JTextField();
        txtsubcategoria2 = new javax.swing.JLabel();
        txttipo2 = new javax.swing.JLabel();
        txt_tipo_create = new javax.swing.JTextField();
        btn_reload = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtable_create = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        imgflechafondo5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        txtcategoria1 = new javax.swing.JLabel();
        txt_nombre_cat_edit = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btn_modificar_edit = new javax.swing.JButton();
        txt_subcate_edit = new javax.swing.JTextField();
        txtsubcategoria1 = new javax.swing.JLabel();
        txttipo1 = new javax.swing.JLabel();
        txt_tipo_edit = new javax.swing.JTextField();
        btn_delete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtable_edit = new javax.swing.JTable();
        btn_reload_edit = new javax.swing.JButton();
        imgflechafondo2 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_view = new javax.swing.JTable();
        txtbuscar1 = new javax.swing.JLabel();
        txt_busqueda = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        btn_reload_view = new javax.swing.JButton();
        imgflechafondo4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(821, 480));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBackground(new java.awt.Color(81, 112, 215));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcategoria2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtcategoria2.setForeground(new java.awt.Color(255, 255, 255));
        txtcategoria2.setText("Nombre Categoría");
        jPanel20.add(txtcategoria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txt_nombre_cat_create.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_nombre_cat_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre_cat_createActionPerformed(evt);
            }
        });
        jPanel20.add(txt_nombre_cat_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 200, -1));

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Gestión de Ingreso de Categoría");
        jPanel20.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 260, -1));

        btn_create_cat.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btn_create_cat.setText("Crear");
        btn_create_cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_catActionPerformed(evt);
            }
        });
        jPanel20.add(btn_create_cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 120, 30));

        txt_subcate_create.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_subcate_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_subcate_createActionPerformed(evt);
            }
        });
        jPanel20.add(txt_subcate_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 200, -1));

        txtsubcategoria2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtsubcategoria2.setForeground(new java.awt.Color(255, 255, 255));
        txtsubcategoria2.setText("Sub Categoría");
        jPanel20.add(txtsubcategoria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 80, -1));

        txttipo2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txttipo2.setForeground(new java.awt.Color(255, 255, 255));
        txttipo2.setText("Tipo");
        jPanel20.add(txttipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 30, -1));

        txt_tipo_create.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_tipo_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tipo_createActionPerformed(evt);
            }
        });
        jPanel20.add(txt_tipo_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 200, -1));

        btn_reload.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_reload.setText("Actualizar");
        btn_reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reloadActionPerformed(evt);
            }
        });
        jPanel20.add(btn_reload, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 100, -1));

        jtable_create.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre Categoría", "Sub Categoría"
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
        jtable_create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jtable_createMouseEntered(evt);
            }
        });
        jScrollPane5.setViewportView(jtable_create);
        if (jtable_create.getColumnModel().getColumnCount() > 0) {
            jtable_create.getColumnModel().getColumn(0).setResizable(false);
            jtable_create.getColumnModel().getColumn(1).setResizable(false);
            jtable_create.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel20.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 470, 300));

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, -1, -1));

        jButton2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton2.setText("Ir Marca");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, -1, -1));

        imgflechafondo5.setBackground(new java.awt.Color(234, 234, 234));
        imgflechafondo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/flecha.png"))); // NOI18N
        imgflechafondo5.setText("jLabel1");
        jPanel20.add(imgflechafondo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 490, 490));

        jPanel2.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 500));

        jTabbedPane1.addTab("Crear", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(81, 112, 215));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcategoria1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtcategoria1.setForeground(new java.awt.Color(255, 255, 255));
        txtcategoria1.setText("Nombre Categoría");
        jPanel14.add(txtcategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        txt_nombre_cat_edit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_nombre_cat_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre_cat_editActionPerformed(evt);
            }
        });
        jPanel14.add(txt_nombre_cat_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 200, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gestión de Editado de Categoría");
        jPanel14.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 260, -1));

        btn_modificar_edit.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btn_modificar_edit.setText("Modifica");
        btn_modificar_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modificar_editMouseClicked(evt);
            }
        });
        btn_modificar_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_editActionPerformed(evt);
            }
        });
        jPanel14.add(btn_modificar_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 110, -1));

        txt_subcate_edit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel14.add(txt_subcate_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 200, -1));

        txtsubcategoria1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtsubcategoria1.setForeground(new java.awt.Color(255, 255, 255));
        txtsubcategoria1.setText("SubCategoría");
        jPanel14.add(txtsubcategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 80, -1));

        txttipo1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txttipo1.setForeground(new java.awt.Color(255, 255, 255));
        txttipo1.setText("Tipo");
        jPanel14.add(txttipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 30, -1));

        txt_tipo_edit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_tipo_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tipo_editActionPerformed(evt);
            }
        });
        jPanel14.add(txt_tipo_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 200, -1));

        btn_delete.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btn_delete.setText("Eliminar");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel14.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 100, 30));

        jtable_edit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre Categoría", "Sub Categoría", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable_edit.setColumnSelectionAllowed(true);
        jtable_edit.getTableHeader().setReorderingAllowed(false);
        jtable_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jtable_editMouseEntered(evt);
            }
        });
        jScrollPane3.setViewportView(jtable_edit);
        jtable_edit.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jtable_edit.getColumnModel().getColumnCount() > 0) {
            jtable_edit.getColumnModel().getColumn(0).setResizable(false);
            jtable_edit.getColumnModel().getColumn(1).setResizable(false);
            jtable_edit.getColumnModel().getColumn(2).setResizable(false);
            jtable_edit.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel14.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 470, 300));

        btn_reload_edit.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btn_reload_edit.setText("Acualizar");
        btn_reload_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reload_editActionPerformed(evt);
            }
        });
        jPanel14.add(btn_reload_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 110, 30));

        imgflechafondo2.setBackground(new java.awt.Color(234, 234, 234));
        imgflechafondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/flecha.png"))); // NOI18N
        imgflechafondo2.setText("jLabel1");
        jPanel14.add(imgflechafondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 490, 490));

        jPanel9.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 500));

        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 490, 490));

        jPanel13.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 500));

        jTabbedPane1.addTab("Editar", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(81, 112, 215));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtable_view.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtable_view.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jtable_view.setForeground(new java.awt.Color(222, 114, 54));
        jtable_view.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre Categoría", "Sub Categoría", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtable_view);
        if (jtable_view.getColumnModel().getColumnCount() > 0) {
            jtable_view.getColumnModel().getColumn(0).setResizable(false);
            jtable_view.getColumnModel().getColumn(1).setResizable(false);
            jtable_view.getColumnModel().getColumn(2).setResizable(false);
            jtable_view.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel8.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 660, 350));

        txtbuscar1.setBackground(new java.awt.Color(255, 255, 255));
        txtbuscar1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtbuscar1.setText("Buscar:");
        txtbuscar1.setOpaque(true);
        jPanel8.add(txtbuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 110, 30));

        txt_busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_busquedaActionPerformed(evt);
            }
        });
        txt_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_busquedaKeyReleased(evt);
            }
        });
        jPanel8.add(txt_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 420, 30));

        jPanel12.setBackground(new java.awt.Color(234, 234, 234));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btn_reload_view.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_reload_view.setText("Acualizar");
        btn_reload_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reload_viewActionPerformed(evt);
            }
        });
        jPanel8.add(btn_reload_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 100, 30));

        imgflechafondo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/flecha.png"))); // NOI18N
        imgflechafondo4.setText("jLabel1");
        jPanel8.add(imgflechafondo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 500, 490));

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 490));

        jTabbedPane1.addTab("Visualizar", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombre_cat_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre_cat_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre_cat_editActionPerformed

    private void txt_nombre_cat_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre_cat_createActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre_cat_createActionPerformed

    private void btn_create_catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_catActionPerformed
    
        
       
            categoria.setNombre_categoria(txt_nombre_cat_create.getText());
            categoria.setSub_categoria(txt_subcate_create.getText());
            categoria.setTipo(txt_tipo_create.getText());
        try{
            daoCategoria.crearCategoria(categoria);
            CleanCamposAdd();
            
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "Error: uno o más valores no son números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_create_catActionPerformed

    private void btn_modificar_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_editActionPerformed
           
    }//GEN-LAST:event_btn_modificar_editActionPerformed

    private void jtable_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_editMouseClicked
        txt_nombre_cat_edit.setText(jtable_edit.getValueAt(jtable_edit.getSelectedRow(), 1).toString());
        txt_subcate_edit.setText(jtable_edit.getValueAt(jtable_edit.getSelectedRow(), 2).toString());
        txt_tipo_edit.setText(jtable_edit.getValueAt(jtable_edit.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_jtable_editMouseClicked

    private void jtable_createMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_createMouseEntered

    }//GEN-LAST:event_jtable_createMouseEntered

    private void jtable_editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_editMouseEntered

    }//GEN-LAST:event_jtable_editMouseEntered

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

        int id_categoria = 0;
        if (jtable_edit.getSelectedRow() != -1) {
            id_categoria = Integer.parseInt(jtable_edit.getValueAt(jtable_edit.getSelectedRow(), 0).toString());
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar marca?", "Eliminar Marca", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                    daoCategoria.eliminarCategoria(id_categoria);
                    daoCategoria.cargarTablaView(jtable_edit);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Error al intentar eliminar la marca: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una marca para eliminar", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } 
        
        
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void txt_busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_busquedaKeyReleased

        String busqueda = "%" + txt_busqueda.getText() + "%"; // Create the search query with wildcards
    try {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Conecta con = new Conecta();
        conn = con.getConnection();
        String sql = "SELECT id_categoria, nombre_categoria, sub_categoria, tipo FROM categoria WHERE nombre_categoria LIKE ?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, busqueda);
        rs = stmt.executeQuery();
        DefaultTableModel model = (DefaultTableModel) jtable_view.getModel();
        model.setRowCount(0); // Clear the table before populating it with new data
        while (rs.next()) {
            Object[] row = {rs.getInt("id_categoria"), rs.getString("nombre_categoria"), rs.getString("sub_categoria"), rs.getString("tipo")};
            model.addRow(row);
        }
    } catch (ClassNotFoundException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al buscar la categoría: " + e.getMessage());
    }
    }//GEN-LAST:event_txt_busquedaKeyReleased

    private void txt_tipo_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tipo_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tipo_editActionPerformed

    private void txt_subcate_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_subcate_createActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_subcate_createActionPerformed

    private void txt_tipo_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tipo_createActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tipo_createActionPerformed

    private void btn_reloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reloadActionPerformed

        categoria.setNombre_categoria(txt_nombre_cat_edit.getText());
        categoria.setSub_categoria(txt_subcate_edit.getText());
        
        try { 
            daoCategoria.cargarTablaCreate(jtable_create);
        } catch (ClassNotFoundException ex) {
            System.out.println("eRRRRRRRROOOrrr"+ex);
        }
    }//GEN-LAST:event_btn_reloadActionPerformed

    private void txt_busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_busquedaActionPerformed
//nada
    }//GEN-LAST:event_txt_busquedaActionPerformed

    private void btn_reload_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reload_editActionPerformed

        categoria.setNombre_categoria(txt_nombre_cat_edit.getText());
        categoria.setSub_categoria(txt_subcate_edit.getText());
        categoria.setTipo(txt_tipo_edit.getText());
        try { 
            daoCategoria.cargarTablaEdit(jtable_edit);
        } catch (ClassNotFoundException ex) {
            System.out.println("eRRRRRRRROOOrrr"+ex);
        }
    }//GEN-LAST:event_btn_reload_editActionPerformed

    private void btn_reload_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reload_viewActionPerformed

        categoria.setNombre_categoria(txt_nombre_cat_edit.getText());
        categoria.setSub_categoria(txt_subcate_edit.getText());
        categoria.setTipo(txt_tipo_edit.getText());
        
        try { 
            daoCategoria.cargarTablaView(jtable_view);
        } catch (ClassNotFoundException ex) {
            System.out.println("eRRRRRRRROOOrrr"+ex);
        }
    }//GEN-LAST:event_btn_reload_viewActionPerformed

    private void btn_modificar_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificar_editMouseClicked
              if (jtable_edit.getSelectedRow() != -1) {
            int id_categoria = Integer.parseInt(jtable_edit.getValueAt(jtable_edit.getSelectedRow(), 0).toString());
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Desea modificar esta marca?", "Modificación de Marca", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                    Categoria categira1 = new Categoria();
                    DaoCategoria ca = new DaoCategoria();
                    categira1.setId_categoria(id_categoria);
                    categira1.setNombre_categoria(txt_nombre_cat_edit.getText().trim());
                    categira1.setSub_categoria(txt_subcate_edit.getText().trim());
                    categira1.setTipo(txt_tipo_edit.getText().trim());
                    ca.editarCategoria(categira1);
                    // Actualizar la tabla después de modificar la marca
                    ca.cargarTablaCreate(jtable_edit);
                    JOptionPane.showMessageDialog(rootPane, "Categoria modificada con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Error al intentar modificar la Categoria: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una Categoria para modificar", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_modificar_editMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          Login log= new Login();
                    dispose();
                    log.setLocationRelativeTo(null);
                    log.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          marcaInterfaz mar = new marcaInterfaz();
                    dispose();
                    mar.setLocationRelativeTo(null);
                    mar.setVisible(true);
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(categoriaD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(categoriaD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(categoriaD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(categoriaD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new categoriaD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_create_cat;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_modificar_edit;
    private javax.swing.JButton btn_reload;
    private javax.swing.JButton btn_reload_edit;
    private javax.swing.JButton btn_reload_view;
    private javax.swing.JLabel imgflechafondo2;
    private javax.swing.JLabel imgflechafondo4;
    private javax.swing.JLabel imgflechafondo5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jtable_create;
    private javax.swing.JTable jtable_edit;
    private javax.swing.JTable jtable_view;
    private javax.swing.JTextField txt_busqueda;
    private javax.swing.JTextField txt_nombre_cat_create;
    private javax.swing.JTextField txt_nombre_cat_edit;
    private javax.swing.JTextField txt_subcate_create;
    private javax.swing.JTextField txt_subcate_edit;
    private javax.swing.JTextField txt_tipo_create;
    private javax.swing.JTextField txt_tipo_edit;
    private javax.swing.JLabel txtbuscar1;
    private javax.swing.JLabel txtcategoria1;
    private javax.swing.JLabel txtcategoria2;
    private javax.swing.JLabel txtsubcategoria1;
    private javax.swing.JLabel txtsubcategoria2;
    private javax.swing.JLabel txttipo1;
    private javax.swing.JLabel txttipo2;
    // End of variables declaration//GEN-END:variables

    private void CleanCamposAdd()
    {
    txt_nombre_cat_create.setText("");
    txt_subcate_create.setText("");
    txt_tipo_create.setText("");
    }
    
    private void CleanCamposEdit()
    {
         txt_nombre_cat_edit.setText("");
         txt_subcate_edit.setText("");
         txt_tipo_edit.setText("");
    }
    
}
