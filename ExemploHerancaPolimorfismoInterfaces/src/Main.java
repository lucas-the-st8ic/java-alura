import br.com.alura.Desenvolvedor;
import br.com.alura.Gerente;

void main(String[] args) {
    Gerente gerente = new Gerente("Lucas",150000);

    gerente.exibirInformacoes();
    gerente.reajustarSalario(2);
    gerente.exibirInformacoes();

    Desenvolvedor dev = new Desenvolvedor("Lucas", 1500000, "Java/Back-end");
    dev.exibirInformacoes();
}
