package com.company.view;

import com.company.dto.ItemDTO;

import java.util.Scanner;

public class LerDadosCadastro {

    private Scanner sc;

    public LerDadosCadastro(Scanner scanner){
        this.sc = scanner;
    }

    public ItemDTO ler(){
        System.out.println("Digite a descrição");
        String descricao = sc.nextLine();
        System.out.println("Digite o valor");
        String valor = sc.nextLine();
        System.out.println("Digite o nome do item");
        String nome = sc.nextLine();
        System.out.println("Digite a categoria");
        String categoria = sc.nextLine();
        System.out.println("Digite a prioridade");
        String prioridade = sc.nextLine();

        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setDescricao(descricao);
        itemDTO.setValor(valor);
        itemDTO.setNome(nome);
        itemDTO.setCategoria(categoria);
        itemDTO.setPrioridade(prioridade);

        return itemDTO;
    }

}
