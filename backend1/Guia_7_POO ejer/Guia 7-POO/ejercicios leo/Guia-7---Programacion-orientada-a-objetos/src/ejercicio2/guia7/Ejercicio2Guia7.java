/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.guia7;

import ejercicio2.guia7.Entidades.Circunferencia;
import java.text.DecimalFormat;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio2Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia c1 =  new Circunferencia();
        DecimalFormat df = new DecimalFormat("#.##");
        c1.crearCircunferencia();
        System.out.println("El area es " + df.format(c1.area()) + " y el perimetro " + df.format(c1.perimetro()));
        
    }
    
}
