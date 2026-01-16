package br.com.Alura;

public class ReservaVip extends Reserva {

    public ReservaVip() {
    }

    @Override
    public void reservar() {
        System.out.println("Reserva VIP confirmada com atendimento exclusivo");
    }
}
