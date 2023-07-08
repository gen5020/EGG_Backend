/*

 */
package servicios;

import entidad.Juego;
import java.util.Scanner;

public class JuegoServicio {

    Scanner leer = new Scanner(System.in);
    Juego j1=new Juego();
    public Juego crearJuego() {
        String[] meses = new String[12];
        meses[0] = "enero";
        meses[1] = "febrero";
        meses[2] = "marzo";
        meses[3] = "abril";
        meses[4] = "mayo";
        meses[5] = "junio";
        meses[6] = "julio";
        meses[7] = "agosto";
        meses[8] = "septiembre";
        meses[9] = "octubre";
        meses[10] = "noviembre";
        meses[11] = "diciembre";
        
        j1.setMeses(meses);
        int azar = (int) (Math.random() * 12);
        String mesSec = meses[azar];
        j1.setMesSecreto(mesSec);
        return j1;

    }

    public void adivinarMes(Juego j1) {

        System.err.println("La palabra secreta es " + j1.getMesSecreto());
        
        
        do {
            System.out.println("Adivina el MES Secreto");
            j1.setAdivina(leer.nextLine());
            if (j1.getAdivina().equalsIgnoreCase(j1.getMesSecreto())) {
                System.out.println("-------------------------");
                System.out.println("Felicidades has Adivinado");
                System.out.println("-------------------------");
            } else {
                System.err.println("*************************");
                System.err.println("  Respuesta Incorrecta");
                System.err.println("*************************");
            }
            
        } while (!j1.getAdivina().equalsIgnoreCase(j1.getMesSecreto()));
    }


    public void mostrarMesSecreto(Juego j1){
        System.err.println("La palabra secreta es " + j1.getMesSecreto());
    }
    public void adivinarMesPanta(Juego j1) {

        
        
            if (j1.getAdivina().equalsIgnoreCase(j1.getMesSecreto())) {
              // label_resultado.setText(("Felicidades has Adivinado"));
                System.out.println("Felicidades has Adivinado");
                System.out.println("-------------------------");
            } else {
                System.err.println("*************************");
                System.err.println("  Respuesta Incorrecta");
                System.err.println("*************************");
            }
            
        
    }
}
