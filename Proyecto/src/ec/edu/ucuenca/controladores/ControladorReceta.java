/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ucuenca.controladores;

import ec.edu.ucuenca.logico.Receta;
import java.util.*;


/**
 *
 * @author EQUIPO
 */
public class ControladorReceta 
{
    public static int codigoReceta;
    private Map<Integer, Receta>lista;

    public ControladorReceta() 
    {
        codigoReceta=0;
        lista=new TreeMap<>();  
    }
    
    public void crearReceta(Receta receta)    
    {
        lista.put(receta.getIdReceta(), receta);
    }
    
    public void modificarReceta(Receta receta)
    {
        lista.put(receta.getIdReceta(), receta);
    }
    
    public void eliminarReceta(int codigo)
    {
        lista.remove(codigo);
    }
    
    public Map<Integer, Receta> listarReceta()
    {
        return lista;
    }
    
    public int generarCodigoReceta()
    {
        return codigoReceta=codigoReceta+1;
    }
    
    public Receta obtenerCodigoReceta(int codigo)
    {
        Receta r=new Receta();
        
        if(lista.containsKey(codigo))
        {
            r=lista.get(codigo);
            return r;
        }
        return r;
    }
}
