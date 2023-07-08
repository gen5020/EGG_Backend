/*

 */
package clase26ej2;

import Entidades.ParDeNumeros;
import Servicios.ParDeNumerosService;

/**

 */
public class Clase26Ej2 {

    /**

     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ParDeNumerosService serNum = new ParDeNumerosService();
        
        ParDeNumeros numPar = new ParDeNumeros();
        // mostramos
        serNum.mostrarValores(numPar);
        
        System.out.println("El número mayor es: " + serNum.devolverMayor(numPar));
        
        System.out.println("La potencias son: " + serNum.calcularPotencia(numPar));
        
        System.out.println("La raiz cuadrada del menor valor es: " + serNum.calcularRaiz(numPar));
    }
    
}
