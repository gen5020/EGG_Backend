/*
 Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, 
con los valores ingresados por el usuario.
 */
package Extras;

import java.util.Scanner;

public class E1 {

    public static void main(String[] args) {
     Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el tamaño de vector ");
     int n=leer.nextInt();
     int []vec= new int[n];
     int sumV=0;
     for(int i=0;i<n;i++){
         System.out.print(i+")");
         vec[i]=leer.nextInt();
         sumV=vec[i]+sumV;
     }
        System.out.println("Suma total ="+sumV);  
   
    
    }//main
    
}//public class
