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
public class Consultorio 
{
    private int numero;
    private String telefono;
    private Especialidad especialidad;

    public Consultorio() 
    {
        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() 
    {
        return "Consultorio{" + "numero=" + numero + ", telefono=" + telefono + ", especialidad=" + especialidad + '}';
    }
}