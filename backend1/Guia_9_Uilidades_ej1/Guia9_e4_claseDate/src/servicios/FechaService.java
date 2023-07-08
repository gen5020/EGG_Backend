/*
Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:


Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
 */
package servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaService {
    Scanner leer=new Scanner(System.in);
    /*Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
    Luego los pase por parámetro a un nuevo objeto Date.
    El método debe retornar el objeto Date. 
    Ejemplo fecha: Date fecha = new Date(anio, mes, dia);*/
    
    public Date fechaNacimiento(){
        System.out.println("Fecha de Nacimiento:"); 
        System.out.print("Dia: ");
        int dia=leer.nextInt();
        System.out.print("Mes: ");
        int mes=leer.nextInt();
        System.out.print("Año: ");
        int año=leer.nextInt();
        Date nac=new Date(año,mes,dia);
        return nac;
    }
    
    /*Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. 
Ejemplo: Date fechaActual = new  Date();    El método debe retornar el objeto Date.*/
    
    
    
    
    
    
}
