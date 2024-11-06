package com.example.springboot.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

// Record recebe os dados via JSON, valida os campos e, em seguida,
// converte para um ProductModel para salvar no banco de dados.
// O id não precisa ser passado como argumento, pois é gerado automaticamente
// A validação inicial é feita através das anotações @NotBlank e @NotNull
public record ProductRecordDto(@NotBlank String name, @NotNull BigDecimal valor) {

}
