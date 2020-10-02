
package mz.co.explicador.correcoes;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author joseseie
 */
public class Exercicio06 {
    
    
    public static void main(String[] args) {
        
        int tamanho = 3;
        
        int[] arrayA = new int[tamanho];
        int[] arrayB = new int[tamanho];
        
        int[] arraysCopiados = new int[arrayA.length + arrayB.length];
        
        Scanner s = new Scanner(System.in);
        
        for (int i = 0; i < tamanho; i++) {
            
            String valoresA = JOptionPane.showInputDialog("Insira o valor no arrayA[" + i + "]");
            
            arrayA[i] = Integer.parseInt(valoresA);
            
            String valoresB = JOptionPane.showInputDialog("Insira o valor no arrayB[" + i + "]");
            
            arrayB[i] = Integer.parseInt(valoresB);
        }
        
        for (int i = 0; i < arrayA.length; i++) {
            arraysCopiados[i] = arrayA[i];
        }
        for (int i = 0; i < arrayB.length; i++) {
            arraysCopiados[arrayA.length + i] = arrayB[i];
        }
        
        JOptionPane.showMessageDialog(null ,"Array A: " + Arrays.toString(arrayA) );
        JOptionPane.showMessageDialog(null ,"Array B: " + Arrays.toString(arrayB) );
        JOptionPane.showMessageDialog(null ,"Copiados: " + Arrays.toString(arraysCopiados) );
        
    }
    
}
