
public class Ejercicio6 extends javax.swing.JFrame {

    public Ejercicio6() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ingreso2 = new javax.swing.JTextField();
        ingreso1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        gasto1 = new javax.swing.JTextField();
        gasto2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gasto3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultados = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ingreso 2:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel2.setText("Ingreso 1:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));
        getContentPane().add(ingreso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 130, -1));
        getContentPane().add(ingreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 130, -1));

        jLabel3.setText("Gasto 1:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        getContentPane().add(gasto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 130, -1));
        getContentPane().add(gasto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 130, -1));

        jLabel4.setText("Gasto 2:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel5.setText("Gasto 3:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        getContentPane().add(gasto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 130, -1));

        resultados.setColumns(20);
        resultados.setRows(5);
        resultados.setEnabled(false);
        jScrollPane1.setViewportView(resultados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 290, 130));

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        double ahorroMensual,ahorroBimestral,ahorroCuatrimestral,ahorroAnual;
        
        ahorroMensual=(Integer.parseInt(ingreso1.getText())+Integer.parseInt(ingreso2.getText()))-(Integer.parseInt(gasto1.getText())+Integer.parseInt(gasto2.getText())+Integer.parseInt(gasto3.getText()));
        ahorroBimestral=ahorroMensual*2;
        ahorroCuatrimestral=ahorroMensual*4;
        ahorroAnual=ahorroMensual*12;
        
        resultados.setText("El ahorro mensual es: "+ahorroMensual+"\n"+"El ahorro bimestral es: "+ahorroBimestral+"\n"+"El ahorro cuatrimestral es: "+ahorroCuatrimestral+"\n"+"El ahorro anual es: "+ahorroAnual);
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
            java.util.logging.Logger.getLogger(Ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField gasto1;
    private javax.swing.JTextField gasto2;
    private javax.swing.JTextField gasto3;
    private javax.swing.JTextField ingreso1;
    private javax.swing.JTextField ingreso2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea resultados;
    // End of variables declaration//GEN-END:variables
}
