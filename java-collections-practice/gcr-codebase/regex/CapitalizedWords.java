package com.regex;

import java.util.*;
import java.util.regex.*;

public class CapitalizedWords {
    public static List<String> extractCapitalized(String text) {
        List<String> result = new ArrayList<>();
        Pattern p = Pattern.compile("\\b[A-Z][a-z]*\\b");
        Matcher m = p.matcher(text);
        
        while (m.find()) {
            result.add(m.group());
        }
        return result;
    }

    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        System.out.println(extractCapitalized(text));
        
    }
}