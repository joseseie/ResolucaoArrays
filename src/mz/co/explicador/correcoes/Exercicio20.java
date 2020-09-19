
package mz.co.explicador.correcoes;

import javax.swing.JOptionPane;

/**
 *
 * @author joseseie
 */
public class Exercicio20 {
    
    /*
    20. Faça um programa de consulta pela posição numérica da pessoa: leia nomes de pessoas, sendo a 
        quantidade determinada pelo usuário. Logo após a entrada pergunte ao usuário o número do nome que ele 
        gostaria de consultar. Após sua resposta, exiba o nome que fica na posição informada.
        
        Chame atenção do usuário em caso de uma consulta inválida, ou seja, com números menores 
        ou iguais a zero, ou maiores do que a quantidade cadastrada.
    */
    
    static String nomes[] = null;
    
    private static void lerNomes (int totalNomes) {
        
        nomes = new String[totalNomes];
        
        for (int i = 0; i < totalNomes; i++) {
            nomes[i] = JOptionPane.showInputDialog("Insira o "+(i+1)+"o nome: ");
        }
        
    }
    
    
    public static void main(String[] args) {
        
        String qtdNomesStr = JOptionPane.showInputDialog("Quantos nomes deseja ler?");
        
        lerNomes(Integer.parseInt(qtdNomesStr));
        
        String posicaoStr = JOptionPane.showInputDialog("Número do nome que deseja consultar: ");
        
        int posicaoInt = Integer.parseInt(posicaoStr);
        
        if (posicaoInt >= 0 && posicaoInt < (Integer.parseInt(qtdNomesStr))) {
            
            JOptionPane.showMessageDialog(null, "O nome consultado é: ("+nomes[posicaoInt]+")");
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Consultou na posição inválida...", "Posição não encontrada", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
}
