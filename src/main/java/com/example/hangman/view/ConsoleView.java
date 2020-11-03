package com.example.hangman.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.collections4.ListUtils;
import org.apache.commons.lang3.StringUtils;

public class ConsoleView extends AbstractView {

    public final static String[] VALID_CHARACTERS = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public ConsoleView() {
        System.out.println("Start Hangman");
    }

    @Override
    public void showHiddenWord(final String word, final List<String> tries) {
        final List<String> allCharacters = Arrays.asList(VALID_CHARACTERS);

        final List<String> uncoveredCharacters = ListUtils.subtract(allCharacters, tries);

        final String secret = word.chars().mapToObj(i -> {
            final String letter = Character.toString((char) i);
            if (uncoveredCharacters.contains(letter)) {
                return "_";
            } else {
                return letter;
            }
        }).collect(Collectors.joining(" "));

        System.out.println("Word: " + secret);
    }

    @Override
    public void showTries(final List<String> tries) {
        final String triesInLine = StringUtils.join(tries, ", ");
        System.out.println("Tries: " + triesInLine);
    }

    @Override
    public String requestNextTry() {
        return null;
    }

    @Override
    public String requestWord() {
        return null;
    }
}
