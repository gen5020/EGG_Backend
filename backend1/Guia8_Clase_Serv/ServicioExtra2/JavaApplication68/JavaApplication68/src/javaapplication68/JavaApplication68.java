/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication68;

import Entidades.Cadena;
import Servicios.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class JavaApplication68 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        CadenaServicio cadserv = new CadenaServicio();
        Cadena cad = cadserv.crearCadena();

        cadserv.mostrarVocales(cad);
        cadserv.invertirFrase(cad);
        System.out.print("Ingrese la letra a buscar: ");
        cadserv.vecesRepetido(cad, leer.nextLine());
        System.out.println("Ingrese la frase para comparar: ");
        String frase= leer.nextLine();
        if (cadserv.compararLongitud(cad, frase)== 0) {
            System.out.println("Tienen la misma longitud");
        } else {
            System.out.println("No tienen la misma longitud");
        }
        System.out.println("Ingrese una nueva frase a concatenar");
        String frase2 = leer.nextLine();
        System.out.println(cadserv.unirFrases(cad, frase2));
        
        System.out.println("Ingrese un caracter para reemplazar a las A ");
        String letra = leer.next();
        System.out.println(cadserv.reemplazar(cad, letra));
        
        System.out.println("Ingrese un caracter para buscar ");
        String caracter = leer.next();
        if (cadserv.contiene(cad, caracter)) {
            System.out.println("Contiene ese caracter que ingresó ");
        } else {
            System.out.println("No contiene ese caracter");
        }
    }
}
