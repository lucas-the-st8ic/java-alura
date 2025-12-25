package br.com.Alura;

public class Aluno {
    public String nomeDoAluno;
    public double nota_1;
    public double nota_2;
    public double mediaDoAluno;

    public void calcularMedia() {
        System.out.println("Nome do Aluno: " + nomeDoAluno);
        System.out.printf("Primeira nota: %.1f%n", nota_1);
        System.out.printf("Segunda nota: %.1f%n\n", nota_2);
        mediaDoAluno = (nota_1 + nota_2) / 2;
        System.out.printf("Media do Aluno: %.1f%n", mediaDoAluno);

        if(mediaDoAluno >= 6.5) {
            System.out.println("Situação: Aprovado!");
        } else {
            System.out.println("Situação: Reprovado!");
        }
    }
}
