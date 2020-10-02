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
public class Exercicio08 {
    
 /*
    8. Criar um array A com 10 elementos inteiros. Implementar um programa que defina e
       escreva a soma de todos os elementos armazenados neste array.
  */
   public static void main(String[] args) {
      
       
       int[] arrayA = new int[5];
    
       for (int i = 0; i < arrayA.length; i++) {
           String nstgp = JOptionPane.showInputDialog("Insira o " +( i + 1 )+ " valor que deseja somar :");
            
           arrayA[i] = Integer.parseInt(nstgp);
       }
           
       int soma = 0;
       for (int i = 0; i < arrayA.length; i++) {
           soma+= arrayA[i];
           
       }
       JOptionPane.showMessageDialog(null ,"Numeros digitados " + Arrays.toString(arrayA));
       JOptionPane.showMessageDialog(null ,"O somatorio de todos os numeros insiridos : " + soma);
   }
}