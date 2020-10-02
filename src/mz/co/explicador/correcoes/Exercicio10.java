/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.explicador.correcoes;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

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
      
        int[] vetorA = new int[5];
    
        for (int i = 0; i < vetorA.length; i++) {
            String nstgp = JOptionPane.showInputDialog("Insira o " +(i+1)+"o valor");
          
            vetorA[i] = Integer.parseInt(nstgp);
        }
        
        int soma = 0;
        int impar=0;
        
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0){
                soma+=vetorA[i];
                impar++;
            }
        }
           
        JOptionPane.showMessageDialog(null ,"Numeros digitados " + Arrays.toString(vetorA));  
        JOptionPane.showMessageDialog(null , "\n A soma de todos os numeros impares: " + soma + 
                                       "\n A media dos numeros impares: " + (soma/impar));
   
     }     
    }
 
