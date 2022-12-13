package sesion05;

public class EjercicioPropuesto3 extends javax.swing.JFrame {

    public EjercicioPropuesto3() {
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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtEnero = new javax.swing.JTextField();
        txtFebrero = new javax.swing.JTextField();
        txtMarzo = new javax.swing.JTextField();
        txtAbril = new javax.swing.JTextField();
        txtMayo = new javax.swing.JTextField();
        txtJunio = new javax.swing.JTextField();
        txtJulio = new javax.swing.JTextField();
        txtAgosto = new javax.swing.JTextField();
        txtSeptiembre = new javax.swing.JTextField();
        txtOctubre = new javax.swing.JTextField();
        txtNoviembre = new javax.swing.JTextField();
        txtDiciembre = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultados = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Enero");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel2.setText("Febrero");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        jLabel3.setText("Marzo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel4.setText("Abril");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        jLabel5.setText("Mayo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel6.setText("Junio");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jLabel7.setText("Julio");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel8.setText("Agosto");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        jLabel9.setText("Septiembre");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel10.setText("Octubre");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        jLabel11.setText("Noviembre");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel12.setText("Diciembre");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));
        getContentPane().add(txtEnero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 120, -1));
        getContentPane().add(txtFebrero, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 120, -1));
        getContentPane().add(txtMarzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 120, -1));
        getContentPane().add(txtAbril, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 120, -1));
        getContentPane().add(txtMayo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 120, -1));
        getContentPane().add(txtJunio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 120, -1));
        getContentPane().add(txtJulio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 120, -1));
        getContentPane().add(txtAgosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 120, -1));
        getContentPane().add(txtSeptiembre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 120, -1));
        getContentPane().add(txtOctubre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 120, -1));
        getContentPane().add(txtNoviembre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 120, -1));
        getContentPane().add(txtDiciembre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 120, -1));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, -1, -1));

        resultados.setColumns(20);
        resultados.setRows(5);
        jScrollPane1.setViewportView(resultados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 450, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        
        double enero,febrero,marzo,abril,mayo,junio,julio,agosto,septiembre,octubre,noviembre,diciembre,total,promedio,mayor,menor;
        String mesMayor,mesMenor;
        
        enero=Double.parseDouble(txtEnero.getText());
        febrero=Double.parseDouble(txtFebrero.getText());
        marzo=Double.parseDouble(txtMarzo.getText());
        abril=Double.parseDouble(txtAbril.getText());
        mayo=Double.parseDouble(txtMayo.getText());
        junio=Double.parseDouble(txtJunio.getText());
        julio=Double.parseDouble(txtJulio.getText());
        agosto=Double.parseDouble(txtAgosto.getText());
        septiembre=Double.parseDouble(txtSeptiembre.getText());
        octubre=Double.parseDouble(txtOctubre.getText());
        noviembre=Double.parseDouble(txtNoviembre.getText());
        diciembre=Double.parseDouble(txtDiciembre.getText());
        
        total=enero+febrero+marzo+abril+mayo+junio+julio+agosto+septiembre+octubre+noviembre+diciembre;
        promedio=total/12;
        
        mayor=enero;
        mesMayor="Enero";
        if(febrero>enero){
            mayor=febrero;
            mesMayor="Febrero";
        }
        if(marzo>febrero){
            mayor=marzo;
             mesMayor="Marzo";
        }
        if(abril>marzo){
            mayor=abril;
            mesMayor="Abril";
        }
        if(mayo>abril){
            mayor=mayo;
            mesMayor="Mayo";
        }
        if(junio>mayo){
            mayor=junio;
            mesMayor="Junio";
        }
        if(julio>junio){
            mayor=julio;
            mesMayor="Julio";
        }
        if(agosto>julio){
            mayor=agosto;
            mesMayor="Agosto";
        }
        if(septiembre>agosto){
            mayor=septiembre;
            mesMayor="Septiembre";
        }
        if(octubre>septiembre){
            mayor=octubre;
            mesMayor="Octubre";
        }
        if(noviembre>octubre){
            mayor=noviembre;
            mesMayor="Noviembre";
        }
        if(diciembre>noviembre){
            mayor=diciembre;
            mesMayor="Diciembre";
        }
        
        //menor
        menor=enero;
        mesMenor="Enero";
        if(febrero<enero){
            menor=febrero;
            mesMenor="Febrero";    
        }
        if(marzo<febrero){
            menor=marzo;
            mesMenor="Marzo";
        }
        if(abril<marzo){
            menor=abril;
            mesMenor="Abril";
        }
        if(mayo<abril){
            menor=mayo;
            mesMenor="Mayo";
        }
        if(junio<mayo){
            menor=junio;
            mesMenor="Junio";
        }
        if(julio<junio){
            menor=julio;
            mesMenor="Julio";
        }
        if(agosto<julio){
            menor=agosto;
            mesMenor="Agosto";
        }
        if(septiembre<agosto){
            menor=septiembre;
            mesMenor="Septiembre";
        }
        if(octubre<septiembre){
            menor=octubre;
            mesMenor="Octubre";
        }
        if(noviembre<octubre){
            menor=noviembre;
            mesMenor="Noviembre";
        }
        if(diciembre<noviembre){
            menor=diciembre;
            mesMenor="Diciembre";
        }
        
        resultados.setText("El total es "+total+"\n"+"El promedio es "+promedio+"\n"+"La mayor venta fue en "+mesMayor+" con "+mayor+"\n"+"La menor venta fue en"+mesMenor+" con "+menor);
        
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
            java.util.logging.Logger.getLogger(EjercicioPropuesto3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjercicioPropuesto3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjercicioPropuesto3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjercicioPropuesto3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjercicioPropuesto3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultados;
    private javax.swing.JTextField txtAbril;
    private javax.swing.JTextField txtAgosto;
    private javax.swing.JTextField txtDiciembre;
    private javax.swing.JTextField txtEnero;
    private javax.swing.JTextField txtFebrero;
    private javax.swing.JTextField txtJulio;
    private javax.swing.JTextField txtJunio;
    private javax.swing.JTextField txtMarzo;
    private javax.swing.JTextField txtMayo;
    private javax.swing.JTextField txtNoviembre;
    private javax.swing.JTextField txtOctubre;
    private javax.swing.JTextField txtSeptiembre;
    // End of variables declaration//GEN-END:variables
}
