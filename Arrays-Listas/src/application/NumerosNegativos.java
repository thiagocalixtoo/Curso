package application;

import java.util.Scanner;

public class NumerosNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? (máximo 10): ");
        int n = sc.nextInt();
        while(n > 10) {
            System.out.println("O número máximo permitido é 10. Redefina N.");
            n = sc.nextInt();
        }

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i+1) + "° número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros negativos:");
        for (int num : vetor) {
            if (num < 0) {
                System.out.println(num);
            }
        }
        sc.close();
    }
}