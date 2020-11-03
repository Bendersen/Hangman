package com.example.hangman.data;

import java.util.List;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class TestMockDatabase {

    @Test
    void testGetRandomWord() {
        final MockDatabase mockDatabase = new MockDatabase();

        final List<String> words = mockDatabase.getWords();

        assertThat(words.size() == 8);
    }

}
