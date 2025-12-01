package alura.java.main;

import alura.java.classes.*;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        ArrayList<String> listaDeCompras = new ArrayList<String>();

        listaDeCompras.add("Arroz");
        listaDeCompras.add("Feijão");
        listaDeCompras.add("Carne");
        listaDeCompras.add(0,"Frango");

        for(String item: listaDeCompras){
            System.out.println(item);
        }
        System.out.println("======================================================");
        Cachorros novaRaca_01 = new Cachorros();
        Animais novaRaca_001 = (Animais) novaRaca_01;

        Animais animal = new Cachorros();

        if(novaRaca_001 instanceof Cachorros){
            Cachorros novaRaca_002 = (Cachorros)novaRaca_001;
        } else {
            System.out.println("Nova raça não está no sistema");
        }
        System.out.println("===========================================================\n");
        Produtos produto_01 = new Produtos("Televisão Philips 90'pol'", 4999.99);
        Produtos produto_02 = new Produtos("Iphone 17 Pro Max", 10349.99);
        Produtos produto_03 = new Produtos("PlayStation 5 Slim", 3799.99);
        Produtos produto_04 = new Produtos("Monitor Samsung 27\" 144Hz", 1299.90);
        Produtos produto_05 = new Produtos("Samsung Galaxy S24 Ultra", 7999.99);

        ArrayList<Produtos> listaDeProdutosEletronicos = new ArrayList<>();
        listaDeProdutosEletronicos.add(produto_01);
        listaDeProdutosEletronicos.add(0,produto_02);
        listaDeProdutosEletronicos.add(produto_03);
        listaDeProdutosEletronicos.add(produto_04);
        listaDeProdutosEletronicos.add(produto_05);

        double somaTotalDeProdutos = 0, mediaDePreco;

        for (Produtos produto : listaDeProdutosEletronicos) {
            somaTotalDeProdutos += produto.getPreco();
        }
        mediaDePreco = somaTotalDeProdutos / listaDeProdutosEletronicos.size();

        System.out.println("Produtos mais vendidos: \n" +listaDeProdutosEletronicos);
        System.out.println("A média de preço dos produtos é: R$ " + mediaDePreco);


        Circulo circulo_01 = new Circulo();
        circulo_01.setRaio(5);

        Quadrado quadrado_01 = new Quadrado();
        quadrado_01.setLado(4);

        ArrayList<Formas> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(circulo_01);
        listaDeFormas.add(quadrado_01);

        for (Formas forma : listaDeFormas) {
            if(forma instanceof Circulo){
                System.out.println("Área do Círculo: " +forma.calcularArea());
            } else {
                System.out.println("Área do Quadrado: " +forma.calcularArea());

            }
        }

        ContasBancarias conta1 = new ContasBancarias(101, 1500.0);
        ContasBancarias conta2 = new ContasBancarias(102, 2500.0);
        ContasBancarias conta3 = new ContasBancarias(103, 1800.0);

        ArrayList<ContasBancarias> listaContas = new ArrayList<>();
        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);

        ContasBancarias contaMaiorSaldo = listaContas.get(0);
        for (ContasBancarias conta : listaContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());



    }


}
