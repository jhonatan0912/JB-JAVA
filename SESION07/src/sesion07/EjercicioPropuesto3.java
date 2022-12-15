package sesion07;

import javax.swing.JOptionPane;

public class EjercicioPropuesto3 extends javax.swing.JFrame {

    public EjercicioPropuesto3() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        calcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Cantidad de sexos (Masculino - Femenino)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        getContentPane().add(calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        // TODO add your handling code here:
        int cantidad,cantMasculino,cantFemenino,value;
        
        
        cantidad=Integer.parseInt(JOptionPane.showInputDialog("Cantidad de personas"));
        
        
        cantMasculino=0;
        cantFemenino=0;
        for(int i= 1;i<=cantidad;i++)
        {
            value=Integer.parseInt(JOptionPane.showInputDialog("Que sexo es la "+i+" persona?"+"\n"+"1 = Varón"+"\n"+"2 = Mujer"));
            
            if(value == 1)
            {
                cantMasculino++;
            }else if(value == 2){
                cantFemenino++;
            }
            else{
                JOptionPane.showMessageDialog(null,"Insertar númerovalido");
            }
        }
        
        JOptionPane.showMessageDialog(null, cantMasculino+" varones"+"\n"+cantFemenino+" mujeres");
        
    }//GEN-LAST:event_calcularActionPerformed

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
    private javax.swing.JButton calcular;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
