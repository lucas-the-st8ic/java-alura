import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        PesquisaCep pesquisaCep = new PesquisaCep();

        System.out.println("Insira um CEP para busca:");
        var cep = input.nextLine();




        try {
            Endereco enderecoPesquisa = pesquisaCep.pesquisaEndereco(cep);
            System.out.println(enderecoPesquisa);
        } catch (RuntimeException e) {
            System.out.println("Erro ao pesquisar: " + e.getMessage());
            System.out.println("Busca Encerrada");
        }

    }
}
