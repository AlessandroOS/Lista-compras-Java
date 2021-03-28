package com.company.view;

import com.company.dto.ItemDTO;
import com.company.validacao.Erro;
import com.company.validacao.MotorDeRegras;

import java.util.List;
import java.util.Scanner;

public class CadastroView {

    public void executar() {

        try(Scanner sc = new Scanner(System.in)){
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
            List<Erro> iniciar = motorDeRegras.iniciar(itemDTO);
            for (Erro erro : iniciar) {
                System.out.println(erro.getDescricao());
            }

        }
    }
}
