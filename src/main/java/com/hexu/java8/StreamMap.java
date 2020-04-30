package com.hexu.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {

    private static List<Dish> listDish(){


        List<Dish> menu = Arrays.asList(new Dish("pork",false,800,Dish.Type.MEAT),
                new Dish("pork",false,800,Dish.Type.MEAT),
                new Dish("beff",false,700,Dish.Type.MEAT),
                new Dish("checken",false,1000,Dish.Type.MEAT),
                new Dish("rice",false,200,Dish.Type.MEAT),
                new Dish("pizaa",false,50,Dish.Type.MEAT));

        return menu;
    }

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1,2,3,4,5,66, 6,7,8,9,10);

        List<Integer> result =  list.stream().map(i -> i*2).collect(Collectors.toList());


        System.out.println(result);


        list.stream().map(i -> i > 5).forEach(System.out::println);

        System.out.println(result);


        List<String> disheNames= listDish().stream().map(d -> d.getName()).collect(Collectors.toList());

        System.out.println(disheNames);


        System.out.println("========================");


        String [] words = {"hello", "world"};

        Stream<String[]> streamW =   Arrays.asList(words).stream().map(w -> w.split(""));//Stream<String[]>
//        streamW.collect(Collectors.toList());
//        System.out.println(streamW.collect(Collectors.toList()));
//        streamW.flatMap()

        Stream<String>  stringStream  = streamW.flatMap(Arrays::stream);
        stringStream.distinct().forEach(System.out::println);

    }
}
