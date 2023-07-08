/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
Después haremos otra función o procedimiento que imprima el vector.
 */
package Extras;

public class Ex3 {

    public static void main(String[] args) {
       int [] vec=new int[10];
       llenarVector(vec);
       imprimir(vec);
    }//main
    
    public static void llenarVector(int[] vec){

for(int i=0;i<10;i++){
vec[i]=(int)(Math.random()*50);
}
}//llenar vector
    public static void imprimir(int[] vec){
     for(int i=0;i<10;i++){
         System.out.println(vec[i]);
}
    }
}//public class


