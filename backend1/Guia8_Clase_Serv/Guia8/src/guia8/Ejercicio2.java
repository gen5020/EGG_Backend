package guia8;

import Servicios.CafeteraServicio;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        CafeteraServicio cafe1 = new CafeteraServicio(); //Instanciamos
        cafe1.llenarCafetera();
        
        System.out.println("Ingrese la medida de la taza 1 - pequeña / 2 - grande");
        int taza= leer.nextInt();
        cafe1.servirTaza(taza);
        cafe1.mostrar();
        cafe1.vaciarCafetera();
        cafe1.mostrar();
        cafe1.rellenarCafetera();
        cafe1.mostrar();        
    }    
}