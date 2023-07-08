/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class CadenaServicio {
    
    private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public Cadena crearCadena(){
        System.out.print("Ingrese su frase: ");
//        String cadena = leer.nextLine();
//        return new Cadena(cadena);
        return new Cadena(leer.nextLine());
    }
    
// a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
// que tiene la frase ingresada.
    public void mostrarVocales(Cadena cad){
        int contVocal = 0;
        String letra;
        for (int i = 0; i < cad.getLongitud() ; i++) {
            letra = cad.getFrase().substring(i, i+1);
                    if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("á")
                    || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("é")
                    || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("í")
                    || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("ó")
                    || letra.equalsIgnoreCase("u") || letra.equalsIgnoreCase("ú") || letra.equalsIgnoreCase("ü") ) {
                contVocal++;
            }
        }
        System.out.println("La cantidad de vocales de la frase es: "+contVocal);
    }
// b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
// por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
// asac".
        //        String nuevaCad = cad.getFrase().substring(cad.getLongitud()- 1, cad.getLongitud());
        //        nuevaCad = nuevaCad+cad.getFrase().substring(i - 1, i)

    public void invertirFrase(Cadena cad) {
        System.out.print("La frase invertida es: ");
        for (int i = cad.getLongitud() - 1; i >= 0; i--) {
            System.out.print(cad.getFrase().substring(i, i + 1));
        }
        System.out.println("");
    }
    
    
//c) Método vecesRepetido(String letra), recibirá un carácter ingresado
//por el usuario y contabilizar cuántas veces se repite el carácter en la
//frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
//veces.
        public void vecesRepetido(Cadena cad, String letra) {
                int contLetra = 0;
                for (int i = 0; i < cad.getLongitud(); i++) {
                    if (cad.getFrase().substring(i, i+1).equalsIgnoreCase(letra)) {
                        contLetra++;
                    }
                }
                System.out.println("El carácter " + letra + " se repite " + contLetra + " veces.");
            }

        //e) Método compararLongitud(String frase), deberá comparar la longitud
        //de la frase que compone la clase con otra nueva frase ingresada por
        //el usuario.
        public Integer compararLongitud(Cadena cad, String frase) {
                return Integer.compare(cad.getLongitud(), frase.length());
            }
        
        public String unirFrases(Cadena cad, String frase2){
            String nuevaFrase = " ";
            nuevaFrase = nuevaFrase.concat(cad.getFrase() + frase2);
            return nuevaFrase;
        }
        
        public String reemplazar(Cadena cad, String letra){
            String cambioFrase = " ";
            String frase = cad.getFrase();
            for (int i = 0;i < frase.length() ; i++) {
                if (frase.substring(i, i+1).equalsIgnoreCase("a")) {
                    cambioFrase = cambioFrase.concat(letra);
                } else {
                    cambioFrase = cambioFrase.concat(frase.substring(i, i+1));
                } 
            }
            
            return cambioFrase;
        }
        
        public boolean contiene(Cadena cad, String letra){
            boolean band = false;
            String frase = cad.getFrase();
            for (int i = 0;i < frase.length() ; i++) {
                if (frase.substring(i, i+1).equalsIgnoreCase(letra)) {
                    band = true;
                } 
            }
            return band;
        }




}

