package com.example.hangman.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockDatabase extends AbstractDatabase {

    List<String> strings = new ArrayList<>(Arrays.asList(
        "camel",
        "eagle",
        "lion",
        "bear",
        "tiger",
        "fox",
        "fish",
        "rhinoceros"
    ));

    @Override
    public List<String> getWords() {
        return new ArrayList<>(this.strings);
    }
}

