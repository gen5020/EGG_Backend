/*
crear un objeto de tipo Estudiante, 
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
estudiantes con sus respectivas notas.

 */
package entidad;

public class Estudiante {
    //sus atributos van a ser nombre y nota (representando la nota obtenida en el final).
    private String nombre;
    private double notaF;

    public Estudiante(String nombre, double notaF) {
        this.nombre = nombre;
        this.notaF = notaF;
    }

    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaF() {
        return notaF;
    }

    public void setNotaF(double notaF) {
        this.notaF = notaF;
    }
    
}
