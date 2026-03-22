package br.com.Alura.TabelaFipe.main;

import br.com.Alura.TabelaFipe.model.Dados;
import br.com.Alura.TabelaFipe.model.Modelos;
import br.com.Alura.TabelaFipe.service.ConsumoApi;
import br.com.Alura.TabelaFipe.service.ConverteDados;

import java.util.Comparator;
import java.util.Scanner;

public class Main {

    private Scanner input = new Scanner(System.in);
    private ConsumoApi consumoApi = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();
    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";

    public void exibeMenu () {
        var menu = """
                ====OPÇÕES====
                -Carro
                -Moto
                -Caminhão
                
                
                Digite uma das opções para consultar: """;
        System.out.print(menu);
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

        var marcas = conversor.obterLista(json, Dados.class);

        marcas.stream()
                .sorted(Comparator.comparing(Dados::codigo))
                .forEach(System.out::println);


        System.out.print("Informe o código da marca" +
                "para realizar a consulta: ");
        var codigoMarca = input.nextLine();

        endereco = endereco+ "/" +codigoMarca+ "/modelos";

        json = consumoApi.obterdados(endereco);

        var modeloLista = conversor.obterDados(json, Modelos.class);

        System.out.println("\nModelos dessa marca: ");

        modeloLista.modelos()
                .stream()
                .sorted(Comparator.comparing(Dados::codigo))
                .forEach(System.out::println);

    }
}
