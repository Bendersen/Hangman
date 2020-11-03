package com.example.hangman.controller;

import java.util.List;
import java.util.Random;

import com.example.hangman.data.Database;
import com.example.hangman.data.GameData;
import com.example.hangman.view.View;

public class ComputerWordController extends AbstractController {

    public ComputerWordController(final GameData gameData, final Database database, final View view) {
        super(gameData, database, view);
    }

    public String getRandomWord() {
        final List<String> words = this.getDatabase().getWords();
        final Random random = new Random();
        final int i = random.nextInt(words.size());
        return words.get(i);
    }

    @Override
    public void start() {
        final String randomWord = this.getRandomWord();
        this.getGameData().setWord(randomWord);
        this.getView().showHiddenWord(this.getGameData().getWord(), this.getGameData().getMoves());
    }
}
