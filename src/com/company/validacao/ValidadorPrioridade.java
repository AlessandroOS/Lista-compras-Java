package com.company.validacao;

import com.company.dto.ItemDTO;
import com.company.modelo.Prioridade;

import java.util.List;

public class ValidadorPrioridade implements Validador {


    private Validador validador;

    @Override
    public List<Erro> validar(ItemDTO item, List<Erro> erros){
        try {
            Prioridade.valueOf(item.getPrioridade());
            validador.validar(item, erros);
        }
        catch(Exception e) {
            erros.add(new Erro("Prioridade Invalido"));
        }
        return erros;
    }

    @Override
    public void setNext(Validador validador) {
        this.validador = validador;
    }


}


