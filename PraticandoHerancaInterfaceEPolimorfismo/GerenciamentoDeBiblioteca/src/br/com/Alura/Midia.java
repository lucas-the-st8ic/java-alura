package br.com.Alura;

public class Midia {

    private String titulo;
    private int anoDePublicacao;
    private String codigo;

    public String getTitulo() {
        return titulo;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public Midia(String titulo, int anoDePublicacao) {
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String gerarCodigo() {
        String codigoParte2 = titulo.substring(0, 3).replaceAll(" ", "").toUpperCase();
        codigo = "MDA-" + codigoParte2 + anoDePublicacao;
        return "Código da Mídia: " + codigo + "\n";


    }
}
