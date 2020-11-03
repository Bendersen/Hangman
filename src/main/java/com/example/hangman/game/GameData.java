package com.example.hangman.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.ListUtils;

public class GameData {

    public final static String[] VALID_CHARACTERS = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    public static final int MAX_TRIES = 11;

    private Word word;
    private List<String> moves;

    public GameData() {
        this.word = null;
        this.moves = new ArrayList<>();
    }

    public String getWord() {
        return this.word.get();
    }

    public String getObfuscatedWord() {
        final List<String> allCharacters = Arrays.asList(VALID_CHARACTERS);
        final List<String> uncoveredCharacters = ListUtils.subtract(allCharacters, this.moves);
        return this.word.getObfuscated(uncoveredCharacters);
    }

    public void setWord(final String word) {
        this.word = new Word(word);
    }

    public List<String> getMoves() {
        return this.moves;
    }

    public void setMoves(final List<String> moves) {
        this.moves = moves;
    }
}
