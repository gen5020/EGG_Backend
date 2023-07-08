/*
 Ejercicio 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
*/
package encuentro4_6;

import java.util.Scanner;

public class E9_Ejemplo_Do_While {

    public static void main(String[] args) {
     int n1;
     int sum=0;
     int cont=0;
      Scanner leer= new Scanner(System.in);
      
      do {
           System.out.println("Ingrese 1 Número Entero");
           n1=leer.nextInt();
           cont=cont+1;
           if (n1>0){
               sum=(sum+n1);
           }
           if (n1==0){
              
               System.out.println("Se Capturó el 0");
               
               break;
           }
      }while (cont!=20);
       System.out.println("La suma total de los numeros es: "+sum);
      }
   
    }
    

