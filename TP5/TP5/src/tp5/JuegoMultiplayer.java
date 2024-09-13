package tp5;

import java.util.List;

public class JuegoMultiplayer {

    private Jugador ganador;

    public void comenzar_a_jugar_segun_barajes(List<Jugador> jugadores, 
                                                                                    Integer eleccion_de_rebarajes, 
                                                                                    Mazo mazo) {

        Integer contador_de_rebarajes = 0;
        int[] puntos = new int[jugadores.size()];

        while (contador_de_rebarajes <= eleccion_de_rebarajes) {

            Naipe carta_del_mazo = mazo.getNaipeArriba();

            for (int i = 0; i < jugadores.size(); i++) {
                if (jugadores.get(i).getNaipe_elegido().equals(carta_del_mazo)) {
                    puntos[i]++;
                }
            }

            boolean necesitaRebarajar = false;
            for (int i = 0; i < jugadores.size(); i++) {
                if (jugadores.get(i).getNaipe_elegido().equals(carta_del_mazo)) {
                    necesitaRebarajar = true;
                    break;
                }
            }
            
            if (necesitaRebarajar || mazo.getSize().equals(20)) {
                mazo.inicializar();
                mazo.barajar();
                for (Jugador jugador : jugadores) {
                    jugador.setNaipe_aleatorio(mazo);
                }
                contador_de_rebarajes++;
            }
        }

        int maxPuntos = -1;
        for (int i = 0; i < jugadores.size(); i++) {
            if (puntos[i] > maxPuntos) {
                maxPuntos = puntos[i];
                ganador = jugadores.get(i);
            }
        }
    }

    public void comenzar_a_jugar_segun_puntos(List<Jugador> jugadores, 
                                                                                 Integer eleccion_de_puntos, 
                                                                                 Mazo mazo) {

        int[] puntos = new int[jugadores.size()];

        while (true) {
            Naipe carta_del_mazo = mazo.getNaipeArriba();

            for (int i = 0; i < jugadores.size(); i++) {
                if (jugadores.get(i).getNaipe_elegido().equals(carta_del_mazo)) {
                    puntos[i]++;
                    if (puntos[i] >= eleccion_de_puntos) {
                        ganador = jugadores.get(i);
                        return;
                    }
                }
            }

            boolean necesitaRebarajar = false;
            for (int i = 0; i < jugadores.size(); i++) {
                if (jugadores.get(i).getNaipe_elegido().equals(carta_del_mazo)) {
                    necesitaRebarajar = true;
                    break;
                }
            }

            if (necesitaRebarajar || mazo.getSize().equals(20)) {
                mazo.inicializar();
                mazo.barajar();
                for (Jugador jugador : jugadores) {
                    jugador.setNaipe_aleatorio(mazo);
                }
            }
        }
    }

    public String getGanador() {
        return ganador.getNombre();
    }
}
