package com.example.hangman;

import com.example.hangman.controller.AbstractController;
import com.example.hangman.controller.ConsoleController;
import com.example.hangman.data.AbstractDatabase;
import com.example.hangman.data.MockDatabase;
import com.example.hangman.view.AbstractView;
import com.example.hangman.view.ConsoleView;

public class Hangman {

    public Hangman() {
        final AbstractDatabase database = new MockDatabase();
        final AbstractController controller = new ConsoleController(database);
        final AbstractView view = new ConsoleView(controller);

    }

    public static void main(final String[] args) {
        final Hangman hangman = new Hangman();
    }

}
