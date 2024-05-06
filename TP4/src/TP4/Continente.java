/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP4;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author juanacuna
 */
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

    @Override
    public String toString() {
        return "Continente{" + "nombre=" + nombre + ", paises=" + paises + '}';
    }
    
    
}
