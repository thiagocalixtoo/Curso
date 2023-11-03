package application;

import entities.Alugueis;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de quartos a serem alugados: ");
        int n = sc.nextInt();
        sc.nextLine();
        boolean escolheuQuarto;
        Alugueis[] vetAlugueis = new Alugueis[10];
        for (int i = 0; i < n; i++) {
            escolheuQuarto = false;
            System.out.print("\nDigite o nome do responsável pelo "+(1+i)+"° aluguel: ");
            String nome = sc.nextLine();
            System.out.print("Digite o email do responsável pelo "+(1+i)+"° aluguel: ");
            String email = sc.nextLine();
            while(!escolheuQuarto) {
                System.out.print("Digite o numero do quarto a ser alugado: ");
                int quartoEscohido = sc.nextInt();
                sc.nextLine();
                if (vetAlugueis[quartoEscohido] == null) {
                    vetAlugueis[quartoEscohido] = new Alugueis(nome, email);
                    escolheuQuarto = true;
                } else {
                    System.out.print("\nQuarto já ocupado por " + vetAlugueis[quartoEscohido].getNome() + ". \nlista de quartos disponíveis: ");
                    for (int j = 0; j < vetAlugueis.length; j++) {
                        if (vetAlugueis[j] == null) {
                            System.out.print(j + "  ");
                        }
                    }
                    System.out.print("\n");
                }
            }
        }
        System.out.println("\nQuartos ocupados: ");
        for (int i = 0; i < vetAlugueis.length; i++) {
            if (vetAlugueis[i] != null) {
                System.out.println(i + ": " + vetAlugueis[i]);
            }
        }
    }
}