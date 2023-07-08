/*
 (Recordemos hacer
los servicios en la clase correspondiente)
 */
package servicios;

import entidad.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author User
 */
public class PaisesServicios {

    Scanner leer = new Scanner(System.in).reset();
    Pais p = new Pais();
//El programa pedirá un país en un bucle, se guardará el país en el
//conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
//si decide salir, se mostrará todos los países guardados en el conjunto.
    public void llenarConjuntoPaises() {
        String opc = "s";

        while (opc.equalsIgnoreCase("s")) {
            System.out.print("Pais:");
            p.getPaises().add(leer.nextLine());//añade el pais dentro del hashset p;
            System.out.print("¿Desea ingresar otro pais? S/N");
            opc = leer.nextLine();

        }
        System.out.println(p);
    }

//    Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
//cómo se ordena un conjunto.
    public void ordenarAlfab(){
        System.out.println("----------------------------------");
        System.out.println("Conjunto Ordenado Alfabeticamente");
        TreeSet<String> paisOrd=new TreeSet(p.getPaises());//convierto el hashset a un treeset porque este lo ordena alfabeticamente
        System.out.println(paisOrd);
        
        
    }
//    Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
//buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
//usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
//al usuario.
    public void elimanarElemento(){
        System.out.println("Ingresar nombre del pais que desea eliminar del conjunto:");
        String buscar=leer.nextLine();
        Integer cont=0;
        Iterator <String> it= p.getPaises().iterator();
        while(it.hasNext()){
            if (it.next().equalsIgnoreCase(buscar)) {
                it.remove();
                cont++;
            }
        }
        if(cont!=0){
            System.out.println("Ha sido eliminado con exito, el conjunto ha quedado asi: ");
            System.out.println(p);
            
        }else{ System.out.println("\033[31m El pais ingresado NO ha sido encontrado");
        
    }
    }
    
    
}
