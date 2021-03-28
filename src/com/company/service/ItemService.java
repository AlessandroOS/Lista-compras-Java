package com.company.service;

import com.company.dto.ItemDTO;
import com.company.modelo.Categoria;
import com.company.modelo.Item;
import com.company.modelo.Prioridade;

public class ItemService {

    public void cadastrar(ItemDTO itemDTO){
        Item item = new Item();


        item.setDescricao(itemDTO.getDescricao());
        item.setValor(Double.parseDouble(itemDTO.getValor()));
        item.setNome(item.getNome());
        item.setCategoria(Categoria.procurarCategoria(itemDTO.getCategoria()));
        item.setPrioridade(Prioridade.procurarPrioridade(itemDTO.getPrioridade()));
    }
}
