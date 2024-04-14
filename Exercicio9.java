import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        // Verificando se o usuário é maior de idade
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
        
        // Fechando o Scanner para liberar recursos
        scanner.close();
    }
}