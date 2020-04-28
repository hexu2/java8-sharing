package com.hexu.java8.apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterApple {

    public static List<Apple> getGreenApple(List<Apple> apples){

        List<Apple> appleList = new ArrayList<>();
        for(Apple apple: apples){
            if("green".equals(apple.getColor())){
                appleList.add(apple);
            }
        }

        return appleList;

    }

    public static void main(String[] args) {
        List<Apple> appleList = Arrays.asList(new Apple("red", 100), new Apple("green",50));

        List<Apple> greenApples = getGreenApple(appleList);

        System.out.println(greenApples.size());

    }

}
