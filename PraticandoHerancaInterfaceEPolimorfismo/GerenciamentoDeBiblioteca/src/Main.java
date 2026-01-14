import br.com.Alura.Ebook;
import br.com.Alura.Livro;
import br.com.Alura.Midia;
import br.com.Alura.Revista;

public class Main {
    static void main(String[] args) {

        Livro livro01 = new Livro("O Guia do Mochileiro das Galáxias", 1979, "Douglas Adams");
        Revista revista01 = new Revista("National Geographic", 2023, 245);
        Ebook ebook01 = new Ebook("Clean Code", 2008, "PDF");

        livro01.exibirInformacoes();
        revista01.exibirInformacoes();
        ebook01.exibirInformacoes();



    }
}
