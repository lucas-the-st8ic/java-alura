import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {
        List<Integer> numeros = List.of(2, 3, 5, 7, 11);

        List<Integer> valoresAoQuadrado = numeros.stream()
                .map(v -> v * v)
                .collect(Collectors.toList());


        System.out.println("Quadrado dos números: " +valoresAoQuadrado);

    }
}
