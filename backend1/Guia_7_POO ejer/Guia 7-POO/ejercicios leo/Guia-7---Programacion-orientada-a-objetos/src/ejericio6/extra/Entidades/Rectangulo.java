/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericio6.extra.Entidades;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Rectangulo {
    Scanner leer = new Scanner(System.in);
    
    private float lado1;
    private float lado2;

    public Rectangulo() {
    }

    public Rectangulo(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public void ingresar_datos(){
        System.out.println("Ingrese el valor de la base:");
        lado1 = leer.nextInt();
        System.out.println("Ingrese el valor de la altura:");
        lado2 = leer.nextInt();
        
    }
    public float calcular_area(){
        return lado1 * lado2;
    }
}
