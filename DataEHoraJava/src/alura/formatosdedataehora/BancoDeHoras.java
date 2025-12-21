package alura.formatosdedataehora;

import java.text.Format;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BancoDeHoras {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LocalTime horarioDeEntrada;
        LocalTime horarioDeSaidaPrevisto;
        LocalTime horarioDeSaidaReal;
        int cargaHoraria;

        DateTimeFormatter formatacaoHorario = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Digite o horário de entrada (HH:mm): ");
        horarioDeEntrada = LocalTime.parse(input.next(), formatacaoHorario);

        System.out.println("Insira a carga horária diária: ");
        cargaHoraria = input.nextInt();

        System.out.println("Digite o horário de saída real (HH:mm): ");
        horarioDeSaidaReal = LocalTime.parse(input.next(), formatacaoHorario);

        horarioDeSaidaPrevisto = horarioDeEntrada.plusHours(cargaHoraria);

        System.out.println("Horário de entrada: " +horarioDeEntrada);
        System.out.println("Horário de saída previsto: " +horarioDeSaidaPrevisto);
        System.out.println("Horário de saída real: " +horarioDeSaidaReal);

        Duration




    }
}
