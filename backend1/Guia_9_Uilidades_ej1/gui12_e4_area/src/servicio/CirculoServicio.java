/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import guia12_e4_area.Circulo;
import java.util.Scanner;


public class CirculoServicio {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");    
    public Circulo crearCirculo(){
        Circulo c1=new Circulo();
        System.out.println("Datos Circulo:");
        System.out.print("Radio: ");
        c1.setRadio(leer.nextDouble());
        System.out.print("Diametro: ");
        c1.setDiametro(leer.nextDouble());
        return c1;
    }
}
