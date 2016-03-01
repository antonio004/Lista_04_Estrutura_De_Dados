
import javax.swing.JOptionPane;

public class Questao_12 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int aux;

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

        //trocando a 1ª linha com a 4ª coluna.
        for (int i = 0; i < matriz.length; i++) {
            aux = matriz[0][i]; // aux recebe o que está armazenado na linha 1
            matriz[0][i] = matriz[i][3]; // linha 1 da matriz recebe a os valores da coluna 4.
            matriz[i][3] = aux; // a coluna 4 recebe os valores da linha 1.
        }

        //Exibindo a Nova Matriz Com os Valores Trocados.
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
