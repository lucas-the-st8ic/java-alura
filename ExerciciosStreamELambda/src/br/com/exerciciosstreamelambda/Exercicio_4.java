package br.com.exerciciosstreamelambda;

import java.util.Arrays;
import java.util.List;

public class Exercicio_4 {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");

        List<String> listaPalavrasUnicas = palavras.stream()
                .distinct()
                .toList();

        System.out.println(listaPalavrasUnicas);
    }
}

