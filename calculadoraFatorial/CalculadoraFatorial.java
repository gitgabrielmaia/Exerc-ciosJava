package calculadoraFatorial;

import java.util.Scanner;

public class CalculadoraFatorial {
 
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {  // Usando try-with-resources
            System.out.print("Digite um número para calcular o fatorial: ");
            int numero = scanner.nextInt();
            
            long fatorial = 1;
            
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }
}
