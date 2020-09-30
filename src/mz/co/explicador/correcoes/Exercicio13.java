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
public class Exercicio13 {
    
    /*
       13.Ler um array A com 10 elementos inteiros correspondentes as idades de um grupo de
       pessoas. Escreva um programa que determine e escreva a quantidade de pessoas que
       possuem idade superior a 35 anos.

    */
     public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
       
        int[] idades = new int[10];
    
           for (int i = 0; i < idades.length; i++) {
              System.out.println(" Digite a idade da " + (i + 1) +"o pessoa");
              idades[i]=r.nextInt();
           }
           int quatidade = 0;
           for (int i = 0; i < idades.length; i++) {
             if(idades[i] > 35){
                 quatidade++;
             }
                    }
                       System.out.print("Idades digitadas: = ");    
    for (int i = 0; i < idades.length; i++) {
          System.out.print(idades[i] + " ");
    }
        System.out.println();
        
          System.out.println("Quantidade de pessoas com a idade maior que 35: " + quatidade);
     }
    
}
