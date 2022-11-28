public class Ejercicio4 extends javax.swing.JFrame {

    public Ejercicio4() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultados = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        compra4 = new javax.swing.JTextField();
        compra1 = new javax.swing.JTextField();
        compra2 = new javax.swing.JTextField();
        compra3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Compra 4:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel2.setText("Compra 1:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel3.setText("Compra 2:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel4.setText("Compra 3:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        resultados.setColumns(20);
        resultados.setRows(5);
        resultados.setEnabled(false);
        jScrollPane1.setViewportView(resultados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        compra4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compra4ActionPerformed(evt);
            }
        });
        getContentPane().add(compra4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 160, -1));

        compra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compra1ActionPerformed(evt);
            }
        });
        getContentPane().add(compra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 160, -1));

        compra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compra2ActionPerformed(evt);
            }
        });
        getContentPane().add(compra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 160, -1));

        compra3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compra3ActionPerformed(evt);
            }
        });
        getContentPane().add(compra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 160, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void compra4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compra4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compra4ActionPerformed

    private void compra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compra1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compra1ActionPerformed

    private void compra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compra2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compra2ActionPerformed

    private void compra3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compra3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compra3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    double total,promedio;        // TODO add your handling code here:
    
    total=Integer.parseInt(compra1.getText())+Integer.parseInt(compra2.getText())+Integer.parseInt(compra3.getText())+Integer.parseInt(compra4.getText());
    promedio=total/4;
    
    resultados.setText("El total de las ventas es: "+total+"\n"+"El promedio es: "+promedio);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField compra1;
    private javax.swing.JTextField compra2;
    private javax.swing.JTextField compra3;
    private javax.swing.JTextField compra4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultados;
    // End of variables declaration//GEN-END:variables
}
