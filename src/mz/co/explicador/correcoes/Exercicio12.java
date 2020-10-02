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
public class Exercicio12 {
    /*
       12.Criar um array A com 10 elementos inteiros. Escrever um programa que calcule e
       escreva: a) a soma de elementos armazenados neste array que são inferiores a 15; b) a
       quantidade de elementos armazenados no array que são iguais a 15; e c) a média dos
       elementos armazenados no array que são superiores a 15.
    */
      
    public static void main(String[] args) {
     
        int[] vetorA = new int[5];
    
        for (int i = 0; i < vetorA.length; i++) {
               String leitor = JOptionPane.showInputDialog("Insira o "+(i+1)+ "o valor");
            
               vetorA[i] = Integer.parseInt(leitor);
        }
        int somaMenor15 =0;
        int igual = 0;
        int quatMaior15=0;
        double somaMaior15=0;
        
        for (int i = 0; i < vetorA.length; i++) {
            if(vetorA[i] == 15){
                igual++;
            } else if(vetorA[i] < 15 ){
                somaMenor15+= vetorA[i];
            } else {
                quatMaior15++;
                somaMaior15 += vetorA[i];
            }
           }
          
        JOptionPane.showMessageDialog(null ,"Numeros digitados " + Arrays.toString(vetorA));  
        JOptionPane.showMessageDialog(null ,"Quatidade de numeros iguais a 15: " + igual +
                  "\n Soma de numeros menores que 15: " +  somaMenor15 );
                
     
       /* if (somaMaior15/ quatMaior15 == 0){
            JOptionPane.showMessageDialog(null ," Medias dos numeros maiores que 15: Nao foram encontrados numeros maiores que 15" );
            
        } else  {
            JOptionPane.showMessageDialog(null ," Medias dos numeros maiores que 15: " +  (somaMaior15/ quatMaior15)); 
        }*/
        
             
    }
     
      
      }
     
      
       

