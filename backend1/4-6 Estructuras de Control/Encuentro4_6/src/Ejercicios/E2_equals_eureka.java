/*
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” 
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
Nota: investigar la función equals() en Java.
 */
package Ejercicios;

import java.util.Scanner;

public class E2_equals_eureka {

    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       System.out.print("Ingrese una frase: ");
       String frase=leer.next();
       
       if (frase.equals("eureka")){
           System.out.println("Correcto");
       }else{
            System.out.println("Incorrecto");
       }
    }
    
}
