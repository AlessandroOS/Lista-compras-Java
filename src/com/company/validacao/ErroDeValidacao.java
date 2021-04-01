package com.company.validacao;

public class ErroDeValidacao {
    private String descricao;

    public ErroDeValidacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
