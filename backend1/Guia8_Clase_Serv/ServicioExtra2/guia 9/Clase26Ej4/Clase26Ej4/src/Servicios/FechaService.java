/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaService {

    public Scanner leer = new Scanner(System.in);

    //a)
    public Date fechaNacimiento() {
        System.out.println("Ingrese su día de nacimiento: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese su anio de nacimiento: ");
        int anio = leer.nextInt();

        return new Date(anio, mes, dia);
    }
    //b)

    public Date fechaActual() {
        Date fechaActual = new Date();
        int anioActual =fechaActual.getYear()+1900;
        fechaActual.setYear(anioActual);
        System.out.println("fecha actual " +  fechaActual.getYear());
        return fechaActual;
    }

    //c)
    public int difencia(Date C, Date fechaActual) {
        int anios = fechaActual.getYear() - C.getYear();
        if (fechaActual.getMonth() < C.getMonth()) {
            return anios-1;
        } else if (fechaActual.getMonth() == C.getMonth()) {
            if (fechaActual.getDay() >= C.getDay()) {
                return anios;
            } else {
                return anios-1;
            }
        } 
        return anios;
    }
    
//    public int difencia(Date C, Date fechaActual) {
//        int anios = fechaActual.getYear() - C.getYear();
//        System.out.println("fecha actual " + fechaActual.getYear());
//        System.out.println("fecha nacimiento " + C.getYear());
//        return anios;
//    }
}
