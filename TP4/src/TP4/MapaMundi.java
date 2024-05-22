package TP4;

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
            System.out.println("Ingrese 3 para Saber los paises limitrofes de uno en concreto");
            System.out.println("Ingrese 4 para salir");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            if (opcion == 1){
                System.out.println("Ingrese el nombre de un continente para listar");
                    
                String nombre = scanner.nextLine();
                mostrarPaises(nombre, mapa);
            }
            
            if (opcion == 2){
                System.out.println("Ingrese el nombre de un pais para listar");
                    
                String nombre = scanner.nextLine();
                mostrarProvincias(nombre, mapa);
            }
            
            if (opcion == 3){
                System.out.println("Ingrese el nombre de un pais para saber sus paises limitrofes");
                    
                String nombre = scanner.nextLine();
                mostrarPaisesLimitrofes(nombre, mapa);
            }

            if (opcion == 4) {
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
    
    public void mostrarPaisesLimitrofes(String nombrePais, MapaMundial mapa){
          var continents = mapa.getContinentes();
          Iterator<Continente> it = continents.iterator();

          while (it.hasNext()) {
                Continente cont = it.next();
                var pais = cont.getPais(nombrePais);
                
                if (pais != null){
                    var limitrofes = pais.getLimitrofes();
                    Iterator<String> iter = limitrofes.iterator();
                    
                    while (iter.hasNext()) {
                           String p = iter.next();

                            System.out.println(p);
                     }
                }
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
