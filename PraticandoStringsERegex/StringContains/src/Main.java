import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String texto;
        String palavra;

        System.out.print("Digite seu texto: ");
        texto = input.nextLine();

        System.out.print("Digite a palavra a ser buscada: ");
        palavra = input.nextLine();

        if (texto.contains(palavra)) {
            System.out.println("A palavra " +palavra+ " está presente no texto.");
        } else {
            System.out.println("Palavra não encontrada.");
        }
    }
}
