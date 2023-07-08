package entidades;

import java.util.ArrayList;


public class Sala {
    private Pelicula pelicula;
    private ArrayList<Asiento> [][] ubicacion = new ArrayList[8][6];
    private Boolean libre;

    public Sala() {
    }

    public Sala(Pelicula pelicula, Boolean libre) {
        this.pelicula = pelicula;
        this.libre = libre;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public ArrayList<Asiento>[][] getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(ArrayList<Asiento>[][] ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Boolean getLibre() {
        return libre;
    }

    public void setLibre(Boolean libre) {
        this.libre = libre;
    }

    @Override
    public String toString() {
        return "Sala{" + "pelicula=" + pelicula + ", ubicacion=" + ubicacion + ", libre=" + libre + '}';
    }

    
    

  
}
