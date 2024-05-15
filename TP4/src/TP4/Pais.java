/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP4;

import java.util.ArrayList;
import java.util.HashSet;


/**
 *
 * @author juanacuna
 */
public class Pais {
    private String nombre, capital;
    private HashSet provincias;
    private ArrayList limitrofes;
    
    public Pais(){
        this.nombre = "";
        this.capital = "";
        this.provincias = new HashSet<Provincia> ();
        this.limitrofes = new ArrayList<String> ();
    }
    
    public Pais(String nombre, String capital) {
        this.nombre = nombre;
        this.capital = capital;
        this.provincias = new HashSet<Provincia> ();
        this.limitrofes = new ArrayList<String> ();
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
    
    public void agregarPaisLimitrofe(String nombre) {
        limitrofes.add(nombre);
    }
    
    public ArrayList getLimitrofes() {
        return limitrofes;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", capital=" + capital + ", provincias=" + provincias + '}';
    }
    
    
}
