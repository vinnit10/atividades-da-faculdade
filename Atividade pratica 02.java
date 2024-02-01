import javax.swing.JOptionPane;

public class Media {

    public static void main(String[] args) {
        int i;
        double[] Num = new double[50];
        double media, soma = 0;

        for (i = 0; i < 50; i++) {
            System.out.println("Digite um número:");
            Num[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
            soma += Num[i];
        }

        media = soma / 50;

        System.out.println("A média dos 50 números digitados é: " + media);
    }
}