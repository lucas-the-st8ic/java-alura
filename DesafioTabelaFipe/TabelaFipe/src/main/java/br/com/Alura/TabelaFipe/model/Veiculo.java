package br.com.Alura.TabelaFipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public record Veiculo(

        @JsonAlias("Marca") String marca,
        @JsonAlias("Modelo") String modelo,
        @JsonAlias("Valor") String valor,
        @JsonAlias("AnoModelo") Integer anoModelo,
        @JsonAlias("Combustivel") String tipoCombustivel ) {
}
