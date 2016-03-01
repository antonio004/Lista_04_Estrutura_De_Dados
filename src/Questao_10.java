
import javax.swing.JOptionPane;

public class Questao_10 {

    public static void main(String[] args) {
        int[][] matriz_1 = new int[4][4];
        int[][] matriz_2 = new int[4][4];
        int[][] matriz_3 = new int[4][4];

        //Tenta criar a matriz_1, verificano se o tipo de entrada será um inteiro.
        try {
            //Cria Linhas da Matriz
            for (int i = 0; i < matriz_1.length; i++) {
                //Cria Colunas da Matriz
                for (int j = 0; j < matriz_1.length; j++) {
                    matriz_1[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor para a posição [" + (i + 1) + "][" + (j + 1) + "] da 1ª Matriz: "));
                }
            }
        } catch (NumberFormatException e) {
            //e.getMessage(), retorna o que foi digitado informando o tipo de dado introduzido.
            JOptionPane.showMessageDialog(null, e.getMessage() + "\nExecução Finalizada.");
            System.exit(0);
        }

        //Tenta Criar a Matriz_2, verificando se o tipo de entrada será um inteiro.
        try {
            //Cria Linhas da Matriz
            for (int i = 0; i < matriz_1.length; i++) {
                //Cria Colunas da Matriz
                for (int j = 0; j < matriz_1.length; j++) {
                    matriz_2[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor para a posição [" + (i + 1) + "][" + (j + 1) + "] da 2ª Matriz: "));
                }
            }
        } catch (NumberFormatException e) {
            //e.getMessage(), retorna o que foi digitado informando o tipo de dado introduzido.
            JOptionPane.showMessageDialog(null, e.getMessage() + "\nExecução Finalizada.");
            System.exit(0);
        }

        //Laço para verificar qual o maior valor de cada posição entre a matriz_1 e matriz_2. O Maior Valor será repassado a matriz_3.
        for (int i = 0; i < matriz_3.length; i++) {
            for (int j = 0; j < matriz_3.length; j++) {
                if (matriz_1[i][j] >= matriz_2[i][j]) {
                    matriz_3[i][j] = matriz_1[i][j];
                } else {
                    matriz_3[i][j] = matriz_2[i][j];
                }
            }
        }

        //Laço que imprime a Matriz_1.
        System.out.println("-------- Matriz 1 ----------");
        for (int i = 0; i < matriz_1.length; i++) {
            for (int j = 0; j < matriz_1.length; j++) {
                System.out.print(matriz_1[i][j] + "     ");
            }
            System.out.println(" ");
        }
        System.out.println("------------------------------------------");

        //Laço que imprime a Matriz_2.
        System.out.println("-------- Matriz 2 ----------");
        for (int i = 0; i < matriz_2.length; i++) {
            for (int j = 0; j < matriz_2.length; j++) {
                System.out.print(matriz_2[i][j] + "     ");
            }
            System.out.println(" ");
        }
        System.out.println("------------------------------------------");

        //Laço que imprime a Matriz_3.
        System.out.println("-------- Matriz 3 (Resultado) ----------");
        for (int i = 0; i < matriz_3.length; i++) {
            for (int j = 0; j < matriz_3.length; j++) {
                System.out.print(matriz_3[i][j] + "     ");
            }
            System.out.println(" ");
        }
        System.out.println("------------------------------------------");
    }
}
