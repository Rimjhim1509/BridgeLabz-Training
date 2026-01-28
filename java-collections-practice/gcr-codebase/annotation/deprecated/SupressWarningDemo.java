package com.annotation.deprecated;

import java.util.ArrayList;

public class SupressWarningDemo {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        // Raw ArrayList (NO generics)
        ArrayList list = new ArrayList();

        list.add("Hello");
        list.add(10);
        list.add(3.14);

        // Type casting required
        String text = (String) list.get(0);
        System.out.println(text);
    }
}
