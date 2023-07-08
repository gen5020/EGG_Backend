/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author User
 */
public class e1_b {
    public static void main(String[] args) { 
    int[] vector = new int[100];
    
        for (int i = 0; i < 100; i++) {
            vector[i]= i + 1;
            
        }
        for (int i = 99; i >= 0; i--) {
            System.out.println(vector[i]);
            
        }
    }
    
} 

