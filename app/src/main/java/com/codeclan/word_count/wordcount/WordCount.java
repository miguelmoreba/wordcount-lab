package com.codeclan.word_count.wordcount;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by miguelmorenobaladron on 3/19/18.
 */

public class WordCount {
    ArrayList<String> inputText;

    public WordCount(){
        this.inputText = new ArrayList<>();
    }

    public int getWordCount(String input){
        String text[] = input.split(" ");
        return text.length;
    }
}
