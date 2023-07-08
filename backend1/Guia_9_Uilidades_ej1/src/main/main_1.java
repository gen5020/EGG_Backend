/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import entidades.Cadena;
import java.util.Scanner;
import servicios.CadenaServicio;

public class main_1 {

    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
        CadenaServicio serv = new CadenaServicio();
       
        Cadena caden1= serv.crearCadena();
        serv.mostrarVocales(caden1);
        serv.invertirFrase(caden1);
        serv.vecesRepetido(caden1);
        
        System.out.println("Ingrese su 2da frase: ");
        String f2= leer.nextLine();       
        serv.compararLongitud(caden1, f2);
        
        System.out.println("Ingrese su 2da frase: ");
        String f3= leer.nextLine();   
        serv.unirFrases(caden1, f3);
        
        serv.reemplazar(caden1);
        
        System.out.println(" Buscar la siguiente letra: ");
        String buscar= leer.nextLine();
        System.out.println("¿La frase contiene la letra ingresada?");
        System.out.println(serv.contiene(caden1,buscar));
        
        
        
        
    }   
    }    
  /*  }//void
        public static int contarVocales(String f1){
        int contV=0; //contador vocal
            System.out.println("Ingresar frase");
      // String  f1= leer.nextLine();
        for (int i = 0; i < f1.length(); i++) {
           char pos=Character.toLowerCase(f1.charAt(i));
            if ((pos=='a')||(pos=='e')||(pos=='i')||(pos=='o')||(pos=='u')) 
                contV++;
            }
        
        return contV;
    }
   */

