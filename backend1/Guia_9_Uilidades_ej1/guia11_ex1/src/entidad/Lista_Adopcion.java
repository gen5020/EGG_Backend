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
public class Lista_Adopcion {

    //atributos
    private ArrayList<Perro> perros = new ArrayList<>();
    private ArrayList<Persona> pers = new ArrayList<>();
    private ArrayList<Perro> adoptado = new ArrayList<>();
    private ArrayList<Perro> aux = new ArrayList<>();

    public Lista_Adopcion() {
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
        aux.add(p1);
        Perro p2 = new Perro("tom", "Pastor Aleman", 5, "grande");
        perros.add(p2);
        aux.add(p2);
        Perro p3 = new Perro("olaf", "Labrador", 4, "Grande");
        perros.add(p3);
        aux.add(p3);
        Perro p4 = new Perro("daysi", "Pequines", 8, "pequeño");
        perros.add(p4);
        aux.add(p4);
        Perro p5 = new Perro("jazmin", "Pequines", 2, "pequeño");
        perros.add(p5);
        aux.add(p5);
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
        
        int cont2=0;
        for (Persona per : pers) {//lista principal de personas
            //menu intro
            System.out.println("Bienvenido " + per.getNombre());
            System.out.println("Lista de perros");
            System.out.println(aux.toString());
            System.out.println("\033[32mIngrese el nombre del perro que desea adoptar");
            String candidato = leer.next();
            int cont1 = 0;
            Iterator<Perro> perro = perros.iterator();
            for (Perro perro1 : aux) {//recorre lista perros para comparar nombre de perros

                while (perro.hasNext()) {
//                        perro.next();
                    Perro p1 = perro.next();
                    if (p1.getNombre().equalsIgnoreCase(candidato)) {//busca y compara nombre de perros con lista adoptados
                        System.out.println("\033[36mPerro Felizmente Adoptado");
                        cont1++;
                        per.setP(p1);//adopta la persona
                        
                        adoptado.add(p1);//agrega perro a lista adoptados
                       perro.remove();  
//                            disponible = false;
                        break;//si esta en la lista salir del bucle
    }
//
                }
                    
                     if (cont1==1){
                      
                    }else{ 
                         System.out.println("\033[31mPerro NO disponible");
                         break;
                     }
                }

            

        }//final for persona
        
        System.out.println("Personas y perros");
        System.out.println(pers.toString());
        System.out.println("Perros sin adoptar");
        System.out.println(perros.toString());
        System.out.println("Adoptados");
        System.out.println(adoptado.toString());

    }
    
    
}//final class 
