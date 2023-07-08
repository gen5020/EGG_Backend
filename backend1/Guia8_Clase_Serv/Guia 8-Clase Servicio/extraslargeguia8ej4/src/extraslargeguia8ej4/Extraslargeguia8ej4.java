/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraslargeguia8ej4;

import Servicios.ServiciosAutobus;
import java.util.Scanner;

/**
 *
 * @author Loscortes
 */
public class Extraslargeguia8ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//    identificación, capacidad máxima de pasajeros, capacidad actual
// de pasajeros y cantidad de paradas
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServiciosAutobus c1 = new ServiciosAutobus();
        int op = 0;
        do {
            System.out.println("-------------------------");
        System.out.println("1 - Ingresar datos iniciales");
        System.out.println("2 - Iniciar recorrido");
        System.out.println("3 - Subir pasajeros");
        System.out.println("4 - Bajar pasajeros");
        System.out.println("5 - Finalizar recorrido");
        System.out.println("6 - Mostrarla");
        System.out.println("7 - Get out");
        System.out.println("----------------------------");
               

      
        System.out.println("ingrese la opcion deseada");
        
                op = leer.nextInt();
            switch (op) {
                case 1:
                    c1.CrearAutobus();
                    break;
                case 2:
                    System.out.println("Cuentes persones suben");
                    int cant = leer.nextInt();
                    c1.inicioRecorrido(cant);
                    break;
                case 3:
                    System.out.println("Ingrese cuantas personas suben y en que parada");
                    int cant1 = leer.nextInt();
                    int parada = leer.nextInt();
                    c1.SubirPasajeros(cant1, parada);
                    break;
                case 4:
                    System.out.println("Ingrese cuantas personas bajan y en que parada");
                    int cant2 = leer.nextInt();
                    int parada2 = leer.nextInt();
                    c1.bajarPasajeros(cant2, parada2);
                    break;
                case 5:
                    c1.FinRecorrido();
                    break;
                case 6:
                    c1.MostrarAutobus();
                    break;
                case 7:
                    System.out.println("vuaelvas prontosss");
                    break;
                default:
                    System.out.println("opcion incorrecta");

                    break;
            }
        } while (op != 7);

    }
}

