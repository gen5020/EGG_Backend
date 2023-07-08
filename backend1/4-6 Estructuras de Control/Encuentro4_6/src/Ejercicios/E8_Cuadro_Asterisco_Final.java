/*
8. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
*/
package Ejercicios;

import java.util.Scanner;

public class E8_Cuadro_Asterisco_Final {

    public static void main(String[] args) {
   Scanner leer= new Scanner(System.in); 
        System.out.print("Ingrese Número:");     
   int n= leer.nextInt();
   
   if(n>0){
       //linea superior
       for(int l=0;l<n;l++){
           System.out.print(" * ");
            }
       System.out.println("");
     //centro
     for(int l=0;l<(n-2);l++){
           System.out.print(" * "); //Borde izq
           for( int i=0;i<(n-2);i++){ 
           System.out.print("   ");//Espacios en blanco del centro
            }
           System.out.println(" * ");//borde derecho
     }
     // System.out.println("");
       

//linea inferior
       for( int l=0;l<n;l++){
           System.out.print(" * ");
            }
       System.out.println("");
   }
    }
    
}
