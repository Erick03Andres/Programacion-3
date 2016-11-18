/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ucuenca.interfaces;

import ec.edu.ucuenca.logico.Receta;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EQUIPO
 */
public class ListarReceta extends javax.swing.JInternalFrame 
{
    private Principal principal;
    
    public ListarReceta(Principal p) 
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
    
    public void mostrarDatos()
    {
        Map<Integer, Receta>lista=principal.getControladorReceta().listarReceta();
        
        Object[] columnas={"Codigo", "Medicina", "Dosis", "Nombre Paciente", "Apellido Paciente", "Nombre Medico", "Apellido Medico", "Especialidad"};
        Object[][] datos=new Object[lista.size()][8];
        Iterator<Integer>it=lista.keySet().iterator();
        
        int cont=0;
        
        while(it.hasNext())
        {
            int codigo=it.next();
            
            Receta r=lista.get(codigo);
            
            datos[cont][0]=String.valueOf(r.getIdReceta());
            datos[cont][1]=r.getMedicina();
            datos[cont][2]=r.getDosis();
            datos[cont][3]=r.getPacienteN();
            datos[cont][4]=r.getPacienteA();
            datos[cont][5]=r.getMedicoN();
            datos[cont][6]=r.getMedicoA();
            datos[cont][7]=r.getEspecialidad();
            
            cont++;
        }
        
        Modelo modelo=new Modelo(datos, columnas);
        modelo.setDataVector(datos, columnas);
        
        tblLista.setRowHeight(125);
        tblLista.setModel(modelo);
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLista = new javax.swing.JTable();
        btnAceptar = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista Recetas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11))); // NOI18N

        tblLista.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblLista);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(btnAceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btnAceptar)
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

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLista;
    // End of variables declaration//GEN-END:variables
}
