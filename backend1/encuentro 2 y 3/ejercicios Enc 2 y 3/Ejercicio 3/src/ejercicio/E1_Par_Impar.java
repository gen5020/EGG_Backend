/*
 Crear un programa que dado un número determine si es par o impar.
 */
package Ejercicio;

import java.util.Scanner;

public class E1_Par_Impar {

    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       System.out.print("Ingrese un numero:");
       int n1=leer.nextInt();
       if (n1%2==0){
           System.out.println("El numero ingresado es par");
       }else{
           System.out.println("El numero ingresado es impar");
           
       }
    }
    
}
