
import javax.swing.JOptionPane;

public class Questao_14 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int aux, linha = 4, coluna = 0;

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

        //Faz a troca de diagonais.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    aux = matriz[i][j];
                    matriz[i][j] = matriz[linha][coluna];
                    matriz[linha][coluna] = aux;
                    linha--;
                    coluna++;
                }
            }
        }

        //Exibindo a Nova Matriz.
        System.out.println("-------- Matriz (Resultado) ----------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "     ");
            }
            System.out.println(" ");
        }
        System.out.println("------------------------------------------");
    }
}
