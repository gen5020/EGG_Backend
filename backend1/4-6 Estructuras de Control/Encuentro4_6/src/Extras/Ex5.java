/*
 Una obra social tiene tres clases de socios:
-‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
-‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
-'C' Los socios que menos aportan,no reciben
descuentos sobre dichos tratamientos.
-Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
 */
package Extras;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
        System.out.println("Elija la letra correspondiente a su categoria: A,B,C");   
    String clase=leer.next();
    clase=clase.toUpperCase();
        System.out.println("Ingrese el valor real del tratamiento:");
        double valorR=leer.nextDouble();int desc;double importe=0;
        switch(clase){
            case "A":
              importe=valorR-(valorR*0.50);
                break;
            case "B":
                 importe=valorR-(valorR*0.35);
                break;
            case "C":
                importe=valorR;
                break;
        }
        System.out.println("El importe a pagar es $"+importe);
    }
    
}
