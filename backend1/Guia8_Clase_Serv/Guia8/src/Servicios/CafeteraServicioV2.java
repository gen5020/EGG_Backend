/*
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
package Servicios;

import Entidades.Cafeterav2;

public class CafeteraServicioV2 {
    
    public Cafeterav2 crearCafetera(){
        Cafeterav2 cafetera = new Cafeterav2();
        cafetera.setCapacidadMáxima(100);
        cafetera.setCantidadActual(0);
        return cafetera; 
    }
    public void llenarCafetera(Cafeterav2 cafetera){
        cafetera.setCantidadActual(cafetera.getCapacidadMáxima());
    }
    public void servirTaza(int taza,Cafeterav2 cafetera){
        if (taza < cafetera.getCantidadActual()) {
            System.out.println("Su cafe se ha servido.");
        }else if(taza == 2 && cafetera.getCantidadActual() == 1){
            System.out.println("Su taza solo se sirvio por la mitad.");
        }else if(taza == 2 && cafetera.getCantidadActual() == 0){
            System.out.println("Lo sentimos, no pudimos servir su cafe.");
        }else if(taza == 1 && cafetera.getCantidadActual() == 0){
            System.out.println("Lo sentimos, no pudimos servir su cafe.");
        }
        cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
    }
    public void vaciarCafetera(Cafeterav2 cafetera){
        cafetera.setCantidadActual(0);
    }
    public void agregarCafe(int cafe,Cafeterav2 cafetera){
        cafetera.setCantidadActual(cafe);
    }
}
