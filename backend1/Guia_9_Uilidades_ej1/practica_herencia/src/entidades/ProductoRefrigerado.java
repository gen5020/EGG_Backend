/*
  productos refrigerados deben llevar el código del organismo de supervisión alimentaria,
la fecha de envasado, la temperatura de mantenimiento recomendada y el país de origen.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author User
 */
public class ProductoRefrigerado extends ProductoCongelado{
    protected Integer codigoOrganismo;
    

    public ProductoRefrigerado() {
    }

    public ProductoRefrigerado(Integer codigoOrganismo, Double temperaturaRecomendada, Date envasado, String paisOrigen, Date caducidad, int lote) {
        super(temperaturaRecomendada, envasado, paisOrigen, caducidad, lote);
        this.codigoOrganismo = codigoOrganismo;
    }

    public Integer getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(Integer codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    @Override
    public String toString() {
        return "ProductoRefrigerado{" + "codigoOrganismo=" + codigoOrganismo + '}';
    }



}
