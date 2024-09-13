package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        
        
        //Ejercicio 6
        Scanner scan= new Scanner(System.in);
        
        Entero e = new Entero(scan.nextInt());
        
        
        System.out.println("El numero ingresado es: "+e.getNumero()); 
        System.out.println("El cuadrado de " + e.getNumero() + " es: " + e.cuadrado());
        
        //Calcular par o impar
        if (e.esPar() == true){
            System.out.println("El numero es par");
        }else{
            System.out.println("el numero es impar");
        }
        
        //Calcular factorial
        System.out.println("el factorial de " + e.getNumero() + " es " + e.factorial());
        
        //Calcular si es un numero primo
        if (e.esPrimo() == true){
            System.out.println("El numero " + e.getNumero() + " es primo");
        }else{
            System.out.println("El numero " + e.getNumero() + " no es primo");
        }
        
        
    }
    
}
