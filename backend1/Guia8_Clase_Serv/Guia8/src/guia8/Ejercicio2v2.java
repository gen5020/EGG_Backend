/*
2. Programa Nespresso. Desarrolle una clase Cafetera en el paquete
Entidades con los atributos capacidadMáxima (la cantidad máxima de
café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Agregar constructor vacío y con
parámetros así como setters y getters. Crear clase CafeteraServicio en
el paquete Servicios con los siguiente:
a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
capacidad máxima.
b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
método recibe el tamaño de la taza y simula la acción de servir la
taza con la capacidad indicada. Si la cantidad actual de café “no
alcanza” para llenar la taza, se sirve lo que quede. El método le
informará al usuario si se llenó o no la taza, y de no haberse llenado
en cuanto quedó la taza.
c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
el método lo recibe y se añade a la cafetera la cantidad de café
indicada.
*/
package guia8;

import Entidades.Cafeterav2;
import Servicios.CafeteraServicioV2;
import java.util.Scanner;


public class Ejercicio2v2 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CafeteraServicioV2 cafeteraServicio = new CafeteraServicioV2();
        Cafeterav2 cafetera1 = cafeteraServicio.crearCafetera();
        System.out.println(""+cafetera1.getCapacidadMáxima());
        System.out.println(""+cafetera1.getCantidadActual());
        cafeteraServicio.llenarCafetera(cafetera1);
        System.out.println(""+cafetera1.getCapacidadMáxima());
        System.out.println(""+cafetera1.getCantidadActual());
        System.out.println("Desesa una taza 1-pequeña o 2-grande");
        int taza = leer.nextInt();
        cafeteraServicio.servirTaza(taza, cafetera1);
        System.out.println(""+cafetera1.getCantidadActual());
        cafeteraServicio.vaciarCafetera(cafetera1);
        System.out.println(""+cafetera1.getCantidadActual());
        System.out.println("¿Cuanto cafe desea recargar a la cafetera?");
        int llenar = leer.nextInt();
        cafeteraServicio.agregarCafe(llenar,cafetera1);
        System.out.println("Se a rellenado la cafetera con: "+cafetera1.getCantidadActual()+" unidades.");
    }
    
}
