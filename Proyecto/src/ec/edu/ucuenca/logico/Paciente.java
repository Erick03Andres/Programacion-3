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
public class Paciente extends Persona
{
    
    private int codigo;
    private String alergias;

    public Paciente() 
    {
        super();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    @Override
    public String toString() {
        return "Paciente{" + "codigo=" + codigo + ", alergias=" + alergias + '}';
    }
}
