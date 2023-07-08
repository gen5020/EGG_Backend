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
public class ProductoCongeladoAire extends ProductoCongelado{
    private Double oxigeno;
     private Double nitrogeno;
      private Double dioxidoCarbono;
       private Double vaporAgua;

    public ProductoCongeladoAire() {
        
    }

    public ProductoCongeladoAire(Double oxigeno, Double nitrogeno, Double dioxidoCarbono, Double vaporAgua, Double temperaturaRecomendada, Date envasado, String paisOrigen, Date caducidad, int lote) {
        super(temperaturaRecomendada, envasado, paisOrigen, caducidad, lote);
        this.oxigeno = oxigeno;
        this.nitrogeno = nitrogeno;
        this.dioxidoCarbono = dioxidoCarbono;
        this.vaporAgua = vaporAgua;
    }

    public Double getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(Double oxigeno) {
        this.oxigeno = oxigeno;
    }

    public Double getNitrogeno() {
        return nitrogeno;
    }

    public void setNitrogeno(Double nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    public Double getDioxidoCarbono() {
        return dioxidoCarbono;
    }

    public void setDioxidoCarbono(Double dioxidoCarbono) {
        this.dioxidoCarbono = dioxidoCarbono;
    }

    public Double getVaporAgua() {
        return vaporAgua;
    }

    public void setVaporAgua(Double vaporAgua) {
        this.vaporAgua = vaporAgua;
    }

    @Override
    public String toString() {
        return "ProductoCongeladoAire{" + "oxigeno=" + oxigeno + ", nitrogeno=" + nitrogeno + ", dioxidoCarbono=" + dioxidoCarbono + ", vaporAgua=" + vaporAgua + '}';
    }
     
    
    
    
    
}
