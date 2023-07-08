/*
  frescos deben llevar la fecha de envasado y el país de origen.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author User
 */
public class ProductoFresco extends Producto {
    protected Date envasado;
    protected String paisOrigen;

    public ProductoFresco() {
    }

   

    public ProductoFresco(Date envasado, String paisOrigen, Date caducidad, int lote) {
        super(caducidad, lote);
        this.envasado = envasado;
        this.paisOrigen = paisOrigen;
    }

    public Date getEnvasado() {
        return envasado;
    }

    public void setEnvasado(Date envasado) {
        this.envasado = envasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "ProductoFresco{" + "envasado=" + envasado + ", paisOrigen=" + paisOrigen + '}';
    }
    
    
    
    
    
    
}
