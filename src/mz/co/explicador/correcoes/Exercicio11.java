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
public class Exercicio11 {
 /*
  11.Criar um array A com 10 elementos inteiros. Desenvolver um programa que defina o
      percentual de elementos pares e ímpares, respectivamente, armazenados neste array
  */
     public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
       
        int[] vetorA = new int[10];
    
           for (int i = 0; i < vetorA.length; i++) {
              System.out.println("Insira o "+(i+1)+ "o valor");
              vetorA[i]=r.nextInt();
           }
             
           int impar=0;
           for (int i = 0; i < vetorA.length; i++) {
             if (vetorA[i] % 2 != 0){
                   impar++;
                 }
           }
          
           int par = vetorA.length - impar;
           
           double percetPar= (par * 100)/ vetorA.length;
           double percetImpar = 100 - percetPar;
           
             System.out.print("Vetor A = ");    
           for (int i = 0; i < vetorA.length; i++) {
             System.out.print(vetorA[i] + " , ");
    }
        System.out.println();
        
          System.out.println("percentagem dos numeros pares: " +percetPar );
          System.out.println("percentagem dos numeros impares: " + percetImpar );
     }     
     }
