
package Ejercicios;

import java.util.Scanner;

public class E6_Menu_c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        // Incializamos el objeto scanner
        Scanner entrada = new Scanner(System.in);
        Scanner leerChar = new Scanner(System.in);
        // Creamos una variable numerica
        int num1 = -1 ;
        int num2 = -1;
        int opc ;
        boolean conf = false;
        String resp ;
        
        // Pide el primer número
        while (num1 < 0 ){
            System.out.println("Ingrese un número entero y positivo: ");
            num1 = entrada.nextInt();
        }
        // Pide el segundo número
        while (num2 < 0 ){
            System.out.println("Ingrese otro número entero y positivo: ");
            num2 = entrada.nextInt();
        }
        do {
            System.out.println("MENU ");
            System.out.println("1 Sumar ");
            System.out.println("2 Restar");
            System.out.println("3 Multiplicar");
            System.out.println("4 Dividir ");
            System.out.println("5 Salir ");
            System.out.println("Elija opcion: ");
            opc = entrada.nextInt();
            // usamos el bucle switch
            switch (opc){
             case 1:
                System.out.println("La suma es de:" +(num1+ num2));
                break;
             case 2:
                System.out.println("La Resta es de:" +(num1 - num2));
                break;
             case 3:
                System.out.println("La Multiplicación es de:" +(num1*num2));
                break;
             case 4:
                System.out.println("La División es de:" +(num1/num2));
                break;
             case 5:
                 System.out.println("¿Está seguro que desea salir del programa?S/N ");
                 resp = leerChar.next();
                 
                 if (resp.equals("s") || resp.equals("S")){
                     conf = true;
                 } 
        } } while (conf == false); 
        
        
        
    }
           
}