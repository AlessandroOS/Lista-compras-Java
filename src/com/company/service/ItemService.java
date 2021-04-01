package com.company.service;

import com.company.dto.ItemDTO;
import com.company.modelo.Categoria;
import com.company.modelo.Item;
import com.company.modelo.Prioridade;
import com.company.repository.ItemRepository;
import com.company.view.DeletarView;

import java.util.List;
import java.util.UUID;

public class ItemService {

    public void cadastrar(ItemDTO itemDTO) {
        Item item = new Item();

        item.setDescricao(itemDTO.getDescricao());
        item.setValor(Double.parseDouble(itemDTO.getValor()));
        item.setNome(itemDTO.getNome());
        item.setCategoria(Categoria.procurarCategoria(itemDTO.getCategoria()));
        item.setPrioridade(Prioridade.procurarPrioridade(itemDTO.getPrioridade()));

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


}
