import br.com.Alura.Reserva;
import br.com.Alura.ReservaVip;

public class Main {
    static void main(String[] args) {
        Reserva reserva = new Reserva();

        reserva.reservar();
        reserva.reservar("17/01");
        reserva.reservar("17/01", 2);

        Reserva vip = new ReservaVip();
        vip.reservar();
    }
}
