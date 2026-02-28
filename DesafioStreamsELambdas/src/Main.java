import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);

        Optional<Integer> maiorNumero = numeros.stream()
                .max(Integer::compare);

        maiorNumero.ifPresent(System.out::println);

        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");

        Map<Integer, List<String>> agrupamento = palavras.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(agrupamento);
    }
}
