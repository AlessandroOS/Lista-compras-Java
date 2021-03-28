package com.company.validacao;

import com.company.dto.ItemDTO;

import java.util.ArrayList;
import java.util.List;

public class MotorDeRegras {

    public List<Erro> iniciar(ItemDTO item) {
        Validador valor = new ValidadorValor();
        Validador categoria = new ValidadorCategoria();
        Validador prioridade = new ValidadorPrioridade();
        Validador nome = new ValidadorNome();

        valor.setNext(categoria);
        categoria.setNext(prioridade);
        prioridade.setNext(nome);
        return valor.validar(item, new ArrayList<>());
    }
}
