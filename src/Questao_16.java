
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Questao_16 {

    public static void main(String[] args) {
        char[][] matriz_1 = new char[4][4];
        char[][] matriz_2 = new char[4][4];
        int flag1 = 1, flag2 = 1;

        Scanner entrada = new Scanner(System.in);

        //Tenta criar a matriz_1, verificano se o tipo de entrada será um inteiro.
        try {
            //Cria Linhas da Matriz
            System.out.println("--------------------- Preenche Matriz 1 ------------------------");
            for (int i = 0; i < matriz_1.length; i++) {
                //Cria Colunas da Matriz
                for (int j = 0; j < matriz_1.length; j++) {
                    System.out.print("Informe o valor para a posição [" + (i + 1) + "][" + (j + 1) + "] da 1ª Matriz: ");
                    matriz_1[i][j] = entrada.nextLine().charAt(0);
                }
            }
            System.out.println("--------------------------------------------------------------------\n");

        } catch (NumberFormatException e) {
            //e.getMessage(), retorna o que foi digitado informando o tipo de dado introduzido.
            JOptionPane.showMessageDialog(null, e.getMessage() + "\nExecução Finalizada.");
            System.exit(0);
        }

        //Tenta criar a matriz_2, verificano se o tipo de entrada será um inteiro.
        try {
            //Cria Linhas da Matriz
            System.out.println("------------------------ Preenche Matriz 2 ------------------------");
            for (int i = 0; i < matriz_2.length; i++) {
                //Cria Colunas da Matriz
                for (int j = 0; j < matriz_2.length; j++) {
                    System.out.print("Informe o valor para a posição [" + (i + 1) + "][" + (j + 1) + "] da 2ª Matriz: ");
                    matriz_2[i][j] = entrada.nextLine().charAt(0);
                }
            }
            System.out.println("--------------------------------------------------------------------");

        } catch (NumberFormatException e) {
            //e.getMessage(), retorna o que foi digitado informando o tipo de dado introduzido.
            JOptionPane.showMessageDialog(null, e.getMessage() + "\nExecução Finalizada.");
            System.exit(0);
        }

        for (int i = 0; i < matriz_1.length; i++) {
            for (int j = 0; j < matriz_1.length; j++) {
                if (matriz_1[i][j] != matriz_1[matriz_1.length - (i + 1)][matriz_1.length - (j + 1)]) {
                    flag1 = 0;
                }
            }
        }

        for (int i = 0; i < matriz_2.length; i++) {
            for (int j = 0; j < matriz_2.length; j++) {
                if (matriz_2[i][j] != matriz_2[matriz_2.length - (i + 1)][matriz_2.length - (j + 1)]) {
                    flag2 = 0;
                }
            }
        }

        if ((flag1 == 1) || (flag2 == 1)) {
            // Se flag = 1, a matriz foi percorrido e e foi encontrado elementos palidromo.
            if (flag1 == 1) {
                JOptionPane.showMessageDialog(null, "A matriz 1 é um palindromo !!");
            } else if (flag2 == 1) {
                JOptionPane.showMessageDialog(null, "A matriz 2 é um palindromo !!");
            } //se flag = 0, é porque não há elementos simétricos diferentes.
            else {
                JOptionPane.showMessageDialog(null, "As Matrizes informadas não são Palindromos. :( :(");
            }
        }

    }
}
