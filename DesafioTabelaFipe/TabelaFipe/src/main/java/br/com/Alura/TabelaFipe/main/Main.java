package br.com.Alura.TabelaFipe.main;

import java.util.Scanner;

public class Main {

    private Scanner input = new Scanner(System.in);

    private final String URL_BASE = "https://parallelum.com.br/api/v2";

    public void exibeMenu () {
        var menu = """
                ====OPÇÕES====
                -Carro
                -Moto
                -Caminhão
                
                
                Digite uma das opções para consultar: 
                """;
        System.out.println(menu);
        var opcao = input.nextLine();
        String endereco;


        if (opcao.toUpperCase().contains("Carr")) {
            endereco = URL_BASE + "carros/marcas";
        } else if(opcao.toUpperCase().contains("Mot")) {
            endereco = URL_BASE + "motos/marcas";
        } else {
            endereco = URL_BASE + "caminhoes/marcas";
        }


    }
}
