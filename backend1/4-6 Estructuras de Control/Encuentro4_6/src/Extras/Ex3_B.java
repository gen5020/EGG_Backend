
package Extras;

import java.util.Scanner;

public class Ex3_B {

    public static void main(String[] args) {
               Scanner leerCadena = new Scanner(System.in);
        // Pedimos al usuario
        System.out.println("Ingrese una letra: ");
        String letra = leerCadena.next();
        if (!(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("0") || letra.equalsIgnoreCase("u")) ) {
            System.out.println("No ingresó ninguna vocal");
        }
    }
    }
    

