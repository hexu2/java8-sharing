package com.hexu.java8;

import java.util.Arrays;
import java.util.List;

public class StreamReduce {



    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);


        list.stream().reduce(0, (i, j) -> i + j);

        System.out.println(list.stream().reduce(0, (i, j) -> i + j));

        list.stream().reduce(0,Integer::sum);
        System.out.println( list.stream().reduce(0,Integer::sum));

    }
}
