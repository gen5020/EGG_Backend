/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.HashSet;

/**
 *
 * @author User
 */
public class Pais {
    //atributos
    private HashSet <String> paises= new HashSet(); 

    public Pais() {
    }

    public HashSet<String> getPaises() {
        return paises;
    }

    public void setPaises(HashSet<String> paises) {
        this.paises = paises;
    }

    @Override
    public String toString() {
        return "Conjunto de Paises=" + paises ;
    }
    
    
}
