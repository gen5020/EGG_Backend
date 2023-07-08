/*
 
 */
package entidad;

public class Jugador {
  //atributos
    private String nombre;
    private String apellido;
    private Integer numero;
    private String posicion;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, Integer numero, String posicion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apellido=" + apellido + ", numero=" + numero + ", posicion=" + posicion + '}';
    }
    
}
