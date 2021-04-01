package com.company.validacao;

import com.company.dto.ItemDTO;

import java.util.List;

public interface Validador {
    List<ErroDeValidacao> validar(ItemDTO item, List<ErroDeValidacao> erroDeValidacaos);

    void setNext(Validador validador);
}
