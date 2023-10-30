package entities;

public class ContaBancaria {
    private final int numeroContaBanco;
    private String nomeTitularConta;
    private double saldo;

    public ContaBancaria(String nome, int numeroConta) {
        numeroContaBanco = numeroConta;
        nomeTitularConta = nome;
    }

    public ContaBancaria(String nome, int numeroConta, double depositoInicial) {
        numeroContaBanco = numeroConta;
        nomeTitularConta = nome;
        depositarSaldo(depositoInicial);
    }

    public int getNumeroContaBanco() {
        return numeroContaBanco;
    }

    public String getNomeTitularConta() {
        return nomeTitularConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositarSaldo(double valor) {
        saldo += valor;
    }

    public void sacarSaldo(double valor) {
        saldo -= valor + 5.0;
    }


    public String toString() {
        return String.format("\nNome do titular: %s\nNumero da conta: %d\nSaldo: R$%.2f\n"
                , getNomeTitularConta(), getNumeroContaBanco(), getSaldo()
        );
    }
}
