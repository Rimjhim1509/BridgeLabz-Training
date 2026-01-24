package com.icecreamrush;

public class Main {

    public static void main(String[] args) {

        Icecream[] flavors = {
            new Icecream("Vanilla", 120),
            new Icecream("Chocolate", 200),
            new Icecream("Strawberry", 90),
            new Icecream("Mango", 150),
            new Icecream("Butterscotch", 110),
            new Icecream("Pista", 80),
            new Icecream("Coffee", 140),
            new Icecream("Black Currant", 100)
        };

        SortByPopularity sorter =
                new SortByPopularity(flavors);

        System.out.println("Before Sorting :");
        sorter.display();

        sorter.sort();

        System.out.println("\nAfter Sorting :");
        sorter.display();
    }
}
