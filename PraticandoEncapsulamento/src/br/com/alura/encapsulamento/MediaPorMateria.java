package br.com.alura.encapsulamento;
import java.util.ArrayList;

public class MediaPorMateria {
    private String nomeMateria;
    private int notasValidas = 0;
    private ArrayList<Double> notas;

    public String getNomeMateria() {
        return nomeMateria;
    }

    public int getNotasValidas() {
        return notasValidas;
    }

    public MediaPorMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(double nota){
        if(nota >= 1 && nota <= 10) {
            notas.add(nota);
            notasValidas++;
        } else {
            System.out.println("Nota invalida ignorada: " + nota);
        }
    }

    public double mediaNotas() {
        if(notas.isEmpty()) return 0;

        double soma = 0;

        for(double nota : notas) {
            soma += nota;
        }
        return (double) soma / notas.size();
    }
}
