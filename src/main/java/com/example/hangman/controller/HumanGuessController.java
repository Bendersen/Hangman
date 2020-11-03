package com.example.hangman.controller;

import com.example.hangman.data.Database;
import com.example.hangman.data.GameData;
import com.example.hangman.view.View;

public class HumanGuessController extends AbstractController {

    public HumanGuessController(final GameData gameData, final Database database, final View view) {
        super(gameData, database, view);
    }

    @Override
    public void start() {

    }
}
