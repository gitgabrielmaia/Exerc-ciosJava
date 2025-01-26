package verificadorPalindromos;

import java.util.Scanner;
public class Palindromo {
 
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {  // Usando try-with-resources
            System.out.print("Digite uma palavra: ");
            String palavra = scanner.nextLine();
            
            String reverso = new StringBuilder(palavra).reverse().toString();
            
            if (palavra.equalsIgnoreCase(reverso)) {
                System.out.println(palavra + " é um palíndromo.");
            } else {
                System.out.println(palavra + " não é um palíndromo.");
            }
        }
    }
}
