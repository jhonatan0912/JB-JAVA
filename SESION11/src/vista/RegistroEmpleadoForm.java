package vista;

import javax.swing.DefaultListModel;
import modelo.Empleado;

public class RegistroEmpleadoForm extends javax.swing.JFrame {
    
    public DefaultListModel modelo = new DefaultListModel();
    
    public void limpiar(){
        txtdni.setText("");
        txtnombre.setText("");
        txtedad.setText("");
        txtsb.setText("");
        txtsp.setText("");
        txtsn.setText("");
        
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        
        cbocargo.setSelectedIndex(0);
        modelo.removeAllElements();
        lstregistro.setModel(modelo);
        txtdni.requestFocus();        
    }
    
    public void habdes(boolean sw){
        txtdni.setEnabled(sw);
        txtnombre.setEnabled(sw);
        txtedad.setEnabled(sw);
        txtsb.setEnabled(sw);
        txtsp.setEnabled(sw);
        txtsn.setEnabled(sw);
        
        radio1.setEnabled(sw);
        radio2.setEnabled(sw);
        radio3.setEnabled(sw);
        radio4.setEnabled(sw);
        
        cbocargo.setEnabled(sw);
    }
    
    public RegistroEmpleadoForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtsn = new javax.swing.JTextField();
        txtsb = new javax.swing.JTextField();
        txtsp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        radio4 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        cbocargo = new javax.swing.JComboBox<>();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        btnSalir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstregistro = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Registro Empleado");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel2.setText("S.Neto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel3.setText("DNI");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel4.setText("Nombres");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel5.setText("Edad:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel6.setText("Sexo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel7.setText("Seguro pensi??n:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jLabel8.setText("S.Bruto:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel9.setText("S.Pension:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        getContentPane().add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 100, -1));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 100, -1));
        getContentPane().add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 100, -1));
        getContentPane().add(txtsn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 100, -1));
        getContentPane().add(txtsb, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 100, -1));
        getContentPane().add(txtsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 100, -1));

        jLabel10.setText("Cargo:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        buttonGroup2.add(radio4);
        radio4.setText("AFP");
        getContentPane().add(radio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        buttonGroup2.add(radio3);
        radio3.setText("ONP");
        getContentPane().add(radio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        cbocargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbocargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 100, -1));

        buttonGroup1.add(radio1);
        radio1.setText("Masculino");
        getContentPane().add(radio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        buttonGroup1.add(radio2);
        radio2.setText("Femenino");
        getContentPane().add(radio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        jScrollPane2.setViewportView(lstregistro);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 360, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:               
        habdes(false);
        limpiar();
        
        cbocargo.removeAllItems();
        
        String Acargo[]={"Seleccionar","Gerente","Administrador","Supervisor","Contador"};
        
        for(int i = 0;i<5;i++){
            cbocargo.addItem(Acargo[i]);
        }
        modelo.removeAllElements();
        modelo.addElement("DNI NOMBRE EDAD SEXO CARGO SUELDO NETO");
        lstregistro.setModel(modelo);
    }//GEN-LAST:event_formWindowOpened

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        habdes(true);
        limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:        
        
        String xdni=txtdni.getText();
        String xnombre=txtnombre.getText();
        
        int xedad=Integer.parseInt(txtedad.getText());
        
        char xsexo=' ';
        double xsp=0.0;
        
        if(radio1.isSelected()){
            xsexo='M';
        }else if(radio2.isSelected()){
            xsexo='F';
        }
        
        if(radio3.isSelected()){
            xsp=0.13;
        }else if(radio4.isSelected()){
            xsp=0.11;
        }
        
        String xcargo=(String) cbocargo.getSelectedItem();
        double xsueldobruto=Double .parseDouble(txtsb.getText());
        
        Empleado objEmpleado= new Empleado();
                
        objEmpleado.setDni(xdni);
        objEmpleado.setNombre(xnombre);
        objEmpleado.setEdad(xedad);
        objEmpleado.setSexo(xsexo);
        objEmpleado.setCargo(xcargo);
        objEmpleado.setSueldobruto(xsueldobruto);
        objEmpleado.setSp(xsp);
        
        txtsp.setText(String.valueOf(objEmpleado.seguropension()));
        txtsn.setText(String.valueOf(objEmpleado.sueldoneto()));
        
        modelo.addElement(objEmpleado.dato());
        
        lstregistro.setModel(modelo);
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
            java.util.logging.Logger.getLogger(RegistroEmpleadoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleadoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleadoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleadoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroEmpleadoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbocargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lstregistro;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    private javax.swing.JRadioButton radio4;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtsb;
    private javax.swing.JTextField txtsn;
    private javax.swing.JTextField txtsp;
    // End of variables declaration//GEN-END:variables
}
