package ordenacaoNumeros;
import java.util.Arrays;
import java.util.Scanner;

public class Ordenacao {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {  // Usando try-with-resources
            System.out.print("Quantos números você quer ordenar? ");
            int n = scanner.nextInt();
            
            int[] numeros = new int[n];
            
            System.out.println("Digite os números:");
            for (int i = 0; i < n; i++) {
                numeros[i] = scanner.nextInt();
            }
            
            Arrays.sort(numeros);
            
            System.out.println("Números ordenados:");
            for (int num : numeros) {
                System.out.print(num + " ");
            }
        }
    }
}