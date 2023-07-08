package ejerciciosbasicos;
import java.util.Scanner;
public class EjerciciosBasicos {

    public static void main(String[] args) {
       System.out.println("Por favor ingrese 2 numeros enteros");
       Scanner leer= new Scanner(System.in);
       int n1= leer.nextInt();
       int n2= leer.nextInt();
       System.out.println("Los numeros ingresados son: "+n1+" y "+n2);
    }
    
}
