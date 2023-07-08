/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia11_ejemplo1;

import entidad.Dni;
import entidad.Persona;

/**
 *
 * @author User
 */
public class Guia11_ejemplo1 {

    public static void main(String[] args) {
      Dni num= new Dni();
      num.setSerie("n");
      num.setNumero(34533212);
      Persona p=new Persona();
      p.setDni(num);
      p.setNombre("edu");
      p.setApellido("fretes");
        System.out.println(p.toString());   
     System.out.println(p.getApellido()+"  "+p.getNombre()+" y "+p.getDni().toString());
    }
    
}
