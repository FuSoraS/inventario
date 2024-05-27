package Interfaz;

import Conectar.DaoUsuario;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    DaoUsuario dao = new DaoUsuario();

    public Login() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        imagenip = new javax.swing.JLabel();
        fondoazuliptitulo = new javax.swing.JPanel();
        IPTITULO = new javax.swing.JLabel();
        bgsesion = new javax.swing.JPanel();
        TituloIniciarSesion = new javax.swing.JLabel();
        TituloUsuario = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        TituloContraseña = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtpassword = new javax.swing.JPasswordField();
        imagencontraseña = new javax.swing.JLabel();
        imagenusuario = new javax.swing.JLabel();
        btningreso = new javax.swing.JButton();
        imgflechafondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(234, 234, 234));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagenip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/wallpaperlogin.jpg"))); // NOI18N
        jPanel2.add(imagenip, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, -1));

        fondoazuliptitulo.setBackground(new java.awt.Color(51, 102, 255));

        IPTITULO.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        IPTITULO.setForeground(new java.awt.Color(255, 255, 255));
        IPTITULO.setText("TIENDITA INSANA");

        javax.swing.GroupLayout fondoazuliptituloLayout = new javax.swing.GroupLayout(fondoazuliptitulo);
        fondoazuliptitulo.setLayout(fondoazuliptituloLayout);
        fondoazuliptituloLayout.setHorizontalGroup(
            fondoazuliptituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoazuliptituloLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(IPTITULO)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        fondoazuliptituloLayout.setVerticalGroup(
            fondoazuliptituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IPTITULO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(fondoazuliptitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 520, 70));

        bgsesion.setBackground(new java.awt.Color(244, 243, 243));
        bgsesion.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        TituloIniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        TituloIniciarSesion.setText("INICIAR SESIÓN");

        TituloUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TituloUsuario.setText("Usuario");

        txtusuario.setBackground(new java.awt.Color(244, 243, 243));
        txtusuario.setForeground(new java.awt.Color(102, 102, 102));
        txtusuario.setText("Nombre de usuario");
        txtusuario.setBorder(null);
        txtusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtusuarioMousePressed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        TituloContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TituloContraseña.setText("Contraseña");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        txtpassword.setBackground(new java.awt.Color(244, 243, 243));
        txtpassword.setForeground(new java.awt.Color(102, 102, 102));
        txtpassword.setText("******************");
        txtpassword.setBorder(null);
        txtpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtpasswordMousePressed(evt);
            }
        });
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });

        imagencontraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pass.png"))); // NOI18N

        imagenusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N

        btningreso.setBackground(new java.awt.Color(51, 102, 255));
        btningreso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btningreso.setForeground(new java.awt.Color(255, 255, 255));
        btningreso.setText("INGRESAR");
        btningreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgsesionLayout = new javax.swing.GroupLayout(bgsesion);
        bgsesion.setLayout(bgsesionLayout);
        bgsesionLayout.setHorizontalGroup(
            bgsesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgsesionLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(bgsesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgsesionLayout.createSequentialGroup()
                        .addGroup(bgsesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imagenusuario)
                            .addComponent(imagencontraseña))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgsesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(TituloContraseña)
                            .addComponent(TituloUsuario)
                            .addComponent(txtusuario)
                            .addComponent(jSeparator1)
                            .addComponent(txtpassword)))
                    .addComponent(TituloIniciarSesion))
                .addContainerGap(128, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgsesionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btningreso, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        bgsesionLayout.setVerticalGroup(
            bgsesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgsesionLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(TituloIniciarSesion)
                .addGap(41, 41, 41)
                .addComponent(TituloUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgsesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imagenusuario)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(TituloContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgsesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagencontraseña))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btningreso, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel2.add(bgsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 500, 370));

        imgflechafondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/flecha.png"))); // NOI18N
        imgflechafondo.setText("jLabel1");
        jPanel2.add(imgflechafondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, -10, 420, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btningresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresoActionPerformed
        String username = txtusuario.getText();
        String password = String.valueOf(txtpassword.getPassword());

        try {
            Map<String, String> userData = dao.validateUser(username, password);
            if (Boolean.parseBoolean(userData.get("valid"))) {
                String category = userData.get(username);
   
                if (category != null && category.equalsIgnoreCase("admin")) {
                    Inventario inventario= new Inventario();
                    dispose();
                    inventario.setLocationRelativeTo(null);
                    inventario.setVisible(true);

                } else if (category != null && category.equalsIgnoreCase("empleado")) {
                    marcaInterfaz marca= new marcaInterfaz();
                    dispose();
                    marca.setLocationRelativeTo(null);
                    marca.setVisible(true);

                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecto...");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error validating user: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btningresoActionPerformed

    private void txtusuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusuarioMousePressed
        if (txtusuario.getText().equals("Nombre de usuario")) {
            txtusuario.setText("");
            txtusuario.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtusuarioMousePressed

    private void txtpasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpasswordMousePressed
       if (String.valueOf(txtpassword.getPassword()).equals("******************")) {
        txtpassword.setText("");
       txtpassword.setForeground(Color.black);
       }
    }//GEN-LAST:event_txtpasswordMousePressed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IPTITULO;
    private javax.swing.JLabel TituloContraseña;
    private javax.swing.JLabel TituloIniciarSesion;
    private javax.swing.JLabel TituloUsuario;
    private javax.swing.JPanel bgsesion;
    private javax.swing.JButton btningreso;
    private javax.swing.JPanel fondoazuliptitulo;
    private javax.swing.JLabel imagencontraseña;
    private javax.swing.JLabel imagenip;
    private javax.swing.JLabel imagenusuario;
    private javax.swing.JLabel imgflechafondo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
