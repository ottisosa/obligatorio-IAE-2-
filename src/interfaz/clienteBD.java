 package interfaz;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class clienteBD extends javax.swing.JFrame {

    public clienteBD() {
        initComponents();
        this.setLocationRelativeTo(null);
           FlatDarkLaf.setup();

      
        //INICIO CON EL FORMULARIO EL METODO LISTAR//
        
        listar();
    }
    
    private void restringir(java.awt.event.KeyEvent evt) {      
    //METODO PARA EVITAR LETRAS, ESPACIOS Y SIMBOLOS EN TXTBOX DE ID Y CEDULA//
    
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
    
        private boolean errores(){
       
       if(txtId.getText().isEmpty()){

        JOptionPane.showMessageDialog(null, "DEBE COMPLETAR LOS CAMPOS", "Error", JOptionPane.ERROR_MESSAGE);
     return false;
    }
    else{
    return true;
    }
}

    private void listar() {
    String jdbcURL = "jdbc:mysql://localhost:3306/obligatorio?serverTimezone=UTC";
    String usuarioDB = "root";
    String contraDB = "";

    DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

    try {
        // Establecer conexión a la base de datos
        Connection connection = DriverManager.getConnection(jdbcURL, usuarioDB, contraDB);

        // Declaración SQL
        Statement st = connection.createStatement();

        String sql = "select ID, usuario, contra, CI from usuario where admin = 0";

        // Consulta a la BD SQL
        ResultSet result = st.executeQuery(sql);

        // Limpiar la tabla
        modelo.setRowCount(0);

        // Obtener datos por nombre
        while (result.next()) {
            int valorcolumna1 = result.getInt("ID");
            String valorcolumna3 = result.getString("usuario");
            String valorcolumna4 = result.getString("contra");
            int valorcolumna2 = result.getInt("CI");

            // Agregar fila al modelo de la tabla
            modelo.addRow(new Object[]{valorcolumna1, valorcolumna3, valorcolumna4, valorcolumna2});
        }

        // Cerrar la conexión
        result.close();
        st.close();
        connection.close();

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        idtxt = new javax.swing.JScrollPane();
        txtId = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/red (2).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 40, 50));

        btnVolver.setBackground(new java.awt.Color(102, 102, 255));
        btnVolver.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(0, 0, 0));
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255), java.awt.Color.cyan, java.awt.Color.cyan));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, -1));

        tabla.setBackground(new java.awt.Color(51, 51, 51));
        tabla.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tabla.setForeground(new java.awt.Color(255, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CI", "Usuario", "Contraseña"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setGridColor(new java.awt.Color(51, 51, 51));
        tabla.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tabla.setSelectionForeground(new java.awt.Color(0, 0, 204));
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 91, 620, 320));

        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar Cliente");
        btnEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(255, 0, 0), null, null));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 436, 170, 30));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 204, 255));
        jLabel5.setText("Info. Cliente");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, 40));

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

        jPanel1.add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 160, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        //BOTON PARA VOLVER A CLIENTES//
        Admin adm = new Admin();
        adm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
      
           if(errores()==true){
     
   //BOTON PARA ELIMINAR CLIENTES DE LA BASE DE DATOS//
    String IDE = txtId.getText();
    int Eid = Integer.parseInt(IDE);
    
      String jdbcURL = "jdbc:mysql://localhost:3306/login?serverTimezone=UTC";
    String usuarioDB = "root";
    String contraDB = "root";
    try (Connection connection = DriverManager.getConnection(jdbcURL, usuarioDB, contraDB)){
       int idElimi = Eid;
    String query = "DELETE  FROM usuario WHERE ID=?";
    
    
    try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, idElimi);
                int filasAfectadas = statement.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Registro eliminado correctamente.");
                    JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
                } else {
                    System.out.println("ERROR, NO SE BORRO");
             JOptionPane.showMessageDialog(null, "No se encontro el usuario que desea eliminar","Error",JOptionPane.ERROR);
        }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
           }
       txtId.setText("");

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
         //LLAMO EL METODO RESTRINGIR PARA QUE EL TXTBOX DE RESTRINGIR EL ID NO ACEPTE LETRAS SIMBOLOS NI ESPACIOS//
          restringir(evt);
          
          if (txtId.getText().length() >= 8) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }      

    }//GEN-LAST:event_txtIdKeyTyped

    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(clienteBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clienteBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clienteBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clienteBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clienteBD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane idtxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextPane txtId;
    // End of variables declaration//GEN-END:variables
}
