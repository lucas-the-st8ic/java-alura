public class Compras implements Comparable<Compras> {

    private String descricaoDoItem;
    private double valorDoItem;

    public Compras(String descricaoDoItem, double valorDoItem) {
        this.descricaoDoItem = descricaoDoItem;
        this.valorDoItem = valorDoItem;
    }

    public String getDescricaoDoItem() {
        return descricaoDoItem;
    }

    public double getValorDoItem() {
        return valorDoItem;
    }

    public void setDescricaoDoItem(String descricaoDoItem) {
        this.descricaoDoItem = descricaoDoItem;
    }

    public void setValorDoItem(double valorDoItem) {
        this.valorDoItem = valorDoItem;
    }

    @Override
    public String toString() {
        return "Novo Item adicionado! \n" +
                "Item adicionado ao Carrinho: " + descricaoDoItem + '\n' +
                "Valor do Item: R$" + valorDoItem +
                "\n";
    }

    @Override
    public int compareTo(Compras outraCompra) {
        return Double.valueOf(this.valorDoItem).compareTo(outraCompra.valorDoItem);
    }
}
