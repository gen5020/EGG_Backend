/*
 Realice un programa que compruebe si una matriz dada es antisimétrica. 
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta,
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
La matriz traspuesta de una matriz A se denota por AT y se obtiene 
cambiando sus filas por columnas (o viceversa).

 */
package Ejercicios;


public class E5 {

    public static void main(String[] args) {
int [][]mat=new int[3][3];
mat[0][0]=1;
mat[0][1]=-2;
mat[0][2]=4;
mat[1][0]=2;
mat[1][1]=0;
mat[1][2]=2;
mat[2][0]=-4;
mat[2][1]=-2;
mat[2][2]=0;
        System.out.println("Matriz 1");
for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
        System.out.print("["+mat[i][j]+"]");
    }
    System.out.println("");
}
        System.out.println("Matriz 2");
for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
        System.out.print("["+mat[j][i]+"]");
    }
    System.out.println("");
}
int cont=0;
for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
       if(mat[i][j]!=-mat[i][j] || mat[i][j]==0){
           cont++;
       }
    }
}
        System.out.println(cont);
        if(cont==(3*3)){
            System.out.println("La matriz es antisimetrica");
            
        }else{
            System.out.println("La matriz NO es antisimetrica");
        }
    }
    
}
