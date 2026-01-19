package com.BrowserBuddy;
public class Main {
    public static void main(String[] args) {

        // Browser start with homepage
        BrowserBuddy browser = new BrowserBuddy("google.com");

        browser.showCurrentPage();
        System.out.println("---------------");

        // Visit pages
        browser.visit("youtube.com");
        browser.visit("github.com");
        browser.showCurrentPage();
        System.out.println("---------------");

        // Back & Forward
        browser.back();
        browser.forward();
        System.out.println("---------------");

        // Open new tab
        browser.openNewTab();
        browser.visit("stackoverflow.com");
        browser.showCurrentPage();
        System.out.println("---------------");

        // Switch tab
        browser.switchTab();
        browser.showCurrentPage();
        System.out.println("---------------");

        // Close tab
        browser.closeTab();
        browser.showCurrentPage();
    }
}
