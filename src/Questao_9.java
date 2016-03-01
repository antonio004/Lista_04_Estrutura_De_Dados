public class Questao_9 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        //Laço para criar a matriz, para a diagonal princial ser toda 1, a linha(i) tem que ser igual a coluna(j).
        //Cria Linhas da Matriz
        for (int i = 0; i < matriz.length; i++) {
            //Cria Colunas da Matriz.
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        //laço para imprimir a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(+matriz[i][j] + " ");
                //Imprime cada elemento.
            }
            System.out.println(" "); //Pula uma linha.
        }
    }
}
