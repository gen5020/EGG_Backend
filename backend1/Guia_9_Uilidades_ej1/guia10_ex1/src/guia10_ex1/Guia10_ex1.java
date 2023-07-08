/*
1. Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).

 */

package guia10_ex1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @noelia User
 */
public class Guia10_ex1 {

    public static void main(String[] args) {
    ArrayList <Integer> lista=new ArrayList();   
   Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");        
   
   Integer n;    
    do {
        System.out.println("ingresar numeros eneteros para agregar al ArrayList, o colocar -99 para finalizar");    
        n= leer.nextInt();
        if (n!=-99){ 
            lista.add(n);
        }
    } while (n!=-99);
    
        System.out.println("Los numeros ingresados al ArrayList son: ");
        System.out.println(lista);
        Integer suma=0;
        Integer cont=0;
        for (Integer n1 : lista) {
          suma+=n1;
          cont++;
        }
        System.out.println("Suma= "+suma);
        double promedio= (double)(suma/cont);
        System.out.println("Promedio= "+promedio);
        
    }//fin void

}//fin class
