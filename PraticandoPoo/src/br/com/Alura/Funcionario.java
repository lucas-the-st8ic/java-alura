package br.com.Alura;

public class Funcionario {

    public String nome;
    public double salario;
    public String cargoAtual;
    public int nivelDeAcessoAtual;



    public void exibirInformacoesFuncionario() {
        System.out.printf("Funcionário: %s - Cargo: %s - Salário %.2f\n", nome, cargoAtual, salario);
    }

    public void reajustarSalario (double percentual) {
        salario += salario * (percentual / 100);
        System.out.printf("Novo salario de %s é %.2f \n", nome, salario);
    }

    public void alterarSetorAcesso (String cargoNovo, int nivelDeAcessoNovo ) {



        System.out.println("\t--Acesso antigo do funcionário--");
        System.out.println("Nome: " + nome+ "\nCargo: " +cargoAtual);
        System.out.println("Nível de Acesso: " +nivelDeAcessoAtual);
        System.out.println("_____________________________________");

        cargoAtual = cargoNovo;
        nivelDeAcessoAtual = nivelDeAcessoNovo;


        System.out.println("\t---Novo acesso do funcionário---");
        System.out.println("Nome: " + nome+ "\nCargo: " +cargoAtual);
        System.out.println("Nível de Acesso: " +nivelDeAcessoAtual);
        System.out.println("_____________________________________");
    }
}
