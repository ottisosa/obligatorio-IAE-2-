package interfaz;

import com.formdev.flatlaf.FlatDarkLaf;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ModificarProduc extends javax.swing.JFrame {
    public ModificarProduc() {
        initComponents();
        this.setLocationRelativeTo(null);
        tablaProduc();
    }
    
    public void tablaProduc() {
    String jdbcURL = "jdbc:mysql://localhost:3306/obligatorio?serverTimezone=UTC";
    String usuarioDB = "root";
    String contraDB = "";

    DefaultTableModel modelo = (DefaultTableModel) tablaP.getModel();

    try {
        // Establecer conexión a la base de datos
        Connection connection = DriverManager.getConnection(jdbcURL, usuarioDB, contraDB);

        // Declaración SQL
        Statement st = connection.createStatement();

        String sql = "select N_Prod, Stock, precio, producto from producto";

        // Consulta a la BD SQL
        ResultSet result = st.executeQuery(sql);

        // Limpiar la tabla
        modelo.setRowCount(0);
        

        // Obtener datos por nombre
        while (result.next()) {
            int valorcolumna1 = result.getInt("N_Prod");
            int valorcolumna2 = result.getInt("Stock");
            int valorcolumna3 = result.getInt("precio");
            String valorcolumna4 = result.getString("producto");

            // Agregar fila al modelo de la tabla
            modelo.addRow(new Object[]{valorcolumna1, valorcolumna4, valorcolumna2, valorcolumna3});
        }

        // Cerrar la conexión //
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
        btnAgr = new javax.swing.JButton();
        btnElim = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaP = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 204, 255));
        jLabel4.setText("Modificar Productos");
        jLabel4.setToolTipText("");

        btnAgr.setBackground(new java.awt.Color(0, 0, 0));
        btnAgr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/agregar-producto.png"))); // NOI18N
        btnAgr.setBorder(null);
        btnAgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrActionPerformed(evt);
            }
        });

        btnElim.setBackground(new java.awt.Color(0, 0, 0));
        btnElim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/eliminar-producto.png"))); // NOI18N
        btnElim.setBorder(null);
        btnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(102, 102, 255));
        btnVolver.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(0, 0, 0));
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255), java.awt.Color.cyan, new java.awt.Color(0, 255, 255)));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        tablaP.setBackground(new java.awt.Color(51, 51, 51));
        tablaP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Producto", "Stock", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaP);
        if (tablaP.getColumnModel().getColumnCount() > 0) {
            tablaP.getColumnModel().getColumn(0).setResizable(false);
            tablaP.getColumnModel().getColumn(1).setResizable(false);
            tablaP.getColumnModel().getColumn(2).setResizable(false);
            tablaP.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(btnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgr, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgr, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        //BOTON PARA VOLVER A ADMIN//
        Admin adm = new Admin();
        adm.setVisible(true);
        this.setVisible(false);
           FlatDarkLaf.setup();

    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimActionPerformed
      // BOTON PARA ELIMINAR UN PRODUCTO DE LA TABLA, ABRE UN FORMULARIO PARA ELIMINARLO//
        
        EliminarProd Eprod = new EliminarProd(this);
        Eprod.setVisible(true);
        tablaProduc();
        
    }//GEN-LAST:event_btnElimActionPerformed

    private void btnAgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrActionPerformed
      // BOTON PARA AGREGAR UN PRODUCTO DE LA TABLA, ABRE UN FORMULARIO PARA ELIMINARLO//
         
       AgregarPrd agr = new AgregarPrd();
       agr.setVisible(true);
       tablaProduc();

    }//GEN-LAST:event_btnAgrActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModificarProduc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarProduc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarProduc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarProduc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarProduc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgr;
    private javax.swing.JButton btnElim;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaP;
    // End of variables declaration//GEN-END:variables
}
