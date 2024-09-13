/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author juanacuna
 */
public class Entero {
    
       private long numero;
       //constructor de la clase Enteros
       public Entero(Integer numero) {
             super();
              this.numero = numero;
       }
       public long getNumero() {
             return numero;
       }
       public void setNumero(Integer numero) {
             this.numero = numero;
       }
       //calcula el cuadrado de n
       public long cuadrado(){
             return numero * numero;
       }
       //calcular par
       public boolean esPar(){
           long j = numero % 2;
           return j == 0;
       }
       //calcular impar
       public boolean esImpar(){
           return !this.esPar();
       }
       //Calcular factorial
       public long factorial(){
           long factorial = 1;
           for(int i = 1; i <= numero; i++){
              factorial = (i * factorial);             
           }
        return factorial;              
       }
       //Calcular primo
       public boolean esPrimo(){
           if(numero < 4){
               return true;
           }else if((numero % 2) != 0 & (numero % 3) != 0){
               return true;
           }else{
               return false;
           }
       }
} 

