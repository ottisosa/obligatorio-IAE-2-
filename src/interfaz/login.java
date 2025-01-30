package interfaz;
import clases.loginConAdm;
import conexion.conexionSQL;
import clases.loginConCli;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
       this.setLocationRelativeTo(null);
        this.nover.setVisible(false);
           FlatDarkLaf.setup();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCon = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtUsu = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ver = new javax.swing.JButton();
        nover = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnResgi = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setName("Log In"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 255));
        jLabel1.setText("Contraseña");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 204, 255));
        jLabel2.setText("Log In");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 204, 255));
        jLabel3.setText("Usuario");

        txtCon.setBackground(new java.awt.Color(102, 102, 102));
        txtCon.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtCon.setForeground(new java.awt.Color(0, 255, 0));
        txtCon.setToolTipText("Contraseña");
        txtCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConActionPerformed(evt);
            }
        });
        txtCon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConKeyTyped(evt);
            }
        });

        jScrollPane1.setForeground(new java.awt.Color(0, 255, 0));

        txtUsu.setBackground(new java.awt.Color(102, 102, 102));
        txtUsu.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtUsu.setForeground(new java.awt.Color(0, 255, 0));
        txtUsu.setToolTipText("Usuario");
        txtUsu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtUsu);

        jButton2.setBackground(new java.awt.Color(0, 153, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Ingresar");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 153), new java.awt.Color(204, 255, 204), null, null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ver.setBackground(new java.awt.Color(0, 0, 0));
        ver.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ver.setForeground(new java.awt.Color(0, 0, 0));
        ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-visible-48.png"))); // NOI18N
        ver.setContentAreaFilled(false);
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
        });
        ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActionPerformed(evt);
            }
        });
        jPanel2.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 38));

        nover.setBackground(new java.awt.Color(0, 0, 0));
        nover.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nover.setForeground(new java.awt.Color(0, 0, 0));
        nover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-visible-48 (1).png"))); // NOI18N
        nover.setContentAreaFilled(false);
        nover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noverActionPerformed(evt);
            }
        });
        jPanel2.add(nover, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 38));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-aprobación-48.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-usuario-45.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-contraseña-45.png"))); // NOI18N

        btnResgi.setBackground(new java.awt.Color(102, 102, 255));
        btnResgi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnResgi.setForeground(new java.awt.Color(0, 0, 0));
        btnResgi.setText("Registrarse Como Cliente");
        btnResgi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(204, 204, 255), null, null));
        btnResgi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResgiActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-registro-48.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(btnResgi)))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCon, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(59, 59, 59))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnResgi)
                                    .addComponent(jLabel8))
                                .addGap(59, 59, 59))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(50, 50, 50))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
       //ERROR POR SI NO SE RELLENAN LOS CAMPOS Y SE TOCA EL BOTON INGRESAR//

    private boolean errores(){
       
       if(txtUsu.getText().isEmpty()){

        JOptionPane.showMessageDialog(null, "DEBE COMPLETAR LOS CAMPOS", "Error", JOptionPane.ERROR_MESSAGE);
     return false;
    }
    else if(txtCon.getText().isEmpty()){

        JOptionPane.showMessageDialog(null, "DEBE COMPLETAR LOS CAMPOS", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }else{
    return true;
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
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(errores()==true){

        //BOTON DE EL LOGIN PARA INGRESAR AL SISTEMA// 
        String usuario = txtUsu.getText();
        String contra = txtCon.getText();
        

     //TRAIGO LAS CLASES LOGINCON PARA ACA//
       loginConCli logconC = new loginConCli();
       loginConAdm logconA = new loginConAdm();
    
  
        
       //CONEXION PARA CLIENTES//
       
       if (logconC.loginCLI(usuario, contra, 0)==true){
               
       producto pri = new producto();
       pri.setVisible(true);
       this.dispose();
       }
      
        //CONEXION PARA ADMINS//
       
      else if (logconA.loginADM(usuario, contra, 1)==true){
               
       Admin admi = new Admin();
       admi.setVisible(true);
       this.dispose();
       }
       else{
       JOptionPane.showMessageDialog(null, "CONTRASEÑA O USUARIO INCORRECTO", "ERROR", JOptionPane.ERROR_MESSAGE);
       }
       
        }
      
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verActionPerformed

    private void noverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noverActionPerformed
     //BOTON PARA OCULTAR CONTRA//
     
        nover.setVisible(false);
       ver.setVisible(true);
       txtCon.setEchoChar('*');

    }//GEN-LAST:event_noverActionPerformed

    private void verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseClicked
     
       //BOTON PARA VER CONTRA//
       
       ver.setVisible(false);
       nover.setVisible(true);
       txtCon.setEchoChar((char)0);
        
        
    }//GEN-LAST:event_verMouseClicked

    private void txtConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConActionPerformed

    
    private void btnResgiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResgiActionPerformed
        // BOTON PARA IR A LA PARTE DE CLIENTES//
        
        registro cc = new registro();
        cc.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_btnResgiActionPerformed

    private void txtUsuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuKeyTyped
  //RESTRINGE LOS SIMBOLOS Y ESPACIOS EN EL TXTBOX DE NOMBRE//
  validarSimbolos(evt);

    }//GEN-LAST:event_txtUsuKeyTyped

    private void txtConKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConKeyTyped
  //RESTRINGE LOS SIMBOLOS Y ESPACIOS EN EL TXTBOX DE APELLIDO//
       validarSimbolos(evt);
    }//GEN-LAST:event_txtConKeyTyped


    public static void main(String args[]) {
    
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           
                conexionSQL con= new conexionSQL();
                con.conec();
                new login().setVisible(true);
                
            }
        });
        
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResgi;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nover;
    private javax.swing.JPasswordField txtCon;
    private javax.swing.JTextPane txtUsu;
    private javax.swing.JButton ver;
    // End of variables declaration//GEN-END:variables
}
