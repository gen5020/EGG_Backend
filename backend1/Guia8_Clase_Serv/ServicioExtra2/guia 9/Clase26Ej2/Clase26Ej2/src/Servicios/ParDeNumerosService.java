/*
 
 */
package Servicios;

import Entidades.ParDeNumeros;

/**
 *
 * @author Miguel Ángel
 */
public class ParDeNumerosService {

    //a)
    public void mostrarValores(ParDeNumeros nums) {
        System.out.println("El primer número es: " + nums.getNum1() + " Y el segundo es: " + nums.getNum2());
    }

    //b)
    public double devolverMayor(ParDeNumeros nums) {
        if (nums.getNum1() > nums.getNum2()) {
            return nums.getNum1();
        } else {

            return nums.getNum2();
        }
    }

    //c)
    
    public int calcularPotencia(ParDeNumeros nums){
        if (nums.getNum1() > nums.getNum2()) {
           
            return (int) Math.pow(nums.getNum1(), nums.getNum2());
        } else {

            return (int) Math.pow(nums.getNum2(), nums.getNum1());
        }
    }
    
    //d)
    public double calcularRaiz(ParDeNumeros nums){
        if (nums.getNum1() < nums.getNum2()) {
            double raizN1 = Math.abs(nums.getNum1());
            return  Math.sqrt(raizN1);
        } else {

            double raizN2 = Math.abs(nums.getNum2());
            return  Math.sqrt(raizN2);
        }
    }
}
