package com.company.view;

import java.util.Scanner;

public class Menu {

    public void iniciarMenu() {
        try (Scanner sc = new Scanner(System.in)) {

                System.out.println("1 Cadastrar");
                String opcao = sc.nextLine();

                switch (opcao) {
                    case "1":
                        CadastroView cadastroView = new CadastroView();
                        cadastroView.executar();
                        break;
                }

        }
    }
}
