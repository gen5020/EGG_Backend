/*
Crear una clase llamada Libro que contenga los siguientes atributos: 
ISBN, Título, Autor, Número de páginas, y un constructor con todos 
los atributos pasados por parámetro y un constructor vacío. 
Crear un método para cargar un libro pidiendo los datos al usuario 
y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el número de páginas.

 */
package Ejercicios;

import java.util.Scanner;


public class Libro {
    //atributos
    public int ISBN;
    public String Título;
    public String Autor;
    public int numPag;
    
    //constructor con parametros

    public Libro(int ISBN, String Título, String Autor, int numPag) {
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.numPag = numPag;
    }
//constructor vacio
    public Libro() {
    }

    //metodo = función o procedimiento
      public static void infLibro(){
       Scanner leer=new Scanner(System.in);
        Libro l1=new Libro();
        System.out.print("Título: ");
               l1.Título=leer.nextLine();
        System.out.print("Autor: ");
        l1.Autor=leer.nextLine();
        System.out.print("ISBN: ");
        l1.ISBN=leer.nextInt();
        System.out.print("Número de paginas: ");
        l1.numPag=leer.nextInt();
        System.out.println(l1);
       }

 @Override
    public String toString() {
        return "Libro " + "ISBN=" + ISBN + ", T\u00edtulo=" + Título + ", Autor=" + Autor + ", numPag=" + numPag;
    }

   /*public static void imp(){
       System.out.println("titulo"+l1.titulo+"autor: "+l1.autor+"ISBN: "+l1.isbn+"numero de paginas: "+l1.numPag);
   }
   */
    }

   
    
    
    
    
    

