/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:



 */
package servicios;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PeliculaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");    
   Scanner leer2=new Scanner(System.in).useDelimiter("\n"); 
    ArrayList <Pelicula> listPel= new ArrayList();//lista de peliculas
  
   
   public void crearPelicula(){
       boolean opc=true;
         String resp;
       do {
           Pelicula peli=new Pelicula();
           System.out.print("Nombre: ");
           peli.setTitulo(leer.next());
           System.out.print("Director: ");
           peli.setDirector(leer2.next());
           System.out.print("Duracion: ");
           peli.setDuracion(leer.nextDouble());
           listPel.add(peli);
           System.out.println("¿Desea ingresar otra peli? S/N");
           resp=leer.next();
            if(resp.equalsIgnoreCase("n")){
                opc=false;}
           
       } while (opc);
       
   }
   
   //• Mostrar en pantalla todas las películas.
   
   public void mostrarPelis(){
        System.out.println("");
       System.out.println("\033[36m-------------------------------------------------");
       System.out.println("Lista de peliculas: ");
       System.out.println(" ");
       for (Pelicula pelicula : listPel) {
           System.out.println(pelicula);
       }  
}
 //• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
   public void duracionMayor1(){
        System.out.println("");
       System.out.println("\033[36m-------------------------------------------------");
       System.out.println("\nPeliculas mayores a 1 hora:");
       for (Pelicula pelicula : listPel) {
           if(pelicula.getDuracion()>1)
            System.out.println(pelicula);
       }  
   }
   
   //• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
    public static Comparator<Pelicula> compararDuracion= new Comparator<Pelicula>(){
       @Override 
       public int compare(Pelicula p1, Pelicula p2){
           return p2.getDuracion().compareTo(p1.getDuracion());
       }
    };
   
   public void ordenarDuracionMayor(){
        System.out.println("");
       System.out.println("\033[36m-------------------------------------------------");
       System.out.println("\033[37mLista Ordenada duracion de mayor a menor");
     Collections.sort(listPel,  compararDuracion);
       for (Pelicula pelicula : listPel) {
           
            System.out.println(pelicula);
       }  
       
   }
   //• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla. 
    public void ordenarDuracionMenor(){
         System.out.println("");
      System.out.println("\033[36m-------------------------------------------------");
       System.out.println("\033[37mLista Ordenada duracion de mayor a menor");
     Collections.sort(listPel,  compararDuracion.reversed());//invierte el orden
       for (Pelicula pelicula : listPel) {
           
            System.out.println(pelicula);
       }  
       
   } 
    
   //• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
     public static Comparator<Pelicula> compararTitulo= new Comparator<Pelicula>(){
       @Override 
       public int compare(Pelicula p1, Pelicula p2){
           return p1.getTitulo().compareTo(p2.getTitulo());
       }
    };
     
   public void ordenarTituloAlfab(){
        System.out.println("");
      System.out.println("\033[36m-------------------------------------------------");
       System.out.println("\033[37mLista Ordenada por titulo Alfabeticamente");
     Collections.sort(listPel,  compararTitulo);
       for (Pelicula pelicula : listPel) {
           
            System.out.println(pelicula);
       }  
   }
      // • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    
      public static Comparator<Pelicula> compararDirector= new Comparator<Pelicula>(){
       @Override 
       public int compare(Pelicula p1, Pelicula p2){
           return p1.getDirector().compareTo(p2.getDirector());
       }
    };
     
   public void ordenarDirectorAlfab(){
       System.out.println("");
       System.out.println("\033[36m-------------------------------------------------");
       System.out.println("\033[37mLista Ordenada por Director Alfabeticamente");
     Collections.sort(listPel,  compararDirector);
       for (Pelicula pelicula : listPel) {
           
            System.out.println(pelicula);
       }
   }
    
}
