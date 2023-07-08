/*
 Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:

Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package guia11_e2;

import entidad.Juego;
import entidad.Jugador;
import entidad.RevolverDeAgua;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Guia11_e2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       RevolverDeAgua r1=new RevolverDeAgua();
       Juego j= new Juego();
       ArrayList <Jugador> jugadores= new ArrayList<Jugador>();
       j.llenarJuego(jugadores, r1);
       j.ronda(jugadores, r1);
//       r1.llenarRevolver(r1);
//       System.out.println(r1.getPosicionActual()+" "+ r1.getPosicionAgua());
//       r1.mojar(r1);
//       r1.siguienteChorro(r1);
//        System.out.println(r1.toString());
//        
//       Jugador jugador=new Jugador();
//       
//       jugador.disparo(r1);
    }
    
}
