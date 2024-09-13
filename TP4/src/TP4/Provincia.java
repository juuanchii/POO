/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP4;

/**
 *
 * @author juanacuna
 */
public class Provincia {
    private String nombre;
    
    public Provincia(String nombre){
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String toString() {
        return "Provincia{" + "nombre=" + nombre + '}';
    }
    
}
