/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

/**
 *
 * @author juanacuna
 */
public class Circulo extends Elipse {

            public Circulo(String nombre, String color, Punto centro, Integer radio) {
                    super(nombre, color, centro, radio, radio);
             }

            public Circulo(String nombre, String color, Integer radio) {
                    super(nombre, color, radio, radio);
                    
            }
            
            
}
