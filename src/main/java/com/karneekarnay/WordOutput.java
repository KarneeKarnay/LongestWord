package com.karneekarnay;

public class WordOutput {
    private String word;
    private Integer length;

    WordOutput(String word, Integer length) {
        this.word = word;
        this.length = length;
    }

    public String getWord() {
        return word;
    }

    public Integer getLength() {
        return length;
    }

}