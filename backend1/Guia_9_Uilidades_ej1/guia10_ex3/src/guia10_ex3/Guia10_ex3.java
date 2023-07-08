/*
3. Implemente un programa para una Librería haciendo uso de un HashSet para evitar
datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
información de cada uno de los libros de una Biblioteca. 
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
se le pregunta al usuario si quiere crear otro Libro o no.


 */

package guia10_ex3;

import entidad.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @noelia User
 */
public class Guia10_ex3 {

    public static void main(String[] args) {
     HashSet <Libro> biblioteca=new HashSet<Libro>();
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
         String resp= "S";
        do{
        Libro l1=new Libro();  
            System.out.print("Titulo: ");
            l1.setAutor(leer.next());
            System.out.print("Autor: ");
            l1.setAutor(leer.next());
            System.out.print("Numero de ejemplares: ");
            l1.setNumEjemplares(leer.nextInt());
            System.out.print("Numero de ejemplares Prestados: ");
            l1.setNumEjemPrestados(leer.nextInt());
            biblioteca.add(l1);
            System.out.println("¿Desea agregar otro libro? S/N");
            resp=leer.next();
        }while(resp.equalsIgnoreCase("S"));
        
        System.out.println("ingresa el titulo del libro que quiere prestar");
        String buscarLibro=leer.next();
        Boolean in= biblioteca.contains(buscarLibro);
        if(in==true){
           biblioteca.
                   
        }
        
    }//fin void

}//fin class
