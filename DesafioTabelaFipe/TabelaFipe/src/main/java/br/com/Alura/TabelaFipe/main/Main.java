package br.com.Alura.TabelaFipe.main;

import br.com.Alura.TabelaFipe.service.ConsumoApi;

import java.util.Scanner;

public class Main {

    private Scanner input = new Scanner(System.in);

    private ConsumoApi consumoApi = new ConsumoApi();

    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";

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


        if (opcao.toLowerCase().contains("carr")) {
            endereco = URL_BASE + "carros/marcas";
        } else if(opcao.toLowerCase().contains("mot")) {
            endereco = URL_BASE + "motos/marcas";
        } else {
            endereco = URL_BASE + "caminhoes/marcas";
        }

        var json = consumoApi.obterdados(endereco);
        System.out.println(json);
    }


}
