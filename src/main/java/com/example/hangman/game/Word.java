package com.example.hangman.game;

import java.util.List;
import java.util.stream.Collectors;

public class Word {

    public static final String DELIMITER = " ";
    public static final String REPLACEMENT = "_";

    private final String word;

    public Word(final String word) {
        this.word = word;
    }

    public String get() {
        return this.word;
    }

    public String getObfuscated(final List<String> uncoveredCharacters) {
        return this.word.chars().mapToObj(i -> {
            final String letter = Character.toString((char) i);
            if (uncoveredCharacters.contains(letter)) {
                return REPLACEMENT;
            } else {
                return letter;
            }
        }).collect(Collectors.joining(DELIMITER));
    }
}
