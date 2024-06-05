package tp5;

public class Juego2Player {
           
          Jugador ganador;
        
          public void comenzar_a_jugar_segun_barajes( Jugador jugador1,
                                                                                          Jugador jugador2,
                                                                                          Integer eleccion_de_rebarajes,
                                                                                          Mazo mazo) {
                    
                    Integer  contador_de_rebarajes = 0;
                    Integer puntos_jugador1 = 0;
                    Integer puntos_jugador2 = 0;
    
                    while(contador_de_rebarajes <= eleccion_de_rebarajes){
            
                    Naipe carta_del_mazo = mazo.getNaipeArriba();
                    
                            if(jugador1.getNaipe_elegido().equals(carta_del_mazo)) {
                                puntos_jugador1++;
                            } 
                            
                            if(jugador2.getNaipe_elegido().equals(carta_del_mazo)) {
                                puntos_jugador2++;
                            }
                            
                            if(jugador1.getNaipe_elegido().equals(carta_del_mazo) || 
                                    (jugador2.getNaipe_elegido().equals(carta_del_mazo)) || 
                                    (mazo.getSize().equals(20)) ) {
                                
                                    mazo.inicializar();
                                    mazo.barajar();
                                    jugador1.setNaipe_aleatorio(mazo);
                                    jugador2.setNaipe_aleatorio(mazo);
                                    contador_de_rebarajes++;                                    
                            } 
                    }
                    
                    if ( puntos_jugador1 > puntos_jugador2){
                           this.ganador = jugador1;
                    } else {
                           this.ganador = jugador2;
                    }
          }
          
          public void comenzar_a_jugar_segun_puntos( Jugador jugador1,
                                                                                          Jugador jugador2,
                                                                                          Integer eleccion_de_puntos,
                                                                                          Mazo mazo) {
                    
                    Integer puntos_jugador1 = 0;
                    Integer puntos_jugador2 = 0;
    
                    while(puntos_jugador1 < eleccion_de_puntos && eleccion_de_puntos > puntos_jugador2){
            
                    Naipe carta_del_mazo = mazo.getNaipeArriba();
                    
                            if(jugador1.getNaipe_elegido().equals(carta_del_mazo)) {
                                puntos_jugador1++;
                            } 
                            
                            if(jugador2.getNaipe_elegido().equals(carta_del_mazo)) {
                                puntos_jugador2++;
                            }
                            
                            if(jugador1.getNaipe_elegido().equals(carta_del_mazo) || 
                                    (jugador2.getNaipe_elegido().equals(carta_del_mazo)) || 
                                    (mazo.getSize().equals(20)) ) {
                                
                                    mazo.inicializar();
                                    mazo.barajar();
                                    jugador1.setNaipe_aleatorio(mazo);
                                    jugador2.setNaipe_aleatorio(mazo);
                            } 
                    }
                    
                    if ( puntos_jugador1 > puntos_jugador2){
                           this.ganador = jugador1;
                    } else {
                           this.ganador = jugador2;
                    }
          }
          
          public String getGanador() {
                    return ganador.getNombre();
          }
}