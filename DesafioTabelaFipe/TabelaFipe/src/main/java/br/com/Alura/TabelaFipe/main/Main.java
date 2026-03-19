package br.com.Alura.TabelaFipe.main;

import java.util.Scanner;

public class Main {

    private Scanner input = new Scanner(System.in);

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

        if (opcao.toUpperCase().contains("Carr")) {}
    }
}
