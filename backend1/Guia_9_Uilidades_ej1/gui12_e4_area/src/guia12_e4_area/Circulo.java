/*
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro
 */
package guia12_e4_area;

import interfaces.calcularFormas;

/**
 *
 * @author User
 */
public class Circulo implements calcularFormas{
 private double radio;
 private double diametro;

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro + '}';
    }
 
    @Override
    public void calcularArea() {
        System.out.println("area= "+ Pi * (radio * radio));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("perimetro= "+  (Pi * diametro));
    }
    
}
