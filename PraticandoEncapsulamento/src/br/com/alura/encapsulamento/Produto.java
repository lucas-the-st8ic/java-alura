package br.com.alura.encapsulamento;

public class Produto {
    private String nomeProduto;
    private  double valorProduto = 0;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valor) {
        if (valor >= 0) {
            this.valorProduto = valor;
        } else {
            System.out.println("Preço Inválido");
        }
    }
}
