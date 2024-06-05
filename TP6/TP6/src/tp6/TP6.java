/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanacuna
 */
public class TP6 {

    public static void main(String[] args) {
        Triangulo t = new Triangulo("Triangulo1", "Marron", 6,9);

		Rectangulo r1 = new Rectangulo("Ractangulo1", "Rojo", 4f, 3f);
		Rectangulo r2 = new Rectangulo("Ractangulo2", "Blanco", 8f, 5f);
		Rectangulo r3 = new Rectangulo("Ractangulo3", "Amarillo", 3f, 6f);
		
		Elipse e1 = new Elipse("Elipse1", "Azul", 4, 3);
		Elipse e2 = new Elipse("Elipse2", "Verde", 3, 2);
                                        System.out.println(e1.perimetro());
                
                                        Circulo c1 = new Circulo("Circulo1", "Verde", 5);
                                        System.out.println(c1.area());
                                        System.out.println(c1.perimetro());
		
                                        
		List<Figura> figuras = new ArrayList<> ();
		figuras.add(r1);
		figuras.add(r2);
		figuras.add(r3);
		figuras.add(e1);
		figuras.add(e2);
		figuras.add(t);
		
		for(Figura f : figuras) {
			System.out.println("El area de " + f.getNombre() + " es: " + f.area());
		}
		
		//System.out.println("El area de la elipse "+e+" es: "+e.area());
    }
    
}
