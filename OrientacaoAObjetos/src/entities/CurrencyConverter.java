package entities;

public class CurrencyConverter {
    private final static double tax = 0.06;  //constante estatica é ligada à classe e não a um objeto

    public static void convertor(double dollarPrice, double dollarBought){
        System.out.printf("Amount to be paid in reais: R$%.2f", dollarPrice*dollarBought*(1+tax));
    }
}

//nao é necessario eu criar um objeto, apenas passar os valores que o usuario digitou como parametro e realizar
//o calculo aqui nessa classe, o exercicio foi mais pra treinar o 'final static', criar um metodo static e usar na main