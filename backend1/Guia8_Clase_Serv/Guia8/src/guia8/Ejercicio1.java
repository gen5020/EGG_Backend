/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaBancariaServicio servicio = new CuentaBancariaServicio();
        CuentaBancaria cuenta1 = servicio.crearCuenta();
        System.out.println("Ingrese la cantidad a depositar:");
        double deposito = leer.nextDouble();
        servicio.ingresar(deposito, cuenta1);
        servicio.consultarSaldo(cuenta1);
        System.out.println("¿Cuanto dinero desea retirar?");
        double retiro = leer.nextDouble();
        servicio.retirar(cuenta1, retiro);
        System.out.println("El saldo actual es: "+cuenta1.getSaldoActual());
        System.out.println("Extraccion rapida, ingrese el monto a retirar:");
        double extraccion = leer.nextDouble();
        servicio.extraccionRapida(cuenta1, extraccion);
        System.out.println("Datos de la cuenta: ");
        servicio.consultarDatos(cuenta1);
    }
    
}
/*
1. Realizar una clase llamada CuentaBancaria en el paquete Entidades con
los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
saldoActual. Agregar constructor vacío, con parámetros, getters y
setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
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