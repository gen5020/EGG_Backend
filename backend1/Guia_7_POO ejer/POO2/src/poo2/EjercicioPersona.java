/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

import Entidades.Persona;
import Servicio.ServicioPersona;

/**
 *
 * @author eglys
 */
public class EjercicioPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, deberá comprobar si la persona 
         está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.*/
        ServicioPersona sp= new ServicioPersona();
        
        Persona per1 = sp.crearPersona();
        Persona per2 = sp.crearPersona();
        Persona per3 = sp.crearPersona();
        Persona per4 = sp.crearPersona();
        
        System.out.println(per1.toString());
        System.out.println(per2.toString());
        System.out.println(per3.toString());
        System.out.println(per4.toString());
        
        int imc []= new int [4];
        boolean edad []= new boolean[4];
        
        imc[0] = sp.calcularIMC(per1);
        imc[1] = sp.calcularIMC(per2);
        imc[2] = sp.calcularIMC(per3);
        imc[3] = sp.calcularIMC(per4);

        edad[0]=sp.esMayorDeEdad(per1);
        edad[1]=sp.esMayorDeEdad(per2);
        edad[2]=sp.esMayorDeEdad(per3);
        edad[3]=sp.esMayorDeEdad(per4);
        
        calImc(imc);
         mayoriaEdad(edad);
    }
    
     public static void calImc(int[] imc) {
        float resul;
        int cont1=0;
        int cont2=0;
        int cont3=0;
        
        for (int i = 0; i < 4; i++) {
            switch (imc[i]) {
                case -1:
                    cont1++;
                    break;
                case 0:
                    cont2++;
                    break;
                default:
                    cont3++;
                    break;
            }
            
            }
        
         System.out.println("Porcentaje de personas por debajo de su peso es de: " + cont1/4*100 +
                 "Porcentaje de personas con peso ideal es de: " 
                 + cont2/4*100 +  "Porcentaje de personas con sobrepeso es de: " + cont3/4*100);
        
        }
        
     public static void mayoriaEdad(boolean edad[]){
       
         int cont1=0;
         int cont2=0;
         for (int i = 0; i < 4; i++) {
             if (edad[i]) {
                 cont1++;
             }else{
             cont2++;
             }
             
         }
         System.out.println("Porcentaje mayores de edad " + cont1/4*100 + "Porcentaje menores de edad " + cont2/4*100);
     }
    }
    

