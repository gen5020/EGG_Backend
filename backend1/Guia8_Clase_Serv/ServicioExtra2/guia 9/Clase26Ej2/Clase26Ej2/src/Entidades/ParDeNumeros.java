/*

 */
package Entidades;

/**
 *
 * @author Miguel Ángel
 */
public class ParDeNumeros {
    // Atributos
    private double num1;
    private double num2;

    public ParDeNumeros() {
        num1= Math.random()* 21 + (-10);
        num2= Math.random()* 21 + (-10);
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    
    
}
