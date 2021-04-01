package com.company.validacao;

import com.company.dto.ItemDTO;
import com.company.modelo.Categoria;

import java.util.List;

public class ValidadorCategoria implements Validador {


    private Validador validador;

    @Override
    public List<ErroDeValidacao> validar(ItemDTO item, List<ErroDeValidacao> erroDeValidacaos){
        try {
            Categoria.valueOf(item.getCategoria().toUpperCase());
            validador.validar(item, erroDeValidacaos);
        }
        catch(Exception e) {
            erroDeValidacaos.add(new ErroDeValidacao("Categoria Invalida"));
        }
        return erroDeValidacaos;
    }

    @Override
    public void setNext(Validador validador) {
        this.validador = validador;
    }
}
