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
public class Exercicio14 {
 /*
   14. Ler um array A com 10 elementos inteiros correspondentes as idades de um grupo de
      pessoas. Escreva um programa que determine e escreva a menor e a maior idades e
       suas respectivas posições.
  */
    
    public static void main(String[] args) {
      
        int[] idades = new int[10];
    
        for (int i = 0; i < idades.length; i++) {
             String idade = JOptionPane.showInputDialog("Digite a idade da " + (i + 1) +"o pessoa");
            
             idades[i] = Integer.parseInt(idade);
        }
        int menorIdade = idades[0];
        int inMenor = 0;
        int maiorIdade = idades[0];
        int inMaior = 0;
        
        for (int i = 0; i < idades.length; i++) {
            if(idades[i] > maiorIdade){
                maiorIdade=idades[i];
                inMaior= i ;
            }else if (idades[i] < menorIdade){
                  menorIdade=idades[i];
                   inMenor= i ;
            }
        }
     
      
     
        JOptionPane.showMessageDialog(null ,"Idades digitadas:" + Arrays.toString(idades));   
        JOptionPane.showMessageDialog(null ,"Menor idade: " + menorIdade + " \n Indice de menor idade: " + inMenor);
        JOptionPane.showMessageDialog(null ,"Maior idade: " + maiorIdade + " \n Indice de maior idade: " + inMaior);
    
           
           }
}
      
