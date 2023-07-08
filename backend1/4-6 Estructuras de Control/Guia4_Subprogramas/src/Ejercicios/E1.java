/*
 *Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
matemática y deben devolver sus resultados para imprimirlos en el main. 
 */
package Ejercicios;

import java.util.Scanner;

public class E1 {

    
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese 2 numeros:"); int retorno=-0;
       int num1=leer.nextInt();String simbol="-+/*";String resp="oa"; String Sol;
       int num2=leer.nextInt();
       int option;
     //  do {
            System.out.println("Menú");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija una opción");
            option = leer.nextInt();
            switch (option) {
                case 1:
                    retorno=sumar(num1,num2);
                    simbol="+";
                    break;
                case 2:
                     retorno=restar(num1,num2);
                    simbol="-";
                    break;
                case 3:
                  retorno=multiplicar(num1,num2);
                    simbol="*";
                    break;
                case 4:
                    retorno=dividir(num1,num2);
                    simbol="/";
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa S/N?");
                    resp = leer.next();
                   /* if (resp.equalsIgnoreCase("s")){
                        break;  
                    }else{
                        continue;
                    } */   
            }
            
           
      //  } while (resp!=("s"));
       System.out.println(num1 + simbol + num2 + "=" + retorno);
    }
    public static int sumar(int n1, int n2){
        int suma=n1+n2;
        return suma;
    }
   public static int restar(int n1, int n2){
        int resta=n1-n2;
        return resta;
}
   public static int dividir(int n1, int n2){
        int divide=n1/n2;
        return divide;
   }
        public static int multiplicar(int n1, int n2){
        int mult=n1*n2;
        return mult;
        }
}
