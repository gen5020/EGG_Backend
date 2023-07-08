/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real.
A continuación, se deben crear los siguientes métodos:
A) Método constructor que inicialice el radio pasado como parámetro.
B) Métodos get y set para el atributo radio de la clase Circunferencia.
C) Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
D) Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
E) Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package e2.poo;

import java.util.Scanner;

public class Circunferencia1 {
    //atributo
    private double radio;
 

//metodos constructor       radio=parametro
   //metodo A
    public Circunferencia1() {
    }

    public Circunferencia1(double radio) {
        this.radio = radio;
    }
    //metodos B

   
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    //metodo C
    public void crearCircunferencia(){
        Scanner leer= new Scanner(System.in);
     
        System.out.println("Ingrese el radio: ");
              this.radio=leer.nextDouble();
    }
    //metodo D
    public double areaC(){
    return Math.PI*Math.pow(radio, 2);
    
    }
    
    //método E
    public double perimetro(){
        double perimetro=  2*Math.PI*radio;
   return perimetro;
   
    }

    
    }
  



