package br.com.Alura;

public class Reserva {

    public Reserva() {
    }

    public void reservar() {
        System.out.println("Reserva realizada com sucesso!");
    }

    public void reservar(String data) {
        System.out.println("Reserva realizada para o dia " + data);
    }

    public void reservar(String data, int quantidadeDePessoas) {
        System.out.println("Reserva realizada para o dia " + data +
                " para " + quantidadeDePessoas + " pessoas.");
    }
}
