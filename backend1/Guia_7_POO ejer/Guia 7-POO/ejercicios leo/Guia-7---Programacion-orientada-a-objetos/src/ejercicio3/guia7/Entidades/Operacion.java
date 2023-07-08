/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.guia7.Entidades;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Operacion {

    private int numero1;
    private int numero2;
    Scanner leer = new Scanner(System.in);

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        System.out.println("Ingrese dos numeros enteros:");
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();
    }

    public int sumarNumeros() {
        return numero1 + numero2;
    }

    public int restarNumeros() {
        return numero1 - numero2;
    }

    public int multiplicarNumeros() {
        if (numero1 != 0 && numero2 != 0) {
            return numero1 * numero2;
        } else {
            System.out.println("Uno de los numeros es 0");
            return 0;
        }
    }

    public double dividirNumeros() {
        if (numero1 != 0 && numero2 != 0) {
            return numero1 / numero2;
        } else {
            System.out.println("Uno de los numeros es 0");
            return 0;
        }
    }

    public void opcion() {
        int opcion;
        do {
            System.out.println("Elija una opcion:");
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("5- Salir");

            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("La suma de los numeros es igual a: " + sumarNumeros());
                    break;
                case 2:
                    System.out.println("La resta de los numeros es igual a: " + restarNumeros());
                    break;
                case 3:
                    System.out.println("La multiplicacion de los numeros es igual a: " + multiplicarNumeros());
                    break;
                case 4:
                    System.out.println("La division de los numeros es igual a: " + dividirNumeros());
                    break;
                    case 5:
                    System.out.println("Esta saliendo del programa ");
                    break;
            }

        } while (opcion!=5);
    }

}
