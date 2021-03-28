package com.company.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaDeCompras {

    private List<Item> itens = new ArrayList<>();

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
    }


}
