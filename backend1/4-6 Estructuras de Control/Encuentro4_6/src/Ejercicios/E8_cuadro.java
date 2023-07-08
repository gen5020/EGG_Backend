/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

public class E8_cuadro {

  public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int n = leer.nextInt();
        
for (int i = 1; i <= n; i++) {
            //Imprime los caracteres de cada fila
            for (int j = 1; j <= n; j++) {
                if (((i == 1 || i == n) || j == 1) || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            //Salta a la siguiente línea para imprimir la siguiente fila
            System.out.println();
    
}
    }
}
