package com.example.hangman.game;

import org.apache.commons.lang3.StringUtils;

public class GameRules {

    public boolean hasWon(final GameData gameData) {
        final String word = gameData.getWord();
        final String moves = StringUtils.join(gameData.getMoves());
        return StringUtils.containsOnly(word, moves);
    }

    public boolean hasLoose(final GameData gameData) {
        return gameData.getMoves().size() >= GameData.MAX_TRIES;
    }

}
