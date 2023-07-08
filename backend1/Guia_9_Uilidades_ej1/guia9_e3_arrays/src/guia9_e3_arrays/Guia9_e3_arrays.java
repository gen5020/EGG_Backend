/*
 Clase Arrays
 
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.

 */
package guia9_e3_arrays;

import Servicio.ArregloService;

public class Guia9_e3_arrays {

    public static void main(String[] args) {
     //Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales.
     double [] a= new double[50];
     double [] b= new double [20];
     
    ArregloService arreglo1 = new ArregloService();
  arreglo1.inicializarA(a);
        System.out.println("Arreglo A");
  arreglo1.mostrar(a);
        System.out.println("Arreglo A Ordenado");
  arreglo1.ordenar(a);
  arreglo1.mostrar(a);
        System.out.println("Arrgelo B");
        arreglo1.inicializarB(a, b);
        arreglo1.mostrar(b);
     
     
    }
    
}
