package entidades;


public class Pelicula {
    private String titulo;
    private Integer duracion;
    private Integer edadminima;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, Integer duracion, Integer edadminima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadminima = edadminima;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getEdadminima() {
        return edadminima;
    }

    public void setEdadminima(Integer edadminima) {
        this.edadminima = edadminima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracion=" + duracion + ", edadminima=" + edadminima + ", director=" + director + '}';
    }
    

}
