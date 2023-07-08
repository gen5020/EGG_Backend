/*
 Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores 
jugar un juego de adivinanza de números. El primer jugador elige un número y el segundo
jugador intenta adivinarlo. El segundo jugador tiene un número limitado de intentos
y recibe una pista de "más alto" o "más bajo" después de cada intento. 
El juego termina cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el número de veces 
que cada jugador ha ganado.
 */
package Poo_Extras3;

import java.util.Scanner;

public class Juego {
 //atributos
 public int num1;//numero jugador 1
 public int num2;//numero jugador 2
 public int limite;//jugador 1
 public int contInt;
 public int contTriu;
//constructor vacio
    public Juego() {
    }
 //contructor parametros

    public Juego(int num1, int num2, int limite, int contInt, int contTriu) {
        this.num1 = num1;
        this.num2 = num2;
        this.limite = limite;
        this.contInt = contInt;
        this.contTriu = contTriu;
    }
    
    //sett getter
    
    //

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getContInt() {
        return contInt;
    }

    public void setContInt(int contInt) {
        this.contInt = contInt;
    }

    public int getContTriu() {
        return contTriu;
    }

    public void setContTriu(int contTriu) {
        this.contTriu = contTriu;
    }
    
    //metodo iniciar juego
    public void iniciarJuego(){
        Scanner leer= new Scanner(System.in);
        System.out.println("Jugador 1");
        System.out.println("Ingrese numero:");
        num1=leer.nextInt();
        System.out.println("Ingrese limite de intentos:");
        limite=leer.nextInt();
        System.out.println("*******************************");
        
        
        do{
            for (int i = 0; i < limite; i++) {
                System.out.println("Jugador 2");
        System.out.println("Ingrese numero");
        
        num2=leer.nextInt();
        System.out.println("Tienes "+ limite+" intentos");
                limite--;
                
                if(num2>num1){
                    System.out.println("Más bajo");
                }else
                    System.out.println("Más alto");
            }
            
        }while ((num2!=num1)||(limite!=0));
    }
}
