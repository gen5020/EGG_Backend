/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe3;

public class main {
    public static void main(String[] args) {
    Operacion op = new Operacion(); // Crear objeto Operacion sin atributos
    op.crearOperacion(); // Pide al usuario los dos números y los guarda en los atributos del objeto
    System.out.println("La suma es: " + op.sumar());
    System.out.println("La resta es: " + op.restar());
    System.out.println("La multiplicación es: " + op.multiplicar());
    System.out.println("La división es: " + op.dividir());
    }
}
