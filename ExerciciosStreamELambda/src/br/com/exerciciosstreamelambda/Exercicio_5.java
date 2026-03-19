package br.com.exerciciosstreamelambda;

import java.util.Arrays;
import java.util.List;

public class Exercicio_5 {
    public static void main(String[] args) {

        List<List<Integer>> listaDeNumeros = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );

        List<Integer> primosOrdenados = listaDeNumeros.stream()
                .flatMap(List::stream)
                .filter(n -> {
                    if(n <= 1) return false;
                    if(n == 2) return true;
                    if(n % 2 == 0) return false;
                    for(int i = 3; i <= Math.sqrt(n); i += 2) {
                        if(n % i == 0) return false;
                    }
                    return true;
                })
                .sorted()
                .toList();

        System.out.println(primosOrdenados);
    }
}

