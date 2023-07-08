/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
package ejercicio2;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args){
        System.out.println("Por favor ingrese su nombre: ");
        
        Scanner leer=new Scanner(System.in);
        String nombre= leer.nextLine();
        System.out.println("Bienvenido al sistema "+nombre);
    }
}
