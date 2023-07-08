/*
5. Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. 
 */
package guia10_5_paises;

import servicios.PaisesServicios;

/**
 * @noelia User
 */
public class Guia10_5_paises {

    public static void main(String[] args) {
        PaisesServicios serv = new PaisesServicios();
        serv.llenarConjuntoPaises();
        serv.ordenarAlfab();
        serv.elimanarElemento();

    }//fin void

}//fin class
