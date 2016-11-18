/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ucuenca.interfaces;

import ec.edu.ucuenca.logico.Cita;
import ec.edu.ucuenca.logico.Consultorio;
import ec.edu.ucuenca.logico.Especialidad;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class CrearConsultorio extends javax.swing.JInternalFrame 
{
    private Principal principal;

    /**
     * Creates new form CrearConsultorio
     */
    public CrearConsultorio(Principal p) 
    {
        initComponents();
        principal=p;
        
        int codigo=principal.getControladorConsultorio().generarCodigoConsultorio();
        txtNumConsultorio.setText(String.valueOf(codigo));
        
        Especialidad[] espe=Especialidad.values();
        
        for(Especialidad especialidad: espe)
        {
            cmbEspecialidad.addItem(String.valueOf(especialidad));
        }
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
        lblNumConsultorio = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblEspecialidad = new javax.swing.JLabel();
        txtNumConsultorio = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmbEspecialidad = new javax.swing.JComboBox<>();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear Consultorio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11))); // NOI18N

        lblNumConsultorio.setText("Numero Consultorio:");

        lblTelefono.setText("Telefono:");

        lblEspecialidad.setText("Especialidad:");

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

        cmbEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNumConsultorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTelefono))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEspecialidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEspecialidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefono)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumConsultorio)
                    .addComponent(lblTelefono)
                    .addComponent(txtNumConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEspecialidad)
                    .addComponent(cmbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        Consultorio c=new Consultorio();
        
        c.setNumero(Integer.parseInt(txtNumConsultorio.getText()));
        c.setTelefono(txtTelefono.getText());
        if(cmbEspecialidad.getSelectedItem()=="MEDICINA_GENERAL")
        {
            c.setEspecialidad(Especialidad.MEDICINA_GENERAL);
        }
        else if(cmbEspecialidad.getSelectedItem()=="ODONTOLOGIA")
        {
            c.setEspecialidad(Especialidad.ODONTOLOGIA);
        }
        else if(cmbEspecialidad.getSelectedItem()=="PEDIATRIA")
        {
            c.setEspecialidad(Especialidad.PEDIATRIA);
        }
        else if(cmbEspecialidad.getSelectedItem()=="GINECOLOGIA")
        {
            c.setEspecialidad(Especialidad.GINECOLOGIA);
        }
        principal.getControladorConsultorio().crearConsultorio(c);
        
        
        
        JOptionPane.showMessageDialog(rootPane, "Consultorio Creado");
        
        try {
            ejemplo(c);
        } catch (IOException ex) {
            Logger.getLogger(CrearConsultorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int codigo=c.getNumero()+1;
        
        txtNumConsultorio.setText(String.valueOf(codigo));
        txtTelefono.setText(null);
        cmbEspecialidad.setSelectedIndex(0);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtTelefono.setText("");
        cmbEspecialidad.setSelectedIndex(0);
        
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void ejemplo(Consultorio c) throws IOException
    {
        
        try
        {
            File archivo = new File("C:\\Users\\EQUIPO\\Desktop\\Proyecto\\consultoriosDB.txt");
            FileWriter aux;
            BufferedWriter bw;

            if (archivo.exists()) 
            {
                aux = new FileWriter(archivo, true);
                bw = new BufferedWriter(aux);
                
                bw.newLine();
                bw.write(c.getNumero() + "|" + c.getEspecialidad() + "|" + c.getTelefono());
                
            } 
            else 
            {
                aux = new FileWriter(archivo, true);
                bw = new BufferedWriter(aux);

                bw.write(c.getNumero() + "|" + c.getEspecialidad() + "|" + c.getTelefono());
            }
            bw.close();
            aux.close();
        }catch(Exception e){System.out.println(e);}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbEspecialidad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEspecialidad;
    private javax.swing.JLabel lblNumConsultorio;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtNumConsultorio;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
