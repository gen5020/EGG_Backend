/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Persona {
  //atributos: nombre, apellido, edad, documento y Perro. 
    private String nombre;
    private String apellido;
    private Integer dni;
    private Integer edad;
    private Perro p;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer dni, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, Integer dni, Integer edad, Perro p) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.p = p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Perro getP() {
        return p;
    }

    public void setP(Perro p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "nombre= " + nombre + ", apellido= " + apellido + ", dni= " + dni + ", edad= " + edad + ", p= " + p + '}';
    }
    
    public void mostrar(Persona p){
        System.out.println( p.getNombre()+" " + p.getApellido()+" "+ p.getDni()+" "+p.getEdad()+" "+p.getP());
    }




}