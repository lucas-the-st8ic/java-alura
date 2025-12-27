package br.com.Alura;

public class Funcionario {

    public String nome;
    public String cargoNovo;
    public String cargoAtual;
    public double salario;
    public int nivelDeAcessoAtual;
    public int nivelDeAcessoNovo;



    public void exibirInformacoesFuncionario() {
        System.out.printf("Funcionário: %s - Cargo: %s - Salário %.2f\n", nome, cargoAtual, salario);
    }

    public void reajustarSalario (double percentual) {
        salario += salario * (percentual / 100);
        System.out.printf("Novo salario de %s é %.2f \n", nome, salario);
    }

    public void alterarSetorAcesso () {



        System.out.println("\t--Acesso antigo do funcionário--");
        System.out.println("Nome: " + nome+ "\nCargo: " +cargoAtual);
        System.out.println("Nível de Acesso: " +nivelDeAcessoAtual);
        System.out.println("_____________________________________");

        System.out.println("\t---Novo acesso do funcionário---");
        System.out.println("Nome: " + nome+ "\nCargo: " +cargoNovo);
        System.out.println("Nível de Acesso: " +nivelDeAcessoNovo);
        System.out.println("_____________________________________");
    }
}
