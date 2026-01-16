package br.com.Alura;

public class Relatorio implements Imprimir {
    protected String titulo;
    protected String conteudo;

    public Relatorio(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void imprimirRelatorio() {
        System.out.println("Título: " + titulo);
        System.out.println("Conteúdo: " + conteudo);
    }
}
