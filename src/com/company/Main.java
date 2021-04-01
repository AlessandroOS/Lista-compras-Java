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
