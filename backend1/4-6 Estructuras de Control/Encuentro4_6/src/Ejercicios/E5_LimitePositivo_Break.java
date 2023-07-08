/*
 Escriba un programa en el cual se ingrese un valor limite positivo, 
y a continuacion solicite números al usuario hasta que la suma de los 
números introducidos supere el límite inicial.
 */
package Ejercicios;

import java.util.Scanner;

public class E5_LimitePositivo_Break {

    public static void main(String[] args) {
       int limite=20;
       int sum=0;
      int n1;
       Scanner leer= new Scanner(System.in);
      
       do{ 
       System.out.print("Ingrese un numero: ");
         n1=leer.nextInt();
        sum=sum+n1;
            if (sum>limite){
                System.out.println("La suma de los numeros introducidos es "+sum+" "
                        + "y ha superado el valor limete que es: "+limite);
             break;
             }
    }while(n1>(0));
   
}
}
