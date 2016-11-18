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
public class Receta 
{
    private String pacienteN, pacienteA, alergia;
    private String medicina, descripcion;
    private String medicoN, medicoA, especialidad;
    private String dosis;
    private int idReceta;

    public Receta() 
    {
        
    }

    public String getPacienteN() {
        return pacienteN;
    }

    public void setPacienteN(String pacienteN) {
        this.pacienteN = pacienteN;
    }

    public String getPacienteA() {
        return pacienteA;
    }

    public void setPacienteA(String pacienteA) {
        this.pacienteA = pacienteA;
    }

    public String getMedicina() {
        return medicina;
    }

    public void setMedicina(String medicina) {
        this.medicina = medicina;
    }

    public String getMedicoN() {
        return medicoN;
    }

    public void setMedicoN(String medicoN) {
        this.medicoN = medicoN;
    }

    public String getMedicoA() {
        return medicoA;
    }

    public void setMedicoA(String medicoA) {
        this.medicoA = medicoA;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }   
}