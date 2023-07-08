/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. 
A continuación, se deben crear los siguientes métodos:
a)Método constructor con todos los atributos pasados por parámetro.
B)Método constructor sin los atributos pasados por parámetro.
C)Métodos get y set.
D)Método para crearOperacion(): que le pide al usuario los dos números 
y los guarda en los atributos del objeto.
E)Método sumar(): calcular la suma de los números y devolver el resultado al main.
F)Método restar(): calcular la resta de los números y devolver el resultado al main
G)Método multiplicar(): primero valida que no se haga una multiplicación por cero, 
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
H)Método dividir(): primero valida que no se haga una división por cero, 
si fuera a pasar una división por cero, el método devuelve 0 y se le informa al usuario 
el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado 
al main.

 */
package ej3_poo;

import java.util.Scanner;

public class Operacion {
  //atributos
   private double numero1;
   private double numero2;
   //metodos constructores
//B)constructor sin parametros 
    public Operacion() {
    }
//A)constructor con parametros
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
  //C) metodo get

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }
    //metodo sett

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    //D)METODO cargar y guardar en los atributos del objeto (num1,num2)
    public void crearOperacion(){
        Scanner leer=new Scanner(System.in);
        System.out.print("Ingrese el 1° Numero : ");    
        this.numero1=leer.nextDouble();
        System.out.print("Ingrese el 2° Numero : ");    
        this.numero2=leer.nextDouble();
    }
    //e)sumar
    public double sumar(){
        return this.numero1+this.numero2;
    }
    //F)restar
    public double restar(){
        return this.numero1-this.numero2;
    }
    /*G)primero valida que no se haga una multiplicación por cero, 
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
*/
 public double multiplicar(){

     if (this.numero1==0 || this.numero2==0){
     System.out.println("ERROR ha ingresado un numero 0"); 
     return 0;
        
}else{
     return this.numero1*this.numero2;
     
}
 }
 
public double dividir(){

     if (numero1==0 || numero2==0){
     System.out.println("ERROR ha ingresado un numero 0"); 
     return 0;
        
}
     return numero1/numero2;
     
}
    
}
