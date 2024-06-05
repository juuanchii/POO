/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        /*
        *******************************************
        * Clase principal para iniciar el juego.
        * Aquí se crean los jugadores, se inicializa
        * el mazo y se inician las partidas.
        *******************************************
        */
        
        Mazo mazo = new Mazo();
        mazo.barajar();
          
        Jugador jugador1 = new Jugador ("Luquita", mazo.getNaipeAleatorio());
        Jugador jugador2 = new Jugador ("Juancito", mazo.getNaipeAleatorio());
        Jugador jugador3 = new Jugador ("Marquito", mazo.getNaipeAleatorio());
        
        Juego2Player juego2player = new Juego2Player();
        
        //System.out.println("Ingrese la cantidad de veces que se va a poder rebarajar el mazo: ");
        //Integer eleccion_de_rebarajes = scanner.nextInt();
         System.out.println("Ingrese la cantidad de puntos que se necesita para ganar: ");
        Integer eleccion_de_puntos = scanner.nextInt();
        
        //juego2player.comenzar_a_jugar_segun_barajes(jugador1, jugador2, eleccion_de_rebarajes, mazo);
        //juego2player.comenzar_a_jugar_segun_puntos(jugador1, jugador2, eleccion_de_puntos, mazo);
        
        
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        jugadores.add(jugador3);
        
         JuegoMultiplayer juegoMultiplayer = new JuegoMultiplayer();
         
        //juegoMultiplayer.comenzar_a_jugar_segun_barajes(jugadores, eleccion_de_rebarajes, mazo);
        juegoMultiplayer.comenzar_a_jugar_segun_puntos(jugadores, eleccion_de_puntos, mazo);
        
        System.out.println();
        System.out.println("El ganador es: ");
       // System.out.println(juego2player.ganador.getNombre());
       System.out.println(juegoMultiplayer.getGanador());
        
        scanner.close();
    }
}
