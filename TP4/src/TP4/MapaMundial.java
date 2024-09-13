/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP4;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author juanacuna
 */
public class MapaMundial {
    private HashSet continentes = new HashSet<Continente>();

    public MapaMundial() {
    }

    public void inicializar(){
        var america = new Continente("America");
        america.agregarPais("Argentina", "Buenos Aires");
        america.agregarPais("Uruguay", "Montevideo");
        america.agregarPais("Brasil", "Brasilia");
        america.agregarPais("Chile", "Concepcion");
        america.agregarPais("Paraguay", "Asuncion");
        continentes.add(america);
        
        var europa = new Continente("Europa");
        europa.agregarPais("España", "Madrid");
        europa.agregarPais("Francia", "Paris");
        europa.agregarPais("Italia", "Roma");
        europa.agregarPais("Portugal", "Lisboa");
        continentes.add(europa);
        
        var argentina = america.getPais("Argentina");
        argentina.agregarProvincia("Entre Rios");
        argentina.agregarProvincia("Buenos Aires");
        argentina.agregarProvincia("Santa Fe");
        argentina.agregarProvincia("Corrientes");
        argentina.agregarProvincia("Cordoba");
        
        argentina.agregarPaisLimitrofe("Uruguay");
        argentina.agregarPaisLimitrofe("Brasil");
        argentina.agregarPaisLimitrofe("Paraguay");
        argentina.agregarPaisLimitrofe("Bolivia");
        argentina.agregarPaisLimitrofe("Chile");
        
        var uruguay = america.getPais("Uruguay");
        uruguay.agregarProvincia("Paysandu");
        uruguay.agregarProvincia("Salto");
        uruguay.agregarProvincia("Canelones");
        uruguay.agregarProvincia("Rocha");
        uruguay.agregarProvincia("Maldonado");   
        
        uruguay.agregarPaisLimitrofe("Argentina");
        uruguay.agregarPaisLimitrofe("Brasil");
        
        var chile = america.getPais("Chile");
        chile.agregarPaisLimitrofe("Argentina");
        chile.agregarPaisLimitrofe("Peru");
        chile.agregarPaisLimitrofe("Bolivia");
        
        var españa = europa.getPais("España");
        españa.agregarPaisLimitrofe("Francia");
        españa.agregarPaisLimitrofe("Portugal");
        españa.agregarPaisLimitrofe("Andorra");
        
        var francia = europa.getPais("Francia");
        francia.agregarPaisLimitrofe("España");
        francia.agregarPaisLimitrofe("Andorra");
        francia.agregarPaisLimitrofe("Italia");
        francia.agregarPaisLimitrofe("Belgica");
        francia.agregarPaisLimitrofe("Suiza");
        francia.agregarPaisLimitrofe("Alemania");
        
        var portugal = europa.getPais("Portugal");
        portugal.agregarPaisLimitrofe("España");
                
    }
    
    public HashSet getContinentes(){        
        return continentes;
    }
    
    public HashSet getPaisesDe(String nombre){
        Iterator<Continente> iterator = continentes.iterator();

        // Itera en el HashSet de contintentes buscando el que sea igual al parametro nombre
        while (iterator.hasNext()) {
            Continente continente = iterator.next();
            
            if(continente.getNombre().equals(nombre)){
                return continente.getPaises();
            }
        }
        return new HashSet<>();
    }
    
    public HashSet getProvinciasDe(String nombre, Object mapa){
        Iterator<Continente> iterator = continentes.iterator();
        
        // Itera en el HashSet de contintentes buscando el que sea igual al parametro nombre
        while (iterator.hasNext()) {
            Continente continente = iterator.next();
            
            var paises = continente.getPaises();
            
            Iterator<Pais> it = paises.iterator();
            
            while (it.hasNext()) {
            Pais pais = it.next();
                if(pais.getNombre().equals(nombre)){
                    return pais.getProvincias();
                }
            }
    
        }
    return new HashSet<>();
    }

    @Override
    public String toString() {
        return "MapaMundial{" + "continentes=" + continentes + '}';
    }
    
    
}    
