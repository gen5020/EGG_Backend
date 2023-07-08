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
public class ProductoCongelado extends ProductoFresco{
    protected Double temperaturaRecomendada;

    public ProductoCongelado() {
     
    }

    public ProductoCongelado(Double temperaturaRecomendada, Date envasado, String paisOrigen, Date caducidad, int lote) {
        super(envasado, paisOrigen, caducidad, lote);
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public Double getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(Double temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    @Override
    public String toString() {
        return "ProductoCongelado{" + "temperaturaRecomendada=" + temperaturaRecomendada + '}';
    }
    
    
}
