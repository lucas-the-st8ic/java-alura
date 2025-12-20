package alura.formatosdedataehora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LembreteDePagamento {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LocalDate dataDeVencimento;
        LocalDate dataDoLembrete;
        int periodoDeAntecedencia;
        String stringData;

        DateTimeFormatter formatacaoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Insira a data de vencimento da conta (dd/MM/yyyy): ");
        stringData = input.nextLine();

        dataDeVencimento = LocalDate.parse(stringData, formatacaoData);

        System.out.println("Insira o prazo de antecedência em dias para o lembrete:");
        periodoDeAntecedencia = input.nextInt();

        dataDoLembrete = dataDeVencimento.minusDays(periodoDeAntecedencia);

        System.out.println("Data de vencimento da conta: " +dataDeVencimento.format(formatacaoData));
        System.out.println("Data do lembrete com " +periodoDeAntecedencia+ " dias de antecedência: " +dataDoLembrete.format(formatacaoData));

        input.close();


    }

}
