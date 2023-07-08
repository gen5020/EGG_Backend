/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

public class ej12_teoria {

    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = leer.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = leer.nextInt();
        
        if (EsMultiplo(num1, num2)) {
            System.out.println(num1 + " es múltiplo de " + num2);
        } else {
            System.out.println(num1 + " no es múltiplo de " + num2);
        }
    }
    
  public static boolean EsMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
    
    

