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
public class Exercicio18 {
 /*
    18.Criar um array A com 15 elementos inteiros. Construir um array B de mesmo tipo e
       tamanho, sendo que cada elemento do array B deverá ser o quadrado do respectivo
         elemento de A, ou seja: B[i] = A[i] * A[I]. 
  */
     
    public static void main(String[] args) {
      
        int numeros = 5;
        int[] arrayA= new int [numeros];
        int[] arrayB= new int [numeros];
       
        for (int i = 0; i < arrayA.length; i++) {
            String str = JOptionPane.showInputDialog("insira o " +(i +1)+ "o numero");
        
            arrayA[i]=Integer.parseInt(str);

            arrayB[i]=arrayA[i] * arrayA[i] ;
        }
           
        JOptionPane.showMessageDialog(null,"Numeros insiridos :"+ Arrays.toString(arrayA)+"\n Resultados : "+ Arrays.toString(arrayB));
      
   }  
}
