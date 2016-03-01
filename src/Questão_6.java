
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Questão_6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char[] numero = new char[5];
        
        System.out.print("Soletre um número de até 5 letras.");
        //Verifica se foi digitado um carctere, caso nao seja, encerra a execução.
        try {
            for (int i = 0; i < numero.length; i++) {
                System.out.print("Informe a " + (i + 1) + " letra do vetor: ");
                numero[i] = entrada.next().charAt(0);
            }
        } catch (NumberFormatException e) {
            //e.getMessage(), retorna o que foi digitado informando o tipo de dado introduzido.
            JOptionPane.showMessageDialog(null, e.getMessage() + "\nExecução Finalizada.");
            System.exit(0);
        }
        
        System.out.print("O número escolhido foi: ");
        
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i]);
        }
        System.out.println("\n");

    }
}
