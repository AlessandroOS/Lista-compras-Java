package com.company.repository;

import com.company.modelo.Categoria;
import com.company.modelo.Item;
import com.company.modelo.Prioridade;

import java.util.ArrayList;
import java.util.List;

public class ItemRepository {

    private static List<Item> itens = new ArrayList<>();

    public void iniciar() {
        Item item = new Item();
        item.setNome("ps4");
        item.setDescricao("lalal");
        item.setCategoria(Categoria.ELETRONICOS);
        item.setValor(5555);
        item.setPrioridade(Prioridade.ALTA);
        itens.add(item);
    }

    public void gravar(Item item) {
        itens.add(item);
    }

    public List<Item> getItem(){
       return itens;
    }


}
