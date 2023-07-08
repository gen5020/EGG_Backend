/*
a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
función devuelve un booleano.
b) Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje.
c) Método calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.
*/
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {
    private Scanner leer = new Scanner(System.in);
    Persona persona = new Persona();
    
    public boolean esMayorDeEdad(Persona persona){
        boolean mayorMenor = persona.getEdad()>= 18;
        return mayorMenor;    
    }
    
    public Persona crearPersona(){
        System.out.println("Introducir nombre:");
        String nombre = leer.next();
        
        System.out.println("Introducir edad:");
        int edad = leer.nextInt();
        
        String sexo;
        boolean logico = false;
        do{
           System.out.println("Ingrese el sexo");
           sexo = leer.next();
        if (sexo.equalsIgnoreCase("H")|| sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("O") ) {
            logico = true;
        }else{
            System.out.println("Ingrese una opción válida");
        } 
        }while(!logico);
        System.out.println("Ingrese su peso:");
        double peso = leer.nextDouble();
        System.out.println("Ingrese su altura en metros:");
        double altura = leer.nextDouble();
        return new Persona (nombre,edad,sexo,peso,altura);
    }
    
    public int calcularIMC(Persona persona){
        //peso en kg/(altura^2 en mt2)
        double imc = persona.getPeso()/(Math.pow(persona.getAltura(),2));
        if (imc<20) {
            return -1;
        } else if (imc >= 20 && imc <= 25){  
            return 0;
        } else {
            return 1;
        }
    }
    /*
    public void peso(Persona persona){
        double imc = calcularIMC(persona);
        if(imc==-1){
            System.out.println("Estas por debajo de tu peso ideal.");
        } else if (imc==0){
            System.out.println("Estas en tu peso ideal");
        } else{
            System.out.println("Estas con sobrepeso");
        }
    }
    */
    /*
    public int calcularIMC(Persona n) {
        int peso = n.getPeso();
        double altura = n.getAltura();

        double imc = peso / Math.pow(altura, 2);
        int resultadoImc;
        if (imc < 20) {
            resultadoImc = -1;
        } else if (imc >= 20 && imc <= 25) {
            resultadoImc = 0;
        } else {
            resultadoImc = 1;
        }
        return resultadoImc;

    }
*/
}
