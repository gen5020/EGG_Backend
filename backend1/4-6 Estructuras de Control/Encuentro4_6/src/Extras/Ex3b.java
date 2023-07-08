/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extras;

import java.util.Scanner;

public class Ex3b {

    public static void main(String[] args) {
     Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese 1 letra");
       String letra=leer.nextLine();
        switch(letra){
            case "A":
                System.out.println("Ha ingresado una vocal");    
                break;
                 case "e":
                System.out.println("Ha ingresado una vocal");    
                break;
                 case "i":
                System.out.println("Ha ingresado una vocal");    
                break;
                 case "o":
                System.out.println("Ha ingresado una vocal");    
                break;
                 case "u":
                System.out.println("Ha ingresado una vocal");    
                break;
                default:
                System.out.println("NO Ha ingresado una vocal");    
               
        } 
    }
    
}
