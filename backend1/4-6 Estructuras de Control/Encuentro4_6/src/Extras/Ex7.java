/*
 Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
 */
package Extras;
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
      int num;  int numMax=0;int numMin=0;int cont=0;
    //while((num>0)||(num<1000)){
        do{
    System.out.println("Ingrese 1 Número:");
       num=leer.nextInt();        
    if (num>numMax){
            numMax=num;
            System.out.println("Numero max: "+numMax);
        }else if(num<numMax){
            numMin=num;
            System.out.println("Numero min: "+numMin);
           
        }
    if (num>0){
    cont++;
            }
    }while(num>0);    
        System.out.println("Número Maximo: "+numMax);
        System.out.println("Número Min: "+numMin);
        System.out.println("Promedio: "+numMax);
    }
    
}
