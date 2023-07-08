package ejercicios;

/*Escribir un programa que pida dos números enteros por teclado 
y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma
package ejercicios;
*/

import java.util.Scanner;

public class E1 {
    public static void main(String[] args){
        System.out.println("Ingresar 2 numeros que desea sumar");
        Scanner leer= new Scanner(System.in);
        
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        int sum= num1 +num2;
        System.out.println("la suma de "+num1+" y "+num2+" es "+sum);
       
    }
}
