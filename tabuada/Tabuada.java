package tabuada;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {  // Usando try-with-resources
            System.out.print("Digite um número para ver a tabuada: ");
            int numero = scanner.nextInt();
            
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }
}