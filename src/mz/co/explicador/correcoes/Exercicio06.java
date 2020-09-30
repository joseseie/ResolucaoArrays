
package mz.co.explicador.correcoes;

import java.util.Arrays;
import java.util.Scanner;

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
            System.out.println("Insira o valor no arrayA[" + i + "]");
            arrayA[i] = s.nextInt();
            
            System.out.println("Insira o valor no arrayB[" + i + "]");
            arrayB[i] = s.nextInt();
        }
        
        for (int i = 0; i < arrayA.length; i++) {
            arraysCopiados[i] = arrayA[i];
        }
        for (int i = 0; i < arrayB.length; i++) {
            arraysCopiados[arrayA.length + i] = arrayB[i];
        }
        
        System.out.println("Array A: " + Arrays.toString(arrayA) );
        System.out.println("Array B: " + Arrays.toString(arrayB) );
        System.out.println("Copiados: " + Arrays.toString(arraysCopiados) );
        
    }
    
}
