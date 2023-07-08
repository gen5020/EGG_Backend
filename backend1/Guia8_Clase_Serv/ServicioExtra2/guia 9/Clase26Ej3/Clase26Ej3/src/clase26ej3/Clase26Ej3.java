/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase26ej3;

import Servicios.ArregloService;

/**
 *
 * @author Miguel Ángel
 */
public class Clase26Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] A = new int[50];
        int[] B = new int[20];
        
        ArregloService arre = new ArregloService();
        
        arre.inicializA(A);
        arre.mostrar(A);
        System.out.println(" ");
        arre.ordenar(A);
        arre.inicializarB(B, A);
        arre.mostrar(A);
        System.out.println(" ");
        arre.mostrar(B);
    }
    
}
