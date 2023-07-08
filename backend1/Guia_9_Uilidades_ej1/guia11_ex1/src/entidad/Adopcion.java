/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Adopcion {

    //atributos
    private ArrayList<Perro> perros = new ArrayList<>();
    private ArrayList<Persona> pers = new ArrayList<>();
    private ArrayList<Perro> adoptado = new ArrayList<>();

    public Adopcion() {
    }

    public ArrayList<Perro> getPerros() {
        return perros;
    }

    public void setPerros(ArrayList<Perro> perros) {
        this.perros = perros;
    }

    public ArrayList<Persona> getPers() {
        return pers;
    }

    public void setPers(ArrayList<Persona> pers) {
        this.pers = pers;
    }

    @Override
    public String toString() {
        return "Adopcion{" + "perros=" + perros + ", pers=" + pers + '}';
    }

    public void listaPerros() {
        Perro p1 = new Perro("ody", "caniche", 2, "pequeño");
        perros.add(p1);
        Perro p2 = new Perro("Tom", "Pastor Aleman", 5, "grande");
        perros.add(p2);
        Perro p3 = new Perro("Olaf", "Labrador", 4, "Grande");
        perros.add(p3);
        Perro p4 = new Perro("Daysi", "Pequines", 8, "pequeño");
        perros.add(p4);
        Perro p5 = new Perro("Jazmin", "Pequines", 2, "pequeño");
        perros.add(p5);

    }

    public void listaPers() {
//       String nombre, String apellido, Integer dni, Integer edad
        Persona pers1 = new Persona("Manu", "Ginobili", 342345, 45);
        pers.add(pers1);
        Persona pers2 = new Persona("Carlos", "Delfino", 4797293, 40);
        pers.add(pers2);
        Persona pers3 = new Persona("Fabricio", "Oberto", 2493982, 42);
        pers.add(pers3);
//        Persona pers4 = new Persona("Luis", "Scola", 298303, 43);
//        pers.add(pers4);
    }

    public void adopcion() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        adoptado.add(perros.get(1));
        
        for (Persona per : pers) {
            System.out.println("---------------------------------------------------------------");
            System.out.println("Bienvenido " + per.getNombre() + " " + per.getApellido() + " al Catalogo de Perros");
//    perro1.toString();
            int cont = 1;
            //lista perros
            for (Perro perro : perros) {
                System.out.println((cont++) + ") " + perro.toString());
                
            }
             
            System.out.println("¿Ingrese el nombre del perro que desea adoptar?");
            String opc = leer.next();
            Boolean esta = adoptado.contains(opc);
            Boolean listaVacia = adoptado.isEmpty();
//            for (Perro adop : adoptado) {//recorrer lista de perros adoptados
            if (listaVacia == false) {
                if (esta == true) {//si esta en la lista de perros adoptados
                    System.out.println("El perro no está disponible");
                } else {
                    for (Perro perro : perros) {
                        if (opc.equalsIgnoreCase(perro.getNombre())) {//si el nombre esta en la lista del conjunto de perro
//                            adoptado.add(perro);
                            per.setP(perro);
                            
                        }
                    }

                }
            }else{
                 for (Perro perro : perros) {
                        if (opc.equalsIgnoreCase(perro.getNombre())) {//si el nombre esta en la lista del conjunto de perro
                            per.setP(perro);
////                            adoptado.add(perro); 
                        }
                   }
            }
        }
    
            for (Persona per : pers) {
                System.out.println(per.toString());
            }
            for (Perro perro : adoptado) {
                System.out.println(perro.toString());
            }

        }
}
    

//               Iterator <Perro> it=perros.iterator();
//               while(it.hasNext()){
//                   if(it.next().getNombre().equalsIgnoreCase(opc)){
//                       it.remove();
//                   }

