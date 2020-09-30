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
public class Exercicio17 {
  /*
    17.Criar um array A com 8 elementos inteiros. Construir um array B de mesmo tipo e
       tamanho e com os elementos do array A multiplicados por 2, ou seja: B[i] = A[i] * 2.
  */
    
    public static void main(String[] args) {
        
     Scanner r = new Scanner(System.in);  
        
    int numeros = 8;
    int[] arrayA= new int [numeros];
    int[] arrayB= new int [numeros];
       
    for (int i = 0; i < arrayA.length; i++) {
          System.out.println("insira o " +(i +1)+ "o numero");
        arrayA[i]=r.nextInt();

          arrayB[i]=arrayA[i] * 2 ;
           }
         System.out.print("Array A = ");    
    for (int i = 0; i < arrayA.length; i++) {
          System.out.print(arrayA[i] + " ");
    }
        System.out.println();
        
        
            
     System.out.print("Array B = ");    
    for (int i = 0; i < arrayB.length; i++) {
          System.out.print(arrayB[i] + " ");
    }
        System.out.println();
    }
     
    
}
