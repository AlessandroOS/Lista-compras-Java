package com.company.view;

import com.company.modelo.Item;
import com.company.service.ItemService;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class DeletarView {

    private final Scanner sc;

    public DeletarView(Scanner sc){
        this.sc = sc;
    }

    public void executar(){
        ItemService itemService = new ItemService();
        List<Item> itens = itemService.executarConsulta();

        for (int i = 0; i < itens.size(); i++) {
            System.out.println("ID: " + i + " Nome : " + itens.get(i).getNome());
        }

        System.out.println("Digite o ID do item que deseja deletar");
        String ID = sc.nextLine();

        //Validar campos
        //Criar UPDATE

        UUID uuid = itens.get(Integer.parseInt(ID)).getID();
        itemService.deletar(uuid);
    }
}
