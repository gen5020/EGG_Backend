/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.extra.Entidades;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Cancion {
    Scanner leer = new Scanner(System.in);
    
    private String titulo;
    private String autor;

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }
    
    
    public void crearCancion(){
        System.out.println("Ingrese el titulo de la cancion:");
        titulo = leer.nextLine();
        System.out.println("Ingrese el autor de la cancion:");
        autor = leer.nextLine();      
    }
    
}
