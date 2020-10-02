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
public class Exercicio19 {
  /*
     19. Criar dois arrays A e B cada um com 10 elementos inteiros. Construir um array C,
       onde cada elemento de C é a divisão dos respectivos elementos em A e B, ou seja:
         C[i] = A[i] / float(B[i]).
    */
    
    public static void main(String[] args) {
        
        int numeros= 5;
        int[] arrayA= new int [numeros];
        int[] arrayB= new int [numeros];
        double [] arrayC= new double [numeros];
       
        for (int i = 0; i < arrayA.length; i++) {
            String str = JOptionPane.showInputDialog("insira o " +(i +1)+ "o numero para o vetor 1");
            
            arrayA[i]=Integer.parseInt(str);
        }
     
        for (int i = 0; i < arrayB.length; i++) {
            String str2 = JOptionPane.showInputDialog("insira o " +(i +1)+ "o numero para o vetor 2");
            
            arrayB[i]=Integer.parseInt(str2);
        }
        
        for (int i = 0; i < arrayC.length; i++) {
            arrayC[i] = arrayA[i] / arrayB[i]; 
        }
     
        JOptionPane.showMessageDialog(null ,"Valores gitados para o vetor 1: " + Arrays.toString(arrayA));      
        JOptionPane.showMessageDialog(null ,"Valores digitados para o vetor 2: " + Arrays.toString(arrayB));    
        JOptionPane.showMessageDialog(null ,"Resultados: " + Arrays.toString(arrayC));    
    
     
    }
}


    

