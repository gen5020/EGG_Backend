/*
Los productos congelados por nitrógeno deben llevar 
la información del método de congelación empleado y del tiempo de exposición al nitrógeno expresada en segundos.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author User
 */
public class ProductoCongeladoNitrogeno extends ProductoCongelado{
   private String metodoConge;
   private Double tiempoExposicion;//seg

    public ProductoCongeladoNitrogeno() {
    }

    public ProductoCongeladoNitrogeno(String metodoConge, Double tiempoExposicion, Double temperaturaRecomendada, Date envasado, String paisOrigen, Date caducidad, int lote) {
        super(temperaturaRecomendada, envasado, paisOrigen, caducidad, lote);
        this.metodoConge = metodoConge;
        this.tiempoExposicion = tiempoExposicion;
    }

    public String getMetodoConge() {
        return metodoConge;
    }

    public void setMetodoConge(String metodoConge) {
        this.metodoConge = metodoConge;
    }

    public Double getTiempoExposicion() {
        return tiempoExposicion;
    }

    public void setTiempoExposicion(Double tiempoExposicion) {
        this.tiempoExposicion = tiempoExposicion;
    }

    @Override
    public String toString() {
        return "ProductoCongeladoNitrogeno{" + "metodoConge=" + metodoConge + ", tiempoExposicion=" + tiempoExposicion + '}';
    }
   
   
}
