
package mz.co.explicador.correcoes;

import javax.swing.JOptionPane;

/**
 *
 * @author joseseie
 */
public class Exercicio21 {
    
    /*
        21. Faça um programa de consulta de Explicadores a partir de um nome 
        informado por uma chave de dados: leia nomes de pessoas com seus respectivos 
        códigos de visita na plataforma Explicador, sendo a quantidade determinada pelo usuário. 
    
        Em seguida pergunte ao usuário qual o nome que ele deseja consultar o código. 
        Após sua resposta, exiba o código do explicador procurado.
    */
    
    static String nomes[] = null;
    static int codigosDeVisita[] = null;
    
    private static void lerDados (int totalNomes) {
        
        nomes = new String[totalNomes];
        codigosDeVisita = new int[totalNomes];
        
        for (int i = 0; i < totalNomes; i++) {
            nomes[i] = JOptionPane.showInputDialog("Insira o "+(i+1)+"o nome: ");
            
            String codeStr = JOptionPane.showInputDialog("Insira o código de visita do ("+nomes[i]+") é o "+(i+1)+"o Explicador");
            
            codigosDeVisita[i] = Integer.parseInt(codeStr);
            
        }
        
    }
    
    private static int encontrarPosicao (String nome) {
        
        int posicaEncontrada = -1;
        
        for (int i = 0; i < nomes.length; i++) {
            
            if (nomes[i].equals(nome)) {
                posicaEncontrada = i;
                break;
            }
            
        }
        
        return posicaEncontrada;
        
    }
    
    public static void main(String[] args) {
        
        String qtdNomesStr = JOptionPane.showInputDialog("Quantos Explicadores deseja ler?");
        
        lerDados(Integer.parseInt(qtdNomesStr));
        
        String nomeAConsultar = JOptionPane.showInputDialog("Nome que deseja consultar o seu código:");
        
        
        int posicaoInt = encontrarPosicao(nomeAConsultar);
        
        if (posicaoInt != -1) {
            
            JOptionPane.showMessageDialog(null, "O código de visita do ("+nomes[posicaoInt]+"), é = " + codigosDeVisita[posicaoInt]);
            
        } else {
            
            JOptionPane.showMessageDialog(null, "O nome consultado, não existel...", "Posição não encontrada", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
}
