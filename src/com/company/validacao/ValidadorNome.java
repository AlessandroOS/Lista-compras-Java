package com.company.validacao;

import com.company.dto.ItemDTO;

import java.util.List;

public class ValidadorNome implements Validador {


    private Validador validador;

    @Override
    public List<Erro> validar(ItemDTO item, List<Erro> erros){
        if(item.getNome() == null || item.getNome().length() < 5){
            Erro erroNome = new Erro("Nome deve ter no minimo 5 caracteres");
            erros.add(erroNome);
        } else {
            if(validador != null){
                validador.validar(item, erros);
            }
        }
        return erros;
    }

    @Override
    public void setNext(Validador validador) {
        this.validador = validador;
    }
}
