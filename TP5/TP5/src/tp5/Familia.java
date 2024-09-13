/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package tp5;

/**
 *
 * @author juanacuna
 */
public enum Familia {
    ORO("Oro", "O"),
    BASTO("Basto", "B"),
    ESPADA("Espada", "E"),
    COPA("Copa", "C");
    
    private String nombre;
    private String simbolo;
    
    private Familia(String nombre, String simbolo){
        this.nombre = nombre;
        this.simbolo = simbolo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    @Override
    public String toString() {
        return "Familia{" + "nombre=" + nombre + ", simbolo=" + simbolo + '}';
    }
    
}
