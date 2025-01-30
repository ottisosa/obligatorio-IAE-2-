package interfaz;

import com.formdev.flatlaf.FlatDarkLaf;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class EliminarProd extends javax.swing.JFrame {
    ModificarProduc ventanaModificar;
    public EliminarProd(ModificarProduc ventanaModificar) {
        this.ventanaModificar = ventanaModificar;
        initComponents();
        this.setLocationRelativeTo(null);
        FlatDarkLaf.setup();
                
     //PARA QUE CUANDO TOQUES LA X DE CERRAR ARRIBA SOLO SE CIERRE ESTA VENTANA Y NO DEJE DE CORRER EL PROGRAMA//
                
       setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idtxt = new javax.swing.JScrollPane();
        txtId = new javax.swing.JTextPane();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Eliminar Producto");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 23, -1, 40));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 122, -1, 30));

        idtxt.setForeground(new java.awt.Color(255, 0, 0));

        txtId.setBackground(new java.awt.Color(102, 102, 102));
        txtId.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtId.setForeground(new java.awt.Color(255, 0, 0));
        txtId.setToolTipText("Usuario");
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        idtxt.setViewportView(txtId);

        jPanel1.add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 122, 160, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar Producto");
        btnEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(255, 0, 0), null, null));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 201, 170, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void restringir(java.awt.event.KeyEvent evt) {      
    //METODO PARA EVITAR LETRAS, ESPACIOS Y SIMBOLOS EN TXTBOX DE ID//
    
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
    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        //LLAMO EL METODO RESTRINGIR PARA QUE EL TXTBOX DE RESTRINGIR EL ID NO ACEPTE LETRAS SIMBOLOS NI ESPACIOS//
        restringir(evt);

        if (txtId.getText().length() >= 8) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtIdKeyTyped

     private boolean errores(){
       
       if(txtId.getText().isEmpty()){

        JOptionPane.showMessageDialog(null, "DEBE COMPLETAR LOS CAMPOS", "Error", JOptionPane.ERROR_MESSAGE);
     return false;
    }
    else{
    return true;
    }
}
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if(errores()==true){

            //BOTON PARA ELIMINAR CLIENTES DE LA BASE DE DATOS//
            String IDE = txtId.getText();
            int Eid = Integer.parseInt(IDE);

            String jdbcURL = "jdbc:mysql://localhost:3306/obligatorio?serverTimezone=UTC";
            String usuarioDB = "root";
            String contraDB = "";
            
            try (Connection connection = DriverManager.getConnection(jdbcURL, usuarioDB, contraDB)){
                int idElimi = Eid;
                String query = "DELETE  FROM producto WHERE N_Prod=?";

                try (PreparedStatement statement = connection.prepareStatement(query)) {
                    statement.setInt(1, idElimi);
                    int filasAfectadas = statement.executeUpdate();

                    if (filasAfectadas > 0) {
                        System.out.println("Producto eliminado correctamente");
                        this.ventanaModificar.tablaProduc();
                        JOptionPane.showMessageDialog(null, "Producto eliminado correctamente");
                    } else {
                        System.out.println("ERROR, NO SE BORRO");
                        JOptionPane.showMessageDialog(null, "No se encontro el producto que desea eliminar","Error",JOptionPane.ERROR);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        txtId.setText("");
       

        
    }//GEN-LAST:event_btnEliminarActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EliminarProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane idtxt;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextPane txtId;
    // End of variables declaration//GEN-END:variables
}
