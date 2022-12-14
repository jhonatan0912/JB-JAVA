package sesion06;

public class EjercicioClase1 extends javax.swing.JFrame {

    public EjercicioClase1() {
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
        cboOperacion = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtNumero1 = new javax.swing.JTextField();
        txtNumero2 = new javax.swing.JTextField();
        resultados = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Operaciones Aritméticas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel2.setText("Número 1:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setText("Número 2:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 60, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sesion06/aritmetica.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 220, -1));

        jLabel5.setText("Operación:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        cboOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Suma", "Resta", "Multiplicación", "División" }));
        cboOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboOperacionActionPerformed(evt);
            }
        });
        getContentPane().add(cboOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 120, -1));

        jLabel6.setText("Resultados:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));
        getContentPane().add(txtNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 120, -1));
        getContentPane().add(txtNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, -1));

        resultados.setForeground(new java.awt.Color(242, 242, 242));
        resultados.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        resultados.setDoubleBuffered(true);
        resultados.setEnabled(false);
        resultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadosActionPerformed(evt);
            }
        });
        getContentPane().add(resultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboOperacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboOperacionActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        txtNumero1.setText("");
        txtNumero2.setText("");
        cboOperacion.setSelectedIndex(0);
        resultados.setText("");
        txtNumero1.requestFocus();               
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        double num1,num2,resultado;
        int opc;
        resultado=0;
        
        num1=Double.parseDouble(txtNumero1.getText());
        num2=Double.parseDouble(txtNumero2.getText());
        
        opc=cboOperacion.getSelectedIndex();
        
        switch (opc) {
            case 1:
                   resultado=num1+num2;
                break;
            case 2:
                   resultado=num1-num2;
                break;
            case 3:
                   resultado=num1*num2;
                break;
            case 4:
                   resultado=num1/num2;
                break;
            default:
                throw new AssertionError();
        }
        
        resultados.setText(String.valueOf(resultado));
            
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void resultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadosActionPerformed

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
            java.util.logging.Logger.getLogger(EjercicioClase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjercicioClase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjercicioClase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjercicioClase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjercicioClase1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField resultados;
    private javax.swing.JTextField txtNumero1;
    private javax.swing.JTextField txtNumero2;
    // End of variables declaration//GEN-END:variables
}
