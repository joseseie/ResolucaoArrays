
package mz.co.explicador.correcoes;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author joseseie
 */
public class Exercicio03 {
    
    /*
     3. Crie um array capaz de armazenar 50 números inteiros. Em seguida faça o seu 
        preenchimento automático com os números de 101 a 150, ou seja, na posição 
        número 0 ponha 101, na posição 1 ponha o número 102, e assim sucessivamente. 
        Em seguida exiba os valores deste vector.
    */
    
    public static void main(String[] args) {
        
        int total = 50;
        int [] numeros = new int[total];
        
        // Preeenchimento automático
        int numeroInicial = 101;
        
        for (int i = 0; i < total; i++) {
            
            numeros[i] = numeroInicial + i;
             
        }
        
        // Listar os valores (imprimir)
        String imprimir = Arrays.toString(numeros);
        JOptionPane.showMessageDialog(null, imprimir);
        
    }
    
}
