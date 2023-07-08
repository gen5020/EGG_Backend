/*

 */
package entidad;

import java.util.Random;

/**
 *
 * @author User
 */
public class RevolverDeAgua {
// esta clase posee los siguientes atributos: posición actual (posición
//del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
//tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.   
  private int posicionActual;
  private int posicionAgua;

    public RevolverDeAgua() {
    }

  public RevolverDeAgua(int posicionActual, int posicionAgua) {
    this.posicionActual=posicionActual;
    this.posicionAgua= posicionAgua;
  }
    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua " + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua;
    }
    
    
//Métodos:
//• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
//deben ser aleatorios.
public void llenarRevolver(RevolverDeAgua r1){
r1.setPosicionActual((int)(Math.random()*7-1)+1);
r1.setPosicionAgua((int)(Math.random()*7-1)+1);
}

//mojar(): devuelve true si la posición del agua coincide con la posición actual
public boolean mojar(RevolverDeAgua r1){

    if(r1.getPosicionActual()==r1.getPosicionAgua()){
         //System.out.println("Mojado");
       return true; 
     
    }
    return false;
   
}

//siguienteChorro(): cambia a la siguiente posición del tambor
public void siguienteChorro(RevolverDeAgua r1){
   
    if(r1.getPosicionActual()!=6){
      
    r1.setPosicionActual(r1.getPosicionActual()+1);
    }else{
        r1.setPosicionActual(1);
    }
}
    
}
