/*
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:

Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
package Servicios;

import Entidad.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {
 Scanner leer= new Scanner(System.in);

//Método para crear cuenta pidiéndole los datos al usuario.   
    public CuentaBancaria crearCuenta(){
        System.out.print("N° de Cuenta:"); 
          int numeroCuenta=leer.nextInt();
          System.out.print("DNI:");
    long dniCliente;
        System.out.println("");
   double saldoActual;
   
    }
}
