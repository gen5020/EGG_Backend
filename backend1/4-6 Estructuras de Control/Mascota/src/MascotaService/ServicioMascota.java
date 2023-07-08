/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MascotaService;

import enum_sexo.sexo;
import java.util.Scanner;
import mascota.Entidades.Mascotas;

public class ServicioMascota {
    private Scanner leer= new Scanner(System.in);
    
    public Mascotas crearMascota(){
        System.out.print("Nombre:");
        String nombre=leer.nextLine();
         System.out.print("Apodo:");
        String apodo=leer.nextLine();
         System.out.print("Color:");
        String color=leer.nextLine();
        System.out.println("Sexo:"+sexo.hembra);
    /*opcion de return creando una variable y el return
        Mascotas m= new Mascotas(nombre,apodo,color);
        return m;
*/
    return new Mascotas(nombre,apodo, color);
        
    }

   
}
