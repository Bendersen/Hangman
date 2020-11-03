package com.example.hangman;

import com.example.hangman.controller.AbstractController;
import com.example.hangman.controller.ComputerWordController;
import com.example.hangman.controller.HumanGuessController;
import com.example.hangman.data.Database;
import com.example.hangman.data.GameData;
import com.example.hangman.data.MockDatabase;
import com.example.hangman.view.ConsoleView;
import com.example.hangman.view.View;

public class Hangman {

    private final AbstractController p1Controller;
    private final AbstractController p2Controller;

    public Hangman() {
        final GameData gameData = new GameData();
        final Database database = new MockDatabase();
        final View view = new ConsoleView();
        this.p1Controller = new ComputerWordController(gameData, database, view);
        this.p2Controller = new HumanGuessController(gameData, database, view);
    }

    public void start() {
        this.p1Controller.start();
        this.p2Controller.start();
    }

    public static void main(final String[] args) {
        final Hangman hangman = new Hangman();
        hangman.start();
    }

}
