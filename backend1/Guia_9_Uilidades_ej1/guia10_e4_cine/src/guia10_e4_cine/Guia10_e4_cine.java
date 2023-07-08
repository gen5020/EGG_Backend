/*

 */

package guia10_e4_cine;

import servicios.PeliculaServicio;

/**
 * @noelia User
 */
public class Guia10_e4_cine {

    public static void main(String[] args) {
      
        PeliculaServicio serv= new PeliculaServicio();
        serv.crearPelicula();
        serv.mostrarPelis();
        serv.duracionMayor1();
        serv.ordenarDuracionMayor();
        serv.ordenarDuracionMenor();
        serv.ordenarTituloAlfab();
        serv.ordenarDirectorAlfab();
        
        
    }//fin void

}//fin class
