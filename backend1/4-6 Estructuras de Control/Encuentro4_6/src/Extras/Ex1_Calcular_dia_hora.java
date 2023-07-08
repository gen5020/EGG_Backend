/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */
package Extras;

import java.util.Scanner;

public class Ex1_Calcular_dia_hora {

    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        System.out.print("Ingrese los minutos:");
        int min=leer.nextInt();
        int hora=(min/60);
        int dia=min/(24*60);
        int horas=(min-(1440*dia));
        
          System.out.println(dia+" Dia "+horas+" horas ");
        
    } 

}