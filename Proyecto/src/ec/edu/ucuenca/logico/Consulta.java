/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ucuenca.logico;

/**
 *
 * @author EQUIPO
 */
public class Consulta 
{
    private int id;
    private String diagnostico;
    private Medicina idMedicina;
    private Cita idCita;
    private Consultorio consultorio;

    public Consulta() 
    {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Medicina getIdMedicina() {
        return idMedicina;
    }

    public void setIdMedicina(Medicina idMedicina) {
        this.idMedicina = idMedicina;
    }

    public Cita getIdCita() {
        return idCita;
    }

    public void setIdCita(Cita idCita) {
        this.idCita = idCita;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }
}