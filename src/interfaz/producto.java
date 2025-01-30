package interfaz;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class producto extends javax.swing.JFrame {

    public producto() {
        initComponents();
        this.setLocationRelativeTo(null);
           FlatDarkLaf.setup();


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CP = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        txtCan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 204, 255));
        jLabel3.setText("Catalogo");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/catalogo.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        CP.setBackground(new java.awt.Color(0, 0, 0));
        CP.setForeground(new java.awt.Color(51, 204, 255));
        CP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Auriculares", "Tablets", "Telefonos", "Laptops", "Equipos Armados", "Mouse", "Teclado", "Monitores", "Memoria RAM", "Almacenamiento", " " }));
        CP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        CP.setOpaque(true);
        jPanel2.add(CP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 204, 255));
        jLabel5.setText("Productos");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 102, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Agregar");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 120, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 204, 255));
        jLabel6.setText("Cantidad");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        btnVolver.setBackground(new java.awt.Color(102, 102, 255));
        btnVolver.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(0, 0, 0));
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 153, 255)));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel2.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, -1));

        txtCan.setBackground(new java.awt.Color(153, 153, 153));
        txtCan.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCan.setForeground(new java.awt.Color(0, 0, 204));
        txtCan.setToolTipText("Nombre");
        txtCan.setName("txtnom"); // NOI18N
        txtCan.setSelectedTextColor(new java.awt.Color(0, 0, 255));
        txtCan.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCanActionPerformed(evt);
            }
        });
        txtCan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCanKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCanKeyTyped(evt);
            }
        });
        jPanel2.add(txtCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 90, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 370));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                            
        int Cbox = CP.getSelectedIndex(); 
        String elemento = CP.getSelectedItem().toString();
             
              String cant = txtCan.getText();

           //HACE QUE EL TXTBOX LO PASE DE STRING A INT//
            int can = Integer.parseInt(cant);
        
        
         String jdbcURL = "jdbc:mysql://localhost:3306/obligatorio?serverTimezone=UTC";
            String usuarioDB = "root";
            String contrasenaDB = "";

            try (Connection conexion = DriverManager.getConnection(jdbcURL, usuarioDB, contrasenaDB)) {
               
                if (conexion != null) {
                    String sql = " INSERT INTO pedido (aticulo, cantidad) VALUES ('" + elemento + "', '" + can + "')";
                    System.out.print(sql);
                    Statement sentencia = conexion.createStatement();
                    int estado = sentencia.executeUpdate(sql);
                
                } else {
                    System.out.println("La conexión a la base de datos falló.");

                }
            } catch (SQLException e) {
                System.out.println("Error en la conexión a la base de datos: " + e.getMessage());

            }
         
                                              
        
        
        JOptionPane.showMessageDialog(null, "SE AGREGO CON EXITO", "Exito", JOptionPane.INFORMATION_MESSAGE);

            txtCan.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        //BOTON PARA VOLVER AL LOGIN//
        login log = new login();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCanActionPerformed

        
    }//GEN-LAST:event_txtCanActionPerformed

    private void txtCanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCanKeyTyped
        
        
    }//GEN-LAST:event_txtCanKeyTyped

    private void txtCanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCanKeyPressed
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
    }    }//GEN-LAST:event_txtCanKeyPressed

    
    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CP;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCan;
    // End of variables declaration//GEN-END:variables
}
