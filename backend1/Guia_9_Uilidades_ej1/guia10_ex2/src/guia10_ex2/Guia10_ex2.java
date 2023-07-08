/*
2. 
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios
 */
package guia10_ex2;

import entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @noelia User
 */
public class Guia10_ex2 {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        ArrayList<CantanteFamoso> lista = new ArrayList();
        
 Guia10_ex2 funcion = new Guia10_ex2();//
        for (int i = 0; i <3; i++) {
            CantanteFamoso c1 = new CantanteFamoso();
            System.out.print("Cantante: ");
            c1.setNombre(leer.next());
            System.out.print("Disco mas Vendido: ");
            c1.setDiscoConMasVentas(leer.next());
            lista.add(c1);
        }
        funcion.mostrar(lista);
        int opc;
        do{
        System.out.println("--------------------------------------");
        System.out.println("                 Menu");
        System.out.println("--------------------------------------");
        System.out.println("1).Agregar un cantante");
        System.out.println("2).Eliminar un cantante");
        System.out.println("3).Mostrar Lista de Cantantes");
        System.out.println("4).Salir");
        opc = leer.nextInt();
 
        
     
 
        switch (opc) {
            case 1:
               funcion.agregar(lista);

                break;
            case 2:
                funcion.eliminar(lista);
                break;
            case 3:
                funcion.mostrar(lista);
                break;
            case 4:
                break;
            default:
                throw new AssertionError();
        }
 }while(opc!=4);
 
    }//fin void

    public void mostrar(ArrayList<CantanteFamoso> lista) {
        System.out.println("El arraylist tiene los siguientes cantantas");
        System.out.println(lista);
    }

    public void agregar(ArrayList<CantanteFamoso> lista) {
        CantanteFamoso c2 = new CantanteFamoso();
        System.out.print("Cantante: ");
        c2.setNombre(leer.next());
        System.out.print("Disco mas Vendido: ");
        c2.setDiscoConMasVentas(leer.next());
        lista.add(c2);

    }

    public void eliminar(ArrayList<CantanteFamoso> lista) {
        System.out.print("Ingresar el nombre del cantante que desea eliminar: ");
        String borrar = leer.next();
        Iterator <CantanteFamoso> it = lista.iterator();//es importante declarar el tipo de clase en el interator para poder usar el .get
        while (it.hasNext()) {
            if (it.next().getNombre().equals(borrar)) {
                it.remove();
            }
        }
    }

}//fin class
