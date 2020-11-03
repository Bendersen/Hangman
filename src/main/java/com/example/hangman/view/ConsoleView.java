package com.example.hangman.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.example.hangman.game.GameData;

public class ConsoleView extends AbstractView {

    public final static String[] VALID_CHARACTERS = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public ConsoleView() {
        System.out.println("Start Hangman");
    }

    @Override
    public void showHiddenWord(final String word) {
        System.out.println("Word: " + word);
    }

    @Override
    public void showWon(final String playerName) {
        System.out.println("Player " + playerName + " won!!!");
    }

    @Override
    public void showTries(final List<String> tries) {
        final String triesInLine = StringUtils.join(tries, ", ");
        System.out.println(tries.size() + " Tries: " + triesInLine);
    }

    @Override
    public String requestNextTry(final List<String> tries) {

        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String letter = StringUtils.EMPTY;
        do {
            System.out.print("Next letter: ");
            try {
                String line = reader.readLine();
                if (StringUtils.isNotBlank(line)) {
                    line = line.toLowerCase();
                    if (StringUtils.containsOnly(line, StringUtils.join(GameData.VALID_CHARACTERS))) {
                        letter = StringUtils.substring(line, 0, 1);
                    }
                }
            } catch (final IOException e) {
                e.printStackTrace();
            }
            if (tries.contains(letter) || StringUtils.isBlank(letter)) {
                System.out.println("Please Try again.");
                letter = StringUtils.EMPTY;
            }
        } while (StringUtils.isBlank(letter));

        return letter;
    }

    @Override
    public String requestWord() {
        return null;
    }
}
