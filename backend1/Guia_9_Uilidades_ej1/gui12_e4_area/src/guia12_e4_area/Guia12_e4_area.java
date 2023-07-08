/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
 */

package guia12_e4_area;

import servicio.CirculoServicio;
import servicio.RectanguloServicio;

/**
 * @noelia User
 */
public class Guia12_e4_area {

    public static void main(String[] args) {
    RectanguloServicio serv= new RectanguloServicio();
    Rectangulo r1= serv.llenarDatos();
    r1.calcularArea();
    r1.calcularPerimetro();
    CirculoServicio servC= new CirculoServicio();
    Circulo c1= servC.crearCirculo();
    c1.calcularArea();
    c1.calcularPerimetro();
        
        
    }//fin void

}//fin class
