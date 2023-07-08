/*
A continuación, en la clase main hacer lo siguiente:
● Crear 4 objetos de tipo Persona con distintos valores, a continuación,
llamaremos todos los métodos para cada objeto, deberá comprobar si la
persona está en su peso ideal, tiene sobrepeso o está por debajo de su
peso ideal e indicar para cada objeto si la persona es mayor de edad.
● Por último, guardaremos los resultados de los métodos calcularIMC y
esMayorDeEdad en distintas variables(arrays), para después calcular un
porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos
un porcentaje de cuantos son mayores de edad y cuantos menores. Para
esto, podemos crear unos métodos adicionales.
*/

package guia8;

import Entidades.Persona;
import Servicios.PersonaServicio;

public class Ejercicio3 {

    public static void main(String[] args) {
        
         
        
        PersonaServicio servicio = new PersonaServicio();
        Persona persona1 = servicio.crearPersona();
        Persona[] vector = new Persona[4];
        vector[0] = persona1;
        
        System.out.println("La persona es mayor de edad: "+servicio.esMayorDeEdad(persona1));
        int imc = servicio.calcularIMC(persona1);
        if(imc==-1){
            System.out.println("Estas por debajo de tu peso ideal.");
        } else if (imc==0){
            System.out.println("Estas en tu peso ideal");
        } else{
            System.out.println("Estas con sobrepeso");
        }
        Persona persona2 = servicio.crearPersona();
        vector[1] = persona2;
        System.out.println("La persona es mayor de edad: "+servicio.esMayorDeEdad(persona2));
        imc = servicio.calcularIMC(persona2);
        if(imc==-1){
            System.out.println("Estas por debajo de tu peso ideal.");
        } else if (imc==0){
            System.out.println("Estas en tu peso ideal");
        } else{
            System.out.println("Estas con sobrepeso");
        }
        Persona persona3 = servicio.crearPersona();
        vector[2] = persona3;
        System.out.println("La persona es mayor de edad: "+servicio.esMayorDeEdad(persona3));
        imc = servicio.calcularIMC(persona3);
        if(imc==-1){
            System.out.println("Estas por debajo de tu peso ideal.");
        } else if (imc==0){
            System.out.println("Estas en tu peso ideal");
        } else{
            System.out.println("Estas con sobrepeso");
        }
        Persona persona4 = servicio.crearPersona();
        vector[3] = persona4;
        System.out.println("La persona es mayor de edad: "+servicio.esMayorDeEdad(persona4));
        imc = servicio.calcularIMC(persona4);
        if(imc==-1){
            System.out.println("Estas por debajo de tu peso ideal.");
        } else if (imc==0){
            System.out.println("Estas en tu peso ideal");
        } else{
            System.out.println("Estas con sobrepeso");
        }
        int[] vector2 = new int[4];
        boolean[] vector3 = new boolean[4];
        double sobrepeso = 0;
        double pesoIdeal = 0;
        double pesoBajo = 0;
        double esMayor = 0;
        double esMenor = 0;
        for (int i = 0; i < 4; i++) {
            vector2[i] = servicio.calcularIMC(vector[i]);
            vector3[i] = servicio.esMayorDeEdad(vector[i]);
            switch (vector2[i]) {
                case -1:
                    
                    pesoBajo++;
                    break;
                case 0:
                    
                    pesoIdeal++;
                    break;    
                default:
                    
                    sobrepeso++;
            }
            
            if (vector3[i]) {
                esMayor++;
            } else {
                esMenor++;
            }
        }
        
        System.out.println("El promedio de personas con peso ideal es " + ((pesoIdeal / 4) * 100)+" %");
        System.out.println("El promedio de personas con peso alto es " + ((sobrepeso / 4) * 100)+" %");
        System.out.println("El promedio de personas con peso bajo es " + ((pesoBajo / 4) * 100)+" %");
        System.out.println(((esMayor/4)*100) + " % son mayores de edad");
        System.out.println(((esMenor/4)*100)+ " % son menores de edad");
        
        
    }
    
}
