package com.company;

import com.company.view.ConsoleView;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        ConsoleView consoleView = new ConsoleView();

        consoleView.iniciar();

        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();

    }
}

//FAZER FUNÇÃO ATUALIZAR PASSAR PELAS VALIADAÇÕES
//FAZER A CLASSE EMAIL
//Enviar e-mail quando cadastrar com o nome do item
//https://www.jetbrains.com/help/idea/convert-a-regular-project-into-a-maven-project.html
