/* Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java. */

import java.util.Scanner;


public class ejer_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar una frase");
        String frase = leer.nextLine();
        if ( frase.equals("Eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
