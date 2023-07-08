/*
 3. Realizar una baraja de cartas españolas orientada a objetos.
 */

package guia11_e3_baraja;

import entidad.Baraja;
import java.util.Collections;

/**
 * @noelia User
 */
public class Guia11_e3_baraja {

    public static void main(String[] args) {
      Baraja b1= new Baraja();
      
      b1.llenarBaraja();
      b1.barajar();
      b1.siguienteCarta();
      b1.cartasDisponibles();
      b1.siguienteCarta();
      b1.cartasDisponibles();
      b1.siguienteCarta();
      b1.cartasDisponibles();
     b1.darCartas();
     b1.cartasDisponibles();
     b1.cartasMonton();
     b1.mostrarBaraja();
    }//fin void

}//fin class
