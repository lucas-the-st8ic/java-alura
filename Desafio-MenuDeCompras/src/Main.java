import java.util.Collections;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o limite do cartão:");
        double limite = leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int saida = 1;

        while (saida != 0) {

            leitura.nextLine();

            System.out.println("Digite o nome do item: ");
            String descricao = leitura.nextLine();


            System.out.println("\nDigite o valor do item: ");
            double valorDoItem = leitura.nextDouble();


            Compras novaCompra = new Compras(descricao, valorDoItem);
            boolean compraRealizada = cartao.adicionarCompra(novaCompra);

            if (compraRealizada == true) {
                System.out.println("Compra realizada com sucesso!");
                System.out.println("Digite 0 para sair ou 1 para continuar!");
                saida = leitura.nextInt();
            } else {
                System.out.println("Saldo Insuficiente!");
                saida = 0;
            }
        }

        System.out.println("=========================");
        System.out.println("COMPRAS REALIZADAS!!\n");

        Collections.sort(cartao.getCarrinhoDeCompras());
        for (Compras c : cartao.getCarrinhoDeCompras()) {
            System.out.println(c.getDescricaoDoItem() + " - " + c.getValorDoItem());
        }
    }
}
