package com.reflection;

import java.lang.reflect.Field;

public class AccessPrivateField {
    public static void main(String[] args) throws Exception {

        // Create object
        Person person = new Person(20);

        // Get Class object
        Class<?> personClass = person.getClass();

        // Get private field "age"
        Field ageField = personClass.getDeclaredField("age");

        // Allow access to private field
        ageField.setAccessible(true);

        // 🔹 Modify private field
        ageField.set(person, 25);

        // 🔹 Retrieve private field
        int ageValue = (int) ageField.get(person);

        System.out.println("Age using Reflection: " + ageValue);
    }
}
