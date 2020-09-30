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
public class Exercicio14 {
 /*
   14. Ler um array A com 10 elementos inteiros correspondentes as idades de um grupo de
      pessoas. Escreva um programa que determine e escreva a menor e a maior idades e
       suas respectivas posições.
  */
    
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
       
        int[] idades = new int[10];
    
           for (int i = 0; i < idades.length; i++) {
              System.out.println(" Digite a idade da " + (i + 1) +"o pessoa");
              idades[i]=r.nextInt();
           }
         int menorIdade = idades[0];
         int inMenor = 0;
         int maiorIdade = idades[0];
         int inMaior = 0;
           for (int i = 0; i < idades.length; i++) {
             if(idades[i] > maiorIdade){
               maiorIdade=idades[i];
               inMaior= i ;
             }else if (idades[i] < menorIdade){
                  menorIdade=idades[i];
                   inMenor= i ;
             }
           }
        System.out.print("Idades digitadas : ");    
    for (int i = 0; i < idades.length; i++) {
          System.out.print(idades[i] + " ");
    }
        System.out.println();
        
          System.out.println("Menor idade: " + menorIdade);
           System.out.println("Indice de menor idade: " + inMenor);
             System.out.println("Maior idade: " + maiorIdade);
           System.out.println("Indice de maior idade: " + inMaior);
           
           }
}
      
