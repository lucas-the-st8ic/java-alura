package br.com.exerciciosstreamelambda.exercicio6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exercicio_6 {
    public static void main(String[] args) {

            List<Pessoa> pessoas = Arrays.asList(
                    new Pessoa("Alice", 22),
                    new Pessoa("Bob", 17),
                    new Pessoa("Charlie", 19)
            );

        List<String> listaMaioresDe18 = pessoas.stream()
                .filter(p -> p.getIdade() >= 18)
                .map(Pessoa::getNome)
                .sorted().toList();




        System.out.println(listaMaioresDe18);
    }
}












