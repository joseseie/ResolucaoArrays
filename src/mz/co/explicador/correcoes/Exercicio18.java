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
public class Exercicio18 {
 /*
    18.Criar um array A com 15 elementos inteiros. Construir um array B de mesmo tipo e
       tamanho, sendo que cada elemento do array B deverá ser o quadrado do respectivo
         elemento de A, ou seja: B[i] = A[i] * A[I]. 
  */
     
    public static void main(String[] args) {
        
   Scanner r = new Scanner(System.in);  
   
   int numeros = 15;
    int[] arrayA= new int [numeros];
    int[] arrayB= new int [numeros];
       
    for (int i = 0; i < arrayA.length; i++) {
          System.out.println("insira o " +(i +1)+ "o numero");
        arrayA[i]=r.nextInt();

          arrayB[i]=arrayA[i] * arrayA[i] ;
           }
         System.out.print("Numeros insiridos : ");    
    for (int i = 0; i < arrayA.length; i++) {
          System.out.print(arrayA[i] + " ");
    }
        System.out.println("");
      
       System.out.println("Multiplicando os numeros insiridos pelos memos.");
              
     System.out.print("Resultados : ");    
    for (int i = 0; i < arrayB.length; i++) {
          System.out.print(arrayB[i] + " ");
    }
        System.out.println();
    }
     
    
}
