package br.com.Alura;

public class Produto {
    public String nomeProduto;
    public double precoProduto;
    public int quantidadeProduto;

    public void exibirProduto() {
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.printf("Preço do produto: R$ %.2f\n", precoProduto);
        System.out.println("Quantidade do produto: " + quantidadeProduto);
    }

    public void venderProduto(int quantidade) {
        if(quantidadeProduto < quantidade) {
            System.out.println("Estoque Insuficiente para realizar a venda!!");
        } else {
            quantidadeProduto -= quantidade;
            System.out.println("Venda Realizada!!");
            System.out.println("Produto: " +nomeProduto);
            System.out.println("Quantidade restante em estoque: " +quantidadeProduto);
        }
    }
}
