/*
Cree un Programa JAVA  de ficha de un paciente y lo muestre por pantalla.
 */
package ejerciciosbasicos;
 
import java.util.Scanner;

public class nombre {

    public static void main(String[] args) {
     Scanner leer= new Scanner(System.in);
     System.out.println("Paciente:");
     String nom= leer.nextLine();
     System.out.println("Edad");
     int edad= leer.nextInt();
     System.out.println("Peso");
     double peso=leer.nextDouble();//DECIMALES DESPUES DE ,
     System.out.println("Estatura:");
     double estatura=leer.nextDouble();
   System.out.println("El/la paciente "+nom+" de "+edad+" años de edad, tiene una altura de "+estatura+" y pesa "+peso+"kg.");
    }
    
}
