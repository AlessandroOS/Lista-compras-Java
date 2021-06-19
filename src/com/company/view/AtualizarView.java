package com.company.view;

import com.company.dto.ItemDTO;
import com.company.modelo.Item;
import com.company.repository.ItemRepository;
import com.company.service.ItemService;
import com.company.validacao.ErroDeValidacao;
import com.company.validacao.MotorDeRegras;

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

        MotorDeRegras motorDeRegras = new MotorDeRegras();
        List<ErroDeValidacao> erroDeValidacaoList = motorDeRegras.iniciar(itemDTO);

        if (erroDeValidacaoList.isEmpty()) {
            itemService.atualizar(itemDTO, item);
        } else {
            for (ErroDeValidacao erro : erroDeValidacaoList) {
                System.out.println(erro.getDescricao());
            }
        }

    }
}
