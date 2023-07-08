/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication14;

import entidad.Perro;
import entidad.Persona;

/**
 *
 * @author User
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1=new Persona();
        Persona p2= new Persona();
        Perro perro1= new Perro();
        Perro perro2= new Perro();
        p1.setNombre("edu");
        p1.setApellido("Paez");
        p1.setDni(12132);
        p1.setEdad(24);
        perro1.setNombre("ody");
        perro1.setRaza("caniche");
        perro1.setTamaño("pequeño");
        perro1.setEdad(2);
        p1.setP(perro1);
        p1.mostrar(p1);
        
       
    }
}


    

