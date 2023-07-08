/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.guia.pkg7;

import ejercicio4.guia.pkg7.Entidades.Rectangulo;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio4Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo();

        r1.crearRectangulo();
        System.out.println(r1.calcularPerimetro());
        System.out.println(r1.calcularArea());
        r1.dibujarRectangulo1();
        System.out.println();
        r1.dibujarRectangulo2();
        

    }

}
