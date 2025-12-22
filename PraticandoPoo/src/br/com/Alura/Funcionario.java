package br.com.Alura;

public class Funcionario {

    String nome;
    String cargo;
    double salario;


    public void exibirInformacoesFuncionario() {
        System.out.printf("Funcionário: %s - Cargo: %s - Salário %.2f\n", nome, cargo, salario);
    }
}
