/*
Ejercicio 8
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package encuentro4_6;
import java.util.Scanner;
public class E8_Ejemplo_While {

    public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
    System.out.println("Ingrese una nota del 0 al 10");
    int nota=leer.nextInt();
    while((nota<0)||(nota>10)){
      System.out.println("Atención: Por Favor Ingrese una nota del 0 al 10");
      nota=leer.nextInt();
                
    }
    }
    
}
