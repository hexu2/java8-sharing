package com.hexu.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMatch {

    public static void main(String[] args) {

        Stream<Integer> stream = Arrays.asList(0,2,4,5,23,54,2,1,45).stream();

        boolean matched = stream.allMatch(i -> i > 10);

        System.out.println(matched);


        System.out.println("================");
        stream = Arrays.asList(0,2,4,5,23,54,2,1,45).stream();
        System.out.println(stream.noneMatch(i -> i == 100));


        System.out.println("================");
        stream = Arrays.asList(0,2,4,5,23,54,2,1,45).stream();
        System.out.println(stream.anyMatch(i -> i == 0));



    }
}
