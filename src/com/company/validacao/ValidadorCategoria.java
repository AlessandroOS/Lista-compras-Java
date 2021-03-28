package com.company.validacao;

import com.company.dto.ItemDTO;
import com.company.modelo.Categoria;

import java.util.List;

public class ValidadorCategoria implements Validador {


    private Validador validador;

    @Override
    public List<Erro> validar(ItemDTO item, List<Erro> erros){
        try {
            Categoria.valueOf(item.getCategoria().toUpperCase());
            validador.validar(item, erros);
        }
        catch(Exception e) {
            erros.add(new Erro("Categoria Invalida"));
        }
        return erros;
    }

    @Override
    public void setNext(Validador validador) {
        this.validador = validador;
    }
}
