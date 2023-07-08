/*
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.
 */
package Extras;
// \n=salto de linea
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    int num;String rom="a";
   do{
    System.out.println("Ingrese 1 número entre 1 y 10");
     num=leer.nextInt();
        
       switch(num){
            case 1:
                   rom="I";
                break; 
            case 2:
                   rom="II";
                break;   
            case 3:
                   rom="III";
                break; 
            case 4:
                   rom="IV";
                break; 
            case 5:
                   rom="V";
                break;   
            case 6:
                   rom="VI";
                break; 
             case 7:
                   rom="VII";
                break; 
            case 8:
                   rom="VIII";
                break;   
            case 9:
                   rom="IX";
                break;     
                 case 10:
                   rom="X";
                break; 
       }
   }while((num<1)||(num>10)); 
   
System.out.println("El numero:"+num+" y su equivalente en romano es: "+rom);
         

   }
}

