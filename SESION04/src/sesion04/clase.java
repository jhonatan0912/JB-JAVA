package sesion04;

public class clase extends javax.swing.JFrame {

    public clase() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nota1 = new javax.swing.JTextField();
        nota2 = new javax.swing.JTextField();
        nota3 = new javax.swing.JTextField();
        calcular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cboalumno = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        estado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        promedio = new javax.swing.JTextField();
        menor = new javax.swing.JTextField();
        condicion = new javax.swing.JTextField();
        mayor = new javax.swing.JTextField();
        salir = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nota 1:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel2.setText("Nota 2:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel3.setText("Nota 3:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        nota1.setEnabled(false);
        getContentPane().add(nota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 110, -1));

        nota2.setEnabled(false);
        getContentPane().add(nota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 110, -1));

        nota3.setEnabled(false);
        getContentPane().add(nota3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 110, -1));

        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        getContentPane().add(calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("REGISTRO DE NOTAS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel5.setText("Alumnos:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 500, 10));

        cboalumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Juan", "Pedro", "Maria", "Rosa" }));
        cboalumno.setEnabled(false);
        cboalumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboalumnoActionPerformed(evt);
            }
        });
        getContentPane().add(cboalumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 110, -1));

        jLabel6.setText("Promedio");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        estado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        estado.setEnabled(false);
        getContentPane().add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 70, -1));

        jLabel7.setText("Condicion");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jLabel8.setText("Estado");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        jLabel9.setText("Mayor");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        jLabel11.setText("Menor");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        promedio.setColumns(1);
        promedio.setToolTipText("");
        promedio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        promedio.setEnabled(false);
        getContentPane().add(promedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 70, -1));

        menor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menor.setEnabled(false);
        getContentPane().add(menor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 70, -1));

        condicion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        condicion.setEnabled(false);
        getContentPane().add(condicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 70, -1));

        mayor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mayor.setEnabled(false);
        getContentPane().add(mayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 70, -1));

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        getContentPane().add(nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        // TODO add your handling code here:
        int mayor,menor;
        double promedio;
        String condicion,estado;
        
        promedio=(Integer.parseInt(nota1.getText())+Integer.parseInt(nota2.getText())+Integer.parseInt(nota3.getText()))/3;
        
        if(promedio>=10.5){
            condicion="Aprobado";
        }else{
            condicion="Desaprobado";
        }
        
        if(promedio<=5){
            estado="Pésimo";
        }else if (promedio<=10) {
            estado="Malo";
        }else if (promedio<=15) {
            estado="Regular";
        }else if (promedio<=18) {
            estado="Bueno";
        }else{
            estado="Excelente";
        }

        mayor=Integer.parseInt(nota1.getText());
        if(Integer.parseInt(nota2.getText())>mayor){
            mayor=Integer.parseInt(nota2.getText());
        }
        if(Integer.parseInt(nota3.getText())>mayor){
            mayor=Integer.parseInt(nota3.getText());
        }
        
        menor=Integer.parseInt(nota1.getText());
        if(Integer.parseInt(nota2.getText())<menor){
            menor=Integer.parseInt(nota2.getText());
        }
        if(Integer.parseInt(nota3.getText())<menor){
            menor=Integer.parseInt(nota3.getText());
        }
        
        
        this.promedio.setText((String.valueOf(promedio)));
        this.condicion.setText(condicion);
        this.estado.setText(estado);
        this.mayor.setText(String.valueOf(mayor));
        this.menor.setText(String.valueOf(menor));
        
    }//GEN-LAST:event_calcularActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:     
        System.exit(0);              
    }//GEN-LAST:event_salirActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        // TODO add your handling code here:
        cboalumno.setEnabled(true);
        nota1.setEnabled(true);
        nota2.setEnabled(true);
        nota3.setEnabled(true);
        nota1.setText("");
        nota2.setText("");
        nota3.setText("");
        promedio.setText("");
        condicion.setText("");
        estado.setText("");
        mayor.setText("");
        menor.setText("");
        cboalumno.setSelectedIndex(0);
        
        // requestFocus() -> nos lleva al input de nota 1
        nota1.requestFocus();
    }//GEN-LAST:event_nuevoActionPerformed

    private void cboalumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboalumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboalumnoActionPerformed

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
            java.util.logging.Logger.getLogger(clase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular;
    private javax.swing.JComboBox<String> cboalumno;
    private javax.swing.JTextField condicion;
    private javax.swing.JTextField estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField mayor;
    private javax.swing.JTextField menor;
    private javax.swing.JTextField nota1;
    private javax.swing.JTextField nota2;
    private javax.swing.JTextField nota3;
    private javax.swing.JButton nuevo;
    private javax.swing.JTextField promedio;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
