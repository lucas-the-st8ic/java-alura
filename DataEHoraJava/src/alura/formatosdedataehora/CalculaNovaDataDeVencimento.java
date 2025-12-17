package alura.formatosdedataehora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculaNovaDataDeVencimento {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LocalDate dataDeVencimento;
        LocalDate novaDataDeVencimento;
        int quantidadeDeMeses;
        String stringData = " ";

        DateTimeFormatter formatacaoData =  DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Insira a data de vencimento (dd/MM/yyyy): ");
        stringData = input.nextLine();

        dataDeVencimento = LocalDate.parse(stringData, formatacaoData);


        System.out.println("Quantos meses você quer aprazar a data de vencimento? ");
        quantidadeDeMeses = input.nextInt();

        novaDataDeVencimento = dataDeVencimento.plusMonths(quantidadeDeMeses);

        System.out.println("Nova data de vencimento: " + novaDataDeVencimento.format(formatacaoData));



    }
}
