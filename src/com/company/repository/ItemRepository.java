package com.company.repository;

import com.company.dto.ItemDTO;
import com.company.modelo.Item;
import com.company.service.ItemService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ItemRepository {

    private static List<Item> itens = new ArrayList<>();

    public void gravar(Item item) {
        itens.add(item);
        System.out.println("GRAVANDO: " + item);
    }

    public List<Item> getItem(){
       return itens;
    }

    public void deletar(UUID uuid) {
        System.out.println("DELETANDO: " + uuid);
        itens.removeIf(item1 -> item1.getID().equals(uuid));
    }

    public void atualizar(Item item) {
        System.out.println("ATUALIZANDO: " + item);
        this.deletar(item.getID());
        this.gravar(item);
    }
}
