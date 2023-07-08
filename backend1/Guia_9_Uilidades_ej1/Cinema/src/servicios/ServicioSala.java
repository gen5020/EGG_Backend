/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Asiento;
import entidades.Cine;
import entidades.Pelicula;
import entidades.Sala;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author User
 */
public class ServicioSala {
    
    Sala norte = new Sala();
    ArrayList<Asiento> [][] asientos = new ArrayList[8][6];
    public void crearCine() {
        Cine paradiso = new Cine();
        
        
        Pelicula premier = new Pelicula("Anabelle", 40, 18,"Federico Martinez" );
        Asiento asiento = new Asiento();
       
        Integer aux1 ;
        String aux2 = "";
        String aux3= " ";
        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 6; j++) {
                aux1 = (8-i);

                switch (j) {

                    case 0:
                        aux2 = "a";
                        break;
                    case 1:
                        aux2 = "b";
                        break;
                    case 2:
                        aux2 = "c";
                        break;
                    case 3:
                        aux2 = "d";
                        break;
                    case 4:
                        aux2 = "e";
                        break;
                    case 5:
                        aux2 = "f";
                        break;

                }

                Asiento lugar= new Asiento (aux1,aux2,aux3);
                 asientos[i][j] = new ArrayList<>();
                asientos[i][j].add(lugar);
            }

        }
        norte.setUbicacion(asientos);

        
        
    }
     
     
     public void mostrarSala(){
         for (int i = 0; i < 8; i++) {
            System.out.print("");
            for (int j = 0; j < 6; j++) {
                
                System.out.print(norte.getUbicacion()[i][j]+"|");
              
            }
            System.out.println("");
        }
     }
     
     
     
     public void llenarAsientos(){
         for (int i = 0; i < 8; i++) {
            System.out.print("");
            for (int j = 0; j < 6; j++) {
                
                System.out.print(norte.getUbicacion()[i][j].iterator());
              norte.getUbicacion()[i][j].
            }
            System.out.println("");
        }
         
         for (ArrayList<Asiento>[] asiento : asientos) {
             asiento.
         }
     }
}
