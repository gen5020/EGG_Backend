/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.util.Scanner; 

public class e2_Cristian {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String respuesta = "Si"; 

        while (respuesta.equalsIgnoreCase("Si")) { 

            System.out.print("Ingrese el nombre de la persona: ");
            String nombre = leer.nextLine(); 

            
            System.out.print("Ingrese la edad de la persona: ");
            int edad = leer.nextInt();
            
            
            leer.nextLine(); 

            
            System.out.println("Nombre: " + nombre + ", Edad: " + edad);
            
            if (edad >= 18) { 

                System.out.println(nombre + " es mayor de edad");
            } else { 

                System.out.println(nombre + " es menor de edad");
            }
            
            System.out.print("¿Quiere seguir mostrando personas? (Si/No): ");
            respuesta = leer.nextLine(); 

        }
        
       
    }
}    

