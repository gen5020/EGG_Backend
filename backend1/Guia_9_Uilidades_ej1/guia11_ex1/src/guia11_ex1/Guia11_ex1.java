/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */

package guia11_ex1;

import entidad.Ad_ultimo;
import entidad.Adop;
import entidad.Adopcion;
import entidad.Lista_Adopcion;
import entidad.Perro;
import entidad.Persona;

/**
 * @noelia User
 */
public class Guia11_ex1 {

    public static void main(String[] args) {
        Lista_Adopcion list=new  Lista_Adopcion ();
        list.listaPerros();
        list.listaPers();
        list.adopcion();
        
        
    }//fin void

}//fin class
