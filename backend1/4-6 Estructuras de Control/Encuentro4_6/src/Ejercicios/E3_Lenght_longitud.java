/*
 Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje 
por pantalla que diga “CORRECTO”,
en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Lenght() en Java.
 */
package Ejercicios;

import java.util.Scanner;

public class E3_Lenght_longitud {

    public static void main(String[] args) {
     Scanner leer=new Scanner(System.in);
     System.out.println("Ingrese una palabra o frase de 8 caracteres");
     String frase=leer.nextLine();
    if (frase.length()==8){
         System.out.println("Correcto");
     }else{
        System.out.println("Incorrecto");
    }
    }
    
}
