package com.regex;

import java.util.Arrays;
import java.util.regex.Pattern;

public class BadWordCensor {
    
    public static String censor(String text, String[] badWords) {
        return Arrays.stream(badWords)
                .map(Pattern::quote)                    // escape special chars
                .map(w -> "(?i)\\b" + w + "\\b")       // case-insensitive whole word
                .reduce(text, (s, regex) -> s.replaceAll(regex, "****"));
    }

    public static void main(String[] args) {
        String text = "Damn this stupid code is fucking awesome!";
        String[] bad = {"damn", "stupid", "fuck"};
        
        System.out.println(censor(text, bad));
        // → **** this **** code is ****ing awesome!
    }
}