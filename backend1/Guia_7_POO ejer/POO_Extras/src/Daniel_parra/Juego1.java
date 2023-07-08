/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daniel_parra;

import java.util.Scanner;

public class Juego1 {
 public int ganados1 = 0;
    public int ganados2 = 0;
    public int intentos = 5;
    public int num1;
    public int num2;
    public int round;
    public int veces;
    
    
    public Juego1() {
    }

    public Juego1(int num1, int num2, int round) {
        this.num1 = num1;
        this.num2 = num2;
        this.round = round;
    }
    
    

    public void iniciar_juego() {
        Scanner leer = new Scanner(System.in);
        System.out.println("cuantos round quieren jugar? ");
        round = leer.nextInt();

        
        // este for es para las veces que quieren jugar
        for (int i = 0; i < round; i++) {
            round--;
       System.out.println("Jugador numero 1, Ingrese un numero: ");
        num1 = leer.nextInt();
            //este for es para los intentos
            for (int j = 0; j < 5; j++) {
          
                if (num2 == num1) {
                    System.out.println("ganaste! en : " +veces+ " intentos.");
                    ganados2++;
                  break;
                }
                if (num2 < num1) {
                    System.out.println("el numero es mayor");
                } else {
                    System.out.println("el numero es menor");
                }
                 intentos--;
            }
            if (intentos == 0) {
                System.out.println(" perdio!");
                ganados1++;
            }
            
            System.out.println("cantidad de veces que gano el jugador 1: "+ganados1+" cantidad de veces que gano el jugador 2: "+ganados2);
        }
    }
}   

