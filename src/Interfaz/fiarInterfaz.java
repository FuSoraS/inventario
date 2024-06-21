package Interfaz;

import Clases.Productos;
import Conectar.DaoProductos;
import Conectar.DaoCliente;
import Clases.Productos;
import Clases.Utils;
import Conectar.DaoInventario;
import Conectar.DaoProductos;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class fiarInterfaz extends javax.swing.JFrame {
    DaoCliente cliente = new DaoCliente();
    DaoProductos daoProducto = new DaoProductos();
    Productos producto = new Productos();
    DaoInventario inventario = new DaoInventario();
    public fiarInterfaz() {
        initComponents();
        cargarTablas();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tablaFiarProducto = new javax.swing.JTable();
        TxtCantidadProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BtnGuardar = new javax.swing.JButton();
        LabelProducto = new javax.swing.JLabel();
        BtnCerrarSesion = new javax.swing.JButton();
        BtnMenuCentral = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaFiarCliente = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        LabelCliente = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fondoZaculTablaProducto = new javax.swing.JPanel();
        titulotienda2 = new javax.swing.JLabel();
        fondoazuliptitulo3 = new javax.swing.JPanel();
        titulotienda3 = new javax.swing.JLabel();
        fondoZaculTablaCliente1 = new javax.swing.JPanel();
        titulotienda4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaFiarProducto.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaFiarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaFiarProductoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaFiarProducto);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 390, 160));

        TxtCantidadProducto.setText("0");
        getContentPane().add(TxtCantidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 150, 30));

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 3, 14)); // NOI18N
        jLabel5.setText("Producto seleccionado:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        BtnGuardar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, 30));

        LabelProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelProducto.setText("No seleccionado");
        getContentPane().add(LabelProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 180, -1));

        BtnCerrarSesion.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnCerrarSesion.setText("Cerrar sesión");
        BtnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 130, 30));

        BtnMenuCentral.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnMenuCentral.setText("Menu Central");
        BtnMenuCentral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuCentralActionPerformed(evt);
            }
        });
        getContentPane().add(BtnMenuCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 130, 30));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setText("Registrar Producto Fiados");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        tablaFiarCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Credito limite"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaFiarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaFiarClienteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaFiarCliente);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 390, 160));

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 3, 14)); // NOI18N
        jLabel7.setText("Cliente seleccionado:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        LabelCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelCliente.setText("No seleccionado");
        LabelCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LabelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 170, 20));

        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel8.setText("Insertar cantidad de productos:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        fondoZaculTablaProducto.setBackground(new java.awt.Color(51, 102, 255));

        titulotienda2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        titulotienda2.setForeground(new java.awt.Color(255, 255, 255));
        titulotienda2.setText("Tabla de Productos");

        javax.swing.GroupLayout fondoZaculTablaProductoLayout = new javax.swing.GroupLayout(fondoZaculTablaProducto);
        fondoZaculTablaProducto.setLayout(fondoZaculTablaProductoLayout);
        fondoZaculTablaProductoLayout.setHorizontalGroup(
            fondoZaculTablaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoZaculTablaProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulotienda2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoZaculTablaProductoLayout.setVerticalGroup(
            fondoZaculTablaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoZaculTablaProductoLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(titulotienda2)
                .addContainerGap())
        );

        getContentPane().add(fondoZaculTablaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 150, 30));

        fondoazuliptitulo3.setBackground(new java.awt.Color(51, 102, 255));

        titulotienda3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titulotienda3.setForeground(new java.awt.Color(255, 255, 255));
        titulotienda3.setText("Fiar");

        javax.swing.GroupLayout fondoazuliptitulo3Layout = new javax.swing.GroupLayout(fondoazuliptitulo3);
        fondoazuliptitulo3.setLayout(fondoazuliptitulo3Layout);
        fondoazuliptitulo3Layout.setHorizontalGroup(
            fondoazuliptitulo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoazuliptitulo3Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(titulotienda3)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        fondoazuliptitulo3Layout.setVerticalGroup(
            fondoazuliptitulo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoazuliptitulo3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titulotienda3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(fondoazuliptitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 260, 70));

        fondoZaculTablaCliente1.setBackground(new java.awt.Color(51, 102, 255));

        titulotienda4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        titulotienda4.setForeground(new java.awt.Color(255, 255, 255));
        titulotienda4.setText("Tabla de Clientes");

        javax.swing.GroupLayout fondoZaculTablaCliente1Layout = new javax.swing.GroupLayout(fondoZaculTablaCliente1);
        fondoZaculTablaCliente1.setLayout(fondoZaculTablaCliente1Layout);
        fondoZaculTablaCliente1Layout.setHorizontalGroup(
            fondoZaculTablaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoZaculTablaCliente1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulotienda4)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        fondoZaculTablaCliente1Layout.setVerticalGroup(
            fondoZaculTablaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoZaculTablaCliente1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulotienda4)
                .addGap(28, 28, 28))
        );

        getContentPane().add(fondoZaculTablaCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 140, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/flecha.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 450, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaFiarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFiarProductoMouseClicked
        LabelProducto.setText(tablaFiarProducto.getValueAt(tablaFiarProducto.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_tablaFiarProductoMouseClicked

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        realiarPrestamos();      
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarSesionActionPerformed
        Utils.AbrirLogin(this);
    }//GEN-LAST:event_BtnCerrarSesionActionPerformed

    private void BtnMenuCentralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuCentralActionPerformed
        Utils.AbrirMenuCentral(this);
    }//GEN-LAST:event_BtnMenuCentralActionPerformed

    private void tablaFiarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFiarClienteMouseClicked
    LabelCliente.setText(tablaFiarCliente.getValueAt(tablaFiarCliente.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_tablaFiarClienteMouseClicked

    // Metodos
    
    private void realiarPrestamos() {
    int selectedRowC = tablaFiarCliente.getSelectedRow();
    int selectedRowP = tablaFiarProducto.getSelectedRow();
    
    if (selectedRowC >= 0 && selectedRowP >= 0) {
        try {
            // variables para obtener los campos
            String nombreCliente = LabelCliente.getText();
            String nombreProducto = LabelProducto.getText();
            int cantidadVendida = Integer.parseInt(TxtCantidadProducto.getText());


            // Obtener el stock actual del producto seleccionado
            int stockActual = Integer.parseInt(tablaFiarProducto.getValueAt(selectedRowP, 1).toString());

            // Calcular el nuevo stock
            int nuevoStock = stockActual - cantidadVendida;
            if (nuevoStock < 0) {
                JOptionPane.showMessageDialog(this, "Cantidad vendida no puede ser mayor al stock actual.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // datos de pérdida no hay
            int cantidadPerdida = 0;
            String descripcionPerdida = "";

            // Actualizar el stock del producto en la base de datos
            daoProducto.actualizarStockProducto(nombreProducto, nuevoStock);

            // Insertar registro en la tabla de historial
            producto.setNombre(nombreProducto);
            producto.setStock_inicial(stockActual);
            inventario.insertarHistorial(producto, cantidadVendida, cantidadPerdida, descripcionPerdida, nuevoStock);

            // Recargar la tabla para mostrar el nuevo stock
            cargarTablas();
            JOptionPane.showMessageDialog(this, "Venta registrada con éxito");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido para la cantidad vendida.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VentaInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Seleccione un producto de la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
// Metodo para cargar todas las tablas de la interfaz
    private void cargarTablas() {
        try {
            cliente.cTablaFiarCliente(tablaFiarCliente);
            daoProducto.cTablaFiarProducto(tablaFiarProducto);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentaInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
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
            java.util.logging.Logger.getLogger(fiarInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fiarInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fiarInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fiarInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fiarInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrarSesion;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnMenuCentral;
    private javax.swing.JLabel LabelCliente;
    private javax.swing.JLabel LabelProducto;
    private javax.swing.JTextField TxtCantidadProducto;
    private javax.swing.JPanel fondoZaculTablaCliente1;
    private javax.swing.JPanel fondoZaculTablaProducto;
    private javax.swing.JPanel fondoazuliptitulo3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaFiarCliente;
    private javax.swing.JTable tablaFiarProducto;
    private javax.swing.JLabel titulotienda2;
    private javax.swing.JLabel titulotienda3;
    private javax.swing.JLabel titulotienda4;
    // End of variables declaration//GEN-END:variables
}
