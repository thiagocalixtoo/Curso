package application;

import java.util.Scanner;
import entities.CurrencyConverter;
public class Quotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dollarPrice;
        double dollarBought;

        System.out.print("What is the dollar price: ");
        dollarPrice = sc.nextDouble();

        System.out.print("How many dollar will be bought: ");
        dollarBought = sc.nextDouble();

        CurrencyConverter.convertor(dollarPrice, dollarBought);
    }
}
