package br.com.Alura;

public class Main {
    static void main(String[] args) {

        Funcionario funcionario_01 = new Funcionario();

        funcionario_01.nome = "Lucas";
        funcionario_01.cargo = "Engenheiro de Software Sênior";
        funcionario_01.salario = 15539;

        Funcionario funcionario_02 = new Funcionario();

        funcionario_02.nome = "Matheus";
        funcionario_02.cargo = "Gerente de Projetos";
        funcionario_02.salario = 10879;

        funcionario_01.exibirInformacoesFuncionario();

        funcionario_02.exibirInformacoesFuncionario();
    }
}
