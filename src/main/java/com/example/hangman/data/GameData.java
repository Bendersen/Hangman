package com.example.hangman.data;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class GameData {

    public static final int MAX_TRIES = 11;

    private String word;
    private List<String> moves;

    public GameData() {
        this.word = StringUtils.EMPTY;
        this.moves = new ArrayList<>();
    }

    public String getWord() {
        return this.word;
    }

    public void setWord(final String word) {
        this.word = word;
    }

    public List<String> getMoves() {
        return this.moves;
    }

    public void setMoves(final List<String> moves) {
        this.moves = moves;
    }
}
