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
public class Adop {
    //atributos

    private ArrayList<Perro> perros = new ArrayList<>();
    private ArrayList<Persona> pers = new ArrayList<>();
    private ArrayList<Perro> adoptado = new ArrayList<>();

    public Adop() {
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
        String opc = "";
        for (Persona per : pers) {
            System.out.println("---------------------------------------------------------------");
            System.out.println("Bienvenido " + per.getNombre() + " " + per.getApellido() + " al Catalogo de Perros");
//    perro1.toString();
            int cont = 1;
            //lista perros

            for (Perro perro : perros) {
                System.out.println((cont++) + ") " + perro.toString());

            }
//            Boolean esta = adoptado.contains(opc);
            System.out.println("¿Ingrese el nombre del perro que desea adoptar?");
            opc = leer.next();
//            Iterator<Perro> itPerros = perros.iterator();
//            Iterator<Perro> itAdop = adoptado.iterator();
//            System.out.println(adoptado.size());
//Iterator<Persona>perso= pers.iterator();
//            if (adoptado.size() == 0) {
//                while(itPerros.hasNext()){
//                if (opc.equalsIgnoreCase(itPerros.next().getNombre())) {
//                    adoptado.add(itPerros.next());
//                    perso.next().setP(itPerros.next());
//                        System.out.println("Perro adoptado con exito");
//                        break;
//                }
//                    for (Persona per1 : pers) {
//                        
//                        
//                    }
//                
//                while(perso.hasNext()){
//                if (opc.equalsIgnoreCase(itPerros.next().getNombre())) {
//                   
//                    perso.next().setP(itPerros.next());
//                        System.out.println("Perro adoptado con exito");
//                        break;
//                }
//                
//            }
//                System.out.println(adoptado.toString());
//                System.out.println(perso.next().toString());
//            if (itAdop.next().getNombre().equalsIgnoreCase(opc)) {
//                System.err.println("El perro no se encuentra disponible para la adopcion");
//            }

            Boolean listaVacia = adoptado.isEmpty();
            if (listaVacia == true) {//si la lista de perro adoptados esta vacia la persona adopta sin problemas
                for (Perro perro : perros) {
                    if (perro.getNombre().equalsIgnoreCase(opc)) {
                        per.setP(perro);//persona adopta al perro
                        adoptado.add(perro);
                    }
                }
            } else {
                for (Perro adop : adoptado) {
                    adop.getNombre();
                    if (adop.getNombre().equalsIgnoreCase(opc)) {
                        System.err.println("El perro no se encuentra disponible para la adopcion");
                    }
                }
            }
            Iterator<Perro> adop = adoptado.iterator();
            while (adop.hasNext()) {
                adop.next().getNombre();
                if (adop.next().getNombre().equalsIgnoreCase(opc)) {
                    adoptado.add(adop.next());
                    System.out.println("Perro adoptado con exito");
                    break;
                }
            }
                        for (Perro perro : perros) {
                             perro.getNombre();
                            if (perro.getNombre().equalsIgnoreCase(opc)) {
                                per.setP(perro);//persona adopta al perro
                                
                                

                            }

                        }
        
        }
        
        for (Persona per : pers) {
            System.out.println(per.toString());
        }
        System.out.println("Perros adoptados");
        for (Perro perro : adoptado) {
            System.out.println(perro.toString());
        }

    }
}
