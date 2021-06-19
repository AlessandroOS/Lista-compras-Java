package com.company.repository;

import com.company.modelo.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ItemRepository {

    private static List<Item> itens = new ArrayList<>();

    public List<Item> getItem() {
        return itens;
    }

    public void gravar(Item item) {
        itens.add(item);
        System.out.println("GRAVANDO: " + item);
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

    public List<Item> filtarPorNome(String nome) {
        List<Item> itemList = getItem();
        List<Item> itemListName = new ArrayList<>();

        for (Item item : itemList) {

            System.out.println(item.getNome());

            if (nome.equals(item.getNome()))
            {
                itemListName.add(item);
            }
            else
            {
                System.out.println("Nome não encontrado");
            }
        }
        return itemListName;
    }

}
