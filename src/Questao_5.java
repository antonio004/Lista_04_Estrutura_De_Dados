import javax.swing.JOptionPane;

public class Questao_5 {

    public static void main(String[] args) {
        double vet_Inicial[] = new double[40];
        double vet_Obtido[] = new double[40];
        double auxiliar = 0;

        //Laço para ler os 40 valores a serem armazenados no vetor.
        for (int i = 0; i < vet_Inicial.length; i++) {
            vet_Inicial[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o numero a ser salva na posição " + (i) + " do vetor: "));
        }

        for (int i = 0; i < vet_Inicial.length; i++) {
            auxiliar += vet_Inicial[i];
            vet_Obtido[i] = auxiliar;
        }

        //Exibe o Vetor Inicial.
        System.out.println(" ----- Vetor Inicial -------");
        for (int i = 0; i < vet_Inicial.length; i++) {
            System.out.println(vet_Inicial[i]);
        }

        //Exibe o Vetor Obtido.
        System.out.println(" ----- Novo Vetor -------");
        for (int i = 0; i < vet_Obtido.length; i++) {
            System.out.println(vet_Obtido[i]);
        }
    }
}
