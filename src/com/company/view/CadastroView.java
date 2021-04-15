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
            ItemDTO itemDTO = new LerDadosCadastro(sc).ler();
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
