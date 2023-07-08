/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Espectador;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ServicioEspectador {
    ArrayList <Espectador> espectadores=new  ArrayList <>();
    public void crearEspectador(){
        int cant= (int) (Math.random()*80+0);//cantidad de espectadores
        for (int i = 0; i < cant; i++) {
           Espectador e1= new Espectador();
           e1.setNombre("esp"+i);
           e1.setDineroDis((Math.random()*1500+500));
           e1.setEdad((int)(Math.random()*80+12));
           espectadores.add(e1);
        }
        
        
    }
    
    public void mostrarEspectadores(){
        for (Espectador espectador : espectadores) {
            System.out.println(espectador);
        }
        
    }
    
    
    
    
    
    
}
