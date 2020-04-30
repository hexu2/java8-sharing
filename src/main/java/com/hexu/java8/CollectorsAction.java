package com.hexu.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class CollectorsAction {

    public static void main(String[] args) {

        List<Dish> menu = Arrays.asList(new Dish("pork",false,800,Dish.Type.MEAT),
                new Dish("pork",false,800,Dish.Type.MEAT),
                new Dish("beff",false,700,Dish.Type.MEAT),
                new Dish("checken",false,1000,Dish.Type.MEAT),
                new Dish("rice",false,200,Dish.Type.MEAT),
                new Dish("pizaa",false,50,Dish.Type.MEAT));


        Predicate predicate = null;

        Consumer consumer = null;

        Function function = null;

        Supplier supplier = null;

        ToDoubleFunction toDoubleFunction = null;
        BiConsumer biConsumer = null;

        BiFunction biFunction =null;



    }
}
