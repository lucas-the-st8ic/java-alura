import br.com.Alura.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

/*      Funcionario funcionario_01 = new Funcionario();

        funcionario_01.nome = "Lucas";
        funcionario_01.cargoAtual = "Engenheiro de Software Sênior";
        funcionario_01.salario = 15539;

        Funcionario funcionario_02 = new Funcionario();

        funcionario_02.nome = "Matheus";
        funcionario_02.cargoAtual = "Gerente de Projetos";
        funcionario_02.salario = 10879;

        funcionario_01.exibirInformacoesFuncionario();

        funcionario_02.exibirInformacoesFuncionario();

        funcionario_02.reajustarSalario(5);

        funcionario_02.exibirInformacoesFuncionario();*/

        Produto produto01 = new Produto();
        produto01.nomeProduto = "Mouse Gamer";
        produto01.precoProduto = 100.00;
        produto01.quantidadeProduto = 50;

    /*  produto01.exibirProduto();
        System.out.println("Ele disse: \"Olá, Mundo!\"");*/

      /*  Livro livro_cod001 = new Livro();
        livro_cod001.titulo = "O guia do Mochileiro das Galáxias";
        livro_cod001.autor = "Douglas Adams";
        livro_cod001.paginas = 208;*/

        /*livro_cod001.exibirInformacoesLivro();*/

        /*Conta contaNum_478 = new Conta();
        contaNum_478.saldo = 1579.42;

        contaNum_478.exibirOSaldo();

        contaNum_478.zerarOSaldo();

        contaNum_478.exibirOSaldo();*/

        /*SensorTemperatura novaAfericao = new SensorTemperatura();
        novaAfericao.local = "Setor A";
        novaAfericao.temperatura = 37;

        novaAfericao.exibirRelatorio();*/

        /*Aluno aluno_01 = new Aluno();
        aluno_01.nomeDoAluno = "Lucas da Silva Santos";
        aluno_01.nota_1 = 6.5;
        aluno_01.nota_2 = 6.5;

        aluno_01.calcularMedia();*/

        /*Funcionario funcionario_03 = new Funcionario();
        funcionario_03.nome = "Júlia Oliveira";
        funcionario_03.cargoAtual = "Pessoa Desenvolvedora Júnior";
        funcionario_03.nivelDeAcessoAtual = 1;

        funcionario_03.alterarSetorAcesso("Pessoa Desenvolvedora Pleno", 3);*/


      /*  ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();

        Tarefa tarefa_01 = new Tarefa();
        tarefa_01.preencherDados();
        listaDeTarefas.add(tarefa_01);

        Tarefa tarefa_02 = new Tarefa();
        tarefa_02.preencherDados();
        listaDeTarefas.add(tarefa_02);

        for(Tarefa t : listaDeTarefas) {
            System.out.println(t);
        }*/

        /*produto01.venderProduto(25);
        produto01.venderProduto(50);*/

        /*livro_cod001.diasDeAtraso = 3;

        livro_cod001.exibirMultaPorAtraso();*/

        List<Produto> carrinhoDeCompras = new ArrayList<>();


        Produto produto02 = new Produto();
        produto02.nomeProduto = "Teclado";
        produto02.precoProduto = 120.0;
        produto02.quantidadeProduto = 10;

        Produto produto03 = new Produto();
        produto03.nomeProduto = "Monitor";
        produto03.precoProduto = 100.00;
        produto03.quantidadeProduto = 5;

        Produto produto04 = new Produto();
        produto04.nomeProduto = "Webcam";
        produto04.precoProduto = 150.0;
        produto04.quantidadeProduto = 12;

        Produto produto05 = new Produto();
        produto05.nomeProduto = "Mouse";
        produto05.precoProduto = 100.0;
        produto05.quantidadeProduto = 25;

        carrinhoDeCompras.add(produto01);
        carrinhoDeCompras.add(produto02);
        carrinhoDeCompras.add(produto03);
        carrinhoDeCompras.add(produto04);
        carrinhoDeCompras.add(produto05);

        double totalCarrinho = 0;

        for (Produto item : carrinhoDeCompras) {
                totalCarrinho += item.calcularProduto();
        }

        System.out.printf("Total da compra: R$ %.2f\n", totalCarrinho);

    }
}
