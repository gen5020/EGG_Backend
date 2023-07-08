/*
 Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla 
el siguiente menú: El usuario deberá elegir una opción y el programa deberá mostrar el resultado 
por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción5.
Tener encuenta que,si el usuario selecciona la opción 5,en vez de salir del programa directamente,
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro quedesea salir del programa S/N?
Si el usuario selecciona el carácter‘S’se sale del programa,caso contrario se vuelve a mostrar el menú.
 */
package Ejercicios;

import java.util.Scanner;

public class E6_Menu {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1;
        int n2;
                
        int sol=1;
        String resp="a";
        String salir="s";
        do {
            System.out.println("Ingrese 2 numeros enteros positivos:");
            n1 = leer.nextInt();
            n2 = leer.nextInt();
        } while ((n1 < 0) || (n2 < 0));
        int option;
        do {
            System.out.println("Menú");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija una opción");
            option = leer.nextInt();
            switch (option) {
                case 1:
                    System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
                    break;
                case 2:
                    System.out.println(n1 + "-" + n2 + "=" + (n1 - n2));
                    break;
                case 3:
                    System.out.println(n1 + "*" + n2 + "=" + (n1 * n2));
                    break;
                case 4:
                    System.out.println(n1 + "/" + n2 + "=" + (n1 / n2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa S/N?");
                    resp = leer.next();
                   /* if (resp.equalsIgnoreCase("s")){
                        break;  
                    }else{
                        continue;
                    } */   
            }
            sol=(salir.compareTo(resp));//si resp=salir me da 0
           
        } while (sol!=0);
        }

    }


