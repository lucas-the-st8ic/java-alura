import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main(String[] args) {

        Map<Integer,String> cadastroDeClientes = new HashMap<>();
        cadastroDeClientes.put(1,"Lucas");
        cadastroDeClientes.put(2,"Marcos");
        cadastroDeClientes.put(3,"Carla");
        cadastroDeClientes.put(4,"Gabriela");

        System.out.println("O nome do cliente com ID 2 é: " +cadastroDeClientes.get(2));
    }
}
