import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();
        
        final double notaMinimaAprovacao = 6.0; 
        if (nota >= notaMinimaAprovacao) {
            System.out.println("O aluno foi aprovado!");
        } else {
            System.out.println("O aluno foi reprovado.");
        }
        
        scanner.close();
    }
}
