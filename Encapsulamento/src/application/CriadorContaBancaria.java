package application;

import entities.ContaBancaria;

import java.util.Scanner;

public class CriadorContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria cont1;
        double valor;

        System.out.print("Digite o nome do titular da conta: ");
        String nome = sc.nextLine();
        System.out.print("Digite o numero da conta: ");
        int numeroCont = sc.nextInt();
        System.out.print("Deseja fazer um deposito incial? digite s/n: ");
        char escolha = Character.toUpperCase(sc.next().charAt(0));
        if (escolha == 'S') {
            System.out.print("Digite o valor do deposito inicial: ");
            valor = sc.nextDouble();
            while (valor <= 0) {
                System.out.println("Digite um valor maior do que zero para o deposito: ");
                valor = sc.nextDouble();
            }
            cont1 = new ContaBancaria(nome, numeroCont, valor);
        } else {
            cont1 = new ContaBancaria(nome, numeroCont);
        }

        System.out.println(cont1);

        System.out.print("Digite o valor para um deposito: ");
        valor = sc.nextDouble();
        while (valor < 0) {
            System.out.print("\nDigite um valor maior ou igual a zero para o deposito: ");
            valor = sc.nextDouble();
        }
        cont1.depositarSaldo(valor);
        System.out.println(cont1);

        System.out.print("Digite o valor para um saque (taxa de R$5,00): ");
        cont1.sacarSaldo(sc.nextDouble());
        System.out.println(cont1);
    }
}
