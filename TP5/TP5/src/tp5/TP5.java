/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5;

/**
 *
 * @author juanacuna
 */
public class TP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mazo mazo = new Mazo();
        mazo.barajar();
        
        Jugador jugador1 = new Jugador ("Jugador 1", mazo.getNaipeAleatorio());
        Jugador jugador2 = new Jugador ("Jugador 2", mazo.getNaipeAleatorio());
        
        System.out.println(jugador1.getNaipe_elegido());
        System.out.println(jugador2.getNaipe_elegido());
        
        Integer  contador_de_rebarajes = 0;
        Integer eleccion_de_rebarajes = 3;
        Integer puntos_jugador1 = 0;
        Integer puntos_jugador2 = 0;
        
        while(contador_de_rebarajes <= eleccion_de_rebarajes){
            
            Naipe carta_del_mazo = mazo.getNaipeArriba();
            if(carta_del_mazo.isNaipeEmpty()){
                mazo.inicializar();
                mazo.barajar();
                contador_de_rebarajes++;
            }
            
            if(jugador1.getNaipe_elegido().equals(carta_del_mazo)){
                puntos_jugador1++;
                if(puntos_jugador1 > 3){contador_de_rebarajes = 4;}
            } else if (jugador2.getNaipe_elegido().equals(carta_del_mazo)){
                puntos_jugador2++;
            }
            System.out.println(contador_de_rebarajes);
            System.out.println(carta_del_mazo.toString());
            
        }
        
        System.out.println(puntos_jugador1);
        System.out.println(puntos_jugador2);
    }
    
}
