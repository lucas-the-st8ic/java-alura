package alura.formatosdedataehora;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class MostraFusoHorarios {
    static void main(String[] args) {


        ZonedDateTime horaAtual = ZonedDateTime.now();

        ZonedDateTime horarioToquio = horaAtual.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

        ZonedDateTime horarioNovaYork = horaAtual.withZoneSameInstant(ZoneId.of("America/New_York"));


        DateTimeFormatter formatacaoHora = DateTimeFormatter.ofPattern("HH:mm:ss");


        System.out.println("Horário Atual em Tóquio: " +horarioToquio.format(formatacaoHora));
        System.out.println("Horário atual em Nova York: " +horarioNovaYork.format(formatacaoHora));
    }
}
