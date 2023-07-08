/*
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
 y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package servicios;

import entidad.Producto;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ProductoServicio {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    Scanner leern = new Scanner(System.in).useDelimiter("\n");
    Producto prodHash = new Producto();

    public void agregarElemento() {

        String resp = "s";
        while (resp.equalsIgnoreCase("s")) {
            System.out.print("Producto: ");
            String prod = leer.next();
            System.out.print("Precio: ");
            Double precio = leern.nextDouble();
            prodHash.getProd().put(prod, precio);
            System.out.println("¿Ingresar otro producto? S/N   ");
            resp = leer.next();
        }
        System.out.println(prodHash);
    }

    public void modificarElemento() {
        int cont = 0;
        System.out.println("Escriba el nombre del producto que desea modificar");
        String elemento = leer.next();

        
        for (Map.Entry<String, Double> entry : prodHash.getProd().entrySet()) {
            if (entry.getKey().equalsIgnoreCase(elemento)) {// COMPARA EL VALOR DE LA LLAVE CON EL EL ELEMENTO INGRESADO
                System.out.println("Escriba el nuevo precio");//si lo encuentra pide el nuevo precio
                Double precioN= leern.nextDouble();
                entry.setValue(precioN);//SETEA EL VALOR DEL MAP
                cont++;
            }

        }
        if (cont == 0) {
            System.out.println("El producto ingresado NO se encuentra en la lista");

        }
        System.out.println(prodHash);

    }
    //eliminar un producto      

    public void eliminarElemento() {
        System.out.println("Ingrese el nombre del producto que desea eliminar:");
        prodHash.getProd().remove(leer.next());//trae la llave y elimina todo ese elemento
        System.out.println(prodHash);
    }

}
