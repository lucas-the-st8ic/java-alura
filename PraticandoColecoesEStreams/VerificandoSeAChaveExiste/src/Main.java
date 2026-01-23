import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int id;

        Map<Integer,String> cadastroDeClientes = new HashMap<>();
        cadastroDeClientes.put(1,"Lucas");
        cadastroDeClientes.put(2,"Marcos");
        cadastroDeClientes.put(3,"Carla");
        cadastroDeClientes.put(4,"Gabriela");

        System.out.print("Insira um ID para buscar um cliente: ");
        id = input.nextInt();


        if(cadastroDeClientes.containsKey(id)){
            System.out.println("O nome do cliente com ID " + id + " é: " + cadastroDeClientes.get(id));
        } else {
            System.out.println("Cliente com ID " +id+ " não encontrado.");
        };
    }
}