/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.entidad;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Libro {

    public int ISBN;
    public String Titulo;
    public String Autores;
    public int NroPagina;
    
     Scanner leer = new Scanner(System.in);

    public Libro() {
    }

    public Libro(int ISBN, String Titulo, String Autores, int NroPagina) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autores = Autores;
        this.NroPagina = NroPagina;
    }



    public void cargarLibro(Scanner leer) {
        
        System.out.println("Ingrese el codigo ISBN:");
        this.ISBN = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el Titulo:");
        this.Titulo = leer.nextLine();
        //leer.next();
        System.out.println("Ingrese el/los autores:");
        this.Autores = leer.nextLine();
        //leer.nextLine();
        System.out.println("Ingrese el numero de pagina:");
        this.NroPagina = leer.nextInt();

        
        
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autores=" + Autores + ", NroPagina=" + NroPagina + '}';
    }

    
    

   

}
