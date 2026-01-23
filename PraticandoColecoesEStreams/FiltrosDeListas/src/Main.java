import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {

        List<String> funcionarios = List.of("Anna", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline", "Bartolomeu", "Ricardo");

        List<String> funcionariosComNomesCurtos =  funcionarios.stream()
                .filter(f -> f.length() <= 5)
                .collect(Collectors.toList());

        List<String> funcionariosComNomesLongos =  funcionarios.stream()
                .filter(f -> f.length() >= 7)
                .collect(Collectors.toList());


        System.out.println("Funcionários com nomes curtos: " +funcionariosComNomesCurtos);
        System.out.println("Funcionários com nomes longos: " +funcionariosComNomesLongos);


    }
}
