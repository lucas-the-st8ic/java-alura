import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Joana");
        lista.add("Lucas");
        lista.add("Pedro");
        lista.add("Antônio");

        System.out.println("Lista inicial: " + lista);

        lista.remove("Pedro");

        System.out.println("Lista após remoção: " + lista);

    }
}
