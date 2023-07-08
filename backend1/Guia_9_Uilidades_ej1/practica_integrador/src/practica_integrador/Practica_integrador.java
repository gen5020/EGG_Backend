/*
Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el
examen final. La escuela nos ha pedido que calculemos el promedio de notas
final de todos sus alumnos y saber qué alumnos han recibido una nota por
encima de ese promedio.


2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
nota mayor al promedio del curso
3. Por último, deberemos mostrar todos los estudiantes con una nota
mayor al promedio.
Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];
 */
package practica_integrador;

import entidad.Estudiante;
import java.util.Scanner;
import servicios.EstudianteServicio;

public class Practica_integrador {

    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        EstudianteServicio serv = new EstudianteServicio();
        Estudiante[] estudiantes = new Estudiante[3];
//llenar vector de objeto
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.print((i + 1) + ")Nombre: ");
            String nombre = (leer.next());
            System.out.print("Nota Final: ");
            double nota = (leer.nextDouble());
            estudiantes[i]=new Estudiante(nombre,nota);

        }

        double sumaNota = 0;
       //suma las notas de los 8 alumnos
        for (int i = 0; i < estudiantes.length; i++) {

            sumaNota += estudiantes[i].getNotaF();

        }
         double promedio = sumaNota/estudiantes.length;//promedio alumnos
        //1. Calcular y mostrar el promedio de notas de todo el curso
         System.out.println("Promedios Nota Final "+(promedio));
       
         int cont=0;//contador alumnos con nota superior al promedio
       
         for (int i = 0; i < estudiantes.length; i++) {
           if(estudiantes[i].getNotaF()>promedio){
               cont++;
               
           }
        }
        
        String [] NotaMayorProm=new String[cont];
       int  cont2=0;//contador para usar como indice para recorrer el vector NotaMayor
        for (int i = 0; i <estudiantes.length; i++) {
         if(estudiantes[i].getNotaF()>promedio){
         NotaMayorProm[cont2]= estudiantes[i].getNombre();
         cont2++;
        
        }
        }
        for (int i = 0; i <cont; i++) {
            System.out.println((i+1)+"Promedio Mayor"+NotaMayorProm[i]);
        }
        
        
        
    
    }

}
