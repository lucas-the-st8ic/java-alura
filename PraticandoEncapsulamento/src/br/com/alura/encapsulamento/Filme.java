package br.com.alura.encapsulamento;

import java.util.ArrayList;

public class Filme {
    private String titulo;
    private ArrayList<Integer> avaliacoes;

    public String getTitulo() {
        return titulo;
    }

    public Filme(String titulo) {
        this.titulo = titulo;
        this.avaliacoes = new ArrayList<>();
    }

    public void adicionarAvaliacao(int valor) {
        if (valor >= 1 && valor <= 5) {
            this.avaliacoes.add(valor);
        } else {
            System.out.println("Insira uma nota válida!!");
        }
    }

    public double calcularMedia() {
        int soma = 0;
        for(int nota : avaliacoes) {
            soma += nota;
        }

        return (double) soma / avaliacoes.size();
    }
}
