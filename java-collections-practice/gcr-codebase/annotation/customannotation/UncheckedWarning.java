package com.annotation.customannotation;

import java.util.ArrayList;

public class UncheckedWarning {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        ArrayList list = new ArrayList(); // raw ArrayList

        list.add("Hello");
        list.add(10);
        list.add(2.5);

        System.out.println(list);
    }
}
