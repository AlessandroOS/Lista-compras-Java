package com.company.view;

import com.company.dto.ItemDTO;
import com.company.modelo.Item;
import com.company.repository.ItemRepository;
import com.company.service.ItemService;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class AtualizarView {

    private final Scanner sc;

    public AtualizarView(Scanner sc) {
        this.sc = sc;
    }

    public void executar() {

        ItemService itemService = new ItemService();
        List<Item> itens = itemService.executarConsulta();

        for (int i = 0; i < itens.size(); i++) {
            System.out.println("ID: " + i + " Nome : " + itens.get(i).getNome());
        }

        System.out.println("Digite o ID do item que deseja atualizar");
        String indice = sc.nextLine();

        ItemDTO itemDTO = new LerDadosCadastro(sc).ler();
        Item item = itens.get(Integer.parseInt(indice));

        itemService.atualizar(itemDTO, item);
    }
}
