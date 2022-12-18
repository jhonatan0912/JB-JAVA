package vista;

import modelo.RegistroCompra;

public class RegistroComprasForm extends javax.swing.JFrame {
    
    void habdes(boolean sw){
        txtRuc.setEnabled(sw);
        txtFecha.setEnabled(sw);
        txtProveedor.setEnabled(sw);
        txtCompra1.setEnabled(sw);
        txtCompra2.setEnabled(sw);
        txtCompra3.setEnabled(sw);
        txtCompra4.setEnabled(sw);
        txtTotal.setEnabled(sw);
        txtPromedio.setEnabled(sw);
        txtMayor.setEnabled(sw);
        txtMenor.setEnabled(sw);
    }
    
    void limpiar(){
        txtRuc.setText("");
        txtFecha.setText("");
        txtProveedor.setText("");
        txtCompra1.setText("");
        txtCompra2.setText("");
        txtCompra3.setText("");
        txtCompra4.setText("");        
        txtTotal.setText("");        
        txtPromedio.setText("");        
        txtMayor.setText("");        
        txtMenor.setText("");        
    }
    
    public RegistroComprasForm() {
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
        txtCompra4 = new javax.swing.JTextField();
        txtRuc = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtProveedor = new javax.swing.JTextField();
        txtCompra1 = new javax.swing.JTextField();
        txtCompra2 = new javax.swing.JTextField();
        txtCompra3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtMenor = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtPromedio = new javax.swing.JTextField();
        txtMayor = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Registro de compras");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel2.setText("Compra 4:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel3.setText("Ruc:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel4.setText("Fecha:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel5.setText("Proveedor:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel6.setText("Compra 1:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel7.setText("Compra 2:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel8.setText("Compra 3:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));
        getContentPane().add(txtCompra4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 120, -1));
        getContentPane().add(txtRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 120, -1));
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 120, -1));
        getContentPane().add(txtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 120, -1));
        getContentPane().add(txtCompra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 120, -1));
        getContentPane().add(txtCompra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 120, -1));
        getContentPane().add(txtCompra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 120, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/compras.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jLabel10.setText("Menor");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, -1));

        jLabel11.setText("Total");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel12.setText("Promedio");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        jLabel13.setText("Mayor");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));
        getContentPane().add(txtMenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 80, -1));
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 80, -1));
        getContentPane().add(txtPromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 80, -1));
        getContentPane().add(txtMayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 80, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        habdes(false);
        
    }//GEN-LAST:event_formWindowActivated

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        habdes(true);
        limpiar();
        txtRuc.requestFocus();
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        double c1,c2,c3,c4;
        
        c1=Double.parseDouble(txtCompra1.getText());
        c2=Double.parseDouble(txtCompra2.getText());
        c3=Double.parseDouble(txtCompra3.getText());
        c4=Double.parseDouble(txtCompra4.getText());
        
        RegistroCompra objCompra= new RegistroCompra();
        
        objCompra.setCompra1(c1);
        objCompra.setCompra2(c2);
        objCompra.setCompra3(c3);
        objCompra.setCompra4(c4);
        
        txtTotal.setText(String.valueOf(objCompra.total()));
        txtPromedio.setText(String.valueOf(objCompra.promedio()));
        txtMayor.setText(String.valueOf(objCompra.mayor()));
        txtMenor.setText(String.valueOf(objCompra.menor()));                             
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroComprasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroComprasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroComprasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroComprasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroComprasForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
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
    private javax.swing.JTextField txtCompra1;
    private javax.swing.JTextField txtCompra2;
    private javax.swing.JTextField txtCompra3;
    private javax.swing.JTextField txtCompra4;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMayor;
    private javax.swing.JTextField txtMenor;
    private javax.swing.JTextField txtPromedio;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
