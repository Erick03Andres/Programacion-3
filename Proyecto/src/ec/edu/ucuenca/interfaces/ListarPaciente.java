/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ucuenca.interfaces;

import ec.edu.ucuenca.logico.Paciente;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EQUIPO
 */
public class ListarPaciente extends javax.swing.JInternalFrame 
{
    
    private Principal principal;

    /**
     * Creates new form ListarPaciente
     */
    public ListarPaciente(Principal p) 
    {
        initComponents();
        
        principal=p;
    }
    
    public void mostrarDatos()
    {
        Map<Integer, Paciente>lista=principal.getControladorPersona().listarPaciente();
        
        Object[] columnas={"Codigo", "Nombre", "Apellido", "Direccion", "Telefono", "Cedula", "Alergias"};
        
        Object[][] datos=new Object[lista.size()][7];
        Iterator<Integer> it=lista.keySet().iterator();
        
        int cont=0;
        
        while(it.hasNext())
        {
            int codigo=it.next();
            
            Paciente p=lista.get(codigo);
            
            datos[cont][0]=String.valueOf(p.getCodigo());
            datos[cont][1]=p.getNombre();
            datos[cont][2]=p.getApellido();
            datos[cont][3]=p.getDireccion();
            datos[cont][4]=p.getTelefono();
            datos[cont][5]=p.getCedula();
            datos[cont][6]=p.getAlergias();
            
            cont++;
        }
        
        Modelo modelo=new Modelo(datos, columnas);
        modelo.setDataVector(datos, columnas);
        
        tblListarPaciente.setRowHeight(125);
        tblListarPaciente.setModel(modelo);
    }
    
    private class Modelo extends DefaultTableModel
    {
        public Modelo (Object[][] datos, Object [] columnas)
        {
            super(datos, columnas);
        }
        
        @Override
        public Class<?> getColumnClass(int columnIndex) 
        {
            Class<?> clazz = Object.class;
            Object aux = getValueAt(0, columnIndex);
            if (aux != null) 
            {
                clazz = aux.getClass();
            }

            return clazz;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListarPaciente = new javax.swing.JTable();
        btnAceptar = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pacientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11))); // NOI18N

        tblListarPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblListarPaciente);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(btnAceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListarPaciente;
    // End of variables declaration//GEN-END:variables
}
