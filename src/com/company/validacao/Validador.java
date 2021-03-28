package com.company.validacao;

import com.company.dto.ItemDTO;

import java.util.List;

public interface Validador {
    List<Erro> validar(ItemDTO item, List<Erro> erros);

    void setNext(Validador validador);
}
