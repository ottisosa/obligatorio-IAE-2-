package interfaz;

import com.formdev.flatlaf.FlatDarkLaf;

public class Admin extends javax.swing.JFrame {


    public Admin() {
        initComponents();
        this.setLocationRelativeTo(null);
        FlatDarkLaf.setup();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnVolver1 = new javax.swing.JButton();
        btnVolver2 = new javax.swing.JButton();
        btnVolver3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 204, 255));
        jLabel4.setText("Admin");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 6, -1, -1));

        btnVolver.setBackground(new java.awt.Color(102, 102, 255));
        btnVolver.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(0, 0, 0));
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(0, 204, 204), new java.awt.Color(0, 255, 255)));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 10, 60, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/soporte-tecnico.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 6, -1, -1));

        btnVolver1.setBackground(new java.awt.Color(51, 204, 255));
        btnVolver1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnVolver1.setForeground(new java.awt.Color(0, 0, 0));
        btnVolver1.setText("Ver  y Editar Clientes");
        btnVolver1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 204, 204)));
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 76, 213, 29));

        btnVolver2.setBackground(new java.awt.Color(51, 204, 255));
        btnVolver2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnVolver2.setForeground(new java.awt.Color(0, 0, 0));
        btnVolver2.setText("Ver Admins");
        btnVolver2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 204, 204)));
        btnVolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver2, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 155, 213, 29));

        btnVolver3.setBackground(new java.awt.Color(51, 204, 255));
        btnVolver3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnVolver3.setForeground(new java.awt.Color(0, 0, 0));
        btnVolver3.setText("Ver Administrar Productos");
        btnVolver3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 204, 204)));
        btnVolver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver3, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 239, -1, 29));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        //BOTON PARA VOLVER A CLIENTES//
        login log = new login();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        clienteBD BD = new clienteBD();
        BD.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnVolver1ActionPerformed

    private void btnVolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver2ActionPerformed
          //BOTON PARA VER LA BD DE ADMINS//
         adminBD aa = new adminBD();
         aa.setVisible(true);
         this.setVisible(false);

    }//GEN-LAST:event_btnVolver2ActionPerformed

    private void btnVolver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver3ActionPerformed
      //BOTON PARA IR A ADMINISTRACION DE PRODUCTOS//
      
        ModificarProduc prod = new ModificarProduc();
        prod.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolver3ActionPerformed

 
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JButton btnVolver2;
    private javax.swing.JButton btnVolver3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
