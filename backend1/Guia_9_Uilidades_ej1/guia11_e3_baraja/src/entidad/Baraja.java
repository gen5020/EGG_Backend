/*

 */
package entidad;

import java.util.ArrayList;
import java.util.Collections;
import entidad.Carta;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Baraja {

    private ArrayList<Carta> b1 = new ArrayList<Carta>();
    private ArrayList<Carta> repartidas = new ArrayList<Carta>();

    public Baraja() {
    }

    public ArrayList<Carta> getB1() {
        return b1;
    }

    public void setB1(ArrayList<Carta> b1) {
        this.b1 = b1;
    }

    @Override
    public String toString() {
        return "Baraja" + "b1=" + b1;
    }

    //La baraja estará compuesta por un conjunto de cartas, 40 exactamente.
    public void llenarBaraja() {
        Integer cont = 0;
        Integer cont1 = 0;
        Integer cont2 = 0;
        for (int i = 0; i < 40; i++) {
            if ((i >= 0) && (i < 10)) {
                Carta c = new Carta();
                c.setNum(i + 1);
                c.setPalo("Basto");
                b1.add(c);
            } else if ((i >= 10) && (i < 20)) {
                Carta c = new Carta();
                cont++;
                c.setNum(cont);
                c.setPalo("Espada");
                b1.add(c);
//         if(c.getNum()!=8 && c.getNum()!=9)   

//        }       
            } else if ((i >= 20) && (i < 30)) {
                Carta c = new Carta();
                cont2++;
                c.setNum(cont2);
                c.setPalo("Oro");
                b1.add(c);

            } else if ((i >= 30) && (i < 40)) {
                Carta c = new Carta();
                cont1++;
                c.setNum(cont1);
                c.setPalo("Copa");
                b1.add(c);
            }

        }
//        System.out.println("Antes");
//        System.out.println(b1.toString());
//reemplaza los 8 y los 9 por 11 y 12
        Iterator<Carta> it = b1.iterator();
        while (it.hasNext()) {
            if (it.next().getNum() == 7) {
                it.next().setNum(11);
            } else if (it.next().getNum() == 9) {
                it.next().setNum(12);
            }

        }
        Iterator<Carta> it2 = b1.iterator();
        while (it2.hasNext()) {
            if (it2.next().getNum() == 11) {
                it2.next().setNum(12);
            }

        }
//        System.out.println("Despues");
        System.out.println(b1.toString());
    }

    //barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar() {
        Collections.shuffle(b1);//reordena las cartas de forma aleatorias
        System.out.println(b1.toString());
    }
//siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.

    public void siguienteCarta() {
        Iterator<Carta> it2 = b1.iterator();

        while (it2.hasNext()) {
            repartidas.add(it2.next());
            break;

        }

        Iterator<Carta> it = b1.iterator();
        int cont = 0;
        while (it.hasNext()) {

            System.out.println(it.next().toString());//1 muestre la carta

            cont++;//se suma el contador
            if (cont == 1) {//dependiendo el contador elimina la carta

                it.remove();
                break;//una vez que borra la carta sale del bucle
            } else {
                System.out.println("No hay mas cartas");
            }

        }

    }

    //cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public void cartasDisponibles() {
        System.out.println("Las cartas disponibles son: " + b1.size());
    }
//darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario. 

    public void darCartas() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("¿Cuantas cartas desea?");
        Integer dar = leer.nextInt();
//        if(dar>=b1.size()){
//            for (int i = 0; i < dar; i++) {
//             b1.get(i).toString();
//             repartidas.add(b1.get(i));
//            }
//  
//        }
        Iterator<Carta> it2 = b1.iterator();
int cont2=0;
        while (it2.hasNext()) {
             if ((cont2 >= 0) && (cont2 < dar)) {
                cont2++;
                 repartidas.add(it2.next());//agrega al conjunto repartidas
             }else{break;}
              
            

        }
        Iterator<Carta> it = b1.iterator();
        int cont = 0;
        while (it.hasNext()) {
            if ((cont >= 0) && (cont < dar)) {
                System.out.println(it.next().toString());//muestra la carta 
                
                it.remove();
                cont++;//se suma el contador

            } else {
                break;
            }
        }

    }
//cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna indicárselo al usuario
    public void cartasMonton() {
        System.out.println("Cartas repartidas");
        if (repartidas.size() > 0) {
            for (Carta carta : repartidas) {
                System.out.println(carta);
            }

        }
    }

//mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.
    public void mostrarBaraja() {
        System.out.println("Baraja Restante");
        if (repartidas.size() > 0) {
            for (Carta carta : b1) {
                System.out.println(carta);
            }

        }
    }
}