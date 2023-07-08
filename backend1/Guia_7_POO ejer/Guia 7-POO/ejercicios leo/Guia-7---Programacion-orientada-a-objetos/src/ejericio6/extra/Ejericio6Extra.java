/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericio6.extra;

import ejericio6.extra.Entidades.Rectangulo;

/**
 *
 * @author PC-Leonardo
 */
public class Ejericio6Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();
        rectangulo1.ingresar_datos();
        System.out.println("El area del rectangulo es: " + rectangulo1.calcular_area());
    }
    
}
