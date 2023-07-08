/*
 Diseñe una función que pida el nombre y la edad de N personas e imprima los datos 
de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package Ejercicios;

import java.util.Scanner;

public class E2 {

    public static void main(String[] args) {
        datos();
    }

    public static void datos() {
        Scanner leer = new Scanner(System.in);
        String resp;

        int edad;

        do {
            System.out.println("Nombre: ");
            String nom = leer.next();
            System.out.println(" ");
            System.out.println("Edad: ");
            edad = leer.nextInt();

            if (edad > 18) {
                System.out.println("Nombre: " + nom + " tiene " + edad + " años por lo tanto es mayor de edad.");
            } else {
                System.out.println("Nombre: " + nom + " tiene " + edad + " por lo tanto es menor de edad.");
            }
            System.out.println("¿Desea continuar?");
            resp = leer.next();
        } while (resp.equalsIgnoreCase("si"));
    }
}
