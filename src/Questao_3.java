import javax.swing.JOptionPane;


public class Questao_3 {
   public static void main(String[] args) {

        double vet[] = new double[20];
        double x;
        
        //Variaveis para controle da consulta do numero dentro do vetor.
        int verifica = 0;
        int posicao = 0;

        //Laço para ler os 20 valores a serem armazenados no vetor.
        for (int i = 0; i < vet.length; i++) {
            vet[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o numero a ser salva na posição " + (i) + " do vetor: "));
        } 
        
        // Laço que imprime os números informados e a posição em que cada um foi armazenado.
        for (int i=0; i<vet.length;i++){
            System.out.println("Posição "+(i)+": "+vet[i]);
        }
        
        //A variável x armazenado o numero que será consultado.
        x = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um numero a ser pesquisado: "));
        
        // Laço que faz a consulta para saber se o numero pertence ao vetor.
        for (int i=0; i< vet.length;i++){
            if(vet[i] == x){
                verifica = 1;
                posicao = i;
            }
        }
        
        //Verifica se a variável verifica teve seu valor alterado, se foi alterada, siginifica que o número pertence ao vetor.
        if(verifica != 0){
               JOptionPane.showMessageDialog(null, "Número encontrado, está na posição: "+posicao+" do vetor");
        }
        else{
            JOptionPane.showMessageDialog(null,"Número não Encontrado!\n       \t \t \t \t \t \t \t \t \t  :( :( :( :(");
        }
   }
}
