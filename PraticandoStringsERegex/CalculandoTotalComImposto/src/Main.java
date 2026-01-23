import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Double> carrinhoDeCompras = List.of(29.99,49.50,15.75,99.99);

        double subtotal;
        double total;

        subtotal = carrinhoDeCompras.stream()
                .reduce(0.0, Double::sum);

        total = subtotal + (subtotal * ((double) 8 / 100));

        System.out.printf("Valor total antes dos impostos: R$%.2f", subtotal);
        System.out.printf("\nValor total com imposto de 8%%: R$%.2f", total);
    }
}
