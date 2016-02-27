import javax.swing.JOptionPane;

public class Questao_02 {

    public static void main(String[] args) {

        double vet[] = new double[16];
        double auxiliar;

        //Laço para ler os 12 valores a serem armazenados no vetor.
        for (int i = 0; i < vet.length; i++) {
            vet[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o numero a ser salva na posição " + (i) + " do vetor: "));
        }
        //Impreme o vetor dos numeros digitados.
        System.out.println("Vetor com os Numeros Digitados.");
        for (int i = 0; i < 16; i++) {
            System.out.println(vet[i]);
        }

        /*a variavael auxiliar recebe o vetor das 8 utlimas posicões, pegando a posição inicial zero e soma com 8, depois 1 e  soma com 8 e assim por diante
        este vetor[i+8] recebe o valor do vetor com as posições iniciais. 
        e vetor com as posições iniciais recebe o a variavel auxiliar que armazena as 8 ultimas posições do vetor.
        Ocorre uma truca permuta de valores.
         */
        for (int i = 0; i < 8; i++) {
            auxiliar = vet[i + 8];
            vet[i + 8] = vet[i];
            vet[i] = auxiliar;
        }

        //Impreme o Vetor com os 8 Primeiros Numeros Invertidos.
        System.out.println("------------Vetor Invertido Obitido --------------");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + "\n");
        }
    }
}
