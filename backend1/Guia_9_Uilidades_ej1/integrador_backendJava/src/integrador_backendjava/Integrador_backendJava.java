/*
Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el examen final.
La escuela nos ha pedido que calculemos el promedio de notas final de todos sus alumnos
y saber qué alumnos han recibido una nota por encima de ese promedio.
usando ese arreglo tenemos que realizar las dos tareas que nos ha pedido la escuela.


Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.
Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];

 */
package integrador_backendjava;

import entidad.Estudiante;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @noelia User
 */
public class Integrador_backendJava {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Estudiante[] alumnos = new Estudiante[8];
        DecimalFormat formato = new DecimalFormat("#.##");
        
//La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8 estudiantes con sus respectivas notas.
//Una vez creado los estudiantes deberemos guardar los estudiantes en un arreglo de objetos tipo Estudiante- 
        String nombre;
        double notaF;
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print((i+1)+")Nombre: ");
            nombre = leer.nextLine();
            notaF = (Math.random() * 10);
            alumnos[i] = new Estudiante(nombre, notaF);

        }
//mostrar nombre y nota
        for (int i = 0; i < alumnos.length; i++) {

            System.out.println(formato.format(alumnos[i].getNotaF()));

        }

        //Calcular y mostrar el promedio de notas de todo el curso
        double sumaN = 0;
        for (int i = 0; i < alumnos.length; i++) {

            sumaN += alumnos[i].getNotaF();

        }

        double promedio = sumaN / alumnos.length;
        System.out.println("suma notas " + sumaN);
        System.out.println("promedio " + formato.format(promedio));
        
     //  superiorPromedio(Estudiante alumnos[],promedio);
        int cont=0;//contador promedio superior
        for (int i = 0; i < alumnos.length; i++) {
        if (alumnos[i].getNotaF()>promedio){
            cont++;
        }
        }
     
     String[] mayorPromedio= new String[cont];
      int indiceAux=0;
     
      for (int i = 0; i < alumnos.length; i++) {
        if (alumnos[i].getNotaF()>promedio){
            mayorPromedio[indiceAux]=alumnos[i].getNombre();
           indiceAux++;}
       
    }
         System.out.println("Los alumnos con una nota superior al promedio son: ");
         for (int i = 0; i < mayorPromedio.length; i++) {
              System.out.println((i+1)+")"+ mayorPromedio[i]);
         
         }
      
       
        
    
       

    }//fin void

    //Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso
//    public void superiorPromedio(Estudiante alumnos[],double promedio){
//int cont=0;//contador promedio superior
//        for (int i = 0; i < alumnos.length; i++) {
//        if (alumnos[i].getNotaF()>promedio){
//            cont++;
//        }
//        }
//      String[] mayorPromedio= new String[cont];
//      int indiceAux=0;
//      for (int i = 0; i < alumnos.length; i++) {
//        if (alumnos[i].getNotaF()>promedio)
//            mayorPromedio[indiceAux]=alumnos[i].getNombre();
//           indiceAux++;
//       
//    }
//         System.out.println("Los alumnos con una nota superior al promedio son: ");
//         for (int i = 0; i < mayorPromedio.length; i++) {
//              System.out.println("1)"+ mayorPromedio[i]);
//         
//         }
//      
        
       
//    }
    
}//fin class
