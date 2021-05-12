package com.avanade.dio.api.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Produto {
    private int codigo;
    private String descricao;
    private Date validade;
    private String ean;
    private boolean inativo;
}
