package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;


public class CafeteraServicio {
    
    Scanner leer = new Scanner(System.in);
    
    Cafetera cafetera = new Cafetera(100,1);
    
    public void llenarCafetera(){
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("La cafetera esta al " + cafetera.getCantidadActual());
    }
    
    public void servirTaza(int taza){       

        if(taza < cafetera.getCantidadActual()){
            System.out.println("Su taza se lleno por completo");
        }else if(taza == 2 && cafetera.getCantidadActual() == 1 ){
            System.out.println("Su taza se llenó por la mitad");
        }else if(taza == 2 && cafetera.getCantidadActual() == 0){
            System.out.println("Su taza no puede ser llenada");
        }else if(taza == 1 && cafetera.getCantidadActual() == 1 ){
            System.out.println("Su taza se llenó por completo");
        }else if(taza == 1 && cafetera.getCantidadActual() == 0){
            System.out.println("Su taza no puede ser llenada");       
        }
        cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
    }
    
    public void mostrar(){
        System.out.println ("La cantidad actual es: " + cafetera.getCantidadActual());
    }
    
    public void vaciarCafetera(){
        cafetera.setCantidadActual(0);
    }
    
    public void rellenarCafetera(){
        System.out.println("Ingrese la cantidad de cafe a llenar:");
        int llenar = leer.nextInt();
        cafetera.setCantidadActual(cafetera.getCantidadActual() + llenar);
    }
}
