package com.hexu.java8;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamFind {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(new Integer[]{1,2,4,3,56,12,49,400,2});

        Optional<Integer> optional = stream.filter(i -> i%2 == 0 ).findAny();

        System.out.println(optional.get());

        Optional<Integer> optional2 = Stream.of(new Integer[]{1,2,4,3,56,12,49,400,2}).filter(i -> i%2 == 0 ).findFirst();

        System.out.println(optional2.get());


        Optional<Integer> optiona3 = Stream.of(new Integer[]{1,2,4,3,56,12,49,400,2}).filter(i -> i >10000 ).findAny();

        System.out.println(optiona3.orElse(-1111));

        Optional<Integer> optiona4 = Stream.of(new Integer[]{1,2,4,3,56,12,49,400,2}).filter(i -> i >10000 ).findAny();

        System.out.println(optiona4.isPresent());

    }
}
