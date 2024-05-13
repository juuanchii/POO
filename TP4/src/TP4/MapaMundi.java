package TP4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class MapaMundi {

    public MapaMundi() {
    }
    
    
    
    public void interactuarConUsuario(MapaMundial mapa){
    Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido al Mapa Mundial!");
        
        
        while (true) {
            
            System.out.println("Ingrese 1 para elegir un continente para listar sus paises.");
            System.out.println("Ingrese 2 para elegir un pais para listar sus provincias.");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            if (opcion == 1){
                System.out.print("Ingrese el nombre de un continente para listar");
                    
                String nombre = scanner.nextLine();
                mostrarPaises(nombre, mapa);
            }
            
            if (opcion == 2){
                System.out.print("Ingrese el nombre de un pais para listar"
                    + "(o 'salir' para terminar): ");
                    
                String nombre = scanner.nextLine();
                mostrarProvincias(nombre, mapa);
            }

            if (opcion == 3) {
                System.out.println("Gracias por usar el Mapa Mundial. ¡Hasta luego!");
                break;
            }

        }
        
        scanner.close();
    }
    
    public void mostrarPaises(String nombreContinente, MapaMundial mapa){
        var continente = mapa.getPaisesDe(nombreContinente);
        Iterator<Pais> it = continente.iterator();
        
        while (it.hasNext()) {
            Pais cont = it.next();
            
            System.out.println(cont.getNombre());
        }
        
    }
    
    public void mostrarProvincias(String nombrePais, MapaMundial mapa){
        var pais = mapa.getProvinciasDe(nombrePais, mapa);
        Iterator<Provincia> it = pais.iterator();
        
        while (it.hasNext()) {
            Provincia provincia = it.next();
            
            System.out.println(provincia.getNombre());
        }
        
    }
}
