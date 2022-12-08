
public class Ejercicio1 extends javax.swing.JFrame {

    public Ejercicio1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        venta3Input = new javax.swing.JTextField();
        nombreInput = new javax.swing.JTextField();
        sueldoMensualInput = new javax.swing.JTextField();
        venta1Input = new javax.swing.JTextField();
        venta2Input = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultados = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Sueldo mensual:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel2.setText("Nombre vendedor:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel3.setText("Venta 3:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel4.setText("Venta 1:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel5.setText("Venta 2:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
        getContentPane().add(venta3Input, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 170, -1));
        getContentPane().add(nombreInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 170, -1));
        getContentPane().add(sueldoMensualInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 170, -1));
        getContentPane().add(venta1Input, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 170, -1));
        getContentPane().add(venta2Input, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 170, -1));

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 120, 50));

        resultados.setEditable(false);
        resultados.setColumns(20);
        resultados.setRows(5);
        resultados.setEnabled(false);
        jScrollPane1.setViewportView(resultados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 420, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        double venta1, venta2, venta3, sueldoMensual, comision, pagoTotal; // TODO add your handling code here:
        venta1 = Integer.parseInt(venta1Input.getText());
        venta2 = Integer.parseInt(venta2Input.getText());
        venta3 = Integer.parseInt(venta3Input.getText());

        comision = (venta1 + venta2 + venta3) * 0.10;
        sueldoMensual = Integer.parseInt(sueldoMensualInput.getText());
        pagoTotal = sueldoMensual + comision;

        resultados.setText(
                "El sueldo mensual del vendedor es: " + pagoTotal + "\n" + "La comision recibida es: " + comision);

    }// GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreInput;
    private javax.swing.JTextArea resultados;
    private javax.swing.JTextField sueldoMensualInput;
    private javax.swing.JTextField venta1Input;
    private javax.swing.JTextField venta2Input;
    private javax.swing.JTextField venta3Input;
    // End of variables declaration//GEN-END:variables
}
