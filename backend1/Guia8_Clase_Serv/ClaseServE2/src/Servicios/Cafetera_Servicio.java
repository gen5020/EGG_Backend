
//Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
 
package Servicios;

import entidades.Cafetera;
import java.util.Scanner;

public class Cafetera_Servicio {
 private final Scanner leer=new Scanner(System.in);
    Cafetera cf1=new Cafetera();

//a)Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
    public void llenarCafetera(Cafetera cf1){//Cafetera 
    cf1.setCantidadActual(cf1.getCapacidadMaxima());
        System.out.println("La cafetera está llena "+cf1.getCantidadActual());
   } 
   
/* b)Método servirTaza(int): se pide el tamaño de una taza vacía,el método recibe 
    el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada.
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
*/    
public void servirTaza(Cafetera cf1){
        System.out.println("Ingresa la capacidad de la taza vacia: ");
        int tazaVacia=leer.nextInt();
        if (tazaVacia>cf1.getCantidadActual()){
           int resto=(int) (cf1.getCantidadActual()-tazaVacia);
            
            System.out.println("No habia suficiente cafe para llenar la taza, solo se cargó: "+ cf1.getCantidadActual()+" ml");
       cf1.setCantidadActual(resto);
        }else{
            int resto=(int) (cf1.getCantidadActual()-tazaVacia);
            cf1.setCantidadActual(resto);
            System.out.println("La taza ha sido llenada con Éxito");
            System.out.println("cantidad de cafe restante: "+cf1.getCantidadActual());
        }
    }
 
//C)Método vaciarCafetera(): pone la cantidad de café actual en cero. 
public void vaciarCafetera(Cafetera cf1){
    cf1.setCantidadActual(0);
     System.out.println("La cafetera está vacía "+cf1.getCantidadActual());
}
/*d)Método agregarCafe(int): se le pide al usuario una cantidad de café, 
el método lo recibe y se añade a la cafetera la cantidad de café indicada.
*/
public void agregarCafe(Cafetera cf1){
    System.out.println("Ingresar la cantidad de cafe que va a agregar:");
    int cafeNuevo=leer.nextInt();
    cf1.setCantidadActual(cafeNuevo);
     System.out.println("La cafetera tiene "+cf1.getCantidadActual()+" ml");
}
}
