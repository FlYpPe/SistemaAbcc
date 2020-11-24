/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felipe
 */
public class Vista extends javax.swing.JFrame {

    
    static ResultSet res;
    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaOrdenes = new javax.swing.JTable();
        borrar = new javax.swing.JLabel();
        editar = new javax.swing.JLabel();
        agregar = new javax.swing.JLabel();
        filtrado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        llenarTabla = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 243, 243));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 110, 30));

        jLabel2.setText("jLabel1");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, 30));

        jLabel3.setText("jLabel1");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 110, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe\\Downloads\\fooddome_116536.png")); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 480));

        tablaOrdenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "idOrden", "Fecha", "Cantidad", "Tipo de Pago", "idMesero"
            }
        ));
        jScrollPane1.setViewportView(tablaOrdenes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 610, 280));

        borrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe\\Downloads\\seo-social-web-network-internet_262_icon-icons.com_61518.png")); // NOI18N
        borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrarMouseClicked(evt);
            }
        });
        jPanel1.add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, 50, 50));

        editar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe\\Downloads\\pencil-striped-symbol-for-interface-edit-buttons_icon-icons.com_56782 (2).png")); // NOI18N
        jPanel1.add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 50, 50));

        agregar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe\\Downloads\\1904677-add-addition-calculate-charge-create-new-plus_122527 (1).png")); // NOI18N
        agregar.setText("   ");
        agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarMouseClicked(evt);
            }
        });
        jPanel1.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 50, 50));

        filtrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtradoActionPerformed(evt);
            }
        });
        jPanel1.add(filtrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 160, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Filtrar");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 60, 30));

        llenarTabla.setText("Refrescar");
        llenarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llenarTablaActionPerformed(evt);
            }
        });
        jPanel1.add(llenarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filtradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtradoActionPerformed

    private void agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMouseClicked
        new Formulario().setVisible(true);
    }//GEN-LAST:event_agregarMouseClicked

    private void llenarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llenarTablaActionPerformed
        CargarTabla();
    }//GEN-LAST:event_llenarTablaActionPerformed

    private void borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarMouseClicked
        try {
            String a = String.valueOf(tablaOrdenes.getValueAt(tablaOrdenes.getSelectedRow(), 0));
            System.out.println(a);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_borrarMouseClicked
    public void CargarTabla(){
        DefaultTableModel modelo = (DefaultTableModel) tablaOrdenes.getModel();
        modelo.setRowCount(0);
        res = Prueba.Conexión.Consulta("Select * from Ordenes");
        try {
            while(res.next()){
                Vector v = new Vector();
                v.add(res.getString(1));
                v.add(res.getString(2));
                v.add(res.getInt(3));
                v.add(res.getString(4));
                v.add(res.getString(5));
                modelo.addRow(v);
                tablaOrdenes.setModel(modelo);
                
            }
        } catch (SQLException e) {
            
            
        }
    }
    /**
     * 
     * 
     * @param args the command line arguments
     */
    
    public void cargarDatos(){
        DefaultTableModel modelo = (DefaultTableModel) tablaOrdenes.getModel();
        modelo.setRowCount(0);
        
    }
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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agregar;
    private javax.swing.JLabel borrar;
    private javax.swing.JLabel editar;
    private javax.swing.JTextField filtrado;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton llenarTabla;
    private javax.swing.JTable tablaOrdenes;
    // End of variables declaration//GEN-END:variables
}
