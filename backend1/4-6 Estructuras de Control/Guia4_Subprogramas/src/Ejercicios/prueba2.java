/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

public class prueba2 {

    public static void main(String[] args) {
         String resp; 
      String nom;
      int edad; 
      Scanner leer= new Scanner(System.in);
      
      do {
          System.out.println("Nombre: ");
          nom=leer.nextLine();
          System.out.println("Edad: ");
          edad=leer.nextInt();
          if (edad>18){
              System.out.println("Nombre: "+nom+ " tiene "+edad+" años por lo tanto es mayor de edad." );
          }else{
              System.out.println("Nombre: "+nom+ " tiene "+edad+" por lo tanto es menor de edad." );
          }
          System.out.println("¿Desea continuar?");
          resp=leer.next();
      }while(resp.equalsIgnoreCase("si"));
  }  
}