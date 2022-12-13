package sesion05;

public class Ejercicio1 extends javax.swing.JFrame {

    public Ejercicio1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        cbodistrtito = new javax.swing.JComboBox<>();
        txtcelular = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rbg1 = new javax.swing.JRadioButton();
        rbg2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cboestadocivil = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbovivienda = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        rbp1 = new javax.swing.JRadioButton();
        rbp2 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        rbpf1 = new javax.swing.JRadioButton();
        rbpf2 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        ckg1 = new javax.swing.JCheckBox();
        ckg2 = new javax.swing.JCheckBox();
        ckg3 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnNuevo = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cbonivel = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        cbocargo = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txtsueldo = new javax.swing.JTextField();
        resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Registro de datos cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel2.setText("DNI:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel4.setText("Distrito:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel5.setText("Celular:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        txtdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdniActionPerformed(evt);
            }
        });
        getContentPane().add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 90, -1));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 180, -1));

        cbodistrtito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbodistrtito, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 110, -1));
        getContentPane().add(txtcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 90, -1));

        jLabel6.setText("Género:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        buttonGroup1.add(rbg1);
        rbg1.setText("Masculino");
        getContentPane().add(rbg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        buttonGroup1.add(rbg2);
        rbg2.setText("Femenino");
        getContentPane().add(rbg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel7.setText("Edad:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));
        getContentPane().add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 90, -1));

        jLabel8.setText("Est.Civil");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        cboestadocivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Soltero", "Casado", "Viudo", "Divorciado" }));
        cboestadocivil.setBorder(null);
        getContentPane().add(cboestadocivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 110, -1));

        jLabel9.setText("Tipo Vivienda:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        cbovivienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Alquiladad", "Familiar", "Propia" }));
        getContentPane().add(cbovivienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 120, -1));

        jLabel10.setText("Tiene préstamos?");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        buttonGroup2.add(rbp1);
        rbp1.setText("Si");
        getContentPane().add(rbp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        buttonGroup2.add(rbp2);
        rbp2.setText("No");
        getContentPane().add(rbp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        jLabel11.setText("Tiene Dep Plazo Fijo?");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        buttonGroup3.add(rbpf1);
        rbpf1.setText("Si");
        getContentPane().add(rbpf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        buttonGroup3.add(rbpf2);
        rbpf2.setText("No");
        getContentPane().add(rbpf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        jLabel12.setText("Garantía:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        ckg1.setText("Vehículo");
        getContentPane().add(ckg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        ckg2.setText("Propiedad");
        getContentPane().add(ckg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        ckg3.setText("Otros");
        getContentPane().add(ckg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        jLabel13.setText("Resultado");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 580, 10));

        btnNuevo.setText("Nuevo");
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, -1, -1));

        btnSalir.setText("Salir");
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        jLabel14.setText("Nivel Instrucción:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        cbonivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Secundaria", "Técnico", "Universitaria" }));
        getContentPane().add(cbonivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 110, -1));

        jLabel15.setText("Cargo");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        cbocargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Empleado", "Ejecutivo", "Funcionario", "Gerente" }));
        getContentPane().add(cbocargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 110, -1));

        jLabel16.setText("Sueldo:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));
        getContentPane().add(txtsueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 90, -1));
        getContentPane().add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdniActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        int edad,prestamo,depfijo,garantia,pe,pec,pv,pnv,pc,pp,ppf,pg,puntaje,ps;
        int ecivil,tvivienda,nivelinst,cargo;
        double sueldo;
        
        String resultado;
        
        edad=Integer.parseInt(txtedad.getText());
        ecivil=cboestadocivil.getSelectedIndex();
        tvivienda=cbovivienda.getSelectedIndex();
        nivelinst=cbonivel.getSelectedIndex();
        cargo=cbocargo.getSelectedIndex();
        sueldo=Double.parseDouble(txtsueldo.getText());
        
        //process
        pe=0;
        pec=0;
        pv=0;
        pg=0;
        ppf=0;
        pnv=0;
        pc=0;
        pp=0;
        ps=0;
        
        if(edad>=18 && edad<=25){
            pe=1;
        }else if(edad>=26 && edad <=25){
            pe=2;
        }else if(edad>=36 && edad <=45){
            pe=3;
        }else if(edad>=46 && edad <=60){
            pe=4;
        }
        
        if(ecivil==1){
            pec=1;
        }else if(ecivil==2){
            pec=4;
        }else if(ecivil==3){
            pec=3;
        }else if(ecivil==4){
            pec=2;
        }
        
        if(tvivienda==1){
            pv=1;
        }else if(tvivienda==2){
            pv=2;
        }else if(tvivienda==3){
            pv=3;
        }else if(tvivienda==4){
            pv=4;
        }
        
        if(nivelinst==1){
            pnv=1;
        }else if(nivelinst==2){
            pnv=2;
        }else if(nivelinst==3){
            pnv=3;
        }
        
        if(cargo==1){
            pc=1;
        }else if(cargo==2){
            pc=2;
        }else if(cargo==3){
            pc=3;
        }else if(cargo==4){
            pc=4;
        }
        
        if(sueldo>=1025 && sueldo>=2500){
            ps=1;
        }else if(sueldo>=2501 && sueldo>=4000){
            ps=2;
        }else if(sueldo>=4001 && sueldo>=8000){
            ps=3;
        }else if(sueldo>=8001 && sueldo>=10000){
            ps=4;
        }
        
        if(rbp1.isSelected()==true){
            pp=1;
        }else if(rbp2.isSelected()==true){
            pp=2;
        }
        
        if(rbpf1.isSelected()==true){
            ppf=2;
        }else if(rbpf2.isSelected()==true){
            ppf=1;
        }
        
        if(ckg1.isSelected()){
            pg=1;
        }
        if(ckg2.isSelected()){
            pg=pg+1;
        }
        if(ckg3.isSelected()){
            pg=pg+1;
        }
        
        puntaje=pe+pec+pv+pnv+pc+pp+ppf+pg+ps;
        
        if(puntaje>=20){
            resultado="Cliente apto";
        }else{
            resultado="Cliente no apto";
        }
        this.resultado.setText(resultado);
        
        
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
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cbocargo;
    private javax.swing.JComboBox<String> cbodistrtito;
    private javax.swing.JComboBox<String> cboestadocivil;
    private javax.swing.JComboBox<String> cbonivel;
    private javax.swing.JComboBox<String> cbovivienda;
    private javax.swing.JCheckBox ckg1;
    private javax.swing.JCheckBox ckg2;
    private javax.swing.JCheckBox ckg3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rbg1;
    private javax.swing.JRadioButton rbg2;
    private javax.swing.JRadioButton rbp1;
    private javax.swing.JRadioButton rbp2;
    private javax.swing.JRadioButton rbpf1;
    private javax.swing.JRadioButton rbpf2;
    private javax.swing.JLabel resultado;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtsueldo;
    // End of variables declaration//GEN-END:variables
}
