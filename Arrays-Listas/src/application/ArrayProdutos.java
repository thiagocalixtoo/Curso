package application;

import entities.Products;

import java.util.Scanner;

public class ArrayProdutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de produtos: ");
        int n = sc.nextInt();
        sc.nextLine();

        Products[] vetorProd = new Products[n];

        for (int i = 0; i < vetorProd.length; i++) {
            System.out.print("\nDigite a nome do " + (i+1) + "° produto: ");
            String name = sc.nextLine();
            System.out.print("Digite a preço do " + (i+1) + "° produto: ");
            double preco = sc.nextDouble();
            sc.nextLine();
            vetorProd[i] = new Products(name, preco);
        }

        double mediaPreco = 0;
        for (int i = 0; i < vetorProd.length; i++) {
            mediaPreco += vetorProd[i].getPreco();
        }

        System.out.printf("\nA média de preço dos produtos é de R$%.2f", mediaPreco/n);
    }
}
