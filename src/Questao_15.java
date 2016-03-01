
import javax.swing.JOptionPane;

public class Questao_15 {

    public static void main(String[] args) {
        int[][] matriz = new int[8][8];
        int maior = 0, soma_diagonal_Secundaria = 0;
        int ordem = 7;//oderem da matriz, contando a partir do zero.

        //Tenta criar a matriz, verificano se o tipo de entrada será um inteiro.
        try {
            //Cria Linhas da Matriz
            for (int i = 0; i < matriz.length; i++) {
                //Cria Colunas da Matriz
                for (int j = 0; j < matriz.length; j++) {
                    matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor para a posição [" + (i + 1) + "][" + (j + 1) + "] da 1ª Matriz: "));

                }
            }
        } catch (NumberFormatException e) {
            //e.getMessage(), retorna o que foi digitado informando o tipo de dado introduzido.
            JOptionPane.showMessageDialog(null, e.getMessage() + "\nExecução Finalizada.");
            System.exit(0);
        }

        //laço para pegar o maior valor da diagonal principal.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    if (matriz[i][j] > maior) {
                        maior = matriz[i][j];
                    }
                }
            }
        }

        /*Laço para fazer a soma da diagonal secundaria.
        Percorre linha x coluna, e verifica se a soma da posição linha x coluna do elemento é igual a mesma do vetor, se for
        é feita a soma.
         */
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if ((i + j) == (ordem)) {
                    soma_diagonal_Secundaria += matriz[i][j];
                }
            }
        }

        //Exibe O maior Valor da D. Principal e A soma da D. Secundaria.
        JOptionPane.showMessageDialog(null, "Maior Valor da Diagonal Principal: " + maior + "\nA soma dos elementos da diagonal secundaria e: " + soma_diagonal_Secundaria);

    }
}
