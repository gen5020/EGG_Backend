/*
 Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
 */
package servicios;
import  entidades.Cadena;
import static java.lang.Integer.compare;
import java.util.Scanner;
public class CadenaServicio {
    Cadena f1=new Cadena();
    Scanner leer=new Scanner(System.in);
    
    
    public Cadena crearCadena(){
        System.out.println("Ingrese una frase:");
        
        f1.setFrase(leer.nextLine());
        f1.setLongitud(f1.getFrase().length());
        return f1;
    }
    
 
//Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    public void mostrarVocales(Cadena f1){
        int contV=0; //contador vocal
        
        for (int i = 0; i < f1.getLongitud(); i++) {
           char pos=Character.toLowerCase(f1.getFrase().charAt(i));
           String letra=f1.getFrase().substring(i, i+1);
            if ((pos=='a')||(pos=='e')||(pos=='i')||(pos=='o')||(pos=='u'))
                contV++;
           /*if (("a".equals(letra))||("e".equals(letra))||("i".equals(letra))||("o".equals(letra))||("u".equals(letra))) 
                contV++;
            }*/    
    }
    System.out.println("Cantidad de vocales en la frase: "+ contV);
    }
    
//Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
//Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    
    public void  invertirFrase(Cadena f1){
       StringBuilder claseInvertir=new StringBuilder(f1.getFrase()); //crear objeto string build con la frase como parametro
       String fraseInvertida= claseInvertir.reverse().toString();//crear una variable String para guardar la frase invertida usando el metodo ".reverse()" y el ".toString()"
       System.out.println("Frase Original: "+ f1.getFrase());
       System.out.println("Frase Invertida: "+ fraseInvertida);
       
    }
/*Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario 
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces. */
public void vecesRepetido(Cadena f1){
    System.out.println("Contar el siguiente Caracter:");
    String letra=leer.nextLine();
        int cont=0;
    for (int i = 0; i < f1.getLongitud(); i++) {
        char pos=Character.toLowerCase(f1.getFrase().charAt(i));
        if (pos==letra.charAt(0)){
            cont++;
        }
    }

   
    System.out.println("El caracter '"+letra+"' se repite "+cont+" veces.");
}    
    
//Método compararLongitud(String frase), deberá comparar la longitud de la 
//frase que compone la clase con otra nueva frase ingresada por el usuario.

public void compararLongitud(Cadena f1, String f2){
  int res=compare(f1.getLongitud(), f2.length());
  if (res==0){
      System.out.println("Las cadenas tienen la misma longitud");
  }else{ System.out.println("Las cadenas son de diferente longitud");
  
  }
}

//Método unirFrases(String frase), deberá unir la frase contenida en la clase 
//Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
public void unirFrases(Cadena f1, String f2){
    System.out.println(f1.getFrase()+" "+f2);
}

/*Método reemplazar(String letra), deberá reemplazar todas las letras “a” 
que se encuentren en la frase, por algún otro carácter seleccionado por el usuario
y mostrar la frase resultante.*/

public void reemplazar(Cadena f1){
    System.out.println("Reemplazar 'a' por: ");
    String f4= leer.nextLine();
    char f4a=f4.charAt(0);
    String f1v2=f1.getFrase().replace('a',f4a);
    System.out.println(f1v2);
    
}

//Método contiene(String letra), deberá comprobar si la frase contiene una letra 
//que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
public boolean contiene(Cadena f1,String letraB){
    
    
    char buscar2= letraB.charAt(0);
    boolean resp= false; 
    for (int i = 0; i < f1.getLongitud(); i++) {
         
        char pos=Character.toLowerCase(f1.getFrase().charAt(i));
           
            if ((pos==buscar2)){
                 resp=true;
          }  
    }
    return resp;
}

}//class final
