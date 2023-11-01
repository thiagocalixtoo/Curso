package application;

import java.util.Scanner;

public class MediaAltura {
    public static void main(String[] args) {
        //calcula a altura media de N pessoas
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero de pessoas: ");
        int n = sc.nextInt();
        double[] pessoas = new double[n];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.print("Digite a " + (i+1) + " altura: ");
            pessoas[i] = sc.nextDouble();
        }

        double media = 0;
        for (int i = 0; i < pessoas.length; i++) {
            media += pessoas[i];
        }

        System.out.printf("\nO média é %.2f", media/n);
    }
}
