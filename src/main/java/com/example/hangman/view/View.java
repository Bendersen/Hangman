package com.example.hangman.view;

import java.util.List;

public interface View {

    void showHiddenWord(String word, List<String> tries);

    void showTries(List<String> tries);

    String requestNextTry();

    String requestWord();

}
