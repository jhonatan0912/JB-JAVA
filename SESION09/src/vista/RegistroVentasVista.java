package vista;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import modelo.Venta;

public class RegistroVentasVista extends javax.swing.JFrame {

    void habdes(boolean sw){
        txtNumeroVenta.setEnabled(sw);
        txtFecha.setEnabled(sw);
        txtVendedor.setEnabled(sw);
        txtVenta1.setEnabled(sw);
        txtVenta2.setEnabled(sw);
        txtVenta3.setEnabled(sw);
        txtVenta4.setEnabled(sw);
    }
    
    void limpiar(){
        txtNumeroVenta.setText("");
        txtFecha.setText("");
        txtVendedor.setText("");
        txtVenta1.setText("");
        txtVenta2.setText("");
        txtVenta3.setText("");
        txtVenta4.setText("");
        
        txtTotal.setText("");
        txtPromedio.setText("");
        txtVentaMayor.setText("");
        txtVentaMenor.setText("");
    }
    
    public RegistroVentasVista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNumeroVenta = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtVendedor = new javax.swing.JTextField();
        txtVenta1 = new javax.swing.JTextField();
        txtVenta2 = new javax.swing.JTextField();
        txtVenta3 = new javax.swing.JTextField();
        txtVenta4 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTotal = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPromedio = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtVentaMayor = new javax.swing.JTextPane();
        txtMenor = new javax.swing.JScrollPane();
        txtVentaMenor = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Registro de Ventas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel2.setText("Nro Venta:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setText("Fecha:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel4.setText("Vendedor:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel5.setText("Venta 1:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel6.setText("Venta 2:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel7.setText("Venta 3:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel8.setText("Venta 4:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/captura1.JPG"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));
        getContentPane().add(txtNumeroVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 120, -1));
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 120, -1));
        getContentPane().add(txtVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 120, -1));
        getContentPane().add(txtVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 120, -1));
        getContentPane().add(txtVenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 120, -1));
        getContentPane().add(txtVenta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 120, -1));
        getContentPane().add(txtVenta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 120, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 500, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Total");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Promedio");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Mayor");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Menor");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        jScrollPane1.setViewportView(txtTotal);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 70, -1));

        jScrollPane2.setViewportView(txtPromedio);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 70, -1));

        jScrollPane3.setViewportView(txtVentaMayor);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 70, -1));

        txtMenor.setViewportView(txtVentaMenor);

        getContentPane().add(txtMenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 70, -1));

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // TODO add your handling code here:
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        habdes(true);
        limpiar();
        txtNumeroVenta.requestFocus();
        txtFecha.setText(dtf.format(LocalDateTime.now()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        habdes(false);
        limpiar();
    }//GEN-LAST:event_formWindowActivated

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        double vt1;
        double vt2;
        double vt3;
        double vt4;
        
        vt1=Double.parseDouble(txtVenta1.getText());
        vt2=Double.parseDouble(txtVenta2.getText());
        vt3=Double.parseDouble(txtVenta3.getText());
        vt4=Double.parseDouble(txtVenta4.getText());
        
        Venta objVenta=new Venta(vt1, vt2, vt3, vt4);
        
        txtTotal.setText(String.valueOf(objVenta.total()));
        txtPromedio.setText(String.valueOf(objVenta.promedio()));
        txtVentaMayor.setText(String.valueOf(objVenta.mayor()));
        txtVentaMenor.setText(String.valueOf(objVenta.menor()));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();        
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(RegistroVentasVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroVentasVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroVentasVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroVentasVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroVentasVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JScrollPane txtMenor;
    private javax.swing.JTextField txtNumeroVenta;
    private javax.swing.JTextPane txtPromedio;
    private javax.swing.JTextPane txtTotal;
    private javax.swing.JTextField txtVendedor;
    private javax.swing.JTextField txtVenta1;
    private javax.swing.JTextField txtVenta2;
    private javax.swing.JTextField txtVenta3;
    private javax.swing.JTextField txtVenta4;
    private javax.swing.JTextPane txtVentaMayor;
    private javax.swing.JTextPane txtVentaMenor;
    // End of variables declaration//GEN-END:variables
}
