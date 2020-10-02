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
public class Exercicio04 {
/* 
 4. Faça um programa que copie o conteúdo de um array para um segundo array   
 */
    
     
    public static void main(String[] args) {
  
        int numeros =5;
        int arrayA[]=  new int [numeros];
        int arrayB[]= new  int [numeros];
        int var=0;
        
        for (int i = 0; i < numeros; i++) {
            String nstr = JOptionPane.showInputDialog("Insira o " + (i+1) +"o numero");
   
            arrayA[i] = Integer.parseInt(nstr);   
   }
    
        arrayB = arrayA;
        JOptionPane.showMessageDialog(null , Arrays.toString(arrayB));
        
           
     
        
    
         
          
        
  
          
    }
}
