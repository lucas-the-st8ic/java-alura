package br.com.Alura;

public class Livro {
    public String titulo;
    public String autor;
    public int paginas;
    String categoria;

    public void exibirInformacoesLivro() {
        System.out.println("\"" +titulo+ "\" de " +autor+ " com " +paginas+ " páginas.");
    }

    
}
