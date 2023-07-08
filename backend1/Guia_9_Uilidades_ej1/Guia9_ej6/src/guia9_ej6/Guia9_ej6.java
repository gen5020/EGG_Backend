/*
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un programa para organizar la información de cada curso.
Para ello, crearemos una clase entidad llamada Curso, 
 */
package guia9_ej6;

import entidades.Curso;

public class Guia9_ej6 {

    public static void main(String[] args) {
      
        Curso c1= new Curso();
    c1.crearCurso(c1);
    c1.calcularGananciaSemananal(c1);
      
    }
    
}
