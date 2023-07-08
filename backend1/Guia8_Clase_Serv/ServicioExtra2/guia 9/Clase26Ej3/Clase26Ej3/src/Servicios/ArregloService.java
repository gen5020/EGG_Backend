/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Arrays;



/**
 *
 * @author Miguel Ángel
 */
public class ArregloService {
    //1)
    public void inicializA(int[] A){
        
        for (int i = 0; i < 50; i++) {
            A[i] =  (int)Math.floor(Math.random()*50+1);
        }
    }
    //2)
    public void mostrar(int[] C){
        for (int i = 0; i < C.length; i++) {
            System.out.print("["+ C[i] +"]" );
        }
    }
    
    //3)
    public void ordenar(int[] C){
       Arrays.sort(C);
       int[] aux = new int[C.length];
       int J = C.length-1;
       for (int i = 0; i < C.length ; i++) {
            aux[i]= C[J];
            J--;
        }
       for (int i = 0; i < C.length ; i++) {
            C[i]= aux[i];
            
        }
       
       for (int i = 0 ; i >C.length ; i++) {
            System.out.print("["+ C[i] +"]" );
        }
    }
    
    //4)
    public void inicializarB(int[] B, int[] A){
        for (int i = 0; i < 20; i++) {
            if (i<10) {
                B[i]= A[i];
            } else {
                B[i]= 5;
            }
             
        }
    }
}
