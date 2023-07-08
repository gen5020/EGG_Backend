package Ejercicios;
import java.util.Scanner;




public class ejer_6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingre el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingre el segundo numero");
        int num2 = leer.nextInt();
        int option;
        String clave= "";
        do {
            System.out.println("Ingresar la operacion que desa realizar"); 
            System.out.println("1= SUMA - 2= RESTA - 5= SALIR");            

            option = leer.nextInt();
         switch (option) {
            case 1:
                int sumar = num1 + num2;
                System.out.println("La suma del num " + num1 + " y "+ num2 + " es: " + sumar);
                break;
            
            case 2:
                int resta = num1 - num2;
                System.out.println("La resta del num " + num1 + " y "+ num2 + "es: " + resta);
                break;
            case 5:
                System.out.println("Esta seguro que quiere salir del programa? S/N");
                clave = leer.next();
                

         }
        } while (!clave.equalsIgnoreCase("S"));//negación
        
    }
}
