/*
 Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
 */
package Extras;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese 1 letra");
    String letra=leer.nextLine();
    if((letra.equalsIgnoreCase("A"))||(letra.equalsIgnoreCase("e"))||(letra.equalsIgnoreCase("i"))||(letra.equalsIgnoreCase("o"))||(letra.equalsIgnoreCase("i"))||(letra.equalsIgnoreCase("u"))){
        System.out.println("La letra ingresada es una vocal");
    }else{
        System.out.println("La letra ingresada No es una vocal");
    }
        
    }
    
}
