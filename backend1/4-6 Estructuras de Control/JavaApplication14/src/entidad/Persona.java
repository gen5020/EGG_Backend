package entidad;

import java.util.Scanner;

/*
Después, vamos a tener que pensar la lógica necesaria para asignarle
a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
package entidad;
*/
/**
 *
 * @author User
 */
public class Persona {
   //atributos: nombre, apellido, edad, documento y Perro. 
    private String nombre;
    private String apellido;
    private Integer dni;
    private Integer edad;
    private Perro p;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer dni, Integer edad, Perro p) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.p = p;
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

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Perro getP() {
        return p;
    }

    public void setP(Perro p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Persona" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", edad=" + edad + ", p=" + p + '}';
    }
    
    public void mostrar(Persona p){
        System.out.println( p.getNombre()+" " + p.getApellido()+" "+ p.getDni()+" "+p.getEdad()+" "+p.getP());
    }


public void adopcion(Persona p,Perro perro1, Perro perro2){
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    System.out.println("Catalogo Perros");
    perro1.toString();
    System.out.println("1)"+perro1.toString());
    System.out.println("2)"+perro2.toString());
    System.out.println("3)"+"Ninguno");
    System.out.println("Elegir una opcion");
    int opc= leer.nextInt();
    switch (opc) {
        case 1:
            p.setP(perro1);
            break;
        case 2:
            p.setP(perro2);
            break;
        case 3: System.out.println("Usted no ha elegido ningun perro");
        default:
            throw new AssertionError();
    }
    
}

}