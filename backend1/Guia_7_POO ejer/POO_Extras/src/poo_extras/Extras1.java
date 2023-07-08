/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
Se deberá definir además dos constructores: uno vacío que inicializa el título 
y el autor a cadenas vacías y otro que reciba como parámetros el título y el autor 
de la canción. Se deberán además definir los métodos getters y setters correspondientes.
 */
package poo_extras;

public class Extras1 {

    public static void main(String[] args) {
    Canción c1=new Canción();
    c1.autor="Soledad Pastorutti";
    c1.titulo="Tren del Cielo";
      Canción c2=new Canción();  
      c2.setAutor("Avril");
      c2.setTitulo("Miss you");
        System.out.println("Cancion1");
      System.out.println(c1);
        System.out.println("Cancion2");
    System.out.println(c2);
    //con el set cambias los datos de c2
        System.out.println("Cancion 2 b");
    c2.setAutor("Demi Lovato");
    c2.setTitulo("heart attack");
        System.out.println(c2);
        
    }
    
}
