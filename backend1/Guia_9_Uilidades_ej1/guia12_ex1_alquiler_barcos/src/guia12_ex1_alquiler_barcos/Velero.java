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
public class Velero extends Barco {
    private Integer mastiles;

    public Velero() {
    }

  
    public Velero(Integer mastiles, Integer matricula, Integer eslora, Date anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "mastiles=" + mastiles + '}';
    }

    @Override
    public int valorModulo() {
    
       int valorModulo= (getEslora()*10)+mastiles;
       return valorModulo;
    }
    
    
}
