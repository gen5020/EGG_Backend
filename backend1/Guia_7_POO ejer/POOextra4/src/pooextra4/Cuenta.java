/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad 
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca
sea negativo después de realizar una transacción de retiro.
 */
package pooextra4;

import java.util.Scanner;

public class Cuenta {
    //atributos
    public double saldo=Math.random()*10000+1;
    public String titular;

    public Cuenta() {
    }

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    
    public void ingresar_nombre(){
       Scanner leer=new Scanner(System.in);
        System.out.println("Ingresar nombre:");
       titular=leer.nextLine();
    }
            
    public void retirar_dinero(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Saldo: "+saldo);
        System.out.println("Ingresar monto que desea retirar:");    
        double retirar=leer.nextDouble();
        if(retirar>saldo){
            System.out.println("Saldo Insuficiente");   
        }else{
            saldo=saldo-retirar;
            System.out.println("Ha retirado: "+ retirar+ " Saldo actual: "+saldo );
        }
    }
}
