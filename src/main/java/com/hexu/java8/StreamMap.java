package com.hexu.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {

    public StreamMap() {
    }

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1,2,3,4,5,66, 6,7,8,9,10);

        List<Integer> result =  list.stream().map(i -> i*2).collect(Collectors.toList());


        System.out.println(result);


        list.stream().map(i -> i > 5).forEach(System.out::println);

        System.out.println(result);



    }
}
