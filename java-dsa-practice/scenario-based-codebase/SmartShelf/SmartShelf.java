package com.SmartShelf;

class SmartShelf {

    
    public static void insertionSort(String[] books) {
        int n = books.length;

        for (int i = 1; i < n; i++) {
            String key = books[i];   // new book
            int j = i - 1;

           
            while (j >= 0 && books[j].compareToIgnoreCase(key) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            
            books[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        String[] books = {
            "Algorithms",
            "Data Structures",
            "Operating Systems",
            "Computer Networks"
        };

        insertionSort(books);

        System.out.println("Sorted Book List:");
        for (String book : books) {
            System.out.println(book);
        }
    }
}
