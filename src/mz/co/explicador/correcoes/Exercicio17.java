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
public class Exercicio17 {
  /*
    17.Criar um array A com 8 elementos inteiros. Construir um array B de mesmo tipo e
       tamanho e com os elementos do array A multiplicados por 2, ou seja: B[i] = A[i] * 2.
  */
    
    
    public static void main(String[] args) {

        int numeros = 8;
        int[] arrayA= new int [numeros];
        int[] arrayB= new int [numeros];
       
        for (int i = 0; i < arrayA.length; i++) {
            String str = JOptionPane.showInputDialog("insira o " +(i +1)+ "o numero");
        
            arrayA[i]=Integer.parseInt(str);

            arrayB[i]=arrayA[i] * 2 ;
        }
          
        JOptionPane.showMessageDialog(null ,"Array A: " + Arrays.toString(arrayA)+ "\n Array B: " + Arrays.toString(arrayB));
 
    }
     
    
}
