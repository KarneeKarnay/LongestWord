package com.karneekarnay;


import org.apache.commons.lang3.Validate;

import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LongestShortestWord {

    private static final Logger LOGGER = Logger.getLogger(LongestShortestWord.class.getName());

    public static void main(String[] args) {

        String input = "The cow jumped over the moon.";
        WordOutput result = getLongestWord(input);
        String output = MessageFormat.format("The string provided was...{0}\n" +
                        "The longest word is...{1}\n" +
                        "Its length is...{2}",
                input, result.getWord(), result.getLength());
        LOGGER.log(Level.INFO, output);

        result = getShortestWord(input);
        output = MessageFormat.format("The string provided was...{0}\n" +
                        "The shortest word is...{1}\n" +
                        "Its length is...{2}",
                input, result.getWord(), result.getLength());
        LOGGER.log(Level.INFO, output);
    }

    public static WordOutput getLongestWord(String input) {

        Validate.notNull(input);
        Validate.notEmpty(input);
        Validate.notBlank(input);

        String[] sentence = input.split(" ");
        String longwrd = " ";
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i].length() > longwrd.length()) {
                longwrd = sentence[i];
            }
        }
        return new WordOutput(longwrd, longwrd.length());
    }

    public static WordOutput getShortestWord(String input){
        Validate.notNull(input);
        Validate.notEmpty(input);
        Validate.notBlank(input);

        String[] sentence = input.split(" ");
        String shortwrd = sentence[0];
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i].length() > 0 && sentence[i].length() < shortwrd.length()) {
                shortwrd = sentence[i];
            }
        }
        return new WordOutput(shortwrd, shortwrd.length());
    }
}

