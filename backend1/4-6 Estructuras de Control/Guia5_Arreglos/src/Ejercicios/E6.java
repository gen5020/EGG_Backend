/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por 
teclado y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9.

 */
package Ejercicios;

import java.util.Scanner;

public class E6 {

    public static void main(String[] args) {
      String resp="asa";
        Scanner leer=new Scanner(System.in);
      int [][] mat=new int[3][3];
      System.out.println("Ingrese Numeros entre 1 y 9");
      for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
              do{
                  System.out.print("Ingrese N° en ["+i+"]"+"["+j+"]:");
             mat[i][j]=leer.nextInt();
              }while((mat[i][j]<0) || (mat[i][j]>10));
          }
      }
      int []sF=new int[3];  
   
        System.out.println("\n Matriz");
        for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
              System.out.print("[" +mat[i][j]+"]");
          }
            System.out.println("");
      }
       
       int  aux=0;
       int aux1=0;
       //suma de filas
       for(int f=0;f<3;f++){
          int sumF=0; 
          for(int c=0;c<3;c++){
              sumF=mat[f][c]+sumF;
              sF[f]=sumF;//guardar resultado de suma de filas en vector
         
          }
            
       }
       for(int i=0;i<3;i++){
           //System.out.println(sF[i]);
       /*if(sF[i]==sumF){
              aux++;
             // System.out.println("Suma igual "+aux);
          } */
       }
       //suma de columnas
       int [] sC=new int[3];
       int sumC=0;
       for(int c=0;c<3;c++){
          sumC=0; 
          for(int f=0;f<3;f++){
              sumC=mat[c][f]+sumC;
              sC[c]=sumC;//guardar result suma de columnas en vector
         
          }
          
       }
       // System.out.println("Suma columnas");
          for (int i=0;i<3;i++){
              //System.out.println(sC[i]);
          }
          //System.out.println(" ");
       for(int i=0;i<3;i++){
           
      
        
       // System.out.println("Suma Diagonal principal");
       
        int dP=0;
        for(int f=0;f<3;f++){
            for(int c=0;c<3;c++){
                if(f==c){
                    dP=mat[f][c]+dP;  
                }
      } 
            
    }
       // System.out.println("diagonal principal"+dP);
        
   // System.out.println("Suma Diagonal secundaria");
       
        int dS=0;
        for(int f=0;f<3;f++){
            for(int c=0;c<3;c++){
                if(f==0 &&c==2){
                    dS=mat[f][c]+dS;
                }else if(f==1 && c==1){
                        dS=mat[f][c]+dS;
                }else if(f==2 && c==0){
                       dS=mat[f][c]+dS; 
                    }
                    }
                }
         //System.out.println("secundaria " +dS);
    
         if(sF[i]==sC[i]){
              aux++;
             // System.out.println("Suma igual "+aux);
              if((dS==dP)&&(dS==sumC)&&aux==3){
              resp="yes";
              }else{
            resp="no";
              }
           
       }else{
             resp="no";
          
      }
       } 
       
    if (resp.equals("yes")){
        System.out.println("\n Es una matriz MÁGICA");
        System.out.println("");
    }else{System.out.println("\n NO es una matriz mágica");}
        System.out.println("");
       
    }//cierre void main
}//cierre class
     
    


    

