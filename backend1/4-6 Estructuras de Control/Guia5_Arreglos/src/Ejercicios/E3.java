/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

public class E3 {

  
    public static void main(String[] args) {
   

       Scanner leer = new Scanner(System.in);
       
       int[] vector = new int[10];
       
        for (int i = 0; i < 10; i++) {
            vector[i]= (int) (Math.random()* 200);
            System.out.println(vector[i]);
            }
        
       int uno = 0;
       int dos = 0;
       int tres = 0;
       int cuatro=0;
       int cinco = 0;
       
        for (int i = 0; i < 10; i++) {
            if (vector[i] < 10 ) {
            uno++;
            }
            else if (vector[i] < 100 ) {
                dos++;
            }
            else if (vector[i]< 1000 ) {
                tres++;
            }
        }
        System.out.println("La cant de nros con 1 digito es de :" + uno);
        System.out.println("La cant de nros con 2 digitos es de :" + dos);
        System.out.println("La cant de nros con 3 digitos es de :" + tres);
   }
}    
  
    

