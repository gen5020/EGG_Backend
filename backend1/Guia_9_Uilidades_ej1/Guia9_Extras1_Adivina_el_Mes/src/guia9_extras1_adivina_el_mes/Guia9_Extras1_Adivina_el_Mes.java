/*

Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!

 */
package guia9_extras1_adivina_el_mes;

import entidad.Juego;
import igu.Pantalla;
import servicios.JuegoServicio;

public class Guia9_Extras1_Adivina_el_Mes {

    public static void main(String[] args) {
       
       Pantalla p= new Pantalla();
       p.setVisible(true);//hacer visible a la pantalla si es true
       p.setLocationRelativeTo(null);//pone la pantalla en el medio
       p.mostrar();
    }
    
}
