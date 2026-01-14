package br.com.Alura;

public class Revista extends Midia {

    private int edicao;


    public Revista(String titulo, int anoDePublicacao, int edicao) {
        super(titulo, anoDePublicacao);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void exibirInformacoes(){
        System.out.println(gerarCodigo() + "Revista: " +getTitulo()+
                "\nEdição: " +edicao+"\nAno de publicação: " + getAnoDePublicacao()+
                "\n============================");
    }
}
