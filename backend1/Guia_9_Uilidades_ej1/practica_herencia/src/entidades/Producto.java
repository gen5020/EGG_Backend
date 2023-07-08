/*
Todos los productos llevan esta información común: fecha de caducidad y número de lote.
 */

package entidades;

import java.util.Date;

/**
 * @noelia User
 */
public class Producto {
protected Date caducidad;
protected int lote;

    public Producto() {
    }

    public Producto(Date caducidad, int lote) {
        this.caducidad = caducidad;
        this.lote = lote;
    }

    public Date getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    @Override
    public String toString() {
        return "Producto{" + "caducidad=" + caducidad + ", lote=" + lote + '}';
    }
    

}//fin class
