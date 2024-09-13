package TP4;

import java.util.HashSet;
import java.util.Iterator;


public class Continente {
    private String nombre;
    private HashSet<Pais> paises;
    
    public Continente(String nombre) {
        this.nombre = nombre;
        this.paises = new HashSet<Pais> ();
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public HashSet getPaises(){
        return paises;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPaises(HashSet paises) {
        this.paises = paises;
    }
    
    public void agregarPais(String nombre, String capital) {
       
        paises.add(new Pais(nombre, capital));
    }
    
    /*public Pais getPais(String nombre){
       
        for (Pais pais : this.paises){
            if (pais.getNombre().equals(nombre)) {
                return pais;
            }
        }
        return new Pais();
    }*/
    
    public Pais getPais(String nombre){
       
        return paises.stream().filter(pais -> nombre.
        equals(pais.getNombre())).findAny().orElse(new Pais());
    }
    
    public HashSet getProvinciasDe(String nombre, Object continente){
        Iterator<Pais> iterator = paises.iterator();

        // Itera en el HashSet de contintentes buscando el que sea igual al parametro nombre
        while (iterator.hasNext()) {
            Pais pais = iterator.next();
            
            if(pais.getNombre().equals(nombre)){
                return pais.getProvincias();
            }
        }
        return new HashSet<>();
    }

    @Override
    public String toString() {
        return "Continente{" + "nombre=" + nombre + ", paises=" + paises + '}';
    }
    
    
}
