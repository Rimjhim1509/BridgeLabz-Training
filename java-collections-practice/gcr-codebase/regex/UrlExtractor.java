package com.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class UrlExtractor {
    
    public static List<String> extractUrls(String text) {
        List<String> urls = new ArrayList<>();
        
        // Good practical pattern
        String regex = "https?://[^\\s/$.?#].[^\s]*";
        
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        
        while (m.find()) {
            urls.add(m.group());
        }
        
        return urls;
    }

    public static void main(String[] args) {
        String text = "Check out https://www.google.com/search?q=java+regex "
                   + "and https://openai.com/chat for examples.";
        
        List<String> links = extractUrls(text);
        System.out.println("Found " + links.size() + " links:");
        for (String url : links) {
            System.out.println(url);
        }
    }
}