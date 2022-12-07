package sesion03;

import java.awt.Label;

public class frame1 extends javax.swing.JFrame {

    public frame1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        boton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtresultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(300, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Numero 1:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 30, -1, -1));

        jLabel2.setText("Numero 2:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 64, -1, -1));
        jLabel2.getAccessibleContext().setAccessibleName("");

        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 140, -1));
        txt1.getAccessibleContext().setAccessibleName("n1");

        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 140, -1));
        txt2.getAccessibleContext().setAccessibleName("n2");

        boton.setText("Calcular");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });
        getContentPane().add(boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jLabel3.setText("Resultado");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 70, 30));

        txtresultado.setEnabled(false);
        txtresultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresultadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 140, -1));
        txtresultado.getAccessibleContext().setAccessibleName("r");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botonActionPerformed
        int numero1, numero2, r; // TODO add your handling code here:
        numero1 = Integer.parseInt(txt1.getText());
        numero2 = Integer.parseInt(txt2.getText());

        r = numero1 + numero2;

        // txtresultado.setText("El resultado es:"+r);
        txtresultado.setText(String.valueOf(r));
    }// GEN-LAST:event_botonActionPerformed

    private void txtresultadoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtresultadoActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtresultadoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame1().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txtresultado;
    // End of variables declaration//GEN-END:variables
}
