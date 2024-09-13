package tp6;

import java.util.ArrayList;
import java.util.List;

public class TP6 {

	public static void cambiarColorYCentro(List<Figura> figuras) {
		for (Figura f : figuras) {
			f.setColor("Verde");
			f.setCentro(5,5);
			System.out.println(f.toString());
			System.out.println("El area de " + f.getNombre() + " es: " + f.area());
			System.out.println("----------------");
		}
	}

                    public static void main(String[] args) {
                     Triangulo t1 = new Triangulo("Triangulo1", "Marron", 6,9);
		Triangulo t2 = new Triangulo("Triangulo2", "Verde", 12,15);
		Triangulo t3 = new Triangulo("Triangulo3", "Amarillo", 10, 12);

		Rectangulo r1 = new Rectangulo("Ractangulo1", "Rojo", 4f, 3f);
		Rectangulo r2 = new Rectangulo("Ractangulo2", "Blanco", 8f, 5f);
		Rectangulo r3 = new Rectangulo("Ractangulo3", "Amarillo", 3f, 6f);
		
		Elipse e1 = new Elipse("Elipse1", "Azul", 4, 3);
		Elipse e2 = new Elipse("Elipse2", "Verde", 3, 2);

		
       	Circulo c1 = new Circulo("Circulo1", "Verde", 5);
		Circulo c2 = new Circulo("Circulo2", "Azul", 3);
		
	   	List<Figura> figuras = new ArrayList<> ();
			figuras.add(r1);
			figuras.add(r2);
			figuras.add(r3);
			figuras.add(e1);
			figuras.add(e2);
			figuras.add(t1);
			figuras.add(t2);
			figuras.add(t3);
			figuras.add(c1);
			figuras.add(c2);
		
		
		// for(Figura f : figuras) {
		// 	System.out.println("--------------------------------");
		// 	System.out.println("El area de " + f.getNombre() + " es: " + f.area());
		// 	System.out.println("El perimetro de " + f.getNombre() + " es: " + f.perimetro());
		// 	System.out.println();
		// }
		
		cambiarColorYCentro(figuras);

    }
    
}
