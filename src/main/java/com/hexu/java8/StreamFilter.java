package com.hexu.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

    public static void main(String[] args) {



        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,7,8,9);

        List<Integer> listResult = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

        System.out.println(listResult);


        listResult = list.stream().distinct().collect(Collectors.toList());


        System.out.println(listResult);

        listResult = list.stream().skip(5).collect(Collectors.toList());

        System.out.println(listResult);

        listResult = list.stream().limit(5).collect(Collectors.toList());


        System.out.println(listResult);




    }
}
