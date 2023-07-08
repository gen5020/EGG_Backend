/*


 */
package entidades;

import java.util.Scanner;

public class Curso {

    //atributos serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana,turno (mañana o tarde),  precioPorHora y alumnos.
    //Donde alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los nombres de cada alumno.
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String alumnos[];

    Scanner leer = new Scanner(System.in);

//Un constructor por defecto.
    public Curso() {
    }

//Un constructor con todos los atributos como parámetro.
    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = new String[5];
    }

    //Métodos getters y setters de cada atributo.
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    /*d)Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. 
Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, solicitando 
en cada repetición que se ingrese el nombre de cada alumno.*/
    public void cargarAlumnos() {
        Curso c1 = new Curso();
        String[] aux = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ")Alumno: ");
            aux[i] = leer.next();

        }
        c1.setAlumnos(aux);

    }

    /*e)Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario 
    y después se le asignan a sus respectivos atributos para llenar el objeto Curso. 
    En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos */
    public Curso crearCurso(Curso c1) {
        System.out.print("Curso: ");
        c1.setNombreCurso(leer.nextLine());
        System.out.print("Cantidad Horas por dia: ");
        c1.setCantidadHorasPorDia(leer.nextInt());
        System.out.print("Cantidad Dias por semana: ");
        c1.setCantidadDiasPorSemana(leer.nextInt());
        System.out.print("Turno: ");
        c1.setTurno(leer.next());
        System.out.print("Precio por hora: ");
        c1.setPrecioPorHora(leer.nextDouble());
        System.out.println("Ingrese nombre de los alumnos: ");
        cargarAlumnos();
        return c1;
    }

    /*f)Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. 
Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos 
y la cantidad de días a la semana que se repite el encuentro.*/

public void calcularGananciaSemananal(Curso c1){
    double ganancia= ((c1.getCantidadDiasPorSemana())*(c1.getPrecioPorHora())*(c1.getCantidadHorasPorDia())*5);
    System.out.println("Ganancia semanal del curso "+ c1.getNombreCurso()+" es de "+ganancia);
}


}//final public class
