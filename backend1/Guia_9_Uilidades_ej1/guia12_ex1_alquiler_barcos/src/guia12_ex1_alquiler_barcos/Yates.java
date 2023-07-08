/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12_ex1_alquiler_barcos;

import java.util.Date;

/**
 *
 * @author User
 */
public class Yates extends Barco {
     private Integer potenciaCV;
     private Integer numCamarotes;

    public Yates() {
    }

    public Yates(Integer potenciaCV, Integer numCamarotes, Integer matricula, Integer eslora, Date anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
    }

    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public Integer getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(Integer numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public String toString() {
        return "Yates{" + "potenciaCV=" + potenciaCV + ", numCamarotes=" + numCamarotes + '}';
    }

    @Override
    public int valorModulo() {
       int valorModulo= (getEslora()*10)+potenciaCV+numCamarotes;
       return valorModulo;
    }
     
}
