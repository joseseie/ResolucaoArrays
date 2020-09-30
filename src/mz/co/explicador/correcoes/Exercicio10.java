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
public class Exercicio10 {
 /*
  10.Criar um array A com 10 elementos inteiros. Implementar um programa que defina e
      escreva a média aritmética simples dos elementos ímpares armazenados neste array
    */
    
     public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
       
        int[] vetorA = new int[10];
    
           for (int i = 0; i < vetorA.length; i++) {
              System.out.println("Insira o " +(i+1)+"o valor");
              vetorA[i]=r.nextInt();
           }
              int soma = 0;
              int impar=0;
           for (int i = 0; i < vetorA.length; i++) {
             if (vetorA[i] % 2 != 0){
                  soma+=vetorA[i];
                  impar++;
               }
           }
          System.out.print("Valores do array A = ");    
    for (int i = 0; i < vetorA.length; i++) {
          System.out.print(vetorA[i] + " ");
    }
        System.out.println();
        
          System.out.println("A soma de todos os numeros impares: " + soma);
          System.out.println("A media dos numeros impares: " + (soma/impar));
          
     }
     }


