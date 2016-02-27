import javax.swing.JOptionPane;

public class Questao_01 {

    public static void main(String[] args) {

        double vet[] = new double[12];
        int Valor_P1 = 0, Valor_P2 = 0;

        //Laço para ler os 12 valores a serem armazenados no vetor.
        for (int i = 0; i < vet.length; i++) {
            vet[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o numero a ser salva na posição " + (i) + " do vetor: "));
        }

        //Pede a posição(inteiro)  do vetor para fazer a soma, e exibe o erro caso a posição nao seja um inteiro.
        try {
            //Não permite a escolhe de posição fora do intervalo (0 a 12) do vetor.
            do {
                Valor_P1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a posição do numero a ser somado (posição entre 0 e 11): "));
            } while (Valor_P1 < 0 || Valor_P1 > 11);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        //Pede a posição(inteiro)  do vetor para fazer a soma, e exibe o erro caso a posição nao seja um inteiro.
        try {
            //Não permite a escolhe de posição fora do intervalo (0 a 12) do vetor.
            do {
                Valor_P2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a posição do valor digitado(posição entre 0 e 11): "));
            } while (Valor_P2 < 0 || Valor_P2 > 11);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        //Exibe o Resultado da Soma dos numeros nas posições escolhidas.
        JOptionPane.showMessageDialog(null, "A soma dos numeros escolhidos é: " + (vet[Valor_P1] + vet[Valor_P2]));
    }

}
