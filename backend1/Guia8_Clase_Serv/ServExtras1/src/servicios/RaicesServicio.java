package Servicios;


import entidades.Raices;
import java.util.Scanner;

public class RaicesServicio {
    Raices raiz1 = new Raices();
    private Scanner leer = new Scanner(System.in);
   
    //a)Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c

    public double getDiscriminante(double a, double b, double c){
       //(b^2)-4*a*c
       return ((Math.pow(b, 2))-4*a*c);
    }
    /* b)Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, 
    para que esto ocurra, el discriminante debe ser mayor o igual que 0.*/
    public boolean tieneRaices(Raices raiz1, double a, double b, double c){
        double discriminante = ((Math.pow(b, 2))-4*a*c); 
        if (discriminante > 0) {
            return true;
        } else {
            return false;
        }
    }
    /*
    c) Método tieneRaiz(): devuelve un booleano indicando si tiene una
    única solución, para que esto ocurra, el discriminante debe ser igual
    que 0.
    */
    public boolean tieneRaiz(double a,double b,double c){
        double discriminante = ((Math.pow(b, 2))-4*a*c); 
        if (discriminante == 0) {
            return true;
        } else {
            return false;
        }
    }
    /*
    d) Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true,
    imprime las 2 posibles soluciones.
    */
    public void obtenerRaices(Raices raiz1,){
        boolean siNo = this.tieneRaices(raiz1, a,b,c);
        double discriminante = ((Math.pow(b, 2))-4*a*c);
      
        System.out.println("La solucion 2 es");
    }
}