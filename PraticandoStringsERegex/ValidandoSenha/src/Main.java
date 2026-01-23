import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String senha;
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        System.out.print("Digite a senha: ");
        senha = input.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(senha);

        if (matcher.matches()) {
            System.out.println("Formato de senha valido!");
        } else {
            System.out.println("Formato de senha invalido!");
        }
    }
}
