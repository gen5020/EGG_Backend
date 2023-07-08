/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascota;

import enum_sexo.sexo;
import mascota.Entidades.Mascotas;

public class MascotaApp {

    public static void main(String[] args) {


//alt+shift+f= identar
        Mascotas m1 = new Mascotas();
 // ctrl+shift+c=comentar

//modificador de acceso public
        m1.apodo = "Odiosito";
        m1.nombre = "Ody";
        m1.tipo = "Perro";

//modificador de acceso private por eso se usa sett
        m1.setRaza("Caniche");
        m1.setColor("Blanco");
        m1.setEdad(2);
        m1.setCola(true);
m1.setSexo(sexo.macho);
        System.out.println(m1.apodo + " " + m1.nombre + " " + m1.getEdad() + " " + m1.tipo + " " + m1.getColor() + " "+m1.getRaza()+" "+m1.getSexo());
        System.out.println(m1);
    }
    
}
