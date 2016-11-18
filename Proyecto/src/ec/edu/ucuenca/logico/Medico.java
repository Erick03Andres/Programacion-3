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
public class Medico extends Persona
{
    private Especialidad especialidad;
    private int codigo;

    public Medico() 
    {
        super();
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Medico{" + "especialidad=" + especialidad + ", codigo=" + codigo + '}';
    }
}
