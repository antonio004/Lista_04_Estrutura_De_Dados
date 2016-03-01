
import javax.swing.JOptionPane;

public class Questao_8 {

    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        int Maior_Valor_Coluna = 0, Maior_Valor_Linha = 0, auxiliar = 0;

        //Tenta criar a matriz verificando o tipo de dado de entrado. Cria Linhas da Matriz
        try {
            for (int i = 0; i < matriz.length; i++) {
                //Cria Colunas da Matriz
                for (int j = 0; j < matriz.length; j++) {
                    matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor a ser armazenado na posicao [" + (i + 1) + "][" + (j + 1) + "]: "));
                    if (matriz[i][j] > auxiliar) {
                        Maior_Valor_Linha = (i + 1);
                        Maior_Valor_Coluna = (j + 1);
                        auxiliar = matriz[i][j];
                    }
                }
            }
        } catch (NumberFormatException e) {
            //e.getMessage(), retorna o que foi digitado informando o tipo de dado introduzido.
            JOptionPane.showMessageDialog(null, e.getMessage() + "\nExecução Finalizada.");
            System.exit(0);
        }

        //Mostra a posição do maior valor da matriz.
        JOptionPane.showMessageDialog(null, "O Maior valor está na linha: " + Maior_Valor_Linha + ", Coluna: " + Maior_Valor_Coluna);
    }
}
