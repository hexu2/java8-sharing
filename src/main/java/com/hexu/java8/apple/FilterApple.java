package com.hexu.java8.apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class FilterApple {

    @FunctionalInterface
    public interface  Filter{
        boolean isTrue(Apple apple);
    }

    public static List<Apple> getGreenApple(List<Apple> apples){

        List<Apple> appleList = new ArrayList<>();
        for(Apple apple: apples){
            if("green".equals(apple.getColor())){
                appleList.add(apple);
            }
        }

        return appleList;

    }

    public static List<Apple> findApple(List<Apple> apples, Filter filter){

        List<Apple> appleList = new ArrayList<>();
        for(Apple apple: apples){
            if(filter.isTrue(apple)){
                appleList.add(apple);
            }
        }

        return appleList;

    }



    public static void main(String[] args) {
        List<Apple> appleList = Arrays.asList(new Apple("red", 100), new Apple("green",50),new Apple("green",50));

        List<Apple> greenApples = getGreenApple(appleList);

        System.out.println(greenApples.size());

        List<Apple> greenApplesNew = findApple(appleList,(apple)->{
            return "red".equals(apple.getColor());
        });

        System.out.println(greenApplesNew.size());


    }

}
