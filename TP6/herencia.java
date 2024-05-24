package herencia;

import java.util.ArrayList;
import java.util.List;

public class herencia {

	public static void main(String[] args) {

		Triangulo t = new Triangulo("Triangulo1", "Marron", 6,9);

		Rectangulo r1 = new Rectangulo("Ractangulo1", "Rojo", 4, 3);
		Rectangulo r2 = new Rectangulo("Ractangulo2", "Blanco", 8, 5);
		Rectangulo r3 = new Rectangulo("Ractangulo3", "Amarillo", 3, 6);
		
		Elipse e1 = new Elipse("Elipse1", "Azul", 4, 3);
		Elipse e2 = new Elipse("Elipse2", "Verde", 3, 2);
		
		List<Figura> figuras = new ArrayList<Figura> ();
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
