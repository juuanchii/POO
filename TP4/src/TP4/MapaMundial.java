/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP4;

import java.util.HashSet;

/**
 *
 * @author juanacuna
 */
public class MapaMundial {
    private HashSet continentes = new HashSet<Continente>();
    
    public void inicializar(){
        var america = new Continente("America");
        america.agregarPais("Argentina", "Buenos Aires");
        
        america.agregarPais("Uruguay", "Montevideo");
        continentes.add(america);
        
        var europa = new Continente("Europa");
        europa.agregarPais("España", "Madrid");
        
        continentes.add(europa);
        
        var pais = europa.getPais("España");
        
        pais.agregarProvincia("Madrid");
        
    }
    
    
    
    
            
}
