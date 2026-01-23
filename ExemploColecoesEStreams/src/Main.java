import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {
        //          -List, Set, Map-
        /*  List - ordenação, permite duplicidade
        *   Implementações - ArrayList e LinkedList
        *   Operações comuns - add, remove, contains, get, size
        * ==========================================================
        *   Set - Não se preocupa com ordenação, não permite duplicidade
        *   Implementações: HashSet(não se preocupa com ordenação nem duplicidade)
        *   LinkedHashSet(mantem ordenação de inserção), TreeSet(permite ordenação)
        * ============================================================
        *   Map - chave-valor, sem valores duplicados
        *   Implementações: HashMap, LinkedHashMap, TreeMap
        *   Operações comuns - put, get, remove, containsKey, keySet
        *   sobrescreve valores com chaves iguais.
        *   Exemplo: 1, Maria- 2, João - 1, Carlos (Carlos Sobrescreve Maria)
        * ==============================================================
        *   Streams API
        *       -Operações Intermediárias.
        *       -Operações terminais.
        *           Exemplos:   -filter();
        *                       -map();
        *                       -reduce();
        *                       -collect();
        *
        * */


        /*List<String> listaDeFuncionarios = new ArrayList<>();

        listaDeFuncionarios.add("Lucas");
        listaDeFuncionarios.add("Jacqueline");
        listaDeFuncionarios.add("Paulo");
        listaDeFuncionarios.add("Paulo");

        System.out.println(listaDeFuncionarios);


        Set<String> produtos = new HashSet<>();

        produtos.add("Fone Bluetooth");
        produtos.add("Mouse Gamer");
        produtos.add("Five Gears");
        produtos.add("Five Gears");

        System.out.println(produtos);


        Map<Integer, String> listaDeClientes = new HashMap<>();
        listaDeClientes.put(1, "Lucas");
        listaDeClientes.put(2, "Jacqueline");
        listaDeClientes.put(3, "Paulo");
        listaDeClientes.put(4, "Marcos");

        System.out.println(listaDeClientes.get(4));*/


        List<String> funcionarios = List.of("Lucas", "João", "Bruno", "Pedro", "Renan", "Amanda", "Anna");

        List<String> funcionariosLetraA = funcionarios.stream()
                .filter(f -> f.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(funcionarios);
        System.out.println(funcionariosLetraA);

        List<Double> valoresVendas = List.of(500.0, 1850.75, 398.0);

        List<Double> comissao = valoresVendas.stream()
                .map(v -> v * 0.05)
                    .collect(Collectors.toList());

        System.out.println(comissao);


        double totalVendas = valoresVendas.stream()
                .reduce(0.0, Double::sum);

        System.out.println("Total de Vendas: " +totalVendas);
    }

}
