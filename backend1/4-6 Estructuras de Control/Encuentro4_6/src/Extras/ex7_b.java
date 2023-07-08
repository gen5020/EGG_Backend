
package Extras;

import java.util.Scanner;

public class ex7_b {
 public static void main(String[] args) {
        // TODO code application logic here
        Scanner leerNum = new Scanner(System.in);
        int num ;
        int n ;
        int max  ;
        int min  ;
        int i = 0 ;
        boolean band = true;
        System.out.print("Ingrese la cantidad de números: ");
        n = leerNum.nextInt();
        while (i<n){
            System.out.print("Ingrese el número: ");
            num = leerNum.nextInt();
            if (band){
               max = num;
               min = num;
               band = false;
            }
        }
        
    }   
}
