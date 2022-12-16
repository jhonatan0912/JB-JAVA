package sesion08;

import javax.swing.JOptionPane;

public class ActividadAsincrona extends javax.swing.JFrame {

    public ActividadAsincrona() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnProcesar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCantidadCompras = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Tienda de juguetes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });
        getContentPane().add(btnProcesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        jLabel2.setText("Cantidad de compras:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));
        getContentPane().add(txtCantidadCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        // TODO add your handling code here:
        
        int cantidad,tipo,cantidadJuguetes;
        double importeCompra,descuento,total;
        
        importeCompra=0.0;
        descuento=0.0;
        total=0.0;
        
        //cantidad=Integer.parseInt(JOptionPane.showInputDialog("Insertar cantidad de juguetes"));
        cantidad=Integer.parseInt(txtCantidadCompras.getText());
        
        for(int i=1;i<=cantidad;i++){
            tipo=Integer.parseInt(JOptionPane.showInputDialog("Ingresar tipo de juguete"+"\n"+"1.-Monopolio"+"\n"+"2.-Ajedrez"+"\n"+"3.-Lego"+"\n"+"4.-Dama"+"\n"+"5.-Laberinto"));
            cantidadJuguetes=Integer.parseInt(JOptionPane.showInputDialog("Insertar cantidad productos"));
            
            if(tipo==1){
                importeCompra=70.99*cantidadJuguetes;
                if(cantidadJuguetes<10){
                    descuento=importeCompra*0.035;
                    total=importeCompra-descuento;
                }else if (cantidadJuguetes >= 10 && cantidadJuguetes <= 20) {
                    descuento = importeCompra * 0.07;
                    total = importeCompra - descuento;
                }else if (cantidadJuguetes > 20) {
                    descuento = importeCompra * 0.095;
                    total = importeCompra - descuento;
                }
            }else if (tipo==2) {
                importeCompra = (78.99 * cantidadJuguetes);
                if (cantidadJuguetes < 10) {
                    descuento = importeCompra * 0.035;
                    total = importeCompra - descuento;
                } else if (cantidadJuguetes >= 10 && cantidadJuguetes <= 20) {
                    descuento = importeCompra * 0.07;
                    total = importeCompra - descuento;
                } else if (cantidadJuguetes > 20) {
                    descuento = importeCompra * 0.095;
                    total = importeCompra - descuento;
                }
            }else if (tipo==3) {
                importeCompra = (100.99 * cantidadJuguetes);
                if (cantidadJuguetes < 10) {
                    descuento = importeCompra * 0.035;
                    total = importeCompra - descuento;
                } else if (cantidadJuguetes >= 10 && cantidadJuguetes <= 20) {
                    descuento = importeCompra * 0.07;
                    total = importeCompra - descuento;
                } else if (cantidadJuguetes > 20) {
                    descuento = importeCompra * 0.095;
                    total = importeCompra - descuento;
                }
            }else if (tipo==4) {
                importeCompra = (58.50 * cantidadJuguetes);
                if (cantidadJuguetes < 10) {
                    descuento = importeCompra * 0.035;
                    total = importeCompra - descuento;
                } else if (cantidadJuguetes >= 10 && cantidadJuguetes <= 20) {
                    descuento = importeCompra * 0.07;
                    total = importeCompra - descuento;
                } else if (cantidadJuguetes > 20) {
                    descuento = importeCompra * 0.095;
                     total = importeCompra - descuento;
                }
            }else if (tipo==5) {
                importeCompra = (35.00 * cantidadJuguetes);
                if (cantidadJuguetes < 10) {
                  descuento = importeCompra * 0.035;
                  total = importeCompra - descuento;
                } else if (cantidadJuguetes >= 10 && cantidadJuguetes <= 20) {
                  descuento = importeCompra * 0.07;
                  total = importeCompra - descuento;
                } else if (cantidadJuguetes > 20) {
                  descuento = importeCompra * 0.095;
                  total = importeCompra - descuento;
                }
            } 
        }
        JOptionPane.showMessageDialog(null, "El importe de compra es "+importeCompra+"\n"+"El descuento es:"+descuento+"\n"+" El importe a pagar es: "+total);
    }//GEN-LAST:event_btnProcesarActionPerformed

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
            java.util.logging.Logger.getLogger(ActividadAsincrona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActividadAsincrona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActividadAsincrona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActividadAsincrona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActividadAsincrona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcesar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtCantidadCompras;
    // End of variables declaration//GEN-END:variables
}
