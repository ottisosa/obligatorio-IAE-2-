package interfaz;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Toolkit;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class registro extends javax.swing.JFrame {

    public registro() {
        initComponents();
        this.setLocationRelativeTo(null);
           FlatDarkLaf.setup();
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        btnC1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnC = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtContra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        txtCi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jTextField4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(51, 204, 255));

        btnC1.setBackground(new java.awt.Color(0, 153, 51));
        btnC1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnC1.setForeground(new java.awt.Color(0, 0, 0));
        btnC1.setText("Completar");
        btnC1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 153), new java.awt.Color(102, 255, 102), null, null));
        btnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 204, 255));
        jLabel3.setText("Nombre de Usuario :");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 204, 255));
        jLabel4.setText("Registro");

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 204, 255));
        jLabel5.setText("Nueva Contraseña :");

        btnC.setBackground(new java.awt.Color(0, 153, 51));
        btnC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnC.setForeground(new java.awt.Color(0, 0, 0));
        btnC.setText("Completar");
        btnC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 153), new java.awt.Color(102, 255, 102), null, null));
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        txtUsuario.setBackground(new java.awt.Color(153, 153, 153));
        txtUsuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 204));
        txtUsuario.setToolTipText("Nombre");
        txtUsuario.setName("txtnom"); // NOI18N
        txtUsuario.setSelectedTextColor(new java.awt.Color(0, 0, 255));
        txtUsuario.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });

        txtContra.setBackground(new java.awt.Color(153, 153, 153));
        txtContra.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtContra.setForeground(new java.awt.Color(0, 0, 204));
        txtContra.setToolTipText("Apellido");
        txtContra.setName("txtape"); // NOI18N
        txtContra.setSelectedTextColor(new java.awt.Color(0, 0, 255));
        txtContra.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraActionPerformed(evt);
            }
        });
        txtContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraKeyTyped(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cliente.png"))); // NOI18N

        btnVolver.setBackground(new java.awt.Color(102, 102, 255));
        btnVolver.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(0, 0, 0));
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 204), new java.awt.Color(0, 255, 204), null, null));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        txtCi.setBackground(new java.awt.Color(153, 153, 153));
        txtCi.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCi.setForeground(new java.awt.Color(0, 0, 204));
        txtCi.setToolTipText("Apellido");
        txtCi.setName("txtape"); // NOI18N
        txtCi.setSelectedTextColor(new java.awt.Color(0, 0, 255));
        txtCi.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtCi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiActionPerformed(evt);
            }
        });
        txtCi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCiKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 204, 255));
        jLabel6.setText("Cedula :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(jLabel4)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCi, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3))
                                    .addGap(27, 27, 27)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtContra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(btnVolver))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(37, 37, 37)
                .addComponent(btnC)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private boolean comprobar() {
        if (txtUsuario.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "DEBE COMPLETAR EL FORMULARIO", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (txtContra.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "DEBE COMPLETAR EL FORMULARIO", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (txtCi.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "DEBE COMPLETAR EL FORMULARIO", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }
    }
                                       
    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        if (comprobar() == true) {

            String usuario = txtUsuario.getText();
            String contra = txtContra.getText();
            String cedula = txtCi.getText();

           //HACE QUE EL TXTBOX LO PASE DE STRING A INT//
            int ced = Integer.parseInt(cedula);

            String jdbcURL = "jdbc:mysql://localhost:3306/obligatorio?serverTimezone=UTC";
            String usuarioDB = "root";
            String contrasenaDB = "";

            try (Connection conexion = DriverManager.getConnection(jdbcURL, usuarioDB, contrasenaDB)) {
                if (conexion != null) {
                    String sql = " INSERT INTO usuario (usuario, contra, admin, CI) VALUES ('" + usuario + "', '" + contra + "' , 0, '" + ced + "')";
                    System.out.print(sql);
                    Statement sentencia = conexion.createStatement();
                    int estado = sentencia.executeUpdate(sql);
      
                    JOptionPane.showMessageDialog(null, "EGREGADO CON EXITO", "Exito", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    System.out.println("La conexión a la base de datos falló.");

                }
            } catch (SQLException e) {
                System.out.println("Error en la conexión a la base de datos: " + e.getMessage());

            }
        }
        txtUsuario.setText("");
        txtContra.setText("");
        txtCi.setText("");

    }//GEN-LAST:event_btnCActionPerformed

    private void validarSimbolos(java.awt.event.KeyEvent evt) {      
    //METODO PARA EVITAR SIMBOLOS Y ESPACIOS EN LOS TXTBOX//
    
    if(evt.getKeyChar() >= 32 && evt.getKeyChar() <=44 
            || evt.getKeyChar() == 47 
            ||evt.getKeyChar() >=58 && evt.getKeyChar() <=64
            ||evt.getKeyChar() >=91 && evt.getKeyChar() <=94
            ||evt.getKeyChar() ==96
            ||evt.getKeyChar() >=123 && evt.getKeyChar() <=255){
    
        evt.consume();
       Toolkit.getDefaultToolkit().beep();
        
       JOptionPane.showMessageDialog(null, "NO SE PERMITEN SIMBOLOS NI ESPACIOS", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    }   
    
    private void restringirLetras(java.awt.event.KeyEvent evt) {      
    //METODO PARA EVITAR LETRAS, ESPACIOS Y SIMBOLOS EN TXTBOX DE CEDULA//
    
    if(evt.getKeyChar() >= 65 && evt.getKeyChar() <= 90  
            ||evt.getKeyChar() >=97 && evt.getKeyChar() <= 122
            ||evt.getKeyChar() >= 32 && evt.getKeyChar() <=47 
            ||evt.getKeyChar() >=58 && evt.getKeyChar() <=64
            ||evt.getKeyChar() >=91 && evt.getKeyChar() <=94
            ||evt.getKeyChar() ==96
            ||evt.getKeyChar() >=123 && evt.getKeyChar() <=255){
    
        evt.consume();
       Toolkit.getDefaultToolkit().beep();
        
       JOptionPane.showMessageDialog(null, "NO SE PERMITEN LETRAS, ESPACIOS NI SIMBOLOS EN ESTE CAMPO", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    }
    
    
    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed

    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
       // RESTRICCIONES A EL TEXT FIELD NOMBRE//
       
            //LLAMO A EL EVENTO PARA EVITAR ESPACIOS Y SIMBOLOS//  
        
            validarSimbolos(evt);
          
        if (txtUsuario.getText().length() >= 15) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }      
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtContraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraKeyTyped
        // RESTRICCIONES PARA TXT FIELD APELLIDO//
        
         //LLAMO A EL EVENTO PARA EVITAR ESPACIOS Y SIMBOLOS//  
            validarSimbolos(evt);
            
        if (txtContra.getText().length() >= 15) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtContraKeyTyped

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnC1ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        //BOTON PARA VOLVER AL LOGIN//
        login log = new login();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtCiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiKeyTyped
        // RESTRICCIONES PARA TXTBOX CI//
        
         //LLAMO A EL EVENTO PARA EVITAR LETRAS, ESPACIOS Y SIMBOLOS//  
        
            restringirLetras(evt);
            
        if (txtCi.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }

    }//GEN-LAST:event_txtCiKeyTyped

    private void txtCiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCiActionPerformed

    private void txtContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraActionPerformed

    public static void main(String args[]) {

        String jdbcURL = "jdbc:mysql://localhost:3306/login?serverTimezone=UTC";
        String usuarioDB = "root";
        String contra = "root";

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnC1;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txtCi;
    private javax.swing.JTextField txtContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
