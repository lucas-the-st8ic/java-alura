import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static void main(String[] args) {

        /*1 - Dada a lista de números
         inteiros a seguir, encontre o maior número dela.*/
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);

        Optional<Integer> maiorNumero = numeros.stream()
                .max(Integer::compare);

        maiorNumero.ifPresent(System.out::println);
        //===================================================================
        /*2 -Dada a lista de palavras (strings)
         abaixo, agrupe-as pelo seu tamanho.
         No código a seguir, há um exemplo prático do resultado esperado.*/
        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");

        Map<Integer, List<String>> agrupamento = palavras.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(agrupamento);
        //====================================================================
        /*3 - Dada a lista de nomes abaixo,
         concatene-os separados por vírgula.
         No código a seguir, há um exemplo prático do resultado esperado.*/
        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");

        String listaNomes = nomes.stream()
                .collect(Collectors.joining(", "));

        System.out.println(listaNomes);
        //=========================================================================
        /*4 - Dada a lista de números inteiros abaixo,
         calcule a soma dos quadrados dos números pares.*/

        List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4, 5, 6);

        int raiz = numeros2.stream()
                .filter(e -> e % 2 == 0)
                .mapToInt(e -> e * e)
                .sum();

        System.out.println(raiz);

    }
}
