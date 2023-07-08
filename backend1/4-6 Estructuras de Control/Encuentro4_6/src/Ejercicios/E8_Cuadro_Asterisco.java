/*
8. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
*/
package Ejercicios;

import java.util.Scanner;

public class E8_Cuadro_Asterisco {

    public static void main(String[] args) {
   Scanner leer= new Scanner(System.in); 
        System.out.println("Ingrese Número:");     
   int n= leer.nextInt();
        
    for(int l=1;l<=(n);l++){
       if(l==n||l==1){
        for(l=1;l<=n;l++){
           System.out.println(" * ");
            }
        }
       if(l!=1||l!=n){
           for(l=1;l<=(n);l++){
           System.out.print(" - ");
       }
    }
        for(int ls=0;ls<(l);ls++){
        System.out.println("o");
           
              }
            }
        }
    }



