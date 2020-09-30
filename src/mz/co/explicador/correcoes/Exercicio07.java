/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.explicador.correcoes;

import java.util.Scanner;

/**
 *
 * @author Milton Junior
 */
public class Exercicio07 {
  /*
   7. Criar dois arrays A e B cada um com 10 elementos inteiros. Construir um array C,
      onde cada elemento de C é a soma dos respectivos elementos em A e B, ou seja:
         C[i] = A[i] + B[i]. 
    */
      
 public static void main(String[] args) {
        
   Scanner r = new Scanner(System.in);
    int numeros= 5;
   int[] array1= new int [numeros];
    int[] array2= new int [numeros];
    double [] array3= new double [numeros];
       
 for (int i = 0; i < array1.length; i++) {
          System.out.println("Insira os valores do arrayA na posicao " + i);
        array1[i]=r.nextInt();

    }
     for (int i = 0; i < array2.length; i++) {
          System.out.println("Insira os valores do arrayB na posicao " + i);
        array2[i]=r.nextInt();
     }
     for (int i = 0; i < array3.length; i++) {
          array3[i] = array1[i] + array2[i]; 
    }
     
        System.out.print("Array A = ");    
    for (int i = 0; i < array1.length; i++) {
          System.out.print(array1[i] + " ");
    }
        System.out.println();
       
     System.out.print("Array B = ");    
    for (int i = 0; i < array2.length; i++) {
          System.out.print(array2[i] + " ");
    }
        System.out.println();
        
         System.out.print("Array c = ");    
    for (int i = 0; i < array3.length; i++) {
          System.out.print(array3[i] + " ; ");
    }
        System.out.println();
    
     
    }
}
