/*
 6. Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 */
package Extras;

import java.util.Scanner;

public class EX6 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese cantidad de personas:");
        int num=leer.nextInt();double alt;int contS=0;int contI=0;double sumI=0;double sumS=0;
        for(int i=0;i<num;i++){
            System.out.println("Altura:");
        alt=leer.nextDouble();
        if(alt<1.60){
            sumI=alt+sumI;
            contI++;//contador altura inferior
        }else{
            sumS=alt+sumS;
            contS++;//contador altura superior
        }
        }
        System.out.println("Promedio Altura<1.60= "+sumI/contI);
        System.out.println("Promedio Altura>1.60= "+sumS/contS);
        
    }
    
}
