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
public class Exercicio07 {
  /*
   7. Criar dois arrays A e B cada um com 10 elementos inteiros. Construir um array C,
      onde cada elemento de C é a soma dos respectivos elementos em A e B, ou seja:
         C[i] = A[i] + B[i]. 
    */
      
 public static void main(String[] args) {
        

        int numeros= 5;
        int[] arrayA= new int [numeros];
        int[] arrayB= new int [numeros];
        double [] arrayC= new double [numeros];
       
        for (int i = 0; i < numeros; i++) {
            
            String nstg = JOptionPane.showInputDialog("Insira os valores do arrayA na posicao " + i);
        
            arrayA[i] = Integer.parseInt(nstg);
        }
 
        for (int i = 0; i < numeros; i++) {
            String nstgp = JOptionPane.showInputDialog("Insira os valores do arrayB na posicao " + i);
         
            arrayB[i] = Integer.parseInt(nstgp);
         
            arrayC[i] = arrayA[i] + arrayB[i];
        }
   
        JOptionPane.showMessageDialog(null ,"Array A: " + Arrays.toString(arrayA) );
        JOptionPane.showMessageDialog(null ,"Array B: " + Arrays.toString(arrayB) );
        JOptionPane.showMessageDialog(null, " A soma " + Arrays.toString(arrayC));
    
     
    }
}