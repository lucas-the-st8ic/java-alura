package alura.java.classes;

public class ContasBancarias {
    private int numeroConta;
    private double saldo;

    public ContasBancarias(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
