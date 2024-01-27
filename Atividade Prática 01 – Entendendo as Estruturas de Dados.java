import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita e lê o nome completo do usuário
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();
        
        // Exibe o nome completo na tela
        System.out.println("Seu nome completo é: " + nomeCompleto);
        
        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}
