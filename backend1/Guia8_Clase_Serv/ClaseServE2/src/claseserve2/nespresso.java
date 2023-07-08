/*
Programa Nespresso. 
 */
package claseserve2;

import Servicios.Cafetera_Servicio;
import entidades.Cafetera;
import java.util.Scanner;

public class nespresso {

    public static void main(String[] args) {
        Cafetera_Servicio cfs=new Cafetera_Servicio();
        Cafetera cf1= new Cafetera();
       Scanner leer=new Scanner(System.in);
       do{
       System.out.println("------------Menu Nespresso----------");
        System.out.println("------------------------------------");
        System.out.println("Elegir opcion segun correponda:");
        System.out.println("A)Llenar Cafetera");
        System.out.println("B)Servir Taza");
        System.out.println("C)Vaciar Cafetera");
        System.out.println("D)Cargar Cafetera");
        String opcion=leer.nextLine();
                opcion=opcion.toUpperCase();
        switch(opcion){
            case "A":
               cfs.llenarCafetera(cf1);
               break;
            case "B":
                cfs.servirTaza(cf1);
                break;
            case "C": 
                cfs.vaciarCafetera(cf1);
            break;
            case "D":
                cfs.agregarCafe(cf1);
        }      
        
    }while(1>0);
    
}
}
