package com.company.view;

import com.company.modelo.Item;
import com.company.service.ItemService;

import java.util.List;

public class ConsultaView {

    public void Consulta(){

        ItemService itemService = new ItemService();
        List<Item> itemServiceList = itemService.executarConsulta();

        for (Item item: itemServiceList) {
            System.out.println(item.toString());

        }

    }

}
