import br.com.alura.encapsulamento.Carro;
import br.com.alura.encapsulamento.Contato;
import br.com.alura.encapsulamento.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {


/*        Carro carro001 = new Carro("Gol", "ABC-1234", 2020);
        carro001.exibirInformacoesVeiculo();

        System.out.println("Modelo do veiculo: " +carro001.getModelo());*/

        ArrayList<Contato> listaDeContatos = new ArrayList<>();

        listaDeContatos.add(new Contato("João Silva", "(11) 99999-7841" ));
        listaDeContatos.add(new Contato("Luana Santos", "(21) 87456-7846"));
        listaDeContatos.add(new Contato("Pedro Oliveira", "(12) 78954-7800"));

        System.out.println("Lista de Contatos:");

        int indice = 1;
        for(Contato contato : listaDeContatos) {
            System.out.printf("%d. %s - %s\n",
                    indice++, contato.getNome(),
                    contato.getTelefone());
        }


        Produto produto001 = new Produto();
        produto001.setNomeProduto("Mouse bluetooth gamer");
        produto001.setValorProduto(-59.90);

        System.out.printf("Produto: %s \nPreço: %.2f\n", produto001.getNomeProduto(), produto001.getValorProduto());
    }
}
