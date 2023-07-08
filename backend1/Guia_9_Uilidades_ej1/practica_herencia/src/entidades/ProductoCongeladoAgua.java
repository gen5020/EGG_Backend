/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author User
 */
public class ProductoCongeladoAgua extends ProductoCongelado {
    private Double salinidad; //en gramos de sal por litro de agua

    public ProductoCongeladoAgua() {
    }

    public ProductoCongeladoAgua(Double salinidad, Double temperaturaRecomendada, Date envasado, String paisOrigen, Date caducidad, int lote) {
        super(temperaturaRecomendada, envasado, paisOrigen, caducidad, lote);
        this.salinidad = salinidad;
    }

    public Double getSalinidad() {
        return salinidad;
    }

    public void setSalinidad(Double salinidad) {
        this.salinidad = salinidad;
    }

    @Override
    public String toString() {
        return "ProductoCongeladoAgua{" + "salinidad=" + salinidad + '}';
    }
    
    
}
