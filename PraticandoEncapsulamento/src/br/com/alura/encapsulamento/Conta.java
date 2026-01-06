package br.com.alura.encapsulamento;

public class Conta {
    private String titularConta;
    private double saldoConta;


    public String getTitularConta() {
        return titularConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }


    public Conta(String titularConta) {
        this.titularConta = titularConta;
        this.saldoConta = 0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldoConta +=  valor;
        } else if (valor < 0) {
            System.out.println("Não é possível depositar valores negativos!! Operação encerrada");
        }
    }

    public void sacar(double valor) {
        if(valor <= this.saldoConta){
            this.saldoConta -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual de " +titularConta+ " : R$" + saldoConta);
    }
}
