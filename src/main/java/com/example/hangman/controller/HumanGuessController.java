package com.example.hangman.controller;

import com.example.hangman.data.Database;
import com.example.hangman.game.GameData;
import com.example.hangman.game.GameRules;
import com.example.hangman.view.View;

public class HumanGuessController extends AbstractController {

    public HumanGuessController(final GameData gameData, final Database database, final View view) {
        super(gameData, database, view);
    }

    @Override
    public void start() {
        final GameRules gameRules = new GameRules();

        while (!(gameRules.hasLoose(this.getGameData()) || gameRules.hasWon(this.getGameData()))) {
            this.getView().showTries(this.getGameData().getMoves());
            final String aTry = this.getView().requestNextTry(this.getGameData().getMoves());
            this.getGameData().getMoves().add(aTry);

            this.getView().showHiddenWord(this.getGameData().getObfuscatedWord());
        }

        if (gameRules.hasWon(this.getGameData())) {
            this.getView().showWon("P2");
        } else {
            this.getView().showWon("P1");
        }
    }
}
