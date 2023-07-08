/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascota.Entidades;

import enum_sexo.sexo;

public class Mascotas {
//atributos
    public String nombre;
    public String apodo;
    private String color;
    //conejo,gato,perro,etc
    public String tipo;
    private int edad;
    private boolean cola;
    private String raza;
    private sexo sexo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public sexo getSexo() {
        return sexo;
    }

    public void setSexo(sexo sexo) {
        this.sexo = sexo;
    }

    //alt+insert da la opción de crear un constructor
   public Mascotas() { //constructor vacio
   }

    public Mascotas(String nombre, String apodo, String color) {//constructor con parametros
        this.nombre = nombre;//this hace referencia a la clase/atributo
        this.apodo = apodo;
        this.color = color;
    }

    public Mascotas(String nombre, String apodo, String color, String tipo, int edad, boolean cola, String raza, sexo sexo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.color = color;
        this.tipo = tipo;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.sexo = sexo;
    }

    public Mascotas(String nombre, String apodo, String color, String tipo, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.color = color;
        this.tipo = tipo;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
    }

   
    public void setColor(String color) {
        this.color = color;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }

    
    
    @Override
    public String toString() {
        return "Mascotas{" + "nombre=" + nombre + ", apodo=" + apodo + ", color=" + color + ", tipo=" + tipo + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + '}';
    }
    
   
}
