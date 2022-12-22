package vista;

import modelo.RegVenta;

public class RegistroVentas extends javax.swing.JFrame {

    public void habdes(boolean sw){
        cboVendedor.setEnabled(sw);
        txtVenta1.setEnabled(sw);
        txtVenta2.setEnabled(sw);
        txtTv.setEnabled(sw);
        txtIgv.setEnabled(sw);
        txtVn.setEnabled(sw);
        txtCondicion.setEnabled(sw);
    }
    
    public void limpiar(){
        cboVendedor.setSelectedIndex(0);
        txtVenta1.setText("");
        txtVenta2.setText("");
        txtTv.setText("");
        txtIgv.setText("");
        txtVn.setText("");
        txtCondicion.setText("");
        cboVendedor.requestFocus();
    }
    
    public RegistroVentas() {
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
        txtCondicion = new javax.swing.JTextField();
        txtTv = new javax.swing.JTextField();
        txtIgv = new javax.swing.JTextField();
        txtVn = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();
        cboVendedor = new javax.swing.JComboBox<>();
        txtVenta1 = new javax.swing.JTextField();
        txtVenta2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Registro de Ventas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabel2.setText("Vendedor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setText("Venta 1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel4.setText("Venta 2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel5.setText("Total ventas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel6.setText("IGV");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jLabel7.setText("Ventas netas");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        jLabel8.setText("Condición");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));
        getContentPane().add(txtCondicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 180, -1));
        getContentPane().add(txtTv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 70, -1));
        getContentPane().add(txtIgv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 70, -1));
        getContentPane().add(txtVn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 70, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        lblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 170, 140));

        cboVendedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Daniel", "Carlos", "Jose", "Bill" }));
        cboVendedor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboVendedorItemStateChanged(evt);
            }
        });
        getContentPane().add(cboVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 110, -1));

        txtVenta1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVenta1KeyTyped(evt);
            }
        });
        getContentPane().add(txtVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 110, -1));

        txtVenta2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVenta2KeyTyped(evt);
            }
        });
        getContentPane().add(txtVenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        habdes(false);
    }//GEN-LAST:event_formWindowOpened

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        habdes(true);
        limpiar();        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtVenta1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVenta1KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        
        if(c<'0' || c>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txtVenta1KeyTyped

    private void txtVenta2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVenta2KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        
        if(c<'0' || c>'9'){
            evt.consume();
        }           
    }//GEN-LAST:event_txtVenta2KeyTyped

    private void cboVendedorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboVendedorItemStateChanged
        // TODO add your handling code here:
        int index=cboVendedor.getSelectedIndex();
        String ruta = new String();
        
        switch (index) {
            case 1 -> ruta="/recurso/daniel.jpg";
            case 2 -> ruta="/recurso/carlos.jpg";
            case 3 -> ruta="/recurso/jose.jpg";
            case 4 -> ruta="/recurso/bill.jpg";          
            default -> throw new AssertionError();
        }
        lblFoto.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(ruta)));
    }//GEN-LAST:event_cboVendedorItemStateChanged

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        double xvt1=Double.parseDouble(txtVenta1.getText());
        double xvt2=Double.parseDouble(txtVenta2.getText());
        double xtv;
        double xigv;
        double xvn;
        String xcon;
        
        RegVenta objVenta= new RegVenta();
        xtv=objVenta.totalventas(xvt1, xvt2);
        xigv=objVenta.IGV(xtv);
        xvn=objVenta.ventasnetas(xtv, xigv);
        xcon=objVenta.condicion(xvn);
        
        txtTv.setText(String.valueOf(xtv));
        txtIgv.setText(String.valueOf(xigv));
        txtVn.setText(String.valueOf(xvn));
        txtCondicion.setText(xcon);
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JTextField txtCondicion;
    private javax.swing.JTextField txtIgv;
    private javax.swing.JTextField txtTv;
    private javax.swing.JTextField txtVenta1;
    private javax.swing.JTextField txtVenta2;
    private javax.swing.JTextField txtVn;
    // End of variables declaration//GEN-END:variables
}
