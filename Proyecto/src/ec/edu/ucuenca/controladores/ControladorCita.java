/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ucuenca.controladores;

import ec.edu.ucuenca.logico.Cita;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author EQUIPO
 */
public class ControladorCita 
{
    public static int codigoCita;
    private Map<Integer, Cita> listaCita;

    public ControladorCita() 
    {
        codigoCita=0;
        listaCita=new TreeMap<>();
    }
    
    public void crearCita(Cita cita)
    {
        listaCita.put(cita.getCodigo(), cita);
    }
    
    public void modificarCita(Cita cita)
    {
        listaCita.put(cita.getCodigo(), cita);
    }
    
    public void eliminarCita(int codigo)
    {
        listaCita.remove(codigo);
    }
    
    public Map<Integer, Cita> listarCita()
    {
        return listaCita;
    }
    
    public int generaroCodigoCita()
    {
        return  codigoCita=codigoCita+1;
    }
    
    public Cita obtenerCodigo(int codigo)
    {
        Cita c=new Cita();
        if(listaCita.containsKey(codigo))
        {
            c=listaCita.get(codigo);
            return c;
        }
        return c;
    }
}