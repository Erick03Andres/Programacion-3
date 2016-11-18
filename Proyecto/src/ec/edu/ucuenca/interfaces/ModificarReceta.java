/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ucuenca.interfaces;

import ec.edu.ucuenca.logico.Receta;
import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class ModificarReceta extends javax.swing.JInternalFrame 
{
    private Principal principal;

    /**
     * Creates new form ModificarReceta
     */
    public ModificarReceta(Principal p) 
    {
        initComponents();
        principal=p;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblDosis = new javax.swing.JLabel();
        lblCodPac = new javax.swing.JLabel();
        lblNombreP = new javax.swing.JLabel();
        lblApellidoP = new javax.swing.JLabel();
        lblAlergias = new javax.swing.JLabel();
        lblCodMed = new javax.swing.JLabel();
        lblNombreM = new javax.swing.JLabel();
        lblApellidoM = new javax.swing.JLabel();
        lblEspecialidad = new javax.swing.JLabel();
        lblCodMedicina = new javax.swing.JLabel();
        txtMedicina = new javax.swing.JTextField();
        txtNombreM = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        txtEspecialidad = new javax.swing.JTextField();
        txtAlergia = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        txtNombreP = new javax.swing.JTextField();
        txtDosis = new javax.swing.JTextField();
        txtCodigoReceta = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar Receta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11))); // NOI18N

        lblCodigo.setText("Codigo:");

        lblDosis.setText("Dosis:");

        lblCodPac.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        lblCodPac.setText("Paciente");

        lblNombreP.setText("Nombre:");

        lblApellidoP.setText("Apellido:");

        lblAlergias.setText("Alergias:");

        lblCodMed.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        lblCodMed.setText("Medico");

        lblNombreM.setText("Nombre:");

        lblApellidoM.setText("Apellido:");

        lblEspecialidad.setText("Especialidad:");

        lblCodMedicina.setText("Medicina:");

        txtNombreM.setEditable(false);

        txtApellidoM.setEditable(false);

        txtEspecialidad.setEditable(false);

        txtAlergia.setEditable(false);

        txtApellidoP.setEditable(false);

        txtNombreP.setEditable(false);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodPac)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNombreP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblApellidoP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAlergias)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblEspecialidad)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblApellidoM)
                                            .addGap(25, 25, 25)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblNombreM)
                                        .addGap(25, 25, 25)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblCodMed))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnBuscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCodMedicina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMedicina, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblDosis)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDosis, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(btnAceptar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigoReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodMedicina)
                    .addComponent(txtMedicina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDosis)
                    .addComponent(txtDosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCodPac)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreP)
                            .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellidoP)
                            .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAlergias)
                            .addComponent(txtAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCodMed)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreM)
                            .addComponent(txtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellidoM)
                            .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEspecialidad)
                            .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Receta r=new Receta();
        
        int codigo=Integer.parseInt(txtCodigoReceta.getText());
        
        r=principal.getControladorReceta().obtenerCodigoReceta(codigo);
        
        if(r.getIdReceta()==codigo)
        {
            txtAlergia.setText(r.getAlergia());
            txtApellidoM.setText(r.getMedicoA());
            txtApellidoP.setText(r.getPacienteA());
            txtDosis.setText(r.getDosis());
            txtEspecialidad.setText(r.getEspecialidad());
            txtMedicina.setText(r.getMedicina());
            txtNombreM.setText(r.getMedicoN());
            txtNombreP.setText(r.getPacienteN());
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        Receta re=new Receta();
        
        int codigo=Integer.parseInt(txtCodigoReceta.getText());
        
        re.setAlergia(txtAlergia.getText());
        re.setMedicina(txtMedicina.getText());
        re.setDosis(txtDosis.getText());
        re.setEspecialidad(txtEspecialidad.getText());
        re.setMedicoA(txtApellidoM.getText());
        re.setMedicoN(txtNombreM.getText());
        re.setPacienteA(txtApellidoM.getText());
        re.setPacienteN(txtNombreP.getText());
        
        principal.getControladorReceta().modificarReceta(re);
        
        JOptionPane.showMessageDialog(rootPane, "Receta Modificada");
        
        txtAlergia.setText("");
        txtApellidoM.setText("");
        txtApellidoP.setText("");
        txtDosis.setText("");
        txtEspecialidad.setText("");
        txtMedicina.setText("");
        txtNombreM.setText("");
        txtNombreP.setText("");
        txtCodigoReceta.setText(null);
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtAlergia.setText("");
        txtApellidoM.setText("");
        txtApellidoP.setText("");
        txtDosis.setText("");
        txtEspecialidad.setText("");
        txtMedicina.setText("");
        txtNombreM.setText("");
        txtNombreP.setText("");
        txtCodigoReceta.setText(null);
        
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAlergias;
    private javax.swing.JLabel lblApellidoM;
    private javax.swing.JLabel lblApellidoP;
    private javax.swing.JLabel lblCodMed;
    private javax.swing.JLabel lblCodMedicina;
    private javax.swing.JLabel lblCodPac;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDosis;
    private javax.swing.JLabel lblEspecialidad;
    private javax.swing.JLabel lblNombreM;
    private javax.swing.JLabel lblNombreP;
    private javax.swing.JTextField txtAlergia;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtCodigoReceta;
    private javax.swing.JTextField txtDosis;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtMedicina;
    private javax.swing.JTextField txtNombreM;
    private javax.swing.JTextField txtNombreP;
    // End of variables declaration//GEN-END:variables
}
