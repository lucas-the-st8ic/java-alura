package br.com.Alura.TabelaFipe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties
public record Modelos(List<Dados> modelos) {
}
