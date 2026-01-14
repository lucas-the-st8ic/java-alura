package br.com.Alura;

public class Ebook extends Midia {

    private String formato;


    public Ebook(String titulo, int anoDePublicacao, String formato) {
        super(titulo, anoDePublicacao);
        this.formato = formato;
    }

    public String getEdicao() {
        return formato;
    }

    public void exibirInformacoes(){
        System.out.println(gerarCodigo() + "Ebook: " +getTitulo()+
                "\nFormato: " +formato+"\nAno de publicação: " + getAnoDePublicacao()+
                "\n============================");
    }
}
