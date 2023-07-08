/*
6. Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.

 */

package guia10_e6;

import java.util.Scanner;
import servicios.ProductoServicio;

/**
 * @noelia User
 */
public class Guia10_e6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1");        
        ProductoServicio serv=new ProductoServicio();
        do {
         
       // ProductoServicio serv=new ProductoServicio();//NO SE CREA DENTRO DEL DO PORQUE O SINO NO ME GUARDA LOS CAMBIOS
        System.out.println("----------------------------");
       System.out.println("          Menu: ");
        System.out.println("1).Agregar Producto");
        System.out.println("2).Modificar Precio");
        System.out.println("3).Eliminar Producto");
        System.out.println("----------------------------");
        int opc=leer.nextInt();
        switch (opc) {
            case 1:
                  serv.agregarElemento();
                break;
              case 2:
                 serv.modificarElemento();
                break;   
                 case 3:
                   serv.eliminarElemento();
                break;
            default:
                throw new AssertionError();
        }
        } while (true);
      
       
      
        
        
        
    }//fin void

}//fin class
