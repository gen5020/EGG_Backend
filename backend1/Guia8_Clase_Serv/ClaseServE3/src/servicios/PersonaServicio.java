/*
 En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. 
La función devuelve un booleano.

Método calcularIMC(): calculara si la persona está en su peso ideal 
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1. 
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), 
significa que la persona está en su peso ideal y la función devuelve un 0.
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa 
que la persona tiene sobrepeso, y la función devuelve un 1.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, 
llamaremos todos los métodos para cada objeto, deberá comprobar si la persona 
está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal
e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC 
y esMayorDeEdad en distintas variables(arrays), para después calcular un porcentaje
de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal 
y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores 
de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales.
 */
package servicios;

import entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {
   private  Scanner leer= new Scanner(System.in);
    Persona np=new Persona();
   /* Metodo crearPersona(): el método crear persona, le pide los valores de los atributos 
al usuario y después se le asignan a sus respectivos atributos para llenar 
el objeto Persona. Además, comprueba que el sexo introducido sea correcto,
es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
*/
    public void crearPersona(Persona np){
        System.out.print("Nombre: ");
        np.setNombre(leer.nextLine());
         System.out.print("Sexo: ");
        np.setSexo(leer.next());
        String sex= np.getSexo();
        if((sex.equalsIgnoreCase("H"))||(sex.equalsIgnoreCase("M"))||(sex.equalsIgnoreCase("o"))){
            
        }else{
            System.out.println("ERROR: Ingrese [H] [M] [O]");
        }
         System.out.print("Edad: ");
        np.setEdad(leer.nextInt());
         System.out.print("Altura: ");
        np.setAltura(leer.nextDouble());
          System.out.print("Peso: ");
        np.setPeso(leer.nextDouble());
    }
}
