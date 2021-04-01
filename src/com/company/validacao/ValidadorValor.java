package com.company.validacao;

import com.company.dto.ItemDTO;

import java.util.List;

public class ValidadorValor implements Validador {


    private Validador validador;

    @Override
    public List<ErroDeValidacao> validar(ItemDTO item, List<ErroDeValidacao> erroDeValidacaos){
        try {
            Double.parseDouble(item.getValor());
            validador.validar(item, erroDeValidacaos);
        }

        catch(Exception e) {
            e.printStackTrace();
            erroDeValidacaos.add(new ErroDeValidacao("Valor Invalido"));
        }
        return erroDeValidacaos;
    }

    @Override
    public void setNext(Validador validador) {
        this.validador = validador;
    }
}
