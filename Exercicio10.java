import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor original do produto: ");
        double valorOriginal = scanner.nextDouble();
    
        System.out.print("Digite a taxa de desconto (em %): ");
        double taxaDesconto = scanner.nextDouble();
        
        double desconto = valorOriginal * (taxaDesconto / 100);
        
        double novoValor = valorOriginal - desconto;
       
        System.out.println("O desconto é de: R$" + desconto);
        System.out.println("O novo valor com desconto é de: R$" + novoValor);
        
     
        scanner.close();
    }
}