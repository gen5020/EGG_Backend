/*
Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:

 */
package Servicio;

import java.util.Arrays;

public class ArregloService {

//Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
    public void inicializarA(double[] a1) {
        for (int i = 0; i < 50; i++) {
            a1[i] = (Math.random() * 10 + 1);
        }

    }
//Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.

    public void mostrar(double[] a1) {
        for (int i = 0; i < a1.length; i++) {
            System.out.print(" [" + a1[i] + "] ");
        }
        System.out.println("");
    }

//Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
    public void ordenar(double[] a1) {
              
       //Arrays.sort ordena el array de menor a mayor
           Arrays.sort(a1);
           int longitud= a1.length;
       double[] a3= new double[longitud];
                        
        for (int i =0 ; i < longitud; i++) {
            a3[i] = a1[a1.length-i-1];}
        
       
    for (int i =0 ; i < longitud; i++) {
            a1[i] = a3[i];
        
        }
    
}
//Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
//Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
  public void inicializarB(double[]a1, double[]b1){
      ordenar(a1); 
      for (int i = 0; i < b1.length; i++) {
          if (i<10){
              b1[i]=a1[i];
          }else{ 
              b1[i]=0.5;
          }
      }
 
    }
}
