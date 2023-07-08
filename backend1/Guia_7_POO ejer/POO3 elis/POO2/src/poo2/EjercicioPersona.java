/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

import Entidades.Persona;
import Servicio.ServicioPersona;

/**
 *
 * @author eglys
 */
public class EjercicioPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, deberá comprobar si la persona 
         está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.*/
        ServicioPersona sp= new ServicioPersona();
        
        Persona per1 = sp.crearPersona();
        Persona per2 = sp.crearPersona();
        Persona per3 = sp.crearPersona();
        Persona per4 = sp.crearPersona();
        
        
        
        
    }
    
}
