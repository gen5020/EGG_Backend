/*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList. 
 */

package guia10_e1_arraylist;

import entidad.Perro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @noelia User
 */
public class Guia10_E1_ArrayList {

    public static void main(String[] args) {
       //Collections
        ArrayList <String> razas= new ArrayList<>(); 
      Perro serv=new Perro();
            
        
    Scanner leer=new Scanner(System.in);
    
          String opc="si";
        while(opc.equalsIgnoreCase("si")){
         System.out.println("Nombre de Raza: ");
        String raza2= leer.nextLine();
        razas.add(raza2);
            System.out.println("¿Desea ingresar otra raza?");
           opc=leer.nextLine();
        } ;
   

  
        System.out.println("El ArrayList razas cuenta con un tamaño de "+ razas.size());
            System.out.println("usando el for each recorre el indice y muestra a cada elemento de la lista ");  
        System.out.println("las Razas Actuales son: ");
              
            for(String raza:razas){// se crea una variable temporal q se utiliza dentro del for para mostrar cada elemento de una variable
            System.out.println(raza);
        }
            System.out.println("muestra todos los elementos de la lista razas");
            System.out.println(razas);//
        
        
/*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.  Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.*/
            System.out.println("Escriba una raza para buscar en la lista");
            String raz=leer.next();
            //Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista ordenada.
            Iterator it=razas.iterator();
            Integer cont=0;
            while (it.hasNext()){
                if (it.next().equals(raz)){
                    it.remove();//borrar elemento
                   cont++;
                          }
            }
            if (cont==0){
                System.out.println("No se encontro la raza ingresada");
            }else{
                Collections.sort(razas);//ordenar lista
               System.out.println(razas);
            }
            
            
            
            
            
            
    }//fin void

}//fin class
