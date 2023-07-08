/*
 Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.

 */
package Ejercicios;


public class E1 {

    public static void main(String[] args) {
 int vector[]=new int[100];
 for(int i=0;i<100;i++){
     vector[i]=i+1;
 }
  for(int j=vector.length-1;j>=0;j--){
      if(vector[j]>j) 
      System.out.println(vector[j]);      
 
    }
    
}
}
