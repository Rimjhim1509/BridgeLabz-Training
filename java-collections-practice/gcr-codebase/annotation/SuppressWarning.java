package com.annotation.todo;

import java.util.ArrayList;

public class SuppressWarning{

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        // Raw ArrayList (without generics)
        ArrayList list = new ArrayList();

        list.add("Java");
        list.add(10);
        list.add(3.14);

        System.out.println(list);
    }
}
