package com.company.validacao;

import com.company.dto.ItemDTO;

import java.util.List;

public class ValidadorNome implements Validador {


    private Validador validador;

    @Override
    public List<ErroDeValidacao> validar(ItemDTO item, List<ErroDeValidacao> erroDeValidacaos){
        if(item.getNome() == null || item.getNome().length() < 5){
            ErroDeValidacao erroDeValidacaoNome = new ErroDeValidacao("Nome deve ter no minimo 5 caracteres");
            erroDeValidacaos.add(erroDeValidacaoNome);
        } else {
            if(validador != null){
                validador.validar(item, erroDeValidacaos);
            }
        }
        return erroDeValidacaos;
    }

    @Override
    public void setNext(Validador validador) {
        this.validador = validador;
    }
}
