package com.karneekarnay;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.karneekarnay.LongestShortestWord.getLongestWord;
import static com.karneekarnay.LongestShortestWord.getShortestWord;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class LongestShortestWordTests {

    @Test(expected = IllegalArgumentException.class)
    public void invalidInputBlankLongestWord() {
        String input = "";
        WordOutput lwo = getLongestWord(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidInputEmptyLongestWord() {
        String input = "   ";
        WordOutput lwo = getLongestWord(input);
    }

    @Test(expected = NullPointerException.class)
    public void invalidInputNullLongestWord() {
        String input = null;
        WordOutput swo = getLongestWord(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidInputBlankShortestWord() {
        String input = "";
        WordOutput swo = getLongestWord(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidInputEmptyShortestWord() {
        String input = "   ";
        WordOutput swo = getLongestWord(input);
    }

    @Test(expected = NullPointerException.class)
    public void invalidInputNullShortestWord() {
        String input = null;
        WordOutput swo = getLongestWord(input);
    }


    @Test
    public void validOutputLongestWord() {
        String input = "The cow jumped over the moon.";
        WordOutput result = getLongestWord(input);

        assertThat(MessageFormat.format("When given the string: {0}\n" +
                        "The function should have returned: 'jumped' with a length of '6'\n" +
                        "Instead it returned {1} with a length of {2}", input, result.getWord(),
                result.getLength()), containsString("jumped"));

        assertThat(MessageFormat.format("When given the string: {0}\n" +
                        "The function should have returned: 'jumped' with a length of '6'\n" +
                        "Instead it returned {1} with a length of {2}", input, result.getWord(),
                result.getLength()), result.getLength() == 6);
    }

    @Test
    public void validOutputShortestWord() {
        String input = "The cow jumped over the moon.";
        WordOutput result = getShortestWord(input);

        assertThat(MessageFormat.format("When given the string: {0}\n" +
                        "The function should have returned: 'the' with a length of '3'\n" +
                        "Instead it returned {1} with a length of {2}", input, result.getWord(),
                result.getLength()), containsString("the"));

        assertThat(MessageFormat.format("When given the string: {0}\n" +
                        "The function should have returned: 'the' with a length of '3'\n" +
                        "Instead it returned {1} with a length of {2}", input, result.getWord(),
                result.getLength()), result.getLength() == 3);
    }

    @Test
    public void validOutputRandomSentLongestWord() {

        List<String> sentenceBuilder = new ArrayList<>();
        String longwrd = "";
        for (int i = 0; i < 15; i++) {
            String word = getAlphaNumericString(new Random().nextInt(5 + 1) + 1);
            if (word.length() > longwrd.length()) {
                longwrd = word;
            }
            sentenceBuilder.add(longwrd);
        }
        String input = StringUtils.join(sentenceBuilder, " ");
        WordOutput result = getLongestWord(input.toString());

        assertThat(MessageFormat.format("When given the string: {0}\n" +
                        "The function should have returned: {1} with a length of {2}\n" +
                        "Instead it returned {3} with a length of {4}", input, longwrd,
                longwrd.length(), result.getWord(), result.getLength()), containsString(longwrd));

        assertThat(MessageFormat.format("When given the string: {0}\n" +
                        "The function should have returned: {1} with a length of {2}\n" +
                        "Instead it returned {3} with a length of {4}", input, longwrd,
                longwrd.length(), result.getWord(), result.getLength()), result.getLength() == longwrd.length());
    }

    @Test
    public void validOutputRandomSentShortestWord() {

        List<String> sentenceBuilder = new ArrayList<>();
        String shortwrd = getAlphaNumericString(new Random().nextInt(5 + 1) + 1);
        sentenceBuilder.add(shortwrd);
        for (int i = 0; i < 15; i++) {
            String word = getAlphaNumericString(new Random().nextInt(5 + 1) + 1);
            if (word.length() < shortwrd.length()) {
                shortwrd = word;
            }
            sentenceBuilder.add(word);
        }
        String input = StringUtils.join(sentenceBuilder, " ");
        WordOutput result = getShortestWord(input);

        assertThat(MessageFormat.format("When given the string: {0}\n" +
                        "The function should have returned: {1} with a length of {2}\n" +
                        "Instead it returned {3} with a length of {4}", input, shortwrd,
                shortwrd.length(), result.getWord(), result.getLength()), containsString(shortwrd));

        assertThat(MessageFormat.format("When given the string: {0}\n" +
                        "The function should have returned: {1} with a length of {2}\n" +
                        "Instead it returned {3} with a length of {4}", input, shortwrd,
                shortwrd.length(), result.getWord(), result.getLength()), result.getLength() == shortwrd.length());
    }

    private String getAlphaNumericString(int n) {

        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            int index = new Random().nextInt(AlphaNumericString.length());

            sb.append(AlphaNumericString.charAt(index));
        }

        return sb.toString();
    }
}
