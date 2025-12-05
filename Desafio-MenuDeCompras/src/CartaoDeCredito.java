import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;

    private List<Compras> carrinhoDeCompras;


    public CartaoDeCredito(double limite) {
        this.limite =limite;
        this.saldo = limite;
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public List<Compras> getCarrinhoDeCompras() {
        return carrinhoDeCompras;
    }

    public boolean adicionarCompra(Compras novoItem){
        if (this.saldo >= novoItem.getValorDoItem()) {
            this.saldo -= novoItem.getValorDoItem();
            this.carrinhoDeCompras.add(novoItem);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }


    public double getSaldo() {
        return saldo;
    }

}
