/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Autobus;

import java.util.Scanner;


/**
 *
 * @author Loscortes
 */
public class ServiciosAutobus {

 Autobus a1 = new Autobus();
 Scanner leer = new Scanner(System.in).useDelimiter("\n");
 Scanner sc = new Scanner(System.in).useDelimiter("\n");
 
public void CrearAutobus(){
    System.out.println("Ingrese identificación");  
    a1.setIdent(leer.next());
    System.out.println("Ingrese Capacidad Maxima"); 
    a1.setCapMax(sc.nextInt());
    System.out.println("Ingrese Capacidad actual");
    a1.setCapAct(sc.nextInt());
    System.out.println("Ingrese Cantidad de paradas");
    a1.setCantPar(sc.nextInt());
       
} 
public void inicioRecorrido(int cantidad){
    
    do {        
        
        a1.setCapAct(a1.getCapAct() + cantidad);
        
    } while (a1.getCapMax() < a1.getCapAct());
}
public void FinRecorrido(){
 a1.setCapAct(0);
 System.out.println("Recorrido finalizado");
   
}
public void SubirPasajeros(int cantidad, int parada) {
  //for (int i = 1; i == a1.getCantPar(); i++){
   if (parada == 1){
   inicioRecorrido(cantidad);
   } else if (parada == a1.getCantPar()) {
       System.out.println("Ultima parada, no suben mas. Al fondo que hay lugar");    
   } else {
    int cantlimit = a1.getCapMax() - a1.getCapAct();
    if (cantidad <= cantlimit) {
    a1.setCapAct(a1.getCapAct()+cantidad);
    System.out.println("en este momento hay " + a1.getCapAct() + " de monos en el bondi");
    } else {
    a1.setCapAct(a1.getCapMax());
        System.out.println("Solo admitimos " + cantlimit +  " pasajeros");
   }    
    } 
  
}
public void bajarPasajeros (int cantidad, int parada) {
   if (parada == 1){
       System.out.println("Colectivo vacio");
       a1.setCapAct(0);
   } else if (parada == a1.getCantPar()) {
   FinRecorrido();    
   } else {
    //int cantlimit = a1.getCapMax() - a1.getCapAct();
    if (cantidad <= a1.getCapAct()) {
    a1.setCapAct(a1.getCapAct()-cantidad);
    System.out.println("se han bajado " + a1.getCapAct() + " de monos en el bondi");
    } else {
    System.out.println("No pueden bajarse mas pasajeros que los que estan en el bondi, Zonzolon!!!!");   

}
}
}
public void MostrarAutobus(){
    System.out.println(a1.toString());
}
}
