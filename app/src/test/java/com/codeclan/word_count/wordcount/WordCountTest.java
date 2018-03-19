package com.codeclan.word_count.wordcount;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by miguelmorenobaladron on 3/19/18.
 */

public class WordCountTest {

    WordCount wordCount;

    @Before
    public void before() {
        wordCount = new WordCount();
    }

    @Test
    public void getNumberOfWords() {
        String input = "Hello world";
        assertEquals(2, wordCount.getWordCount(input));
    }
}
