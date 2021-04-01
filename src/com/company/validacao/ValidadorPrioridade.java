package com.company.validacao;

import com.company.dto.ItemDTO;
import com.company.modelo.Prioridade;

import java.util.List;

public class ValidadorPrioridade implements Validador {


    private Validador validador;

    @Override
    public List<ErroDeValidacao> validar(ItemDTO item, List<ErroDeValidacao> erroDeValidacaos){
        try {
            Prioridade.valueOf(item.getPrioridade());
            validador.validar(item, erroDeValidacaos);
        }
        catch(Exception e) {
            erroDeValidacaos.add(new ErroDeValidacao("Prioridade Invalido"));
        }
        return erroDeValidacaos;
    }

    @Override
    public void setNext(Validador validador) {
        this.validador = validador;
    }


}


