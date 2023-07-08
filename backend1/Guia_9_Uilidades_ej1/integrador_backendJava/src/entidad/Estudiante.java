/*
Para esto vamos a tener que crear un objeto de tipo Estudiante, 
sus atributos van a ser nombre y nota (representando la nota obtenida en el final). 
 */
package entidad;

public class Estudiante {
    //atributos
    
    private double notaF;
    private String nombre;
    
    //constructores

    public Estudiante() {
    }

    public Estudiante( String nombre, double notaF) {
        this.notaF = notaF;
        this.nombre = nombre;
    }

    
    //getters and setters
    public double getNotaF() {
        return notaF;
    }

    public void setNotaF(double notaF) {
        this.notaF = notaF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
