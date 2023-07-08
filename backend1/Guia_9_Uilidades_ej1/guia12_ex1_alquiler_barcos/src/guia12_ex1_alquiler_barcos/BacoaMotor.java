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
public class BacoaMotor extends Barco{
    private Integer potenciaCV;

    public BacoaMotor() {
    }

    public BacoaMotor(Integer potenciaCV, Integer matricula, Integer eslora, Date anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public int valorModulo() {
        int valorModulo= (getEslora()*10)+potenciaCV;
       return valorModulo;
    }
    
}
