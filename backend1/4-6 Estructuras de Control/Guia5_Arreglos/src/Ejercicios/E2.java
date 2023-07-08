/*
 Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
y le pida al usuario un número a buscar en el vector. 
El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
package Ejercicios;

import java.util.Scanner;

public class E2 {

    public static void main(String[] args) {
   Scanner leer=new Scanner(System.in);
        int vector[]=new int[100];
   int n;
   for(int i=0;i<10;i++){
       vector[i]=(int)(Math.random()*10+1);
   
   }
   for(int i=0;i<10;i++){
       System.out.println(" \n"+vector[i]); 
       
   
   }
        System.out.println("Ingrese el numero que desea buscar");
        n=leer.nextInt();
    for(int inicio=0;inicio<10;inicio++){
        if(vector[inicio]==n){
            
        }
    }
    
}
}
