/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
   Scanner leer= new Scanner(System.in); 
        System.out.println("Ingrese Número:");     
   int n= leer.nextInt();
        
    for(int l=1;l<=(n);l++){
        
        
        if(l==n){
            for(int li=1;li<=n;li++){    
            System.out.print(" * ");//linea inferior
                        }
        }else if((l!=1)&&(l!=n)){
           for(int li=1;li<=n;li++){    
            System.out.println("  ");
                        } 
            
        }
        if(l==1){
            for(int ls=0;ls<(n);ls++){
            System.out.print(" o ");//linea superior
    }
    }
      
        System.out.print("");
        
       // System.out.println(" u ");
                     
            }
        }
    }



    


