package com.hexu.java8;

import com.hexu.java8.apple.Apple;
import sun.applet.Main;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorIntroduce {

    public static void main(String[] args) {

        List<Apple> appleList = Arrays.asList(
                new Apple("red", 100),
                new Apple("green",50),
                new Apple("green",50));


        /*  */
        List<Apple> greeList = appleList.stream().filter(a -> "green".equals(a.getColor())).collect(Collectors.toList());

        Optional.ofNullable(greeList).ifPresent(System.out::println);

        System.out.println(greeList);



        System.out.println(groupByNormal(appleList));
        System.out.println(groupByFunctional(appleList));

        System.out.println(groupByCollector(appleList));


    }



    private static Map<String, List<Apple>> groupByNormal(List<Apple> appleList){

        Map<String, List<Apple>> map = new HashMap<>();
        for(Apple a: appleList){
            List<Apple> list = map.get(a.getColor());
            if(null == list){
                list = new ArrayList<Apple>();
                map.put(a.getColor(),list);
            }

            list.add(a);
        }

        return map;
    }

    private static Map<String, List<Apple>> groupByFunctional(List<Apple> appleList){

        Map<String, List<Apple>> map = new HashMap<>();

        appleList.stream().forEach(apple -> {
            List<Apple> colorList = Optional.ofNullable(map.get(apple.getColor())).orElseGet(()->{
               List<Apple> list = new ArrayList<>();
               map.put(apple.getColor(), list);
               return list;
            });

            colorList.add(apple);
        });


        return map;
    }


    private static Map<String, List<Apple>> groupByCollector(List<Apple> appleList){


        return appleList.stream().collect(Collectors.groupingBy(Apple::getColor));
    }

}
