/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
     System.out.println("Por favor ingrese un numero entero");
     Scanner leer= new Scanner(System.in);
     int entero=leer.nextInt();
     int d= 2;
     int t=3;
     int doble=(int) (Math.pow(entero,d));
     int triple=(int) (Math.pow(entero,t));
    
     System.out.println("El doble de "+ entero+" = " + doble);
    System.out.println("El triple de "+ entero+" = " +triple);
    }
    
}
