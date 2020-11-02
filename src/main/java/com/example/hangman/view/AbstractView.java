package com.example.hangman.view;

import com.example.hangman.controller.AbstractController;

public class AbstractView {

    AbstractController controller;

    public AbstractView(final AbstractController controller) {
        this.controller = controller;
    }
}
