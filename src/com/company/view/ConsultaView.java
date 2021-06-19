package com.company.view;

import com.company.modelo.Item;
import com.company.service.ItemService;

import java.util.List;
import java.util.Scanner;

public class ConsultaView {

    private final Scanner sc;
    private ItemService itemService = new ItemService();

    public ConsultaView (Scanner sc){ this.sc = sc; }

    public void Consulta(){

        List<Item> itemServiceList = itemService.executarConsulta();

        for (Item item: itemServiceList) {
            System.out.println(item.toString());

        }

    }

    public void filtrar() {
        // A view tem a função de pegar o nome que o usr quer filtrar
        // E passa pra frente

        System.out.println("Por qual nome deseja procurar");
        String nomeASerFiltrado = sc.nextLine();

        List<Item> itemServiceList = itemService.filtarPorNome(nomeASerFiltrado);

        for (Item item: itemServiceList) {
            System.out.println(item.toString());
        }

    }
}
