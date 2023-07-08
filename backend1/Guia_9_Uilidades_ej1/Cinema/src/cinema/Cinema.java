package cinema;

import servicios.ServicioCine;
import servicios.ServicioSala;


public class Cinema {


    public static void main(String[] args) {
  ServicioCine cine = new ServicioCine();
  ServicioSala sala= new ServicioSala();
 sala.crearCine();
    }

}
