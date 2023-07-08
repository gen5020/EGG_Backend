/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package guia11_e1_animal;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

/**
 * @noelia User
 */
public class Guia11_e1_animal {

    public static void main(String[] args) {

        Animal p1 = new Perro("stich", "carne", 2, "caniche");
        p1.alimentar();
        Animal p2 = new Perro("Teddy", "croquetas", 10, "Chihuahua");
        p2.alimentar();
        Animal g = new Gato("Pelusa", "Galletas", 15, "siames");
        g.alimentar();
        Animal c = new Caballo("Tornado", "Pasto", 25, "Fino");

    }//fin void

}//fin class
