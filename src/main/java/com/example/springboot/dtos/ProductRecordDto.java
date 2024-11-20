package com.example.springboot.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

// Record: feature que permite criar classes imutáveis e é usada principalmente
// para transportar dados, reduzindo a quantidade de código boilerplate.
// Record recebe os dados via JSON, valida os campos e, em seguida,
// converte para um ProductModel para salvar no banco de dados.
// Parâmetros necessários: atributos definidos em ProductModel para criar um produto.
// O id não precisa ser passado como parâmetro, pois é gerado automaticamente.
// A validação inicial é feita através das anotações @NotBlank e @NotNull.
public record ProductRecordDto(@NotBlank String name, @NotNull BigDecimal valor) {

}
