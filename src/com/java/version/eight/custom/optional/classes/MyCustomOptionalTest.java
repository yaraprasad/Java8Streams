package com.java.version.eight.custom.optional.classes;

public class MyCustomOptionalTest {


    public static void main(String[] args) {
        MyCustomOptional<String> optional = MyCustomOptional.of("Hello World");
        if(optional.isPresent()){
            String value = optional.get();
            System.out.println(value);
        }

        MyCustomOptional<String> optional2 = MyCustomOptional.of("Hello World","Welcome");
        if(optional2.isPresent()){
            String value = optional2.get();
            System.out.println(value);
        }

        MyCustomOptional<String> o1 = MyCustomOptional.of("Hello");
        MyCustomOptional<String> o2 = MyCustomOptional.of("Hello", "World");         // ❌ Exception
        MyCustomOptional<String> o3 = MyCustomOptional.of();                         // ❌ Exception
        MyCustomOptional<String> o4 = MyCustomOptional.of((String) null);            // ❌ Exception
    }
}
