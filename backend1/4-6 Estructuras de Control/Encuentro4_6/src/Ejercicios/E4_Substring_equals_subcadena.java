/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’.
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Substring y equals() de Java.
 */
package Ejercicios;

import java.util.Scanner;

public class E4_Substring_equals_subcadena {

    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
    System.out.print("Ingrese una frase:");
    String frase= leer.nextLine();
    String letra= (frase.substring(0,1));
     System.out.println(frase.substring(0,1));
    if (letra.equalsIgnoreCase("A")){
         System.out.println("Correcto");
    }else{
        System.out.println("Incorrecto");
    }
    }
}
    

