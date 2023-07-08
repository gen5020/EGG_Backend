/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.time.Duration;

/**
 *
 * @author User
 */
public class Peli {
    
    private String Director;
    private String titulo;
    private Duration duracion;

    public Peli() {
    }

    public Peli(String Director, String titulo, Duration duracion) {
        this.Director = Director;
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Duration getDuracion() {
        return duracion;
    }

    public void setDuracion(Duration duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "Director=" + Director + ", titulo=" + titulo + ", duracion=" + duracion + '}';
    }
    
            
}
