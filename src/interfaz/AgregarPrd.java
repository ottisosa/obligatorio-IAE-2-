package interfaz;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class AgregarPrd extends javax.swing.JFrame {
    public AgregarPrd() {
        initComponents();
        FlatDarkLaf.setup();
        setLocationRelativeTo(null);
         
     //PARA QUE CUANDO TOQUES LA X DE CERRAR ARRIBA SOLO SE CIERRE ESTA VENTANA Y NO DEJE DE CORRER EL PROGRAMA//
                
       setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
       private boolean comprobar() {
        if (txtNP.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "DEBE COMPLETAR EL FORMULARIO", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (txtPP.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "DEBE COMPLETAR EL FORMULARIO", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPP = new javax.swing.JTextField();
        txtNP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 102));
        jLabel4.setText("Agregar Producto");
        jLabel4.setToolTipText("");

        btnAgregar.setBackground(new java.awt.Color(0, 204, 51));
        btnAgregar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("Agregar Producto");
        btnAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 0), new java.awt.Color(0, 255, 0), null, null));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("Nombre de el producto :");

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 0));
        jLabel5.setText("Precio de el producto :");

        txtPP.setBackground(new java.awt.Color(51, 51, 51));
        txtPP.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtPP.setForeground(new java.awt.Color(0, 255, 0));
        txtPP.setToolTipText("Apellido");
        txtPP.setName("txtape"); // NOI18N
        txtPP.setSelectedTextColor(new java.awt.Color(0, 0, 255));
        txtPP.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPPActionPerformed(evt);
            }
        });
        txtPP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPPKeyTyped(evt);
            }
        });

        txtNP.setBackground(new java.awt.Color(51, 51, 51));
        txtNP.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNP.setForeground(new java.awt.Color(0, 255, 0));
        txtNP.setToolTipText("Nombre");
        txtNP.setName("txtnom"); // NOI18N
        txtNP.setSelectedTextColor(new java.awt.Color(0, 0, 255));
        txtNP.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtNP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNPActionPerformed(evt);
            }
        });
        txtNP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNPKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPP, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNP, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
         if (comprobar() == true) {

            String nomP = txtNP.getText();
            String preP = txtPP.getText();

           //HACE QUE EL TXTBOX LO PASE DE STRING A INT//
            int ced = Integer.parseInt(preP);

            String jdbcURL = "jdbc:mysql://localhost:3306/obligatorio?serverTimezone=UTC";
            String usuarioDB = "root";
            String contrasenaDB = "";

            try (Connection conexion = DriverManager.getConnection(jdbcURL, usuarioDB, contrasenaDB)) {
               
                if (conexion != null) {
                    String sql = " INSERT INTO producto (Stock, precio, producto) VALUES (1,'" + preP + "', '" + nomP + "')";
                    System.out.print(sql);
                    Statement sentencia = conexion.createStatement();
                    int estado = sentencia.executeUpdate(sql);
                
                    JOptionPane.showMessageDialog(null, "Producto agregado con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    System.out.println("La conexión a la base de datos falló.");

                }
            } catch (SQLException e) {
                System.out.println("Error en la conexión a la base de datos: " + e.getMessage());

            }
        }
        txtNP.setText("");
        txtPP.setText("");
      
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPPActionPerformed

    }//GEN-LAST:event_txtPPActionPerformed

    private void txtPPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPPKeyTyped
        // RESTRICCIONES PARA TXTBOX PP//

        //LLAMO A EL EVENTO PARA EVITAR LETRAS, ESPACIOS Y SIMBOLOS//

        restringirLetras(evt);

        if (txtPP.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtPPKeyTyped

    private void txtNPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNPActionPerformed

    }//GEN-LAST:event_txtNPActionPerformed

    private void txtNPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNPKeyTyped
        // RESTRICCIONES A EL TEXT FIELD NP//

        //LLAMO A EL EVENTO PARA EVITAR ESPACIOS Y SIMBOLOS//

        validarSimbolos(evt);

        if (txtNP.getText().length() >= 15) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtNPKeyTyped

    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgregarPrd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPrd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPrd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPrd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarPrd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNP;
    private javax.swing.JTextField txtPP;
    // End of variables declaration//GEN-END:variables
}
