package TP4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class tp4 {

        public static void main(String[] args) {
        MapaMundial mapa = new MapaMundial();
        mapa.inicializar();
        
        //HashSet con los paises del continente Europa
        var europa = mapa.getPaisesDe("Europa");
        
        //HashSet con los paises del continente America
        var america = mapa.getPaisesDe("America");
        
        var provincias_de_argentina = mapa.getProvinciasDe("Argentina", mapa);
        
        MapaMundi mundi = new MapaMundi();
        
        mundi.interactuarConUsuario(mapa);
        
    }
   
}
