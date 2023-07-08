
package Ejercicios;

import java.util.Scanner;

public class Ex6_b {

    public static void main(String[] args) {
              // Creamos el objeto scanner
        Scanner leerNum = new Scanner(System.in);
        // Creamos la variable num
        int pers ;
        double altura ;
        double auxGral = 0 ;
        double auxBaja = 0;
        int contBaja = 0;
        // Pedimos al usuario que ingrese los datos
        System.out.print("Ingrese la cantidad de personas: ");
        pers = leerNum.nextInt();
        // Bucle para pedir altura
        for (int i = 1; i <= pers; i++){
            System.out.println("Ingrese la altura de la persona " + i);
            altura = leerNum.nextDouble();
            auxGral = auxGral + altura;
            if (altura < 1.60){
                auxBaja = auxBaja + altura;
                contBaja ++;
            } 
            
        }
        
        // Hacemos el promedio
        System.out.println("El promedio de estaturas en general es: " + (auxGral / pers));
        // condicionamos si hay menores a 1.60
        if (auxBaja > 0 ) {
            System.out.println("El promedio de estaturas menores a 1.60 es: " + (auxBaja / contBaja));
        } else {
            System.out.println("No haía ninguna persona menor a 1.60 ");
        }
        
    }
    }
    


