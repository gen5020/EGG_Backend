/*
 Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.
 */
package encuentro4_6;
import java.util.Scanner;
public class E6_Ejemplo_if_else {

  
    public static void main(String[] args) {
        System.out.println("Ingrese 2 numeros enteros:");
        Scanner leer= new Scanner(System.in);
        int n1= leer.nextInt();
        int n2= leer.nextInt();
        if ((n1>25)&&(n2>25)){
        System.out.println("Los 2 numeros son mayores a 25");
    }else if ((n1>25)||(n2>25)){
        System.out.println("Solo uno de los numeros es es mayor a 25");
    }else {
        System.out.println("Ninguno de los numeros es mayor a 25");
            
        }
    }
    
}
