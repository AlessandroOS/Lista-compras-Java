package com.company.view;

import java.util.Scanner;

public class Menu {

    public void iniciarMenu() {
        try (Scanner sc = new Scanner(System.in)) {

            do {
                System.out.println("0 Sair");
                System.out.println("1 Cadastrar");
                System.out.println("2 Consultar");
                System.out.println("3 Deletar");
                String opcao = "";
                opcao = sc.nextLine();

                switch (opcao) {

                    case "0":
                        return;

                    case "1":
                        CadastroView cadastroView = new CadastroView(sc);
                        cadastroView.executar();
                        break;

                    case "2":
                        ConsultaView consultaView = new ConsultaView();
                        consultaView.Consulta();
                        break;

                    case "3":
                        DeletarView deletarView = new DeletarView(sc);
                        deletarView.executar();
                        break;
                }
            } while (true);
        }
    }
}


