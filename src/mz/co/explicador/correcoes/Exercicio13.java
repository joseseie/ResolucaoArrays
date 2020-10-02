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
public class Exercicio13 {
    
    /*
       13.Ler um array A com 10 elementos inteiros correspondentes as idades de um grupo de
       pessoas. Escreva um programa que determine e escreva a quantidade de pessoas que
       possuem idade superior a 35 anos.

    */
    
    public static void main(String[] args) {
       
        int[] idades = new int[10];
    
        for (int i = 0; i < idades.length; i++) {
              String idade = JOptionPane.showInputDialog("Insira a "+(i+1)+ "o idade");
            
              idades[i] = Integer.parseInt(idade);
        }
         
        int quatidade = 0;
        
        for (int i = 0; i < idades.length; i++){
            if(idades[i] > 35){
                quatidade++;
            }
        }
           
        JOptionPane.showMessageDialog(null ,"Quantidade de idades digitadas: " + Arrays.toString(idades));
        JOptionPane.showMessageDialog(null ,"Quantidade de pessoas com a idade maior que 35: " + quatidade);
                               }
                
   
      
        
           
     }
    

