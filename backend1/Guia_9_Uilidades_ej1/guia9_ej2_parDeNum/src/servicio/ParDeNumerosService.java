/*
 Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además 
implementar los siguientes métodos:
 */
package servicio;

import entidad.ParDeNumeros;

public class ParDeNumerosService {

    //a)Método mostrarValores que muestra cuáles son los dos números guardados.
    public void mostrarValores(ParDeNumeros p1) {
        System.out.println("1)" + p1.getNum1());
        System.out.println("2)" + p1.getNum2());

    }

    //b)Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor   
    public double devolverMayor(ParDeNumeros p1) {
        if (p1.getNum1() > p1.getNum2()) {
            return p1.getNum1();
        } else {
            return p1.getNum2();
        }
    }

    public double devolverMenor(ParDeNumeros p1) {
        if (p1.getNum1() < p1.getNum2()) {
            return p1.getNum1();
        } else {
            return p1.getNum2();
        }

    }
    //c)Método calcularPotencia para calcular la potencia del mayor valor de la clase 
//elevado al menor número. Previamente se deben redondear ambos valores. 

    public double calcularPotencia(ParDeNumeros p1) {
double mayor=  Math.round(devolverMayor(p1));
double menor= Math.round(devolverMenor(p1));
        return Math.pow(mayor, menor);
    }

//Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    public double calcularRaiz(ParDeNumeros p1) {
        return Math.sqrt((Math.abs(devolverMenor(p1))));
    }

}
