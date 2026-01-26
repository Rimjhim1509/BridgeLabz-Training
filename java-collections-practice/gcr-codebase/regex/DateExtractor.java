package com.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class DateExtractor {
    public static List<String> extractDDMMYYYY(String text) {
        List<String> dates = new ArrayList<>();
        String regex = "\\b(?:0[1-9]|[12]\\d|3[01])/(?:0[1-9]|1[0-2])/(?:19\\d{2}|20\\d{2})\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        
        while (m.find()) {
            dates.add(m.group());
        }
        return dates;
    }

    public static void main(String[] args) {
        String text = "Meeting on 05/04/2026 and project due 20/11/2025.";
        System.out.println(extractDDMMYYYY(text));
        
    }
}