/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ucuenca.interfaces;

import ec.edu.ucuenca.logico.Paciente;
import ec.edu.ucuenca.logico.Medicina;
import ec.edu.ucuenca.logico.Medico;
import ec.edu.ucuenca.logico.Receta;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class CrearReceta extends javax.swing.JInternalFrame 
{
    private Principal principal;
            
    public CrearReceta(Principal p) 
    {
        initComponents();
        principal=p;
        
        int codigo=principal.getControladorReceta().generarCodigoReceta();
        txtCodigoReceta.setText(String.valueOf(codigo));
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
        lblCodPac = new javax.swing.JLabel();
        lblNombreP = new javax.swing.JLabel();
        lblApellidoP = new javax.swing.JLabel();
        txtCodigoP = new javax.swing.JTextField();
        txtCodigoReceta = new javax.swing.JTextField();
        txtNombreP = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        btnBuscarP = new javax.swing.JButton();
        lblCodMed = new javax.swing.JLabel();
        lblNombreM = new javax.swing.JLabel();
        lblAlergias = new javax.swing.JLabel();
        lblApellidoM = new javax.swing.JLabel();
        lblEspecialidad = new javax.swing.JLabel();
        txtAlergia = new javax.swing.JTextField();
        txtCodigoM = new javax.swing.JTextField();
        btnBuscarM = new javax.swing.JButton();
        txtNombreM = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        txtEspecialidad = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblCodMedicina = new javax.swing.JLabel();
        txtCodMedicina = new javax.swing.JTextField();
        btnBuscarMed = new javax.swing.JButton();
        lblDosis = new javax.swing.JLabel();
        txtDosis = new javax.swing.JTextField();
        lblMl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDescripcion = new javax.swing.JTextArea();
        txtMedicina = new javax.swing.JTextField();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear Receta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11))); // NOI18N

        lblCodigo.setText("Codigo:");

        lblCodPac.setText("Codigo Paciente:");

        lblNombreP.setText("Nombre:");

        lblApellidoP.setText("Apellido:");

        txtCodigoReceta.setEditable(false);

        txtNombreP.setEditable(false);

        txtApellidoP.setEditable(false);

        btnBuscarP.setText("Buscar");
        btnBuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPActionPerformed(evt);
            }
        });

        lblCodMed.setText("Codigo Medico:");

        lblNombreM.setText("Nombre:");

        lblAlergias.setText("Alergias:");

        lblApellidoM.setText("Apellido:");

        lblEspecialidad.setText("Especialidad:");

        txtAlergia.setEditable(false);

        btnBuscarM.setText("Buscar");
        btnBuscarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMActionPerformed(evt);
            }
        });

        txtNombreM.setEditable(false);

        txtApellidoM.setEditable(false);

        txtEspecialidad.setEditable(false);

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

        lblCodMedicina.setText("Codigo Medicina:");

        btnBuscarMed.setText("Buscar");
        btnBuscarMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMedActionPerformed(evt);
            }
        });

        lblDosis.setText("Dosis:");

        lblMl.setText("ml");

        txtaDescripcion.setEditable(false);
        txtaDescripcion.setColumns(20);
        txtaDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtaDescripcion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCodPac)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarP))
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
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblNombreM)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                    .addComponent(txtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblApellidoM)
                                        .addGap(30, 30, 30)
                                        .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblEspecialidad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCodMed)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodigoM, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarM))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(lblCodMedicina))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDosis)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDosis, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMl)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodMedicina, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarMed))
                            .addComponent(txtMedicina))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(btnAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCodigo)
                                .addComponent(txtCodigoReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCodMedicina)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCodMedicina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscarMed)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDosis)
                                    .addComponent(txtDosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMl)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMedicina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodPac)
                    .addComponent(txtCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarP)
                    .addComponent(lblCodMed)
                    .addComponent(txtCodigoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarM))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreM)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNombreP)
                        .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoP)
                    .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellidoM)
                    .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlergias)
                    .addComponent(txtAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEspecialidad)
                    .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(19, Short.MAX_VALUE))
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

    private void btnBuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPActionPerformed
        Paciente p=new Paciente();
        
        int codigoP=Integer.parseInt(txtCodigoP.getText());
        p=principal.getControladorPersona().obtenerCodigoPaciente(codigoP);
        txtAlergia.setText("."+p.getAlergias());
        txtApellidoP.setText("."+p.getApellido());
        txtNombreP.setText("."+p.getNombre());
    }//GEN-LAST:event_btnBuscarPActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        Receta r=new Receta();
        
        r.setAlergia(txtAlergia.getText());
        r.setDescripcion(txtaDescripcion.getText());
        r.setDosis(txtDosis.getText());
        r.setEspecialidad(txtEspecialidad.getText());
        r.setIdReceta(Integer.parseInt(txtCodigoReceta.getText()));
        r.setMedicina(txtMedicina.getText());
        r.setMedicoA(txtApellidoM.getText());
        r.setMedicoN(txtNombreM.getText());
        r.setPacienteA(txtApellidoP.getText());
        r.setPacienteN(txtNombreP.getText());
        
        principal.getControladorReceta().crearReceta(r);
        
        
        
        JOptionPane.showMessageDialog(rootPane, "Receta Creada");
        
        try {
            ejemplo(r);
        } catch (IOException ex) {
            Logger.getLogger(CrearReceta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int codigo=r.getIdReceta()+1;
        
        txtCodigoReceta.setText(String.valueOf(codigo));
        txtAlergia.setText("");
        txtApellidoM.setText("");
        txtApellidoP.setText("");
        txtCodMedicina.setText("");
        txtCodigoM.setText("");
        txtCodigoP.setText("");
        txtDosis.setText("");
        txtEspecialidad.setText("");
        txtNombreM.setText("");
        txtNombreP.setText("");
        txtaDescripcion.setText("");
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtAlergia.setText("");
        txtApellidoM.setText("");
        txtApellidoP.setText("");
        txtCodMedicina.setText("");
        txtCodigoM.setText("");
        txtCodigoP.setText("");
        txtDosis.setText("");
        txtEspecialidad.setText("");
        txtNombreM.setText("");
        txtNombreP.setText("");
        txtaDescripcion.setText("");
        
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMActionPerformed
        Medico m=new Medico();
        
        int codigoM=Integer.parseInt(txtCodigoM.getText());
        
        m=principal.getControladorPersona().obtenerCodigoMedico(codigoM);
        txtApellidoM.setText(m.getApellido());
        txtEspecialidad.setText(String.valueOf(m.getEspecialidad()));
        txtNombreM.setText(m.getNombre());
    }//GEN-LAST:event_btnBuscarMActionPerformed

    private void btnBuscarMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMedActionPerformed
        Medicina med=new Medicina();
        
        int codigoMed=Integer.parseInt(txtCodMedicina.getText());
        
        med=principal.getControladorMedicina().obtenerCodigo(codigoMed);
        txtaDescripcion.setText(med.getDescripcion());
        txtMedicina.setText(med.getNombre());
        
    }//GEN-LAST:event_btnBuscarMedActionPerformed

    public void ejemplo(Receta r) throws IOException
    {
        
        try
        {
            File archivo = new File("C:\\Users\\EQUIPO\\Desktop\\Proyecto\\recetasDB.txt");
            FileWriter aux;
            BufferedWriter bw;

            if (archivo.exists()) 
            {
                aux = new FileWriter(archivo, true);
                bw = new BufferedWriter(aux);
                
                bw.newLine();
                bw.write(r.getIdReceta() + "|" + r.getMedicina() + "|" + r.getDescripcion() + "|" + r.getPacienteN() + "|" + r.getPacienteA());
                
            } 
            else 
            {
                aux = new FileWriter(archivo, true);
                bw = new BufferedWriter(aux);

                bw.write(r.getIdReceta() + "|" + r.getMedicina() + "|" + r.getDescripcion() + "|" + r.getPacienteN() + "|" + r.getPacienteA());
            }
            bw.close();
            aux.close();
        }catch(Exception e){System.out.println(e);}
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscarM;
    private javax.swing.JButton btnBuscarMed;
    private javax.swing.JButton btnBuscarP;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlergias;
    private javax.swing.JLabel lblApellidoM;
    private javax.swing.JLabel lblApellidoP;
    private javax.swing.JLabel lblCodMed;
    private javax.swing.JLabel lblCodMedicina;
    private javax.swing.JLabel lblCodPac;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDosis;
    private javax.swing.JLabel lblEspecialidad;
    private javax.swing.JLabel lblMl;
    private javax.swing.JLabel lblNombreM;
    private javax.swing.JLabel lblNombreP;
    private javax.swing.JTextField txtAlergia;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtCodMedicina;
    private javax.swing.JTextField txtCodigoM;
    private javax.swing.JTextField txtCodigoP;
    private javax.swing.JTextField txtCodigoReceta;
    private javax.swing.JTextField txtDosis;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtMedicina;
    private javax.swing.JTextField txtNombreM;
    private javax.swing.JTextField txtNombreP;
    private javax.swing.JTextArea txtaDescripcion;
    // End of variables declaration//GEN-END:variables
}
