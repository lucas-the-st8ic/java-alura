import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String cpf;
        boolean valorExato = false;

        System.out.print("Digite o CPF(xxx.xxx.xxx-xx): ");
        cpf = input.nextLine();


        String regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cpf);


        if(cpf.matches(regex)) {
            System.out.println("O CPF " +cpf+ " está no formato válido");
        } else {
            System.out.println("O CPF " +cpf+ " não está no formato válido");
        }

        input.close();
    }
}
