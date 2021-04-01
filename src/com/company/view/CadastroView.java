package com.company.view;

import com.company.dto.ItemDTO;
import com.company.service.ItemService;
import com.company.validacao.ErroDeValidacao;
import com.company.validacao.MotorDeRegras;

import java.util.List;
import java.util.Scanner;

public class CadastroView {

    private final Scanner sc;

    public CadastroView(Scanner sc){
        this.sc = sc;
    }

    public void executar() {

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

            MotorDeRegras motorDeRegras = new MotorDeRegras();
            List<ErroDeValidacao> erroDeValidacaoList = motorDeRegras.iniciar(itemDTO);

            if (erroDeValidacaoList.isEmpty()) {
                ItemService itemService = new ItemService();
                itemService.cadastrar(itemDTO);
            } else {
                for (ErroDeValidacao erro : erroDeValidacaoList) {
                    System.out.println(erro.getDescricao());
                }
            }
    }
}
