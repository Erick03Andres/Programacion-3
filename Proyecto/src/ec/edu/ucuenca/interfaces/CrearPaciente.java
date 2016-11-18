/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ucuenca.interfaces;

import ec.edu.ucuenca.logico.Paciente;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class CrearPaciente extends javax.swing.JInternalFrame 
{
    private Principal principal;
    
    public CrearPaciente(Principal p) 
    {
        initComponents();
        
        principal=p;
        
        int codigo=principal.getControladorPersona().generarCodigoPaciente();
        txtCodigo.setText(String.valueOf(codigo));
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

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblAlergias = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxtAlergias = new javax.swing.JTextArea();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        rbtSi = new javax.swing.JRadioButton();
        rbtNo = new javax.swing.JRadioButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11))); // NOI18N

        lblNombre.setText("Nombre:");

        lblApellido.setText("Apellido:");

        lblDireccion.setText("Direccion:");

        lblCedula.setText("Cedula:");

        lblTelefono.setText("Telefono:");

        lblCodigo.setText("Codigo:");

        lblAlergias.setText("Alergias:");

        txtCodigo.setEditable(false);

        atxtAlergias.setEditable(false);
        atxtAlergias.setColumns(20);
        atxtAlergias.setRows(5);
        jScrollPane1.setViewportView(atxtAlergias);

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

        buttonGroup2.add(rbtSi);
        rbtSi.setText("Si");
        rbtSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtSiActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbtNo);
        rbtNo.setSelected(true);
        rbtNo.setText("No");
        rbtNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblApellido)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtApellido))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblTelefono)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTelefono)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(rbtSi)
                                                .addGap(18, 18, 18)
                                                .addComponent(rbtNo)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNombre)
                                            .addComponent(lblCedula))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombre))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblAlergias)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDireccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccion))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(lblCodigo)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlergias)
                    .addComponent(rbtSi)
                    .addComponent(rbtNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtApellido.setText("");
        txtCedula.setText("");
        txtDireccion.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        atxtAlergias.setText("");
        
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        Paciente paciente=new Paciente();
        
        paciente.setAlergias(atxtAlergias.getText());
        paciente.setApellido(txtApellido.getText());
        paciente.setCedula(txtCedula.getText());
        paciente.setCodigo(Integer.parseInt(txtCodigo.getText()));
        paciente.setDireccion(txtDireccion.getText());
        paciente.setNombre(txtNombre.getText());
        paciente.setTelefono(txtTelefono.getText());
        
        if(rbtSi.isSelected())
        {
            paciente.setAlergias(rbtSi.getText());
        }
        else
        {
            paciente.setAlergias("No");
        }
        
        int codigo=paciente.getCodigo()+1;
        
        txtCodigo.setText(String.valueOf(codigo));
        principal.getControladorPersona().crearPaciente(paciente);
        
        
        
        JOptionPane.showMessageDialog(rootPane, "Paciente Creado");
        
        try {
            ejemplo(paciente);
        } catch (IOException ex) {
            Logger.getLogger(CrearPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        txtApellido.setText("");
        txtCedula.setText("");
        txtDireccion.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        atxtAlergias.setText("");
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void rbtSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtSiActionPerformed
        atxtAlergias.setEnabled(true);
        atxtAlergias.setEditable(true);
    }//GEN-LAST:event_rbtSiActionPerformed

    private void rbtNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNoActionPerformed
        atxtAlergias.setEnabled(false);
        atxtAlergias.setEditable(false);
    }//GEN-LAST:event_rbtNoActionPerformed

    public void ejemplo(Paciente p) throws IOException
    {
        
        try
        {
            File archivo = new File("C:\\Users\\EQUIPO\\Desktop\\Proyecto\\pacientesDB.txt");
            FileWriter aux;
            BufferedWriter bw;

            if (archivo.exists()) 
            {
                aux = new FileWriter(archivo, true);
                bw = new BufferedWriter(aux);
                
                bw.newLine();
                bw.write(p.getCodigo() + "|" + p.getNombre() + "|" + p.getApellido() + "|" + p.getCedula() + "|" + p.getDireccion() + "|" + p.getTelefono() + "|" + p.getAlergias());
                
            } 
            else 
            {
                aux = new FileWriter(archivo, true);
                bw = new BufferedWriter(aux);

                bw.write(p.getCodigo() + "|" + p.getNombre() + "|" + p.getApellido() + "|" + p.getCedula() + "|" + p.getDireccion() + "|" + p.getTelefono() + "|" + p.getAlergias());
            }
            bw.close();
            aux.close();
        }catch(Exception e){System.out.println(e);}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxtAlergias;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlergias;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JRadioButton rbtNo;
    private javax.swing.JRadioButton rbtSi;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
