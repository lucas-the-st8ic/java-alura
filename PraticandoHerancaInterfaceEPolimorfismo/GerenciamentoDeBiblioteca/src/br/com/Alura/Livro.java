package br.com.Alura;

public class Livro extends Midia {

    private String autor;


    public Livro(String titulo, int anoDePublicacao, String autor) {
        super(titulo, anoDePublicacao);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void exibirInformacoes(){
        System.out.println(gerarCodigo() + "Livro: " +getTitulo()+
        "\nAutor: " +getAutor()+"\nAno de publicação: " +getAnoDePublicacao()+
                "\n============================");
    }
}
