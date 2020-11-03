package com.example.hangman.controller;

import com.example.hangman.data.Database;
import com.example.hangman.game.GameData;
import com.example.hangman.view.View;

public abstract class AbstractController implements Controller {

    private final Database database;
    private final View view;
    private final GameData gameData;

    public AbstractController(final GameData gameData, final Database database, final View view) {
        this.gameData = gameData;
        this.database = database;
        this.view = view;
    }

    public Database getDatabase() {
        return this.database;
    }

    public View getView() {
        return this.view;
    }

    public GameData getGameData() {
        return this.gameData;
    }
}
