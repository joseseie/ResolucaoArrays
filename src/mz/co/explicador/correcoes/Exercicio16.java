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
public class Exercicio16 {
 /*
    16.Criar um array A com 5 elementos inteiros. Construir um array B de mesmo tipo e
      tamanho e com os "mesmos" elementos do array A, ou seja, B[i] = A[i].
    */
    
    public static void main(String[] args) {
    
        int valor= 5;   
        int[] arrayA = new int[valor];
        int[] arrayB = new int[valor];
      
        for (int i = 0; i < arrayA.length; i++) {
            String str = JOptionPane.showInputDialog("insira o " +(i +1)+ "o numero");
         
            arrayA[i] = Integer.parseInt(str);
        }
        
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i]= arrayA[i];
        }
            
        JOptionPane.showMessageDialog(null ,"Array A: " + Arrays.toString(arrayA)+ 
                  " \n Array B: " + Arrays.toString(arrayB) );
      
      
    }
    
}
