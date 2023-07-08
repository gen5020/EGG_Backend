/* Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú. */


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
        } while (!clave.equalsIgnoreCase("S"));
        
    }
}
