/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.guia7.Entidades;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Circunferencia {
    
    
    private double radio;
    

    Scanner leer = new Scanner (System.in);

    public Circunferencia() {
    }
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        System.out.println("Ingrese el valor del radio:");
        radio = leer.nextDouble();
    }
    public double area(){
       return Math.PI * Math.pow( radio,2);
        
    }
    
    public double perimetro(){
        return 2 * Math.PI * radio;
    }
}
