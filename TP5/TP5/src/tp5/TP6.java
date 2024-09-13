/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        /*
        *******************************************
        * Clase principal para iniciar el juego.
        * Aca se crean los jugadores, se inicializa
        * el mazo y se inician las partidas.
        *******************************************
        */
        
        Mazo mazo = new Mazo();
        mazo.barajar();
          
        Jugador jugador1 = new Jugador ("Luquita", mazo.getNaipeAleatorio());
        Jugador jugador2 = new Jugador ("Juancito", mazo.getNaipeAleatorio());
        Jugador jugador3 = new Jugador ("Marquito", mazo.getNaipeAleatorio());
        
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        jugadores.add(jugador3);
        
         JuegoMultiplayer juegoMultiplayer = new JuegoMultiplayer();
         
        /*
        *******************************************
        * Interfaz del usuario simple
        *******************************************
        */
        
        System.out.println("Elija una opción:");
        System.out.println("1. Jugar según puntos");
        System.out.println("2. Jugar según rebarajes");

        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.println("Ingrese la cantidad de puntos que se necesita para ganar: ");
            int eleccion_de_puntos = scanner.nextInt();
            juegoMultiplayer.comenzar_a_jugar_segun_puntos(jugadores, eleccion_de_puntos, mazo);
        } else if (opcion == 2) {
            System.out.println("Ingrese la cantidad de veces que se va a poder rebarajar el mazo: ");
            int eleccion_de_rebarajes = scanner.nextInt();
            juegoMultiplayer.comenzar_a_jugar_segun_barajes(jugadores, eleccion_de_rebarajes, mazo);
        } else {
            System.out.println("Opción no válida");
        }
    

        System.out.println();
        System.out.println("El ganador es: ");
        System.out.println(juegoMultiplayer.getGanador());
        
        scanner.close();
    }
}
