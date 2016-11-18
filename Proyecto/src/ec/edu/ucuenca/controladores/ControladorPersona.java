/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ucuenca.controladores;

import ec.edu.ucuenca.logico.Paciente;
import ec.edu.ucuenca.logico.Medico;
import java.util.*;

/**
 *
 * @author EQUIPO
 */
public class ControladorPersona 
{
    public static int codigoPaciente;
    public static int codigoMedico;
    
    private Map<Integer, Paciente> listaPaciente;
    private Map<Integer, Medico> listaMedico;

    public ControladorPersona() 
    {
        listaPaciente=new TreeMap<>();
        listaMedico=new TreeMap<>();
        
        codigoMedico=100;
        codigoPaciente=0;
    }
/*----------------------------------------------------------------------------*/
    public void crearPaciente(Paciente paciente)
    {
        listaPaciente.put(paciente.getCodigo(), paciente);
    }
    
    public void crearMedico(Medico medico)
    {
        listaMedico.put(medico.getCodigo(), medico);
    }
/*----------------------------------------------------------------------------*/
    public void modificarPaciente(Paciente paciente)
    {
        listaPaciente.put(paciente.getCodigo(), paciente);
    }
    
    public void modificarMedico(Medico medico)
    {
        listaMedico.put(medico.getCodigo(), medico);
    }
/*----------------------------------------------------------------------------*/
    public void eliminarPaciente(int codigo)
    {
        listaPaciente.remove(codigo);
    }
    
    public void eliminarMedico(int codigo)
    {
        listaMedico.remove(codigo);
    }
/*----------------------------------------------------------------------------*/
    public Map<Integer, Paciente> listarPaciente()
    {
        return listaPaciente;   
    }
    
    public Map<Integer, Medico> listarMedico()
    {
        return listaMedico;
    }
/*----------------------------------------------------------------------------*/
    public int generarCodigoPaciente()
    {
        return codigoPaciente=codigoPaciente+1;
    }
    
    public int generarCodigoMedico()
    {
        return codigoMedico=codigoMedico+1;
    }
/*----------------------------------------------------------------------------*/
    public Paciente obtenerCodigoPaciente(int codigo)
    {
        Paciente p=new Paciente();
        
        if(listarPaciente().containsKey(codigo))
        {
            p=listaPaciente.get(codigo);
            return p;
        }
        return p;
    }
    
    public Medico obtenerCodigoMedico(int codigo)
    {
        Medico m=new Medico();
        
            if(listaMedico.containsKey(codigo))
        {
            m=listaMedico.get(codigo);
            return m;
        }
        return m;
    }
/*----------------------------------------------------------------------------*/
    
}