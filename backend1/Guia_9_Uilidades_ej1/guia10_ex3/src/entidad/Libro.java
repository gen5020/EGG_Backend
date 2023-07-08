/*
La clase Libro debe guardar el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
 */
package entidad;

import java.util.Scanner;

public class Libro {
    private String titulo;
    private String autor;
    private Integer numEjemplares;
    private Integer numEjemPrestados;
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
//• Constructor por defecto.
    public Libro() {
    }
//• Constructor con parámetros.
    public Libro(String titulo, String autor, Integer numEjemplares, Integer numEjemPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numEjemPrestados = numEjemPrestados;
    }
//• Métodos Setters/getters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(Integer numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public Integer getNumEjemPrestados() {
        return numEjemPrestados;
    }

    public void setNumEjemPrestados(Integer numEjemPrestados) {
        this.numEjemPrestados = numEjemPrestados;
    }

    @Override
    public String toString() {
        return "titulo= " + titulo + ", autor= " + autor + ", numero de Ejemplares= " + numEjemplares + ", numeros de Ejemplares Prestados= " + numEjemPrestados ;
    }
  
//• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
//busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
//método. El método se incrementa de a uno, como un carrito de compras, el
//atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
//cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
//que no queden ejemplares disponibles para prestar. Devuelve true si se ha
//podido realizar la operación y false en caso contrario.
    
    public void prestamo(){
        
        
    }
    
    
    
    
    
//• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
//lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
//El método decrementa de a uno, como un carrito de compras, el atributo
//ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
//vez que se produzca la devolución de un libro. No se podrán devolver libros
//donde que no tengan ejemplares prestados. Devuelve true si se ha podido
//realizar la operación y false en caso contrario.
//• Método toString para mostrar los datos de los libros.
    
}
