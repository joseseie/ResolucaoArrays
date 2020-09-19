
package mz.co.explicador.correcoes;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
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
    
    
}
