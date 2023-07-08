/*
 Escriba un programa que averigüe si dos vectores de N enteros son iguales
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 */
package Extras;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
       // System.out.println("Ingrese tamaño de vector");
        //int n=leer.nextInt();
        int []vec1=new int[5];
        int []vec2=new int[5];
      
        for(int i=0;i<5;i++){
            vec1[i]=i++;
           
              
        }
           for(int i=0;i<5;i++){
          
            vec2[i]=i++;
              
        }
        vec2[3]=6;
        for(int i=0;i<5;i++){
        System.out.print("vec1 "+vec1[i]);
        System.out.println(" // vec2 "+vec2[i]);
        }
        for(int i=0;i<5;i++){
            if(vec1[i]!=vec2[i]){
                System.out.println("Stop");
                break;
                
            }else{ System.out.println(i+") son iguales");
        }
        }
     // for(int i=0;i<n;i++){
         //   vec2[i]=i++;
       // }
    
    }   
}
