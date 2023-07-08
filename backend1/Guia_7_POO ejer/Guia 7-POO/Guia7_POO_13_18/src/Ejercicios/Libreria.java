/*
Crear una clase llamada Libro que contenga los siguientes atributos: 
ISBN, Título, Autor, Número de páginas, y un constructor con todos 
los atributos pasados por parámetro y un constructor vacío. 
Crear un método para cargar un libro pidiendo los datos al usuario 
y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el número de páginas.
 */
package Ejercicios;

import static Ejercicios.Libro.infLibro;

public class Libreria {

    public static void main(String[] args) {
       infLibro();
      // System.out.println(l1);
        Libro [] libreria = new Libro [3];
        for (int i = 0; i < 3; i++) {
            System.out.println(" completa el libro: " + (i+1));
            libreria [i] = new Libro();
            libreria [i].infLibro();
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println(" Libro " + (i+1) +" "+ libreria[i]);
        }
       /*  Libro l2=new Libro();
      
        l2.infLibro();
        System.out.println (l2.toString());
        */
            
        }
    
    }
   
  

