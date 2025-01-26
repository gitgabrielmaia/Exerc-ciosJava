package jogoAdivinhacao;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        
        try (Scanner scanner = new Scanner(System.in)) {  // Usando try-with-resources
            int tentativas = 0;
            int palpite;
            
            System.out.println("Tente adivinhar o número entre 1 e 100.");
            
            do {
                System.out.print("Digite seu palpite: ");
                palpite = scanner.nextInt();
                tentativas++;
                
                if (palpite < numeroSecreto) {
                    System.out.println("O número secreto é maior.");
                } else if (palpite > numeroSecreto) {
                    System.out.println("O número secreto é menor.");
                } else {
                    System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
                }
            } while (palpite != numeroSecreto);
        }
    }
}
