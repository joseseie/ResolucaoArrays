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
public class Exercicio09 {
 /*
  *  9.Criar um array A com 10 elementos inteiros. Implementar um programa que
  *    determine a soma dos elementos armazenados neste array que são múltiplos de 5.
  */
 
     public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
       
        int[] arrayA = new int[10];
    
           for (int i = 0; i < arrayA.length; i++) {
              System.out.println("Insira o " + (i+1)+"o numero");
              arrayA[i]=r.nextInt();
           }
      int soma = 0;
           for (int i = 0; i < arrayA.length; i++) {
               if (arrayA[i] % 5 == 0){
                   soma+=arrayA[i];
               }
           }
          System.out.print("Valores do array A = ");    
    for (int i = 0; i < arrayA.length; i++) {
          System.out.print(arrayA[i] + " ");
    }
        System.out.println();
        
          System.out.println("Valores que sao multiplos de 5: " + soma);
     }
     
}
