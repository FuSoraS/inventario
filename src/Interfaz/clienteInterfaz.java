package Interfaz;

import Clases.Cliente;
import Clases.Utils;
import Conectar.DaoCliente;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;


public class clienteInterfaz extends javax.swing.JFrame {
DaoCliente brand = new DaoCliente();
Cliente cliente = new Cliente();
    public clienteInterfaz() {
        initComponents();
        try {
            brand.cargarTablaCrear(tablaClienteCrear);
            brand.cargarTablaModificar(tablaClienteModificar);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(clienteInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Cliente = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        LabelTelefono = new javax.swing.JLabel();
        txtFecha_ven1 = new javax.swing.JTextField();
        LabelNombreCompleto = new javax.swing.JLabel();
        txtNombreCompleto1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BtnCrearCliente = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaClienteCrear = new javax.swing.JTable();
        BtnRecargar1 = new javax.swing.JButton();
        BtnCerrarSesion = new javax.swing.JButton();
        BtnMenuCentral = new javax.swing.JButton();
        LabelDireccion1 = new javax.swing.JLabel();
        txtDireccion1 = new javax.swing.JTextField();
        txtTelefono1 = new javax.swing.JTextField();
        LabelTelefono1 = new javax.swing.JLabel();
        txtinteres1 = new javax.swing.JTextField();
        LabelTelefono2 = new javax.swing.JLabel();
        txtLimiteCredito1 = new javax.swing.JTextField();
        imgflechafondo1 = new javax.swing.JLabel();
        LabelTelefono3 = new javax.swing.JLabel();
        LabelTelefono4 = new javax.swing.JLabel();
        LabelTelefono9 = new javax.swing.JLabel();
        Visualizar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaClienteModificar = new javax.swing.JTable();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar1 = new javax.swing.JButton();
        BtnCerrarSesion2 = new javax.swing.JButton();
        LabelTelefono5 = new javax.swing.JLabel();
        txtFecha_ven2 = new javax.swing.JTextField();
        LabelNombreCompleto1 = new javax.swing.JLabel();
        txtNombreCompleto2 = new javax.swing.JTextField();
        LabelDireccion2 = new javax.swing.JLabel();
        txtDireccion2 = new javax.swing.JTextField();
        txtTelefono2 = new javax.swing.JTextField();
        LabelTelefono6 = new javax.swing.JLabel();
        txtinteres2 = new javax.swing.JTextField();
        LabelTelefono7 = new javax.swing.JLabel();
        txtLimiteCredito2 = new javax.swing.JTextField();
        LabelTelefono8 = new javax.swing.JLabel();
        imgflechafondo2 = new javax.swing.JLabel();
        LabelTelefono10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cliente.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(81, 112, 215));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelTelefono.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LabelTelefono.setForeground(new java.awt.Color(255, 255, 255));
        LabelTelefono.setText("vencimiento:"); // NOI18N
        jPanel10.add(LabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, 30));

        txtFecha_ven1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jPanel10.add(txtFecha_ven1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 220, -1));

        LabelNombreCompleto.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LabelNombreCompleto.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombreCompleto.setText("Nombre Completo:");
        jPanel10.add(LabelNombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtNombreCompleto1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jPanel10.add(txtNombreCompleto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 220, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gestión de Creación de Cliente");
        jPanel10.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        BtnCrearCliente.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtnCrearCliente.setText("Crear");
        BtnCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearClienteActionPerformed(evt);
            }
        });
        jPanel10.add(BtnCrearCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 110, -1));

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

        jPanel10.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 440, 390));

        BtnRecargar1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtnRecargar1.setText("Recargar");
        BtnRecargar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRecargar1ActionPerformed(evt);
            }
        });
        jPanel10.add(BtnRecargar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 110, 30));

        BtnCerrarSesion.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnCerrarSesion.setText("Cerrar sesión");
        BtnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel10.add(BtnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 130, 30));

        BtnMenuCentral.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnMenuCentral.setText("Menu Central");
        BtnMenuCentral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuCentralActionPerformed(evt);
            }
        });
        jPanel10.add(BtnMenuCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 120, 30));

        LabelDireccion1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LabelDireccion1.setForeground(new java.awt.Color(255, 255, 255));
        LabelDireccion1.setText("Direccion:");
        jPanel10.add(LabelDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        txtDireccion1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jPanel10.add(txtDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 220, -1));

        txtTelefono1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jPanel10.add(txtTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 220, -1));

        LabelTelefono1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LabelTelefono1.setForeground(new java.awt.Color(255, 255, 255));
        LabelTelefono1.setText("Telefono:");
        jPanel10.add(LabelTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        txtinteres1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jPanel10.add(txtinteres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 220, -1));

        LabelTelefono2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LabelTelefono2.setForeground(new java.awt.Color(255, 255, 255));
        LabelTelefono2.setText("Interes:");
        jPanel10.add(LabelTelefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        txtLimiteCredito1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jPanel10.add(txtLimiteCredito1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 220, -1));

        imgflechafondo1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        imgflechafondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/flecha.png"))); // NOI18N
        jPanel10.add(imgflechafondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 490, 470));

        LabelTelefono3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LabelTelefono3.setForeground(new java.awt.Color(255, 255, 255));
        LabelTelefono3.setText("Limite de credito:");
        jPanel10.add(LabelTelefono3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        LabelTelefono4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LabelTelefono4.setForeground(new java.awt.Color(255, 255, 255));
        LabelTelefono4.setText("Fecha de"); // NOI18N
        jPanel10.add(LabelTelefono4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 80, 30));

        LabelTelefono9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        LabelTelefono9.setForeground(new java.awt.Color(204, 204, 204));
        LabelTelefono9.setText("Formato: Año-Mes-Dia"); // NOI18N
        jPanel10.add(LabelTelefono9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 200, 30));

        javax.swing.GroupLayout ClienteLayout = new javax.swing.GroupLayout(Cliente);
        Cliente.setLayout(ClienteLayout);
        ClienteLayout.setHorizontalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
            .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE))
        );
        ClienteLayout.setVerticalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
            .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ClienteLayout.createSequentialGroup()
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Crear", Cliente);

        Visualizar.setBackground(new java.awt.Color(81, 112, 215));
        Visualizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Editar Cliente");
        Visualizar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        tablaClienteModificar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Direccion", "Telefono", "Title 5", "Title 6", "Title 7"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClienteModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClienteModificarMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaClienteModificar);

        Visualizar.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 590, 380));

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
        Visualizar.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 110, 30));

        BtnEliminar1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtnEliminar1.setText("Eliminar");
        BtnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminar1ActionPerformed(evt);
            }
        });
        Visualizar.add(BtnEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 110, 30));

        BtnCerrarSesion2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnCerrarSesion2.setText("Cerrar sesión");
        BtnCerrarSesion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarSesion2ActionPerformed(evt);
            }
        });
        Visualizar.add(BtnCerrarSesion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 140, 30));

        LabelTelefono5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LabelTelefono5.setForeground(new java.awt.Color(255, 255, 255));
        LabelTelefono5.setText("vencimiento:"); // NOI18N
        Visualizar.add(LabelTelefono5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, 30));

        txtFecha_ven2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Visualizar.add(txtFecha_ven2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 220, -1));

        LabelNombreCompleto1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LabelNombreCompleto1.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombreCompleto1.setText("Nombre Completo:");
        Visualizar.add(LabelNombreCompleto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtNombreCompleto2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Visualizar.add(txtNombreCompleto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 220, -1));

        LabelDireccion2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LabelDireccion2.setForeground(new java.awt.Color(255, 255, 255));
        LabelDireccion2.setText("Direccion:");
        Visualizar.add(LabelDireccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        txtDireccion2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Visualizar.add(txtDireccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 220, -1));

        txtTelefono2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Visualizar.add(txtTelefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 220, -1));

        LabelTelefono6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LabelTelefono6.setForeground(new java.awt.Color(255, 255, 255));
        LabelTelefono6.setText("Telefono:");
        Visualizar.add(LabelTelefono6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        txtinteres2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Visualizar.add(txtinteres2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 220, -1));

        LabelTelefono7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LabelTelefono7.setForeground(new java.awt.Color(255, 255, 255));
        LabelTelefono7.setText("Interes:");
        Visualizar.add(LabelTelefono7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        txtLimiteCredito2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Visualizar.add(txtLimiteCredito2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 220, -1));

        LabelTelefono8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LabelTelefono8.setForeground(new java.awt.Color(255, 255, 255));
        LabelTelefono8.setText("Limite de credito:");
        Visualizar.add(LabelTelefono8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        imgflechafondo2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        imgflechafondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/flecha.png"))); // NOI18N
        Visualizar.add(imgflechafondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 490, 470));

        LabelTelefono10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LabelTelefono10.setForeground(new java.awt.Color(255, 255, 255));
        LabelTelefono10.setText("Fecha de"); // NOI18N
        Visualizar.add(LabelTelefono10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 80, 30));

        jTabbedPane1.addTab("Editar", Visualizar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarSesionActionPerformed
        Utils.AbrirLogin(this);
    }//GEN-LAST:event_BtnCerrarSesionActionPerformed

    private void BtnRecargar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRecargar1ActionPerformed

    }//GEN-LAST:event_BtnRecargar1ActionPerformed

    private void BtnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearClienteActionPerformed
        try {
        // Enviar los datos
        cliente.setNombre_completo(txtNombreCompleto1.getText());
        cliente.setDireccion(txtDireccion1.getText());
        cliente.setTelefono(txtTelefono1.getText());
        Double interes = Double.valueOf(txtinteres1.getText());
        cliente.setInteres(interes);
        int credito_limite = Integer.parseInt(txtLimiteCredito1.getText());
        cliente.setCredito_limite(credito_limite);

        // Formato en el que esperas recibir la fecha
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        // Obtener el texto del campo de texto
        String fechaTexto = txtFecha_ven1.getText();
        // Convertir el texto a un objeto java.util.Date
        java.util.Date parsedDate = dateFormat.parse(fechaTexto);
        // Convertir java.util.Date a java.sql.Date
        Date fecha_ven = new Date(parsedDate.getTime());
        // Asignar la fecha al objeto cliente
        cliente.setFecha(fecha_ven);

        // Método para insertar datos en la base de datos
        brand.AgregarCliente(cliente);
        
        // Cargar las tablas
        brand.cargarTablaCrear(tablaClienteCrear);
        brand.cargarTablaModificar(tablaClienteModificar);
        this.limpiarCampoCrear();
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(marcaInterfaz.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ParseException ex) {
        Logger.getLogger(clienteInterfaz.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_BtnCrearClienteActionPerformed

    private void tablaClienteModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClienteModificarMouseClicked
        txtNombreCompleto2.setText(tablaClienteModificar.getValueAt(tablaClienteModificar.getSelectedRow(), 1).toString());
        txtDireccion2.setText(tablaClienteModificar.getValueAt(tablaClienteModificar.getSelectedRow(), 2).toString());
        txtTelefono2.setText(tablaClienteModificar.getValueAt(tablaClienteModificar.getSelectedRow(), 3).toString());
        txtinteres2.setText(tablaClienteModificar.getValueAt(tablaClienteModificar.getSelectedRow(), 4).toString());
        txtLimiteCredito2.setText(tablaClienteModificar.getValueAt(tablaClienteModificar.getSelectedRow(), 5).toString());
        txtFecha_ven2.setText(tablaClienteModificar.getValueAt(tablaClienteModificar.getSelectedRow(), 6).toString());
    }//GEN-LAST:event_tablaClienteModificarMouseClicked

    private void BtnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnModificarMouseClicked

    }//GEN-LAST:event_BtnModificarMouseClicked

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
       if (tablaClienteModificar.getSelectedRow() != -1) {
            int id_cliente = Integer.parseInt(tablaClienteModificar.getValueAt(tablaClienteModificar.getSelectedRow(), 0).toString());
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Desea modificar este cliente?", "Modificación de Cliente", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                    cliente.setId(id_cliente);
                    cliente.setNombre_completo(txtNombreCompleto2.getText().trim());
                    cliente.setDireccion(txtDireccion2.getText().trim());
                    cliente.setTelefono(txtTelefono2.getText().trim());
                    // Convertir en Double el interes
                    Double interes = Double.valueOf(txtinteres2.getText().trim());
                    cliente.setInteres(interes);
                    // Convertir en numero entero
                    int credito_limite = Integer.parseInt(txtLimiteCredito2.getText().trim());
                    cliente.setCredito_limite(credito_limite);
                    // Formato en el que esperas recibir la fecha
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    // Obtener el texto del campo de texto
                    String fechaTexto = txtFecha_ven2.getText();
                    // Convertir el texto a un objeto java.util.Date
                    java.util.Date parsedDate = dateFormat.parse(fechaTexto);
                    // Convertir java.util.Date a java.sql.Date
                    Date fecha_ven = new Date(parsedDate.getTime());
                    // Asignar la fecha al cliente
                    cliente.setFecha(fecha_ven);

                    // Metodo para actualizar los datos
                    brand.ModificarCliente(cliente);
                    // Actualizar la tabla después de modificar el cliente
                    brand.cargarTablaModificar(tablaClienteModificar);
                    brand.cargarTablaCrear(tablaClienteCrear);
                    JOptionPane.showMessageDialog(rootPane, "Cliente modificado con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Error al intentar modificar el cliente: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                } catch (SQLException ex) {
                    Logger.getLogger(clienteInterfaz.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(clienteInterfaz.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un cliente para modificar", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminar1ActionPerformed
        int cliente_id = 0;
        if (tablaClienteModificar.getSelectedRow() != -1) {
            cliente_id = Integer.parseInt(tablaClienteModificar.getValueAt(tablaClienteModificar.getSelectedRow(), 0).toString());
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar el cliente?", "Eliminar Cliente", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                    brand.EliminarCliente(cliente_id);
                    brand.cargarTablaModificar(tablaClienteModificar);
                    brand.cargarTablaCrear(tablaClienteCrear);
                } catch (ClassNotFoundException | SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Error al intentar eliminar la marca: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una marca para eliminar", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        this.limpiarCampoModificar();
    }//GEN-LAST:event_BtnEliminar1ActionPerformed

    private void BtnCerrarSesion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarSesion2ActionPerformed
        Utils.AbrirMenuCentral(this);
    }//GEN-LAST:event_BtnCerrarSesion2ActionPerformed

    private void BtnMenuCentralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuCentralActionPerformed
        Utils.AbrirMenuCentral(this);
    }//GEN-LAST:event_BtnMenuCentralActionPerformed

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
    // Limpiar campos de la tabla Crear Cliente
    private void limpiarCampoCrear(){
        txtNombreCompleto1.setText("");
        txtDireccion1.setText("");
        txtTelefono1.setText("");
        txtinteres1.setText("");
        txtLimiteCredito1.setText("");
        txtFecha_ven1.setText("");
    }
    // Limpiar campos de la tabla Editar Cliente
    private void limpiarCampoModificar(){
    txtNombreCompleto2.setText("");
    txtDireccion2.setText("");
    txtTelefono2.setText("");
    txtinteres2.setText("");
    txtLimiteCredito2.setText("");
    txtFecha_ven2.setText("");
} 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrarSesion;
    private javax.swing.JButton BtnCerrarSesion2;
    private javax.swing.JButton BtnCrearCliente;
    private javax.swing.JButton BtnEliminar1;
    private javax.swing.JButton BtnMenuCentral;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnRecargar1;
    private javax.swing.JPanel Cliente;
    private javax.swing.JLabel LabelDireccion1;
    private javax.swing.JLabel LabelDireccion2;
    private javax.swing.JLabel LabelNombreCompleto;
    private javax.swing.JLabel LabelNombreCompleto1;
    private javax.swing.JLabel LabelTelefono;
    private javax.swing.JLabel LabelTelefono1;
    private javax.swing.JLabel LabelTelefono10;
    private javax.swing.JLabel LabelTelefono2;
    private javax.swing.JLabel LabelTelefono3;
    private javax.swing.JLabel LabelTelefono4;
    private javax.swing.JLabel LabelTelefono5;
    private javax.swing.JLabel LabelTelefono6;
    private javax.swing.JLabel LabelTelefono7;
    private javax.swing.JLabel LabelTelefono8;
    private javax.swing.JLabel LabelTelefono9;
    private javax.swing.JPanel Visualizar;
    private javax.swing.JLabel imgflechafondo1;
    private javax.swing.JLabel imgflechafondo2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaClienteCrear;
    private javax.swing.JTable tablaClienteModificar;
    private javax.swing.JTextField txtDireccion1;
    private javax.swing.JTextField txtDireccion2;
    private javax.swing.JTextField txtFecha_ven1;
    private javax.swing.JTextField txtFecha_ven2;
    private javax.swing.JTextField txtLimiteCredito1;
    private javax.swing.JTextField txtLimiteCredito2;
    private javax.swing.JTextField txtNombreCompleto1;
    private javax.swing.JTextField txtNombreCompleto2;
    private javax.swing.JTextField txtTelefono1;
    private javax.swing.JTextField txtTelefono2;
    private javax.swing.JTextField txtinteres1;
    private javax.swing.JTextField txtinteres2;
    // End of variables declaration//GEN-END:variables
}
