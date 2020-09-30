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
public class Exercicio12 {
    /*
       12.Criar um array A com 10 elementos inteiros. Escrever um programa que calcule e
       escreva: a) a soma de elementos armazenados neste array que são inferiores a 15; b) a
       quantidade de elementos armazenados no array que são iguais a 15; e c) a média dos
       elementos armazenados no array que são superiores a 15.
    */
      
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
       
        int[] vetorA = new int[10];
    
           for (int i = 0; i < vetorA.length; i++) {
              System.out.println("Insira o " +(i+1)+"o numero :");
              vetorA[i]=r.nextInt();
           }
      int somaMenor15 =0;
      int igual = 0;
      int quatMaior15=0;
      double somaMaior15=0;
          for (int i = 0; i < vetorA.length; i++) {
            if(vetorA[i] == 15){
                igual++;
            } else if(vetorA[i] < 15 ){
                 somaMenor15+= vetorA[i];
             } else {
                quatMaior15++;
                somaMaior15 += vetorA[i];
            }
            
          }
               System.out.print("Valores do array A : ");    
    for (int i = 0; i < vetorA.length; i++) {
         System.out.print(vetorA[i] + " ");
    }
        System.out.println();
        
          System.out.println("Quatidade de numeros iguais a 15: " + igual);
           System.out.println("Soma de numeros menores que 15: " +  somaMenor15);
            System.out.println("Medias dos numeros maiores que 15: " +  (somaMaior15/ quatMaior15));
        
      }
     
      
       
}
