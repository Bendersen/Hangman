package com.example.hangman.view;

import com.example.hangman.controller.AbstractController;

public class ConsoleView extends AbstractView {

    public ConsoleView(final AbstractController controller) {
        super(controller);
        System.out.println("Start Hangman");


    }
}
