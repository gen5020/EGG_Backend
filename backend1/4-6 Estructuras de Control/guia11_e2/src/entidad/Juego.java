/*
Clase Juego: 
 */
package entidad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Juego {
 //esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y Revolver  
 private ArrayList <Jugador> jugadores=new ArrayList<Jugador>();
 private RevolverDeAgua r;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, RevolverDeAgua r) {
        this.jugadores = jugadores;
        this.r = r;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return r;
    }

    public void setRevolver(RevolverDeAgua r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + r + '}';
    }
 
    //Métodos:
//• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
//y el revolver para guardarlos en los atributos del juego.
 public void llenarJuego(ArrayList<Jugador>jugadores, RevolverDeAgua r){
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
     // ArrayList <Jugador> jugadores= new ArrayList();
      System.out.println("Cantidad de jugadores: (Entre 1 y 6)");
      //Jugador j1=new Jugador();
      Integer resp= leer.nextInt();
      Integer res;
      if (resp>0 && resp<7){
         res=resp;
          // j1.setJugadores(resp);
      }else{ 
        res=6;         
// j1.setJugadores(6);
      }
      for (int i = 0; i < res; i++) {
       Jugador j= new Jugador(); 
       j.setId((i+1));
       j.setNombre("Jugador "+j.getId());
       j.setJugadores(resp);
       j.setJugadores(res);
       jugadores.add(j);
      }
//      for (Jugador jugador : jugadores) {
//          System.out.println(jugador);
//      }
     
    r.llenarRevolver(r);
     System.out.println("Revolver Listo");
     
     
 }  
 
//  • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.  
  
public void ronda(ArrayList<Jugador>jugadores, RevolverDeAgua r){
//    Iterator it= jugadores.iterator();
//    
////    while(it.hasNext()){
////        it.next();
////        it.next().toString();
////        r.mojar(r);
////       
////    }   
    boolean resp=false;
    int ronda=0;
do {
      for (Jugador jugador : jugadores) {
      ronda++;//contador de rondas
//      System.out.println("posicion actual("+r.getPosicionActual()+") posicion agua "+ r.getPosicionAgua());
          jugador.disparo(r);
        System.out.println("--------------------");      
      System.out.println("    Disparo "+ronda);
         System.out.println("--------------------"); 
        if (jugador.disparo(r)==true){
      System.out.println(jugador.getNombre()+" Mojado");
         resp=false;   
      break;//si el jugador se moja se sale de bucle for
  }else{ 
      System.out.println(jugador.getNombre()+" Salvado");
//      System.out.println("posicion actual("+r.getPosicionActual()+") posicion agua "+ r.getPosicionAgua());
       r.siguienteChorro(r);//gira el tambor a la siguiente posicion
       
       resp=true;//el bucle continua con otra ronda hasta que alguno se moje
        }
    }   
    } while (resp);


    for (Jugador jugador : jugadores) {
        System.out.println(jugador.toString());
    }
 
   
    
    
    
//    do {
        
        
//        jugadores.get(0);
//        if (r.mojar(r)){
//      System.out.println("Mojado");
//  }else{ 
//      System.out.println("Salvado");
//  }
//    } while (r.mojar(r));
   
  
  
} 





 
}
