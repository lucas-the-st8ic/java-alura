package alura.formatosdedataehora;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataEHoraFormatados {

    LocalDate dataRelatorio;
    LocalTime horarioRelatorio;

    DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter timeformat = DateTimeFormatter.ofPattern("HH:mm");

    public LocalTime getHorarioRelatorio() {
        return horarioRelatorio;
    }

    public LocalDate getDataRelatorio() {
        return dataRelatorio;
    }

    public DataEHoraFormatados(String relatorio) {

        this.dataRelatorio = LocalDate.now();
        this.horarioRelatorio = LocalTime.now();

        System.out.println("Relatório liberado: " + relatorio);
        System.out.println("Data: " + dataRelatorio.format(dateformat));
        System.out.println("Hora: " + horarioRelatorio.format(timeformat));

    }

}
