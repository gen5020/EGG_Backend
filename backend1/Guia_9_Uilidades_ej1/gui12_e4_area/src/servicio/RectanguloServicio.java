/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import guia12_e4_area.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class RectanguloServicio {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");    
    
    public Rectangulo llenarDatos(){
       Rectangulo r1= new Rectangulo();
        System.out.println("Rectangulo");
       System.out.print("Altura: ");
        r1.setAltura(leer.nextDouble());
        System.out.print("Base: ");
        r1.setBase(leer.nextDouble());
        return  r1;
    }
}
