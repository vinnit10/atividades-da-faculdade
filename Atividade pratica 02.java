import javax.swing.JOptionPane;

public class Media {

    public static void main(String[] args) {
        // declaração de variáveis e/ou constantes
        int i;
        double[] Num = new double[50];
        double media, soma = 0;

        // processamento de dados
        for (i = 0; i < 50; i++) {
            // mensagem ao usuário
            System.out.println("Digite um número:");

            // entrada de dados
            Num[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));

            soma += Num[i];
        }

        // processamento de dados
        media = soma / 50;

        // saída de resultados
        System.out.println("A média dos 50 números digitados é: " + media);
    }
}
