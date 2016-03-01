
import javax.swing.JOptionPane;

public class Questao_7 {

    public static void main(String[] args) {
        int[] vetor = new int[10];
        int aux = 0, j;

        //tenta executar o laçõ para preencher as 10 posições do vetor, verificando se o que foi digitado é um valor inteiro.
        try {
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um Número Inteiro: "));
            }
        } catch (NumberFormatException e) {
            //e.getMessage(), retorna o que foi digitado informando o tipo de dado introduzido.
            JOptionPane.showMessageDialog(null, e.getMessage() + "\nExecução Finalizada.");
            System.exit(0);
        }

        System.out.print("Números iguais: ");
        //Laço que verifica se existem numeros iguais dentro do vetor.
        for (int i = 0; i < vetor.length; i++) {
            for (j = (i + 1); j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    aux = 1;
                }
            }
            if (aux == 1) {
                System.out.print(vetor[i] + "\t");
                aux = 0;
            }
        }
        
        System.out.println("\n");

    }
}
