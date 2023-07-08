/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12_ex1_alquiler_barcos;

import java.util.Date;


public class Alquiler {
//    el nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
//amarre y el barco que lo ocupará. 
    private String nombre;
    private Integer dni;
    private Date fechaAlq;
    private Date fechaDev;
    private Integer posicionAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer dni, Date fechaAlq, Date fechaDev, Integer posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlq = fechaAlq;
        this.fechaDev = fechaDev;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Date getFechaAlq() {
        return fechaAlq;
    }

    public void setFechaAlq(Date fechaAlq) {
        this.fechaAlq = fechaAlq;
    }

    public Date getFechaDev() {
        return fechaDev;
    }

    public void setFechaDev(Date fechaDev) {
        this.fechaDev = fechaDev;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", dni=" + dni + ", fechaAlq=" + fechaAlq + ", fechaDev=" + fechaDev + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + '}';
    }

    public void setFechaAlq(int anio, int mes, int dia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
