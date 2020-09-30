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
public class Exercicio04 {
/* 
 4. Faça um programa que copie o conteúdo de um array para um segundo array   
 */
    
     
    public static void main(String[] args) {
   
   
        
     int numeros =5;
    int arrayA[]=  new int [numeros];
     int arrayB[]= new  int [numeros];
       
    for (int i = 0; i < numeros; i++) {
         JOptionPane.showInputDialog("Insira o " + (i+1) +"o numero");
    }
      for (int i = 0; i < numeros; i++) {
         
       arrayB[i]=arrayA[i];
      }
   String strMedias = Arrays.toString(arrayB);
   
   //ra JOptionPane.showMessageDialog(null, "A media dos alunos " + strMedias);
          
    
        System.out.println(arrayA);
   
        
           
     
        
    
         
          
        
  
          
    }
}
