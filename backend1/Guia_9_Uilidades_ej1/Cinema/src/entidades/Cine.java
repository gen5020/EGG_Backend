package entidades;


public class Cine {
    private Pelicula peli;
    private Sala sala;
    private Espectador espectador;
    private int precio;

    public Cine(Pelicula peli, Sala sala, Espectador espectador, int precio) {
        this.peli = peli;
        this.sala = sala;
        this.espectador = espectador;
        this.precio = precio;
    }

    public Cine() {
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine{" + "peli=" + peli + ", sala=" + sala + ", espectador=" + espectador + ", precio=" + precio + '}';
    }
    
    

}
