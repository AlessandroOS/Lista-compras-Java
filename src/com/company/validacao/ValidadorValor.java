package com.company.validacao;

import com.company.dto.ItemDTO;

import java.util.List;

public class ValidadorValor implements Validador {


    private Validador validador;

    @Override
    public List<Erro> validar(ItemDTO item, List<Erro> erros){
        try {
            Double.parseDouble(item.getValor());
            validador.validar(item, erros);
        }

        catch(Exception e) {
            e.printStackTrace();
            erros.add(new Erro("Valor Invalido"));
        }
        return erros;
    }

    @Override
    public void setNext(Validador validador) {
        this.validador = validador;
    }
}
