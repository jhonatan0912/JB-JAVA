package vista;

import modelo.Promedio;

public class RegistroPromedio extends javax.swing.JFrame {

    public RegistroPromedio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNumero2 = new javax.swing.JLabel();
        txtNumero1 = new javax.swing.JLabel();
        txtNumero2RP = new javax.swing.JTextField();
        txtNumero1RP = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        promedio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNumero3 = new javax.swing.JLabel();
        txtNumero4 = new javax.swing.JLabel();
        txtNumero4RP = new javax.swing.JTextField();
        txtNumero3RP = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 450));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Registro promedio");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        txtNumero2.setText("Sueldo 2:");
        getContentPane().add(txtNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        txtNumero1.setText("Sueldo 1:");
        getContentPane().add(txtNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));
        getContentPane().add(txtNumero2RP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 140, -1));
        getContentPane().add(txtNumero1RP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 140, -1));

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));
        getContentPane().add(promedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 130, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Promedio");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        txtNumero3.setText("Sueldo 4:");
        getContentPane().add(txtNumero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        txtNumero4.setText("Sueldo 3:");
        getContentPane().add(txtNumero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));
        getContentPane().add(txtNumero4RP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 140, -1));
        getContentPane().add(txtNumero3RP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 140, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double numero1 = Double.parseDouble(txtNumero1RP.getText());
        double numero2 = Double.parseDouble(txtNumero2RP.getText());
        double numero3 = Double.parseDouble(txtNumero3RP.getText());
        double numero4 = Double.parseDouble(txtNumero4RP.getText());
        double res;
        
        Promedio objPromedio = new Promedio();
        res=objPromedio.promedio(numero1, numero2,numero3,numero4);
        
        promedio.setText(String.valueOf(res));
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
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
            java.util.logging.Logger.getLogger(RegistroPromedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPromedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPromedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPromedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPromedio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField promedio;
    private javax.swing.JLabel txtNumero1;
    private javax.swing.JTextField txtNumero1RP;
    private javax.swing.JLabel txtNumero2;
    private javax.swing.JTextField txtNumero2RP;
    private javax.swing.JLabel txtNumero3;
    private javax.swing.JTextField txtNumero3RP;
    private javax.swing.JLabel txtNumero4;
    private javax.swing.JTextField txtNumero4RP;
    // End of variables declaration//GEN-END:variables
}
