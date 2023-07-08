/*
Ejercicio 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por
ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package encuentro4_6;

import java.util.Scanner;

public class E10_Ejemplo_For {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1;
            for (int i = 0; i < 4; i++) {
                System.out.print("Ingrese su " + (i + 1) + "° Número:");
                n1 = leer.nextInt();
                System.out.print(n1);
                if ((n1 > 0) && (n1 < 21)) {
                    for (int j = 0; j < n1; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }else{
                    System.out.println(" ");
                    System.out.println("Ingrese un numero entre 1 y 20"); 
                n1 = leer.nextInt();
                }
                System.out.println("");
            }
    }
}
             
               
               


