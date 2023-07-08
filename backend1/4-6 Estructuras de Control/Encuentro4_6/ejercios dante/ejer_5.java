/* Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
*/

import java.util.Scanner;

public class ejer_5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar un numero limite");
        int lim = leer.nextInt();
        int suma= 0;
        int num;
        while (suma < lim) {
            System.out.println("Ingresar un numero");
            num = leer.nextInt();
            suma = suma + num;
        }
        System.out.println("Superaste el limite");
    }
}
