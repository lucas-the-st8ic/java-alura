package alura.formatosdedataehora;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main(String[] args) {
        LocalDate dataDeCompra = LocalDate.now();
        LocalDate dataPrimeiraParcela = LocalDate.of(2025, 5, 10);
        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);

        if(dataPrimeiraParcela.isEqual(LocalDate.now()) && dataSegundaParcela.isEqual(LocalDate.now())) {
            System.out.println("Hoje é o dia do vencimento.");
        } else {
            System.out.println("Parcela no prazo.");
        }

        System.out.println("Data de compra: " + dataDeCompra);
        System.out.println("Data da primeira parcela: " + dataPrimeiraParcela);
        System.out.println("Data da segunda parcela: " + dataSegundaParcela);

        DateTimeFormatter formatacao =  DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data de compra: " + dataDeCompra.format(formatacao));


        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
        System.out.println("Data de compra: " + dataConclusaoCompra);
        ZonedDateTime dataCompraNY = dataConclusaoCompra.withZoneSameInstant(
                ZoneId.of("America/New_York")
        );

        System.out.println("Data de compra Nova York: " + dataCompraNY);


        LocalTime inicio = LocalTime.of(9, 30);
        LocalTime fim = LocalTime.of(19, 30);

        Duration duracao = Duration.between(inicio, fim);

        System.out.println("Duração: " + duracao.toHours() + " horas e " +duracao.toMinutesPart()+ " minutos.");

        LocalDate dataPagamento = LocalDate.parse("2025-10-30");
        Period periodo = Period.between(dataDeCompra, dataPagamento);
        System.out.println("Diferença em dias: " + periodo.getDays());
    }

}
