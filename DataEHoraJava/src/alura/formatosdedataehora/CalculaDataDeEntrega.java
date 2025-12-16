package alura.formatosdedataehora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculaDataDeEntrega {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        DateTimeFormatter formatacaoData =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatacaoHora =  DateTimeFormatter.ofPattern("HH:mm");

        LocalDate dataDeInicio;
        int prazoEmDias;
        LocalDate dataDeEntrega;
        String dataOuHora;


        System.out.print("Digite a data de inicio do Projeto (dd/MM/yyyy):");
        dataOuHora = entrada.nextLine();

        dataDeInicio = LocalDate.parse(dataOuHora, formatacaoData);



        System.out.print("Insira o prazo em dias: ");
        prazoEmDias = entrada.nextInt();

        dataDeEntrega = dataDeInicio.plusDays(prazoEmDias);

        System.out.println("Com data de inicio em: " +dataDeInicio.format(formatacaoData));
        System.out.println("E com prazo de " +prazoEmDias+ " dias, a entrega será feita na data de " +dataDeEntrega.format(formatacaoData));


        entrada.close();
    }
}
