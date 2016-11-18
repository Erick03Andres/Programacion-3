/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ucuenca.interfaces;

import ec.edu.ucuenca.controladores.*;

/**
 *
 * @author EQUIPO
 */
public class Principal extends javax.swing.JFrame 
{
    private CrearPaciente crearPaciente;
    private ListarPaciente listarPaciente;
    private EliminarPaciente eliminarPaciente;
    private ModificarPaciente modificarPaciente;
    
    private CrearMedico crearMedico;
    private ListarMedico listarMedico;
    private EliminarMedico eliminarMedico;
    private ModificarMedico modificarMedico;
    
    private CrearMedicina crearMedicina;
    private ListarMedicina listarMedicina;
    private EliminarMedicina eliminarMedicina;
    private ModificarMedicina modificarMedicina;
    
    private CrearCita crearCita;
    private ListarCita listarCita;
    private EliminarCita eliminarCita;
    private ModificarCita modificarCita;
    
    private CrearReceta crearReceta;
    private ListarReceta listarReceta;
    private EliminarReceta eliminarReceta;
    private ModificarReceta modificarReceta;    
            
    
    private CrearConsultorio crearConsultorio;
    private ListarConsultorio listarConsultorio;
    private EliminarConsultorio eliminarConsultorio;
    private ModificarConsultorio modificarConsultorio;
    
    private ControladorPersona controladorPersona;
    private ControladorMedicina controladorMedicina; 
    private ControladorConsultorio controladorConsultorio;
    private ControladorCita controladorCita;
    private ControladorReceta controladorReceta;
    
    public Principal() 
    {
        initComponents();
        
        controladorPersona=new ControladorPersona();
        controladorMedicina=new ControladorMedicina();
        controladorConsultorio=new ControladorConsultorio();
        controladorCita=new ControladorCita();
        controladorReceta=new ControladorReceta();
        
        crearMedico=new CrearMedico(this);
        listarMedico=new ListarMedico(this);
        eliminarMedico=new EliminarMedico(this);
        modificarMedico=new ModificarMedico(this);
        
        crearPaciente=new CrearPaciente(this);
        listarPaciente=new ListarPaciente(this);
        eliminarPaciente=new EliminarPaciente(this);
        modificarPaciente=new ModificarPaciente(this);
        
        crearMedicina=new CrearMedicina(this);
        listarMedicina=new ListarMedicina(this);
        eliminarMedicina=new EliminarMedicina(this);
        modificarMedicina=new ModificarMedicina(this);
        
        crearCita=new CrearCita(this);
        listarCita=new ListarCita(this);
        eliminarCita=new EliminarCita(this);
        modificarCita=new ModificarCita(this);
        
        crearReceta=new CrearReceta(this);
        listarReceta=new ListarReceta(this);
        eliminarReceta=new EliminarReceta(this);
        modificarReceta=new ModificarReceta(this);
        
        crearConsultorio=new CrearConsultorio(this);
        listarConsultorio=new ListarConsultorio(this);
        eliminarConsultorio=new EliminarConsultorio(this);
        modificarConsultorio=new ModificarConsultorio(this);
    }

    public ControladorPersona getControladorPersona() {
        return controladorPersona;
    }

    public void setControladorPersona(ControladorPersona controladorPersona) {
        this.controladorPersona = controladorPersona;
    }

    public ControladorMedicina getControladorMedicina() {
        return controladorMedicina;
    }

    public void setControladorMedicina(ControladorMedicina controladorMedicina) {
        this.controladorMedicina = controladorMedicina;
    }

    public ControladorConsultorio getControladorConsultorio() {
        return controladorConsultorio;
    }

    public void setControladorConsultorio(ControladorConsultorio controladorConsultorio) {
        this.controladorConsultorio = controladorConsultorio;
    }

    public ControladorCita getControladorCita() {
        return controladorCita;
    }

    public void setControladorCita(ControladorCita controladorCita) {
        this.controladorCita = controladorCita;
    }

    public ControladorReceta getControladorReceta() {
        return controladorReceta;
    }

    public void setControladorReceta(ControladorReceta controladorReceta) {
        this.controladorReceta = controladorReceta;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        miCrearPaciente = new javax.swing.JMenuItem();
        miModificarPaciente = new javax.swing.JMenuItem();
        miEliminarPaciente = new javax.swing.JMenuItem();
        miListarPaciente = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        miCrearMedico = new javax.swing.JMenuItem();
        miModificarMedico = new javax.swing.JMenuItem();
        miEliminarMedico = new javax.swing.JMenuItem();
        miListarMedico = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        miCrearMedicina = new javax.swing.JMenuItem();
        miModificarMedicina = new javax.swing.JMenuItem();
        miEliminarMedicina = new javax.swing.JMenuItem();
        miListarMedicina = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        miCrearConsultorio = new javax.swing.JMenuItem();
        miModificarConsultorio = new javax.swing.JMenuItem();
        miEliminarConsultorio = new javax.swing.JMenuItem();
        miListarConsultorio = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        miCrearCita = new javax.swing.JMenuItem();
        miModificarCita = new javax.swing.JMenuItem();
        miEliminarCita = new javax.swing.JMenuItem();
        miListarCita = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        miCrearReceta = new javax.swing.JMenuItem();
        miModificarReceta = new javax.swing.JMenuItem();
        miEliminarReceta = new javax.swing.JMenuItem();
        miListarReceta = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Paciente");

        miCrearPaciente.setMnemonic('o');
        miCrearPaciente.setText("Crear");
        miCrearPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCrearPacienteActionPerformed(evt);
            }
        });
        fileMenu.add(miCrearPaciente);

        miModificarPaciente.setMnemonic('s');
        miModificarPaciente.setText("Modificar");
        miModificarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miModificarPacienteActionPerformed(evt);
            }
        });
        fileMenu.add(miModificarPaciente);

        miEliminarPaciente.setMnemonic('a');
        miEliminarPaciente.setText("Eliminar");
        miEliminarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEliminarPacienteActionPerformed(evt);
            }
        });
        fileMenu.add(miEliminarPaciente);

        miListarPaciente.setMnemonic('x');
        miListarPaciente.setText("Listar");
        miListarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarPacienteActionPerformed(evt);
            }
        });
        fileMenu.add(miListarPaciente);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Medico");

        miCrearMedico.setMnemonic('t');
        miCrearMedico.setText("Crear");
        miCrearMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCrearMedicoActionPerformed(evt);
            }
        });
        editMenu.add(miCrearMedico);

        miModificarMedico.setMnemonic('y');
        miModificarMedico.setText("Modificar");
        miModificarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miModificarMedicoActionPerformed(evt);
            }
        });
        editMenu.add(miModificarMedico);

        miEliminarMedico.setMnemonic('p');
        miEliminarMedico.setText("Eliminar");
        miEliminarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEliminarMedicoActionPerformed(evt);
            }
        });
        editMenu.add(miEliminarMedico);

        miListarMedico.setMnemonic('d');
        miListarMedico.setText("Listar");
        miListarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarMedicoActionPerformed(evt);
            }
        });
        editMenu.add(miListarMedico);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Medicina");

        miCrearMedicina.setMnemonic('c');
        miCrearMedicina.setText("Crear");
        miCrearMedicina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCrearMedicinaActionPerformed(evt);
            }
        });
        helpMenu.add(miCrearMedicina);

        miModificarMedicina.setMnemonic('a');
        miModificarMedicina.setText("Modificar");
        helpMenu.add(miModificarMedicina);

        miEliminarMedicina.setText("Eliminar");
        miEliminarMedicina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEliminarMedicinaActionPerformed(evt);
            }
        });
        helpMenu.add(miEliminarMedicina);

        miListarMedicina.setText("Listar");
        miListarMedicina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarMedicinaActionPerformed(evt);
            }
        });
        helpMenu.add(miListarMedicina);

        menuBar.add(helpMenu);

        jMenu3.setText("Consultorio");

        miCrearConsultorio.setText("Crear");
        miCrearConsultorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCrearConsultorioActionPerformed(evt);
            }
        });
        jMenu3.add(miCrearConsultorio);

        miModificarConsultorio.setText("Modificar");
        miModificarConsultorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miModificarConsultorioActionPerformed(evt);
            }
        });
        jMenu3.add(miModificarConsultorio);

        miEliminarConsultorio.setText("Eliminar");
        miEliminarConsultorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEliminarConsultorioActionPerformed(evt);
            }
        });
        jMenu3.add(miEliminarConsultorio);

        miListarConsultorio.setText("Listar");
        miListarConsultorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarConsultorioActionPerformed(evt);
            }
        });
        jMenu3.add(miListarConsultorio);

        menuBar.add(jMenu3);

        jMenu4.setText("Cita");

        miCrearCita.setText("Crear");
        miCrearCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCrearCitaActionPerformed(evt);
            }
        });
        jMenu4.add(miCrearCita);

        miModificarCita.setText("Modificar");
        miModificarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miModificarCitaActionPerformed(evt);
            }
        });
        jMenu4.add(miModificarCita);

        miEliminarCita.setText("Elimnar");
        miEliminarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEliminarCitaActionPerformed(evt);
            }
        });
        jMenu4.add(miEliminarCita);

        miListarCita.setText("Listar");
        miListarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarCitaActionPerformed(evt);
            }
        });
        jMenu4.add(miListarCita);

        menuBar.add(jMenu4);

        jMenu5.setText("Receta");

        miCrearReceta.setText("Crear ");
        miCrearReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCrearRecetaActionPerformed(evt);
            }
        });
        jMenu5.add(miCrearReceta);

        miModificarReceta.setText("Modificar");
        miModificarReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miModificarRecetaActionPerformed(evt);
            }
        });
        jMenu5.add(miModificarReceta);

        miEliminarReceta.setText("Eliminar");
        miEliminarReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEliminarRecetaActionPerformed(evt);
            }
        });
        jMenu5.add(miEliminarReceta);

        miListarReceta.setText("Listar ");
        miListarReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarRecetaActionPerformed(evt);
            }
        });
        jMenu5.add(miListarReceta);

        menuBar.add(jMenu5);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miListarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarPacienteActionPerformed
        listarPaciente.setVisible(true);
        listarPaciente.setPrincipal(this);
        listarPaciente.mostrarDatos();
        desktopPane.add(listarPaciente);
    }//GEN-LAST:event_miListarPacienteActionPerformed

    private void miCrearPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCrearPacienteActionPerformed
        crearPaciente.setVisible(true);
        crearPaciente.setPrincipal(this);
        desktopPane.add(crearPaciente);   
    }//GEN-LAST:event_miCrearPacienteActionPerformed

    private void miCrearMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCrearMedicoActionPerformed
        crearMedico.setVisible(true);
        crearMedico.setPrincipal(this);
        desktopPane.add(crearMedico);
        
    }//GEN-LAST:event_miCrearMedicoActionPerformed

    private void miEliminarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEliminarPacienteActionPerformed
        eliminarPaciente.setVisible(true);
        eliminarPaciente.setPrincipal(this);
        desktopPane.add(eliminarPaciente);
    }//GEN-LAST:event_miEliminarPacienteActionPerformed

    private void miModificarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miModificarPacienteActionPerformed
        modificarPaciente.setVisible(true);
        modificarPaciente.setPrincipal(this);
        desktopPane.add(modificarPaciente);
    }//GEN-LAST:event_miModificarPacienteActionPerformed

    private void miListarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarMedicoActionPerformed
        listarMedico.setVisible(true);
        listarMedico.setPrincipal(this);
        listarMedico.mostrarDatos();
        desktopPane.add(listarMedico);
    }//GEN-LAST:event_miListarMedicoActionPerformed

    private void miModificarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miModificarMedicoActionPerformed
        modificarMedico.setVisible(true);
        modificarMedico.setPrincipal(this);
        desktopPane.add(modificarMedico);
    }//GEN-LAST:event_miModificarMedicoActionPerformed

    private void miEliminarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEliminarMedicoActionPerformed
        eliminarMedico.setVisible(true);
        eliminarMedico.setPrincipal(this);
        desktopPane.add(eliminarMedico);
    }//GEN-LAST:event_miEliminarMedicoActionPerformed

    private void miCrearMedicinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCrearMedicinaActionPerformed
        crearMedicina.setVisible(true);
        crearMedicina.setPrincipal(this);
        desktopPane.add(crearMedicina);
    }//GEN-LAST:event_miCrearMedicinaActionPerformed

    private void miListarMedicinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarMedicinaActionPerformed
        listarMedicina.setVisible(true);
        listarMedicina.setPrincipal(this);
        listarMedicina.mostrarDatos();
        desktopPane.add(listarMedicina);
    }//GEN-LAST:event_miListarMedicinaActionPerformed

    private void miEliminarMedicinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEliminarMedicinaActionPerformed
        eliminarMedicina.setVisible(true);
        eliminarMedicina.setPrincipal(this);
        desktopPane.add(eliminarMedicina);
    }//GEN-LAST:event_miEliminarMedicinaActionPerformed

    private void miCrearConsultorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCrearConsultorioActionPerformed
        crearConsultorio.setVisible(true);
        crearConsultorio.setPrincipal(this);
        desktopPane.add(crearConsultorio);
    }//GEN-LAST:event_miCrearConsultorioActionPerformed

    private void miModificarConsultorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miModificarConsultorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miModificarConsultorioActionPerformed

    private void miEliminarConsultorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEliminarConsultorioActionPerformed
        eliminarConsultorio.setVisible(true);
        eliminarConsultorio.setPrincipal(this);
        desktopPane.add(eliminarConsultorio);
    }//GEN-LAST:event_miEliminarConsultorioActionPerformed

    private void miListarConsultorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarConsultorioActionPerformed
        listarConsultorio.setVisible(true);
        listarConsultorio.setPrincipal(this);
        listarConsultorio.mostrarDatos();
        desktopPane.add(listarConsultorio);
    }//GEN-LAST:event_miListarConsultorioActionPerformed

    private void miCrearCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCrearCitaActionPerformed
        crearCita.setVisible(true);
        crearCita.setPrincipal(this);
        desktopPane.add(crearCita);
    }//GEN-LAST:event_miCrearCitaActionPerformed

    private void miListarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarCitaActionPerformed
        listarCita.setVisible(true);
        listarCita.setPrincipal(this);
        listarCita.mostrarDatos();
        desktopPane.add(listarCita);
    }//GEN-LAST:event_miListarCitaActionPerformed

    private void miCrearRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCrearRecetaActionPerformed
        crearReceta.setVisible(true);
        crearReceta.setPrincipal(this);
        desktopPane.add(crearReceta);
    }//GEN-LAST:event_miCrearRecetaActionPerformed

    private void miModificarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miModificarCitaActionPerformed
        modificarCita.setVisible(true);
        modificarCita.setPrincipal(this);
        desktopPane.add(modificarCita);
    }//GEN-LAST:event_miModificarCitaActionPerformed

    private void miEliminarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEliminarCitaActionPerformed
        eliminarCita.setVisible(true);
        eliminarCita.setPrincipal(this);
        desktopPane.add(eliminarCita);
    }//GEN-LAST:event_miEliminarCitaActionPerformed

    private void miListarRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarRecetaActionPerformed
        listarCita.setVisible(true);
        listarCita.setPrincipal(this);
        listarCita.mostrarDatos();
        desktopPane.add(listarCita);
    }//GEN-LAST:event_miListarRecetaActionPerformed

    private void miEliminarRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEliminarRecetaActionPerformed
        eliminarReceta.setVisible(true);
        eliminarReceta.setPrincipal(this);
        desktopPane.add(eliminarReceta);
    }//GEN-LAST:event_miEliminarRecetaActionPerformed

    private void miModificarRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miModificarRecetaActionPerformed
        modificarReceta.setVisible(true);
        modificarReceta.setPrincipal(this);
        desktopPane.add(modificarReceta);
    }//GEN-LAST:event_miModificarRecetaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem miCrearCita;
    private javax.swing.JMenuItem miCrearConsultorio;
    private javax.swing.JMenuItem miCrearMedicina;
    private javax.swing.JMenuItem miCrearMedico;
    private javax.swing.JMenuItem miCrearPaciente;
    private javax.swing.JMenuItem miCrearReceta;
    private javax.swing.JMenuItem miEliminarCita;
    private javax.swing.JMenuItem miEliminarConsultorio;
    private javax.swing.JMenuItem miEliminarMedicina;
    private javax.swing.JMenuItem miEliminarMedico;
    private javax.swing.JMenuItem miEliminarPaciente;
    private javax.swing.JMenuItem miEliminarReceta;
    private javax.swing.JMenuItem miListarCita;
    private javax.swing.JMenuItem miListarConsultorio;
    private javax.swing.JMenuItem miListarMedicina;
    private javax.swing.JMenuItem miListarMedico;
    private javax.swing.JMenuItem miListarPaciente;
    private javax.swing.JMenuItem miListarReceta;
    private javax.swing.JMenuItem miModificarCita;
    private javax.swing.JMenuItem miModificarConsultorio;
    private javax.swing.JMenuItem miModificarMedicina;
    private javax.swing.JMenuItem miModificarMedico;
    private javax.swing.JMenuItem miModificarPaciente;
    private javax.swing.JMenuItem miModificarReceta;
    // End of variables declaration//GEN-END:variables

}
