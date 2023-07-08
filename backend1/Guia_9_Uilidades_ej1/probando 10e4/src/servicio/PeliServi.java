/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Peli;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class PeliServi {
     Scanner teclado = new Scanner(System.in);
    
    ArrayList<Peli> pelis = new ArrayList();
    
    public void Pelicula(){
        
        boolean respuesta = true;
        do { 
        Peli a = new Peli();    
        System.out.println(" Escriba el nombre del director ");
        a.setDirector(teclado.next());
        System.out.println(" Escriba el nombre del titulo ");
        a.setTitulo(teclado.next());
        System.out.println(" Escriba la duracion de la pelicula en horas ");
        a.setDuracion(Duration.ofHours(teclado.nextInt()));
        pelis.add(a);
        System.out.println(" Quiere ingresar otra pelicula si/no ?");
        String resupesta1 = teclado.next();
        
        if(resupesta1.equals("no")){
            respuesta = false;
        }
        } while (respuesta);
        for (Peli pelic : pelis) {
            System.out.println(pelic);
        }
    }
    
    public void DuracionMayor(){
        Duration P= Duration.ofHours(1);
        
        for (Peli peli : pelis) {
            if(peli.getDuracion().toHours() > P.toHours()){
                System.out.println(" es igual ");
    }
            
 }
}}
