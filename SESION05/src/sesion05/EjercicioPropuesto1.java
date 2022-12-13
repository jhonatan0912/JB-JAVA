package sesion05;

public class EjercicioPropuesto1 extends javax.swing.JFrame {

    public EjercicioPropuesto1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtCantidadHijos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHijosEdadEscolar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        radioViuda1 = new javax.swing.JRadioButton();
        radioViuda2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        radioSeguro1 = new javax.swing.JRadioButton();
        radioSeguro2 = new javax.swing.JRadioButton();
        resultado = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        radioCasada1 = new javax.swing.JRadioButton();
        radioCasada2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cantidad de hijos:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        getContentPane().add(txtCantidadHijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 120, -1));

        jLabel2.setText("Cant hijos en edad escolar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        getContentPane().add(txtHijosEdadEscolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 120, -1));

        jLabel3.setText("Es viuda?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        buttonGroup1.add(radioViuda1);
        radioViuda1.setText("Si");
        getContentPane().add(radioViuda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        buttonGroup1.add(radioViuda2);
        radioViuda2.setText("No");
        getContentPane().add(radioViuda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jLabel4.setText("Tiene seguro social:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        buttonGroup2.add(radioSeguro1);
        radioSeguro1.setText("Si");
        getContentPane().add(radioSeguro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        buttonGroup2.add(radioSeguro2);
        radioSeguro2.setText("No");
        getContentPane().add(radioSeguro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));
        getContentPane().add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 350, 40));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("SUBSIDIO FAMILIAR");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel6.setText("Es casada?");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        buttonGroup3.add(radioCasada1);
        radioCasada1.setText("Si");
        getContentPane().add(radioCasada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        buttonGroup3.add(radioCasada2);
        radioCasada2.setText("No");
        getContentPane().add(radioCasada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int cantidadHijos,hijosEdadEscolar;
        double montoCantidadHijos,montoSeguroSocial,montoHijosEdadEscolar,montoViuda,montoCasada,montoTotal;
        
        montoCantidadHijos=0;
        montoSeguroSocial=0;
        montoHijosEdadEscolar=0;
        montoViuda=0;
        montoCasada=0;
        montoTotal=0;
                        
                        
        cantidadHijos=Integer.parseInt(txtCantidadHijos.getText());
        
        if(cantidadHijos<=2){
            montoCantidadHijos=120;
        }else if(cantidadHijos==3 || cantidadHijos<=5){
            montoCantidadHijos=150;
        }else if(cantidadHijos==6 || cantidadHijos>6){
            montoCantidadHijos=180;
        }
        
        hijosEdadEscolar=Integer.parseInt(txtHijosEdadEscolar.getText());
        montoHijosEdadEscolar=20*hijosEdadEscolar;
        
        if(radioViuda1.isSelected()){
            montoViuda=90;
        }
        
        if(radioCasada1.isSelected()){
            montoCasada=50;
        }
        
        if(radioSeguro2.isSelected()){
            montoSeguroSocial=100;
        }
        montoTotal=montoCantidadHijos+montoSeguroSocial+montoHijosEdadEscolar;
        
        resultado.setText("El monto mensual es S/."+montoTotal);
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(EjercicioPropuesto1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjercicioPropuesto1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjercicioPropuesto1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjercicioPropuesto1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjercicioPropuesto1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton radioCasada1;
    private javax.swing.JRadioButton radioCasada2;
    private javax.swing.JRadioButton radioSeguro1;
    private javax.swing.JRadioButton radioSeguro2;
    private javax.swing.JRadioButton radioViuda1;
    private javax.swing.JRadioButton radioViuda2;
    private javax.swing.JLabel resultado;
    private javax.swing.JTextField txtCantidadHijos;
    private javax.swing.JTextField txtHijosEdadEscolar;
    // End of variables declaration//GEN-END:variables
}
