/*
 Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
 */
package entidad;

/**
 *
 * @author User
 */
public class CantanteFamoso {
    //atributos
    private String nombre;
    private String discoConMasVentas;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String nombre, String discoConMasVentas) {
        this.nombre = nombre;
        this.discoConMasVentas = discoConMasVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoConMasVentas() {
        return discoConMasVentas;
    }

    public void setDiscoConMasVentas(String discoConMasVentas) {
        this.discoConMasVentas = discoConMasVentas;
    }

    @Override
    public String toString() {
        return "nombre= " + nombre + ", Disco Con Mas Ventas= " + discoConMasVentas ;
    }
    
    
    
    
}
