package com.example.hangman.controller;

import com.example.hangman.data.AbstractDatabase;

public class AbstractController {

    private final AbstractDatabase abstractDatabase;

    public AbstractController(final AbstractDatabase abstractDatabase) {
        this.abstractDatabase = abstractDatabase;
    }
}
