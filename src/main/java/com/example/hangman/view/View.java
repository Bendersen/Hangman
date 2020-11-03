package com.example.hangman.view;

import java.util.List;

public interface View {

    void showHiddenWord(String word);

    void showWon(String playerName);

    void showTries(List<String> tries);

    String requestNextTry(final List<String> tries);

    String requestWord();

}
