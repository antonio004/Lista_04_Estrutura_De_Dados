
import javax.swing.JOptionPane;

public class Questao_4 {

    public static void main(String[] args) {
        double vet[] = new double[40];
        //Variável que ira fazer a contagem de numeros pares.        
        int cont = 0;

        //Laço para ler os 40 valores a serem armazenados no vetor e verifica a condição de paridade.
        for (int i = 0; i < vet.length; i++) {
            vet[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o numero a ser salva na posição " + (i) + " do vetor: "));
            if (vet[i] % 2 == 0) {
                cont++;
            }
        }
        
        //Exibe Mensagem Informando a quantidade de números pares no vetor.
        JOptionPane.showMessageDialog(null, "O vetor possui, " + cont + " numero pares!!");
    }
}
