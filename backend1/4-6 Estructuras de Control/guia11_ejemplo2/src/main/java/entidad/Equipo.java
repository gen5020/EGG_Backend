/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {
 private ArrayList<Jugador>equi=new ArrayList<Jugador>();

    public Equipo() {
    }

    public ArrayList<Jugador> getEqui() {
        return equi;
    }

    public void setEqui(ArrayList<Jugador> equi) {
        this.equi = equi;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
 
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    


public void llenarEquipo(){
    String resp="s";
do {
        Jugador j1=new Jugador();
            System.out.print("Nombre: ");
        j1.setNombre(leer.next());
            System.out.print("Apellido: ");
                j1.setApellido(leer.next());
            System.out.print("Posición: ");
            j1.setPosicion(leer.next());
            System.out.print("Número: ");
            j1.setNumero(leer.nextInt());
            equi.add(j1);
            System.out.println("¿Agregar otro jugador? S/N");
            resp=leer.next();
    } while (resp.equalsIgnoreCase("s"));
   }

    @Override
    public String toString() {
        return "Equipo{" + "equi=" + equi + '}';
    }
}


