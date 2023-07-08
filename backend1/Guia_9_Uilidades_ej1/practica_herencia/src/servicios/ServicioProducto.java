/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Producto;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ServicioProducto {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");    
    
    public Producto crearProducto(){
        Producto p=new Producto();
        System.out.print("N°Lote: ");
        p.setLote(leer.nextInt());
        System.out.println("Fecha de Caducidad: ");
        System.out.print("Dia: ");
        int dia=leer.nextInt();
        System.out.print("Mes: ");
        int mes= leer.nextInt();
        System.out.println("Año: ");
        int anio= leer.nextInt();
        Date cad= new Date(anio, mes, dia);
       p.setCaducidad(cad);
        return p;
    }
    
}
