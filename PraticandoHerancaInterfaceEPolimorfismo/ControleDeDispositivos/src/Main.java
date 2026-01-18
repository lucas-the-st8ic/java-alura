import br.com.Alura.ArCondicionado;
import br.com.Alura.Luz;

public class Main {
    static void main(String[] args) {
        ArCondicionado arQuarto = new ArCondicionado();
        Luz luzQuarto = new Luz();


        arQuarto.ligar();
        arQuarto.ligar();
        arQuarto.desligar();
        arQuarto.desligar();
        arQuarto.ligar();

        luzQuarto.ligar();
        luzQuarto.ligar();
        luzQuarto.desligar();
        luzQuarto.desligar();
        luzQuarto.ligar();
        luzQuarto.ligar();
    }
}
