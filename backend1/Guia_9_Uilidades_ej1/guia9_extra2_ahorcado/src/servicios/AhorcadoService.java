/*Definir los siguientes métodos en AhorcadoService:

 */
package servicios;

import entidad.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {

    Scanner leer = new Scanner(System.in);
    Ahorcado j1 = new Ahorcado();

    /*Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector. 
Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.*/
    public Ahorcado crearJuego() {
        System.out.println("\033[37m Ingrese una palabra");
        String palabra = leer.next();
        j1.setLetras_encontradas(0);
        int longV = (palabra.length());//longitud vector
        System.out.println("Jugadas maximas");
        j1.setJugadasMax(leer.nextInt());
        String[] vecAux = new String[longV];
        char[] mostrar = new char[longV];
        for (int i = 0; i < longV; i++) {
            mostrar[i] = '-';
        }
        j1.setMostrarPal(mostrar);
        char[] vecA = palabra.toCharArray(); //crea un vector de caracter llenando el vector con una letra en cada posicion
        j1.setPalabraBusc(vecA);
        return j1;
    }

    //Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
    public int longitud() {
        //System.out.println("La longitud de la palabra es: "+j1.getPalabraBusc().length);
        return j1.getPalabraBusc().length;
    }

    //Método buscar(letra): este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra o no. 
    //También informará si la letra estaba o no.
    public void buscar() {
        System.out.println("Ingrese letra: ");
        String letra = leer.next();
        char[] vecA = j1.getPalabraBusc();//crea un vector de caracter llenando el vector con una letra en cada posicion
        char[] vecM = j1.getMostrarPal();
        int contNo = 0;//letra no encontrada
        String red="\033[31m";
        for (int i = 0; i < longitud(); i++) {
            if (letra.charAt(0) == (j1.getPalabraBusc()[i])) {
                j1.setLetras_encontradas(j1.getLetras_encontradas() + 1);
                vecA[i] = '@'; //para que reemplace la letra ya encontrada y la bloquee
                vecM[i] = letra.charAt(0);//reemplaza la letra encontrada en el vector que la muestra por pantalla
                j1.setPalabraBusc(vecA);
                j1.setMostrarPal(vecM);
            } else {
                contNo++;
            }
        }
        if (contNo == longitud()) {
            System.out.println("\033[31m_________________________________");
            System.out.println("\033[31m       LETRA NO ENCONTRADA      ");
            System.out.println("\033[31m_________________________________");
            j1.setJugadasMax((j1.getJugadasMax()) - 1);
        }
    }

    /*Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras 
han sido encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba 
y false si la letra no estaba, ya que, cada vez que se busque una letra que no esté, 
se le restará uno a sus oportunidades.*/
    public void encontradas() {
        buscar();

        int faltan = longitud() - j1.getLetras_encontradas();
        System.out.println("Total Letras encontradas: " + j1.getLetras_encontradas());
        System.out.println("Faltan: " + faltan + " letras");
        /* if (buscar()==0){
           j1.setJugadasMax(j1.getJugadasMax()-1);
        }
         */
    }
//Método intentos(): para mostrar cuántas oportunidades le queda al jugador.

    public void intentos() {
        System.out.println("Quedan " + (j1.getJugadasMax()) + " intentos");
    }
//metodo mostrar ahorcado

    public void mostrar() {
        System.out.println(" \033[36m*********************");
        for (int i = 0; i < longitud(); i++) {
            System.out.print("\033[36m"+ j1.getMostrarPal()[i]);

        }
          
        System.out.println("");
        System.out.println(" \033[36m*********************");
    }

    /*Método juego(): el método juego se encargará de llamar todos los métodos previamente 
mencionados e informará cuando el usuario descubra toda la palabra o se quede sin intentos. 
Este método se llamará en el main.*/
    public void juego() {
        int opc;
        do {
            crearJuego();

            do {
                mostrar();
                System.out.println("");
                System.out.println("La longitud de la palabra es: " + longitud());
                encontradas();
                intentos();
            } while ((j1.getJugadasMax() != 0) && (j1.getLetras_encontradas() != longitud()));
            if (j1.getJugadasMax() == 0) {
                System.out.println("\033[31m_________________________________");
                System.out.println("\033[31m         GAME OVER");
                System.out.println("\033[31m_________________________________");
                //System.out.println("");
            } else if (j1.getLetras_encontradas() == longitud()) {
                System.out.println("\033[36m_________________________________");
                System.out.println("\033[36m           YOU WIN!");
                System.out.println("\033[36m_________________________________");
                System.out.println("");
            }

            System.out.println("\u001B[0m************************");
            System.out.println("   ¿Jugar otra vez?");
            System.out.println("************************");
            System.out.println("[1])SI          [2]NO");
            
            opc = leer.nextInt();
            
        } while ((opc == 1));
    }
}
