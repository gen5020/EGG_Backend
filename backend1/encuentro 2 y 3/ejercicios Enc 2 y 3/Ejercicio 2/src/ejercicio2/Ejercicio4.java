/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
       
       System.out.println("por favor ingresar los grados centigrados que desea convertir");
      Scanner leer= new Scanner(System.in);
       int centigrado= leer.nextInt();
       int farenheit= 32+(9*centigrado/5);
       System.out.println(centigrado+"°C = "+farenheit+"°F");
    }
    
}
