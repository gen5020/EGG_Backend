/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.extra.Entidades;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Juego {

    Scanner leer = new Scanner(System.in);
    private int ganados;
    private int intentos;
    private int incognita;
    private int numero;
    private int vidas;

    public void iniciar_juego() {

        System.out.println("Ingrese la cantidad de vidas:");
        vidas = leer.nextInt();
        intentos = 0;
        ganados = 0;

        do {
            System.out.println("Ingrese un numero a adivinar:");
            incognita = leer.nextInt();
            do {
                System.out.println("Ingrese un numero:");
                numero = leer.nextInt();

                if (numero > incognita) {
                    System.out.println("El numero es menor");
                    intentos++;
                    vidas--;
                }
                if (numero < incognita) {
                    System.out.println("El numero es mayor");
                    intentos++;
                    vidas--;
                } 
                if (numero ==incognita) {
                    ganados++;
                    intentos++;
                    System.out.println("Adivino el numero!");
                }

            } while (numero != incognita && vidas!=0);

        } while (vidas != 0);

        System.out.println("Ganaste " + ganados + " veces en " + intentos + " intentos");
        System.out.println("");
    }

}
