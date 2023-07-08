/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.extra;

import ejercicio1.extra.Entidades.Cancion;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cancion c1 = new Cancion();
        
        c1.crearCancion();
        
        System.out.println(c1);
        System.out.println(c1.getTitulo());
        System.out.println(c1.getAutor());
    }
    
}
