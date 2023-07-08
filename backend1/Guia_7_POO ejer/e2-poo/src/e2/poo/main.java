/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e2.poo;

public class main {

    public static void main(String[] args) {
    Circunferencia2 c=new Circunferencia2(0);
        c.crearCircunferencia2();
        c.setRadio(15);
        System.out.println(c.getRadio());
        System.out.println("Area:"+c.area());
        System.out.println("Perimetro"+ c.perimetro());
}
}

