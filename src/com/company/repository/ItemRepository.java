package com.company.repository;

import com.company.modelo.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ItemRepository {

    private static List<Item> itens = new ArrayList<>();


    public static void gravar(Item item) {
        itens.add(item);
        System.out.println(item.getNome());
    }

    public static List<Item> getItem(){
       return itens;
    }

    public void deletar(UUID uuid) {
        itens.removeIf(item1 -> item1.getID().equals(uuid));
    }
}
