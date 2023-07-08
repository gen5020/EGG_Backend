/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Loscortes
 */
public class Autobus {
 //    identificación, capacidad máxima de pasajeros, capacidad actual
// de pasajeros y cantidad de paradas  
    
private int CapMax, CapAct, CantPar;
private String ident;

    @Override
    public String toString() {
        return "Autobus{" + "CapMax=" + CapMax + ", CapAct=" + CapAct + ", CantPar=" + CantPar + ", ident=" + ident + '}';
    }

    public Autobus() {
    }

    public Autobus(int CapMax, int CapAct, int CantPar, String ident) {
        this.CapMax = CapMax;
        this.CapAct = CapAct;
        this.CantPar = CantPar;
        this.ident = ident;
    }

    public int getCapMax() {
        return CapMax;
    }

    public void setCapMax(int CapMax) {
        this.CapMax = CapMax;
    }

    public int getCapAct() {
        return CapAct;
    }

    public void setCapAct(int CapAct) {
        this.CapAct = CapAct;
    }

    public int getCantPar() {
        return CantPar;
    }

    public void setCantPar(int CantPar) {
        this.CantPar = CantPar;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }


}
