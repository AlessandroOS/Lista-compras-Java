package com.company.service;

import com.company.dto.ItemDTO;
import com.company.modelo.Item;
import com.company.repository.ItemRepository;

import java.util.List;
import java.util.UUID;

public class ItemService {

    public void cadastrar(ItemDTO itemDTO) {
        Item item = new Item(itemDTO);
        ItemRepository itemRepository = new ItemRepository();
        itemRepository.gravar(item);
    }

    public List<Item> executarConsulta() {

        ItemRepository itemRepository = new ItemRepository();
        List<Item> item = itemRepository.getItem();
        return item;
    }

    public void deletar(UUID uuid) {
        ItemRepository itemRepository = new ItemRepository();
        itemRepository.deletar(uuid);
    }

    // itemDTO é o atualizado, e o item é o antigo, precisa transferir do atualizado para antigo
    public void atualizar(ItemDTO itemDTO, Item item) {
        Item itemNovo = new Item(itemDTO, item.getID());
        ItemRepository itemRepository = new ItemRepository();
        itemRepository.atualizar(itemNovo);
    }

    public List<Item> filtarPorNome (String nome) {
        ItemRepository itemRepository = new ItemRepository();
        List<Item> ItemPegadoDoBanco = itemRepository.filtarPorNome(nome);
        return ItemPegadoDoBanco;
    }
}
