package br.com.Alura;

public class Conta {
    public double saldo;

    public void exibirOSaldo() {
        System.out.printf("Saldo atual: R$%.2f%n\n", saldo);
    }

    public void zerarOSaldo () {
        saldo -= saldo;

    }
}
