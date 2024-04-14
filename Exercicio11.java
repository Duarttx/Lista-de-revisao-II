import java.util.Scanner;
import java.util.Random;

public class Exercicio11 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
      
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        
        int indiceComputador = random.nextInt(3); 
        String jogadaComputador = opcoes[indiceComputador];
        
        
        System.out.println("Escolha uma opção: Pedra, Papel ou Tesoura");
        String jogadaUsuario = scanner.nextLine();
        
        
        System.out.println("Você jogou: " + jogadaUsuario);
        System.out.println("O computador jogou: " + jogadaComputador);
        
    
        if (jogadaUsuario.equalsIgnoreCase(jogadaComputador)) {
            System.out.println("Empate!");
        } else if ((jogadaUsuario.equalsIgnoreCase("Pedra") && jogadaComputador.equalsIgnoreCase("Tesoura")) ||
                   (jogadaUsuario.equalsIgnoreCase("Papel") && jogadaComputador.equalsIgnoreCase("Pedra")) ||
                   (jogadaUsuario.equalsIgnoreCase("Tesoura") && jogadaComputador.equalsIgnoreCase("Papel"))) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Você perdeu!");
        }
        
    
        scanner.close();
    }
}