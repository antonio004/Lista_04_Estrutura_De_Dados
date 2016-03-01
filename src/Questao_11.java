
import javax.swing.JOptionPane;

public class Questao_11 {

    public static void main(String[] args) {
        int[][] matriz = new int[20][20];
        int x, Pos_linha = 0, Pos_coluna = 0, verifica = 0;

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

        // Laço que imprime os números informados e a posição em que cada um foi armazenado
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Posição [" + (i + 1) + "][" + (j + 1) + "]: " + matriz[i][j]);
            }
        }

        //A variável x armazenado o numero que será consultado.
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero a ser pesquisado: "));

        // Laço que faz a consulta para saber se o numero pertence ao vetor.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == x) {
                    verifica = 1;
                    Pos_linha = i;
                    Pos_coluna = j;
                }
            }
        }

        //Verifica se a variável "verifica" teve seu valor alterado, se foi alterada, siginifica que o número pertence a Matriz.
        if (verifica != 0) {
            JOptionPane.showMessageDialog(null, "Número encontrado, está na posição [" + (Pos_linha + 1) + "][" + (Pos_coluna + 1) + "] da Mariz");
        } else {
            JOptionPane.showMessageDialog(null, "Número não Encontrado!\n       \t \t \t \t \t \t \t \t \t  :( :( :( :(");
        }

    }
}
