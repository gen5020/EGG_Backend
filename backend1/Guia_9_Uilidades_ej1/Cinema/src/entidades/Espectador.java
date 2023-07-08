package entidades;


public class Espectador {
    private String nombre;
    private Integer edad;
    private Double dineroDis;

    public Espectador() {
    }

    public Espectador(String nombre, Integer edad, Double dineroDis) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDis = dineroDis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getDineroDis() {
        return dineroDis;
    }

    public void setDineroDis(Double dineroDis) {
        this.dineroDis = dineroDis;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dineroDis=" + dineroDis + '}';
    }
    

}
