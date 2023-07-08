/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Miguel Ángel
 */
public class Cadena {
    // ATRIBUTOS
    private String frase;
    private Integer longitud;
    
    // CONSTRUCTORES

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }
    
    // SETTERS Y GETTERS

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }

}
