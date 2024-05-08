/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP4;

import java.util.Iterator;

/**
 *
 * @author juanacuna
 */
public class tp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MapaMundial mapa = new MapaMundial();
        
        mapa.inicializar();
        
        var europa = mapa.getPaisesDeContinente("Europa", mapa);
        System.out.print(europa);
        
    }
    
}
