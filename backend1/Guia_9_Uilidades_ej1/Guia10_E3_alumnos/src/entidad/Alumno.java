/*
  Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
 */
package entidad;

import java.util.List;

/**
 *
 * @author User
 */
public class Alumno {
    //atributos
    private String nombre;
    private List<Integer> notas;
    //constructores

    public Alumno(String nombre, List<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public Alumno() {
    }
    //getter and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }
    
}
