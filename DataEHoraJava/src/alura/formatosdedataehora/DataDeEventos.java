package alura.formatosdedataehora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DataDeEventos {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LocalDate dataAtual = LocalDate.now();
        LocalDate dataDoEvento;
        String stringData;

        DateTimeFormatter formatacaoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Insira a data do Evento (dd/MM/yyyy):");
        stringData = input.nextLine();

        dataDoEvento = LocalDate.parse(stringData, formatacaoData);

        System.out.println("Data do evento: " + dataDoEvento.format(formatacaoData));
        System.out.println("Data de hoje: " + dataAtual.format(formatacaoData));


        if(dataDoEvento.isBefore(dataAtual)) {
        System.out.println("O evento já ocorreu!!");
        } else {
            System.out.println("Evento ainda não aconteceu!!");
        }

        input.close();
    }
}
