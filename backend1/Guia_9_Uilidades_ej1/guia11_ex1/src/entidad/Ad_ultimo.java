/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ad_ultimo {
    //atributos

    private ArrayList<Perro> perros = new ArrayList<>();
    private ArrayList<Persona> pers = new ArrayList<>();
    private ArrayList<Perro> adoptado = new ArrayList<>();

    public Ad_ultimo() {
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
        Perro p2 = new Perro("tom", "Pastor Aleman", 5, "grande");
        perros.add(p2);
        Perro p3 = new Perro("olaf", "Labrador", 4, "Grande");
        perros.add(p3);
        Perro p4 = new Perro("daysi", "Pequines", 8, "pequeño");
        perros.add(p4);
        Perro p5 = new Perro("jazmin", "Pequines", 2, "pequeño");
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
        Boolean disponible = true;

//        String opc = "";
//        for (Persona per : pers) {
//            System.out.println("---------------------------------------------------------------");
//            System.out.println("Bienvenido " + per.getNombre() + " " + per.getApellido() + " al Catalogo de Perros");
////    perro1.toString();
//            int cont = 1;
//            //lista perros
//
//            for (Perro perro : perros) {
//                System.out.println((cont++) + ") " + perro.toString());
//                
//            }
////            Boolean esta = adoptado.contains(opc);
//            System.out.println("¿Ingrese el nombre del perro que desea adoptar?");
//            opc = leer.next();
//            
//        }
        for (Persona per : pers) {//lista principal de personas
            //menu intro
            System.out.println("Bienvenido " + per.getNombre());
            System.out.println("Lista de perros");
            System.out.println(perros.toString());
            System.out.println("Ingrese el nombre del perro que desea adoptar");
            String candidato = leer.next();
            //fin menu intro
            Iterator<Perro> adop = adoptado.iterator();
            Iterator<Perro> perro = perros.iterator();
            for (Perro perro1 : perros) {//recorre lista perros para comparar nombre de perros
                if (adoptado.size() == 0) {
                    disponible = true;

                } else {

                    while (adop.hasNext()) {
                      Perro perroCandidato= adop.next();
                        if (perroCandidato.getNombre().equalsIgnoreCase(candidato)) {//busca y compara nombre de perros con lista adoptados
                            disponible = false;
                            break;//si esta en la lista salir del bucle
                        } else {
                            disponible = true;
                        }
                    }
                   
                }
 if (disponible == true) {
                        per.setP(perro1);//adopta la persona
                        adoptado.add(perro1);//agrega perro a lista adoptados
                         break;
                    } else {
                        System.err.println("Perro No Disponible");
                       
                    }
            }//final lista de perros

        }//final lista principal de personas

        for (Persona per : pers) {
            System.out.println("Personas " + per.getNombre() + " " + per.getP());
        }
        System.out.println("Perros adoptados ");
        for (Perro perro : adoptado) {
            System.out.println(perro.getNombre());
        }

    }//final metodo adopcion

}//final public class
