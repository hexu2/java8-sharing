package com.hexu.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String[] args) {

        createStreamFromCollection().forEach(System.out::println);

        System.out.println("==================");
        createStreamFromValues().forEach(System.out::println);

    }



    private static Stream<String> createStreamFromCollection(){
        List<String> list = Arrays.asList("Hello", "world", "I am hexu");

        return list.stream();

    }

    private static Stream<String> createStreamFromValues(){
        return Stream.of("Sam", "Charles", "Hexu", "Liqun", "Horace");
    }
}
