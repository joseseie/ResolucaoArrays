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
public class Exercicio08 {
    
 /*
    8. Criar um array A com 10 elementos inteiros. Implementar um programa que defina e
       escreva a soma de todos os elementos armazenados neste array.
  */
   public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
       
        int[] arrayA = new int[10];
    
          for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Insira os valores que deseja somar :");
            arrayA[i]=r.nextInt();
           }
           
        int soma = 0;
          for (int i = 0; i < arrayA.length; i++) {
            soma+= arrayA[i];
           
       }
         System.out.print("Valores do array A = ");    
    
       for (int i = 0; i < arrayA.length; i++) {
         System.out.print(arrayA[i] + " , ");
    }
         System.out.println();
        
         System.out.println("O somatorio de todos os numeros insiridos : " + soma);
   }
}
