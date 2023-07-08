/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

public class e2_pablo {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "Si";

        while (!continuar.equalsIgnoreCase("No")) {
            System.out.println("Ingrese el nombre de la persona: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese la edad de la persona: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad.");
            } else {
                System.out.println(nombre + " es menor de edad.");
            }

            System.out.println("¿Desea seguir mostrando personas? (Si/No)");
            continuar = scanner.nextLine();
        }

        System.out.println("¡Gracias por usar el programa!");
        scanner.close();
    }
}
     
    
