/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe4;

public class PooE4 {

    public static void main(String[] args) {
    Rectangulo r1=new Rectangulo();
    r1.crearRectangulo();
        System.out.println("Perimetro: "+r1.calcularPerimetro());
        System.out.println("Superficie: "+r1.calcularSuperficie());
        r1.asteriscos();
        
    }
    
}
