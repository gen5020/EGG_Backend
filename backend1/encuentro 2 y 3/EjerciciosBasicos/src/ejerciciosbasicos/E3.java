/*
 Programa que lee por teclado el valor del radio de una circunferencia y calcula 
y muestra por pantalla la longitud y el área de la circunferencia. 

Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2

 */
package ejerciciosbasicos;
import static java.lang.Math.PI;
import java.util.Scanner;
public class E3 {

    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
      System.out.println("Ingrese el valor del radio de una circunferencia");
    double radio=leer.nextDouble();
    double longitude= (2*PI*radio);
    double area= PI*(Math.pow(radio,2));
    System.out.println("Longitud= "+longitude);
    System.out.println("Área= "+area);
    
    }
    
}
