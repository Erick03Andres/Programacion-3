/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ucuenca.controladores;

import ec.edu.ucuenca.logico.Medicina;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author EQUIPO
 */
public class ControladorMedicina 
{
    public static int codigoMedicina;
    private Map<Integer, Medicina> listaMedicina;

    public ControladorMedicina() 
    {
        codigoMedicina=0;
        listaMedicina=new TreeMap<>();
    }
    
    public void crearMedicina(Medicina medicina)
    {
        listaMedicina.put(medicina.getId(), medicina);
    }
    
    public void modificarMedicina(Medicina medicina)
    {
        listaMedicina.put(medicina.getId(), medicina);
    }
    
    public void eliminarMedicina(int codigo)
    {
        listaMedicina.remove(codigo);
    }
    
    public Map<Integer, Medicina> listarMedicina()
    {
        return listaMedicina;
    }
    
    public int generarCodigo()
    {
        return codigoMedicina=codigoMedicina+1;
    }
    
    public Medicina obtenerCodigo(int codigo)
    {
        Medicina m=new Medicina();
        
        if(listaMedicina.containsKey(codigo))
        {
            m=listaMedicina.get(codigo);
            return m;
        }
        return m;
    }
}