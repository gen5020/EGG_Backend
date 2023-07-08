/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia13_e4_excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @noelia User
 */
public class Guia13_e4_excepciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");                     
        String c1= leer.next();
        try {   
            int n1= leer.nextInt();
            int n2= Integer.parseInt(c1);
            double div= n1/n2;
        }catch (ArithmeticException e){
            System.out.println("Imposible dividir por 0");
        }catch(InputMismatchException e){
            System.out.println("Por favor ingresar solo numeros enteros");
        }catch(NumberFormatException e){
            System.out.println("No se puede convertir a int");
        }
       
        
        
        
    }//fin void

}//fin class
