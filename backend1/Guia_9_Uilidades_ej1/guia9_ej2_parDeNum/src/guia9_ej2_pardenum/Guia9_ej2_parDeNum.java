/*
 Método Static y Clase Math
 */
package guia9_ej2_pardenum;

import entidad.ParDeNumeros;
import java.util.Scanner;
import servicio.ParDeNumerosService;

public class Guia9_ej2_parDeNum {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
//creamos los ojetos 
        ParDeNumerosService serv = new ParDeNumerosService();
        ParDeNumeros p1 = new ParDeNumeros();
       int opc;
        do {
            System.out.println("Menú");
            System.out.println("----------------------------------------------");
            System.out.println("1.Mostrar Numeros");
            System.out.println("2. Mayor");
            System.out.println("3.Potencia");
            System.out.println("4.Raiz cuadrada");
            System.out.println("----------------------------------------------");
            System.out.print("Elegir opcion: ");

            opc = leer.nextInt();

//utilizamos los metodos dentro de un menu switch
            switch (opc) {
                case 1:
                    serv.mostrarValores(p1); //(pasamos como parametro el objeto de par de numeros)
                    break;
                case 2:
                    System.out.println("El mayor es: " + serv.devolverMayor(p1));
                    break;
                case 3:
                    System.out.println("La potencia es " + serv.calcularPotencia(p1));

                    break;
                case 4:
                    System.out.println("La raiz cuadrada es: " + serv.calcularRaiz(p1));

                default:

            }
        } while (opc > 0);

    }

}
