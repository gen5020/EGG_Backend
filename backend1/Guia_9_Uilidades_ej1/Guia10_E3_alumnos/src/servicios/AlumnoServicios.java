/*
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
*/
package servicios;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Scanner leern = new Scanner(System.in);
//En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno.
//Se pide toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.
 //String opc="n";
 
 boolean opc=true;
  ArrayList <Alumno> ListAl=new ArrayList(); //crea lista objeto alumno
 String resp;
  
public void crearAlumno(){
 
    do{
            System.out.print("Nombre: ");
            String nombre= leer.next();
            System.out.print("1)Nota: ");
            ArrayList <Integer> listNotas= new ArrayList ();
            Integer n1= leern.nextInt();
            listNotas.add(n1);//agrega nota a lista notas
             System.out.print("2)Nota: ");
            Integer n2= leern.nextInt();
            listNotas.add(n2);//agrega nota a lista notas
             System.out.print("3)Nota: ");
            Integer n3= leern.nextInt();
            listNotas.add(n3);//agrega nota a lista notas
 Alumno a1= new Alumno(nombre,listNotas);//crea objeto alumno
         ListAl.add(a1);////agrega alumno a lista alumnos
            System.out.println("¿Ingresar otro nombre?");
            System.out.println("S/N");
            resp=leer.next();
            if(resp.equalsIgnoreCase("n")){
                opc=false;}
            
        } while(opc);
    
    System.out.println(ListAl);
    
    
}
//    Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.
public void notaFinal(){

    System.out.println("Ingresar Nombre de alumno que desea saber la nota final");
  String alum=leer.next();
      
      double promedio=0;
      boolean esta=false;
       for(Alumno a: ListAl){
           if(a.getNombre().equalsIgnoreCase(alum)){
            promedio= (a.getNotas().get(0)+a.getNotas().get(1)+a.getNotas().get(2))/3;
       esta=true;   
           }
       }
       if(esta){
       System.out.println("Su promedio es: "+promedio);
       }else{System.out.println("\033[31mEl alumno ingresado NO se encuentra en la lista");}
   /*  Iterator it=ListAl.iterator();
       while(it.hasNext()){
          Alumno lista = (Alumno) it.next();
           if((lista.getNombre().equalsIgnoreCase(alum))){
           promedio= (lista.getNotas().get(0)+lista.getNotas().get(1)+lista.getNotas().get(2))/3;
       esta=true;
           }
       }
      */
      
       
}
}
  
 /* for(Alumno a: ListAl){
           if(a.getNombre().equalsIgnoreCase(alum)){
               
           }
        }


for (Iterator it = ListAl.iterator(); it.hasNext();) {
            Alumno lista = (Alumno) it.next();
            if(alum.equalsIgnoreCase(lista.getNombre())){
                
            }
        }
*/        
    


 
/*public void notaFinal(ArrayList ListAl){
    double promedio= ListaAl.get;
}*/
    
    
    
    
    

