/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.guia.pkg7.Entidades;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Rectangulo {

    Scanner leer = new Scanner(System.in);
    private double base;
    private double altura;

    public void crearRectangulo() {
        System.out.println("Ingrese la base del rectangulo:");
        base = leer.nextDouble();

        System.out.println("Ingrese la altura del rectangulo:");
        altura = leer.nextDouble();

    }

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Double calcularArea() {
        return base * altura;

    }

    public Double calcularPerimetro() {
        return (base + altura) * 2;

    }

    public void dibujarRectangulo1() {
        for (int i = 0; i <= altura; i++) {
            for (int j = 0; j <= base; j++) {
                if (i == 0 || j == 0 || i == altura || j == base) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public void dibujarRectangulo2() {
        for (int i = 0; i <= altura; i++) {
            for (int j = 0; j <= base; j++) {
                
                    System.out.print("*");
                
                }
            System.out.println();
            }
            
        }

    }

