import br.com.alura.encapsulamento.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

/*      Carro carro001 = new Carro("Gol", "ABC-1234", 2020);
        carro001.exibirInformacoesVeiculo();

        System.out.println("Modelo do veiculo: " +carro001.getModelo());*/

        /*ArrayList<Contato> listaDeContatos = new ArrayList<>();

        listaDeContatos.add(new Contato("João Silva", "(11) 99999-7841" ));
        listaDeContatos.add(new Contato("Luana Santos", "(21) 87456-7846"));
        listaDeContatos.add(new Contato("Pedro Oliveira", "(12) 78954-7800"));

        System.out.println("Lista de Contatos:");

        int indice = 1;
        for(Contato contato : listaDeContatos) {
            System.out.printf("%d. %s - %s\n",
                indice++, contato.getNome(),
                contato.getTelefone());
        }*/


        /*Produto produto001 = new Produto();
        produto001.setNomeProduto("Mouse bluetooth gamer");
        produto001.setValorProduto(-59.90);

        System.out.printf("Produto: %s \nPreço: %.2f\n", produto001.getNomeProduto(), produto001.getValorProduto());*/

       /* Usuario newUser = new Usuario("lucas.ss", "246810");

        newUser.setSenha("246812", "abc123");

        newUser.setSenha("246810", "abc123");*/

       /* Bateria bateriaNova = new Bateria();

        bateriaNova.setNivelBateria(20);
        System.out.println("Status: " + bateriaNova.exibeNivelBateria());*/

        /*Conta novaConta = new Conta("Ana");
        novaConta.depositar(1000);
        novaConta.sacar(1300);
        novaConta.sacar(200);
        novaConta.exibirSaldo();

        novaConta.sacar(800);
        novaConta.exibirSaldo();*/

    /*    Filme matrix = new Filme("Matrix");
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(4);
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(3);
        matrix.adicionarAvaliacao(4);
        matrix.adicionarAvaliacao(7);
        matrix.adicionarAvaliacao(2);

        System.out.printf("Média de avaliações para %s: %.2f\n", matrix.getTitulo(), matrix.calcularMedia());*/

    /*    LoginAluno aluno = new LoginAluno("Aluno@2025", "Escola@123456");

        int tentativas = 3;


        while(tentativas > 0) {
            System.out.print("Digite seu login: \n");
            String usuario = input.nextLine();

            System.out.print("Digite sua senha: \n");
            String senha = input.nextLine();

            if (aluno.validarSenha(usuario, senha)) {
                System.out.println("Senha correta!!");
                System.out.println("Seja bem vindo!!");
                break;
            } else {
                tentativas--;

                if (tentativas == 0) {
                    System.out.println("Acesso Bloqueado. Contate o administrador");
                } else {
                    System.out.println("Credenciais inválidas. Tentativas restantes " +tentativas);
                }
            }
        }*/

       /* Aluno fernanda = new Aluno("Fernanda");
        fernanda.ganharPontos(99);
        fernanda.exibirStatus();
        fernanda.ganharPontos(1);
        fernanda.ganharPontos(99);
        fernanda.exibirStatus();*/

        MediaPorMateria matematica = new MediaPorMateria("Matematica");
        matematica.adicionarNota(7.5);
        matematica.adicionarNota(1000);
        matematica.adicionarNota(8);
        matematica.adicionarNota(-3);
        matematica.adicionarNota(9.5);

        System.out.println("Total de notas válidas: " +matematica.getNotasValidas());
        System.out.printf("Média em %s: %.2f", matematica.getNomeMateria(), matematica.mediaNotas());
    }
}
