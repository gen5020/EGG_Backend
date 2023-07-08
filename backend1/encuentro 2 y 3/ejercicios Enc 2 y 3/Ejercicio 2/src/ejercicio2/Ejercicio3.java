/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas 
y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package ejercicio.pkg3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
       System.out.println("Por Favor ingrese una Frase");
       Scanner leer= new Scanner(System.in);  
       String frase= leer.nextLine();
       System.out.println("La frase completa en mayusculas es así: "+frase.toUpperCase());
       System.out.println("La frase completa en minuscula es así: "+frase.toLowerCase());
    }
    
}
