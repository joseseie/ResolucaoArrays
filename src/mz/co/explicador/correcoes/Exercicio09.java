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
public class Exercicio09 {
 /*
  *  9.Criar um array A com 10 elementos inteiros. Implementar um programa que
  *    determine a soma dos elementos armazenados neste array que são múltiplos de 5.
  */
 
    public static void main(String[] args) {
     
       
         int[] arrayA = new int[5];
    
         for (int i = 0; i < arrayA.length; i++) {
             String nstgp = JOptionPane.showInputDialog("Insira o " + (i+1)+"o numero");
           
             arrayA[i] = Integer.parseInt(nstgp);
              
         }
         
         int soma = 0;
         for (int i = 0; i < arrayA.length; i++) {
             
             if (arrayA[i] % 5 == 0){
                 soma+=arrayA[i];
                    
             }
         }  
          
         JOptionPane.showMessageDialog(null ,"Numeros digitados " + Arrays.toString(arrayA));  
         JOptionPane.showMessageDialog(null ,"Soma dos valores que sao multiplos de 5: " + soma);
     }
     
}
