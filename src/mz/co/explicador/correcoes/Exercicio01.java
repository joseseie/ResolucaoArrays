
package mz.co.explicador.correcoes;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author joseseie
 */
public class Exercicio01 {

    /*
        1. O sistema de admissão à UEM da maior parte dos cursos de engenharias 
        é composto por dois exames, Matemática e Física. Supondo que o primeiro
        exame tem peso 70%, e o segundo tem peso 30%. Faça um porgrama para  
        calcular a média final de 10 alunos nestas disciplinas.
    */
    
    public static void main(String[] args) {
        
        int totalAlunos = 3;
        double medias[] = new double[totalAlunos];
        
        for (int i = 0; i < totalAlunos; i++) {
            
            String strNotaMatematica = JOptionPane.showInputDialog("Insira a nota de matemática para o aluno["+(i+1)+"]");
            String strNotaFisica = JOptionPane.showInputDialog("Insira a nota de Física para o aluno["+(i+1)+"]");
            
            double media = Double.parseDouble(strNotaMatematica) * 0.7 + Double.parseDouble(strNotaFisica) * 0.3;
            
            medias[i] = media;
            
        }
        
        
        String strMedias = Arrays.toString(medias); // [9, 12.4,9,8,18,...]
        
        // Em java
        // 1. Caractares de escape
        // 2. Uso de JOptionPage
        // 3. Classes Wrappers

        JOptionPane.showMessageDialog(null, "A media dos ("+totalAlunos+") alunos é: \n" + strMedias);
        
    }
    
}
