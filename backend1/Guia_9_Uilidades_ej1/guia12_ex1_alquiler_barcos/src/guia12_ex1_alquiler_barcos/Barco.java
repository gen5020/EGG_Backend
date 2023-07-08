/*
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
 */
package guia12_ex1_alquiler_barcos;

import java.util.Date;

public abstract class Barco {
    protected Integer matricula;
    protected Integer eslora;
    protected Date anioFabricacion;

    public Barco() {
    }

    public Barco(Integer matricula, Integer eslora, Date anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Date getAñoFabricacion() {
        return anioFabricacion;
    }

    public void setAñoFabricacion(Date añoFabricacion) {
        this.anioFabricacion = añoFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", a\u00f1oFabricacion=" + anioFabricacion + '}';
    }
    
    public abstract int valorModulo();
    
    
}
