package application;

import java.util.Scanner;
import entities.Pessoas;

public class AnalisaPessoas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de pessoas que serão analisadas: ");
        int n = sc.nextInt();
        sc.nextLine();
        Pessoas[] vetPessoas = new Pessoas[n];

        for (int i = 0; i < vetPessoas.length; i++) {
            System.out.print("Digite o nome da "+(i+1)+"° pessoa: ");
            String nome = sc.nextLine();
            System.out.print("Digite a idade da "+(i+1)+"° pessoa: ");
            int idade = sc.nextInt();
            System.out.print("Digite a altura da "+(i+1)+"° pessoa: ");
            double altura = sc.nextDouble();
            sc.nextLine();
            System.out.print("\n");
            vetPessoas[i] = new Pessoas(nome, altura, idade);
        }
        System.out.printf("\nA altura média das pessoas é de %.2fm", mediaAltura(vetPessoas));
        nomesMenores16(vetPessoas);
    }

    public static double mediaAltura (Pessoas[] vetPessoas){
        double mediaAltura = 0.0;
        for (int i = 0; i < vetPessoas.length; i++) {
            mediaAltura += vetPessoas[i].getAltura();
        }
        return mediaAltura/vetPessoas.length;
    }

    public static void nomesMenores16 (Pessoas[] vetPessoas){
        int contaMenores16 = 0;
        for (int i = 0; i < vetPessoas.length; i++){
            if (vetPessoas[i].getIdade() < 16) {
                contaMenores16++;
            }
        }
        System.out.printf("\nPorcentagem de menores: %.2f%%", (double) contaMenores16/vetPessoas.length*100.0);

        if(contaMenores16 > 0){
            System.out.println("\n\nLista dos de menores: \n");
            for (int i = 0; i < vetPessoas.length; i++) {
                if (vetPessoas[i].getIdade() < 16) {
                    System.out.printf("Nome: %s, %d anos.\n", vetPessoas[i].getNome(), vetPessoas[i].getIdade());
                }
            }
        }
    }
}
