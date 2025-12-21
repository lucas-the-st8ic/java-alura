package alura.formatosdedataehora;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class HorarioDoSistemaEFusoHorario {
    static void main(String[] args) {


        ZonedDateTime horarioSistema = ZonedDateTime.now();

        ZonedDateTime horarioSydney = horarioSistema.withZoneSameInstant(ZoneId.of("Australia/Sydney"));


        DateTimeFormatter formatacaoHora = DateTimeFormatter.ofPattern("hh:mm");


        System.out.println("Horário Atual no sistema: " +horarioSistema.format(formatacaoHora));
        System.out.println("Horário atual em Sydney: " +horarioSydney.format(formatacaoHora));
    }
}
