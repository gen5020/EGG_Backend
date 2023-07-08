/*
Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
 */
package Ejercicios;

import java.util.Scanner;

public class E7_Substring_equals_length {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int largo=5;
        int correc=0;
        int incor=0;
        String end="&&&&&";//clave para finalizar el bucle
        String fde;
       
        do{//repetir
        System.out.println("Ingresar FDE");
        fde=leer.nextLine();//entrada por teclado FDE
        if(fde.length()==5){
        String in1=(fde.substring(0,1));//primera letra de cadena
        String end2=(fde.substring(4,5));//letra posicion 4 de cadena
        
         System.out.println(in1+" "+end2);
            System.out.println(fde.length());
        
        if((fde.length()==5)&&(in1.equalsIgnoreCase("x"))&&(end2.equalsIgnoreCase("O"))){
            correc++;//contador correcto 
            System.out.println(correc+" bien");
         }else{
            incor++;//contador incorrecto
            System.out.println(incor+" mal");
        }
        }
    }while(((fde.compareTo(end))!=0)||(fde.length()!=5));//mientras fde distinto de end("&&&&&")
        System.out.println("FDE Correctos= "+correc);
        System.out.println("FDE Correctos= "+incor);
}
}