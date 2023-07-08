/*
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
 */
package Servicios;

import guia12_ex1_alquiler_barcos.Alquiler;
import guia12_ex1_alquiler_barcos.Barco;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ServicioAlquiler {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");    
    Alquiler a1=new Alquiler();
    public void datosAlquiler(Barco b1){
       
        System.out.print("Nombre: ");
       a1.setNombre(leer.next());
        System.out.print("DNI: ");
        a1.setDni(leer.nextInt());
        System.out.println("Fecha de Amarre: ");
        System.out.print("Dia: ");
        int dia= leer.nextInt();
        System.out.print("Mes: ");
        int mes= leer.nextInt();
        System.out.println("Año: ");
        int anio= leer.nextInt();
        a1.setFechaAlq(anio,mes,dia);
        System.out.println("Fecha de Devolucion: ");
        System.out.print("Dia: ");
        dia= leer.nextInt();
        System.out.print("Mes: ");
        mes= leer.nextInt();
        System.out.println("Año: ");
        anio= leer.nextInt();
        a1.setFechaAlq(anio,mes,dia);
        System.out.println("Posicion Amarre: ");
        a1.setPosicionAmarre(leer.nextInt());
        
    }
//Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
//alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
//multiplicando por 10 los metros de eslora).
    public void calcularAlquiler(){
      long diferenciaMilisegundos = a1.getFechaDev().getTime() - a1.getFechaAlq().getTime();
      long diferenciaDias = TimeUnit.DAYS.convert(diferenciaMilisegundos, TimeUnit.MILLISECONDS);
        System.out.println("Cantidad de dias: "+diferenciaDias);
        int modul= b1.valorModulo(b1);
        int precioAlquiler= (int) ((int) modul*diferenciaDias);
        
    }
    
    
}
