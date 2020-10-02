/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.explicador.correcoes;

import java.util.Arrays;
import javax.swing.JOptionPane;

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
        
        int[] vetorA = new int[10];
        
        for (int i = 0; i < vetorA.length; i++) {
             String idade = JOptionPane.showInputDialog("Digite o " + (i+1) + "o numero");
             
             vetorA[i] = Integer.parseInt(idade);
              
        }
        
        int numPares=0;
        
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 ==0 ){
                numPares++;
            }
              
        }
      
        JOptionPane.showMessageDialog(null ,"Idades digitadas:" + Arrays.toString(vetorA));           
        JOptionPane.showMessageDialog(null ,"Quatidade de numeros pares: " + numPares);
       
      }
}
