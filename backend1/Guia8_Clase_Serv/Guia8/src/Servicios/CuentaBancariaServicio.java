/*
a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;


public class CuentaBancariaServicio {
    
    private Scanner leer = new Scanner(System.in);
    
    public CuentaBancaria crearCuenta(){
        //Instanciacion
        CuentaBancaria cuentaNueva = new CuentaBancaria();
        //Asignacion de atributos
        System.out.println("Ingrese numero de cuenta:");
        cuentaNueva.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI:");
        cuentaNueva.setDniCliente(leer.nextLong());
        System.out.println("Ingrese el saldo a depositar:");
        cuentaNueva.setSaldoActual(leer.nextDouble());
        //Retorno
        return cuentaNueva;
    } 
    public void ingresar(double deposito, CuentaBancaria cuenta){
        double ctaAux = cuenta.getSaldoActual()+deposito;
        cuenta.setSaldoActual(ctaAux);
    }
    public void consultarSaldo(CuentaBancaria cuenta){
        System.out.println("El saldo actual es: "+cuenta.getSaldoActual());
    }
    public void retirar(CuentaBancaria cuenta, double retiro){
        System.out.println("El saldo actual es de: "+cuenta.getSaldoActual());
        System.out.println("Usted desea retirar: "+retiro);
        if (retiro > cuenta.getSaldoActual()) {
            System.out.println("Se retirara: "+cuenta.getSaldoActual());
            cuenta.setSaldoActual(cuenta.getSaldoActual()-cuenta.getSaldoActual());
        }
    }
    public void extraccionRapida(CuentaBancaria cuenta, double extraccion){
        if (extraccion > cuenta.getSaldoActual()*0.2) {
            System.out.println("No se puede realizar la extraccion, el monto supera el 20% del saldo actual");
        } else {
            cuenta.setSaldoActual(cuenta.getSaldoActual()-extraccion);
            System.out.println("El nuevo saldo es de: "+cuenta.getSaldoActual());
        }
    }
    public void consultarDatos(CuentaBancaria cuenta){
        System.out.println(""+cuenta.toString());
    }
}
