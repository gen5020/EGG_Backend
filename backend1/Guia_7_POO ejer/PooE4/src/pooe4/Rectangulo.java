/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base 
y un atributo privado altura. La clase incluirá un método para crear el rectángulo 
con los datos del Rectángulo dados por el usuario. También incluirá un método 
para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura.
Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

 */
package pooe4;

import java.util.Scanner;

public class Rectangulo {
    //atributos
    private int altura;
    private int base;

    //constructor vacio
    public Rectangulo() {
    }
//constructor con paramentros
    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }
    
    //getter y setter
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
    //metodo ingresar datos
    public void crearRectangulo(){
    Scanner leer=new Scanner(System.in);
            System.out.print("Ingresar Base:");
    base=leer.nextInt();
            System.out.print("Ingresar Altura:");
    altura=leer.nextInt();
}
    
//metodo calcular  Perímetro = (base + altura) * 2
    public int calcularPerimetro(){
        return ((base+altura)*2);
    }
    // metodo calcular Superficie = base * altura
    public int calcularSuperficie(){
        return base*altura;
    }
    
    //dibujar en pantalla el rectangulo
    public void asteriscos(){
       for (int i = 1; i <= base; i++) {
            //Imprime los caracteres de cada fila
            for (int j = 1; j <= altura; j++) {
                if (((i == 1 || i == base) || j == 1) || j == altura) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            //Salta a la siguiente línea para imprimir la siguiente fila
            System.out.println();
    
}
    }
}
