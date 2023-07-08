/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */

package guia13_e5_juego_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @noelia User
 */
public class Guia13_e5_juego_excepciones {

    public static void main(String[] args) {
       int numAleatorio= (int)(Math.random()*500+1);
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");        
        System.out.println(numAleatorio); 
        System.out.println("Adivine el numero entre 1 y 500: ");
       int adiv=0;
       int cont=1;
       
       
       try{
        
         adivinar(adiv,cont,numAleatorio);
        }catch(InputMismatchException e){
            System.err.println("Ingresar solo numeros");
            cont++;
            adivinar(adiv,cont,numAleatorio);
        }
       
    }//fin void

    public static void adivinar(int adiv, int cont, int numAleatorio){
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");    
        do {
            try{
            adiv= leer.nextInt();
//            System.out.println("Intentos Fallidos= "+cont);
            if(adiv==numAleatorio){
                System.out.println("You Win");
                System.out.println("Intentos "+ cont);
                break;
            }else if(adiv>numAleatorio){
                System.out.println("Prueba con un numero menor");
            }else{
                System.out.println("Prueba con un numero mayor");
            }
            }catch(InputMismatchException e){
                System.err.println("Escribe solo numeros");
            leer.next();
            }
            
            
            cont++;
        } while (adiv!=numAleatorio);
    }
    
    
    
}//fin class
