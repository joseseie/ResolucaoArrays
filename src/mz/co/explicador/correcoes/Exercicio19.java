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
public class Exercicio19 {
  /*
     19. Criar dois arrays A e B cada um com 10 elementos inteiros. Construir um array C,
       onde cada elemento de C é a divisão dos respectivos elementos em A e B, ou seja:
         C[i] = A[i] / float(B[i]).
    */
    
    public static void main(String[] args) {
        
   Scanner r = new Scanner(System.in);
    int numeros= 5;
   int[] arrayA= new int [numeros];
    int[] arrayB= new int [numeros];
    double [] arrayC= new double [numeros];
       
 for (int i = 0; i < arrayA.length; i++) {
          System.out.println("insira o " +(i +1)+ "o numero");
        arrayA[i]=r.nextInt();

    }
     for (int i = 0; i < arrayB.length; i++) {
          System.out.println("insira o " +(i +1)+ "o valor");
        arrayB[i]=r.nextInt();
     }
     for (int i = 0; i < arrayC.length; i++) {
          arrayC[i] = arrayA[i] / arrayB[i]; 
    }
     
        System.out.print("1o valores gitados: ");    
    for (int i = 0; i < arrayA.length; i++) {
          System.out.print(arrayA[i] + " , ");
    }
        System.out.println();
       
     System.out.print("2o valores digitados:");    
    for (int i = 0; i < arrayB.length; i++) {
          System.out.print(arrayB[i] + " , ");
    }
        System.out.println();
        
         System.out.print("Resultados: ");    
    for (int i = 0; i < arrayC.length; i++) {
          System.out.print(arrayC[i] + " ; ");
    }
        System.out.println("");
     
    }
}


    

