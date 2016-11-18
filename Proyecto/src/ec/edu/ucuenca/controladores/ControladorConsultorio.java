/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ucuenca.controladores;

import ec.edu.ucuenca.logico.Consultorio;
import java.util.*;

/**
 *
 * @author EQUIPO
 */
public class ControladorConsultorio 
{
    public static int codigoConsultorio;
    private Map<Integer, Consultorio> listaConsultorio;

    public ControladorConsultorio() 
    {
        codigoConsultorio=0;
        listaConsultorio=new TreeMap<>();
    }
    
    public void crearConsultorio(Consultorio consultorio)
    {
        listaConsultorio.put(consultorio.getNumero(), consultorio);
    }
    
    public void actualizarConsultorio(Consultorio consultorio)
    {
        listaConsultorio.put(consultorio.getNumero(), consultorio);
    }
    
    public void eliminarConsultorio(int codigo)
    {
        listaConsultorio.remove(codigo);
    }
    
    public Map<Integer, Consultorio> listarConsultorio()
    {
        return listaConsultorio;
    }
    
    public int generarCodigoConsultorio()
    {
        return codigoConsultorio=codigoConsultorio+1;
    }
    
    public Consultorio obtenerCodigo(int codigo)
    {
        Consultorio c=new Consultorio();
        
        if(listaConsultorio.containsKey(codigo))
        {
            c=listaConsultorio.get(codigo);
            return c;
        }
        
        return c;
    }
}
 