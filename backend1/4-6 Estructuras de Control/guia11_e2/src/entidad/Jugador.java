/*
esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
 */
package entidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;
    private int jugadores;

    public Jugador() {
    }

    public Jugador(int id, String nombre, boolean mojado, int jugadores) {
        this.id = id;
        this.nombre = "jugador"+id;
        this.mojado = false;
        this.jugadores = jugadores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public int getJugadores() {
        return jugadores;
    }

    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return  nombre + ", mojado=" + mojado + ", jugadores=" + jugadores + '}';
    }
    
 
   
//  Métodos:
//• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.
  public boolean disparo(RevolverDeAgua r1){
  if(r1.mojar(r1)){
      mojado=true;
      return true;
//  }else{
//      r1.siguienteChorro(r1);
//      return false;
//  }
// 
  
  }return false;
    
}
}
