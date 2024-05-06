/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP4;

import java.util.HashSet;

/**
 *
 * @author juanacuna
 */
public class Pais {
    private String nombre, capital;
    private HashSet provincias;
    
    public Pais(){
        this.nombre = "";
        this.capital = "";
        this.provincias = new HashSet<Provincia> ();
    }
    
    public Pais(String nombre, String capital) {
        this.nombre = nombre;
        this.capital = capital;
        this.provincias = new HashSet<Provincia> ();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getCapital() {
        return this.capital;
    }
    
    public void agregarProvincia(String nombre) {
        
        provincias.add(new Provincia(nombre));
    }
    
    public HashSet getProvincias() {
        return provincias;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", capital=" + capital + ", provincias=" + provincias + '}';
    }
    
    
}
