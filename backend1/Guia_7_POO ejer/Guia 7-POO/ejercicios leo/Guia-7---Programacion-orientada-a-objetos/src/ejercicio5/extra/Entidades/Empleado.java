/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.extra.Entidades;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Empleado {
    Scanner leer = new Scanner(System.in);
    
    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    

    public void calcular_aumento(){
        System.out.println("Ingrese nombre del empleado:");
        nombre = leer.nextLine();
        System.out.println("Ingrese la edad del empleado:");
        edad = leer.nextInt();
        System.out.println("Ingrese el salario actual del empleado:");
        salario = leer.nextDouble();
        
        if (edad>=30) {
            System.out.println("A " + nombre + " de " + edad + " años de edad, le corresponde un salario de $" + salario*1.1);
        } else {
            System.out.println("A " + nombre + " de " + edad + " años de edad, le corresponde un salario de $" + salario*1.05);
        }
        
    }
    
    
    
}
