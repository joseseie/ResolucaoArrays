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
public class Exercicio15 {
  /*
     15.Criar um array A com 10 elementos inteiros. Implementar um programa que defina e
        escreva a quantidade de elementos armazenados neste vetor que são pares.
    */
    
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
       
        int[] vetorA = new int[10];
        
          for (int i = 0; i < vetorA.length; i++) {
              System.out.println("Digite o " + (i+1) + "o numero");
              vetorA[i]=r.nextInt();
              
          }
         int numPares=0;
          for (int i = 0; i < vetorA.length; i++) {
              if (vetorA[i] % 2 ==0 ){
                  numPares++;
              }
              
          }
             System.out.print("Total de numeros inseridos : ");    
    for (int i = 0; i < vetorA.length; i++) {
          System.out.print(vetorA[i] + " ");
    }
        System.out.println();
        
          System.out.println("Quatidade de numeros pares: " + numPares);
       
      }
}
