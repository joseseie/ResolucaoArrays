<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.explicador.correcoes;

=======

package mz.co.explicador.correcoes;

import java.util.Arrays;
>>>>>>> 6c34b5022c668c617f291a1ddd2cf5cf5b65e76c
import javax.swing.JOptionPane;

/**
 *
<<<<<<< HEAD
 * @author Milton Junior
 */
public class Exercicio02 {
/*     2. Escreva um programa que leia 10 valores reais do teclado e armazene-os num array d e
 *     permita que sejam impressos quanto solicitados.
 */
    public static void main(String[] args) {
    
     int totalDeValores= 10;
     double[] d=new double[totalDeValores];
     
     for (int i = 0; i <totalDeValores ; i++){
          
         String valores = JOptionPane.showInputDialog("Insira o valor ["+(i+1)+"]");
     
     }
     
     String solicitacao = JOptionPane.showInputDialog("Deseja solicitar os numeros?: ");
    
     String=
    }
    
     
=======
 * @author joseseie
 */
public class Exercicio02 {
    
    /*
        2. Escreva um programa que leia 10 valores reais do teclado e 
        armazene-os num array d e permita que sejam impressos quanto solicitados.
    */
    
    static double[] d = null;
   
    
    private static void lerValores () {
        
        int totalValores = 5;
        
        d = new double[totalValores];
                
        for (int i = 0; i < totalValores; i++) {
            
            String lido = JOptionPane.showInputDialog("Insira o "+(i+1)+"o valor: ");
            d[i] = Double.parseDouble(lido);
          
        }
    }
    
    private static void imrimirValores () {
        
        String valores = Arrays.toString(d);
        
        JOptionPane.showMessageDialog(null, valores);
        
    }
    
    
    private static void menu () {
        
        String menu = "\n"
                + "1. Ler novos valores;\n"
                + "2. Imprimir valores lidos;\n"
                + "3. Sair;\n";
     
        String escolha = null;
        
        do {  
     
            escolha = JOptionPane.showInputDialog(menu);
     
            switch (escolha) {
                case "1": {
                    lerValores();
                    break;
                }
                case "2": {
                    imrimirValores();
                    break;
                }
                case "3": {
                    System.exit(0);
                };
            }
            
        } while (!escolha.equals("3"));
        
    }
    
    
    public static void main(String[] args) {
        
        menu();
        
    }
    
    
>>>>>>> 6c34b5022c668c617f291a1ddd2cf5cf5b65e76c
}
