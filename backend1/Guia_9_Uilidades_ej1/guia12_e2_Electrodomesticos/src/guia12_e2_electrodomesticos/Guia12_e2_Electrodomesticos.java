/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia12_e2_electrodomesticos;

import entidad.Electrodomestico;
import entidad.Lavadora;
import java.util.Scanner;

/**
 * @noelia User
 */
public class Guia12_e2_Electrodomesticos {

    public static void main(String[] args) {
       Electrodomestico e=new Electrodomestico();
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");              
       
   
//      e.crearElectrodomestico();
//        System.out.println("color: "+e.getColor()+ " consumo: "+ e.getConsumo()+ " precio: "+ e.getPrecio());
//      e.precioFinal();
//        System.out.println("color: "+e.getColor()+ " consumo: "+ e.getConsumo()+ " precio: "+ e.getPrecio());


Lavadora l=new Lavadora();
l.crearLavadora();
l.precioFinal();
l.mostrar();
//     System.out.println(l.getColor()+" "+l.getConsumo()+" "+l.getPeso()+" "+l.getPrecio()+" "+l.toString());
    }//fin void

}//fin class
