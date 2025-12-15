package alura.formatosdedataehora;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CriaTarefa{
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    String descricaoDaTarefa;
    LocalDate dataDeCriacao;
    LocalTime horaDeCriacao;


    public CriaTarefa(String descricaoDaTarefa){
        this.descricaoDaTarefa = descricaoDaTarefa;
        dataDeCriacao = LocalDate.now();
        horaDeCriacao = LocalTime.now();
        System.out.println("Tarefa criada com sucesso!!");
        System.out.println("Tarefa: " + descricaoDaTarefa);
        System.out.println("Data de criação: " + dataDeCriacao.format(formatter));
        System.out.println("Horário de criação: " + horaDeCriacao);

    }

    public String getDescricaoDaTarefa() {
        return descricaoDaTarefa;
    }

    public void setDescricaoDaTarefa(String descricaoDaTarefa) {
        this.descricaoDaTarefa = descricaoDaTarefa;
    }
}
