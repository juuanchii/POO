/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author juanacuna
 */
public class Ejercicio4 {
    
    public static void ordenarMenorAMayor(int numeros[]) {       
        
        for (int i = 0; i < numeros.length; i++) {
            int menor = numeros[0];

            for(int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    
                int tmp = numeros[j+1];
                numeros[j+1] = numeros[j];
                numeros[j] = tmp;
                }
            }
        }
    }
    
    public static float promedioArray(int numeros[]) {
        float total = 0;
       
        for(float elemento : numeros) {
            total += elemento;
        }
        float promedio = total/(numeros.length);
        
        return promedio;
    }
    
    public static int mayorNuemeroArray(int numeros[]) {
        ordenarMenorAMayor(numeros);
       
        int x = numeros.length-1;
        int mayor = numeros[x];
        return mayor;
    }
}

