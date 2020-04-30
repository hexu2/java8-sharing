package com.hexu.java8;

public class NullException {

    public static void main(String[] args) {

        String dishName = getDishName(new Dish("Beff", false, 100, Dish.Type.MEAT));

        System.out.println(dishName);

    }


    private static String getDishName(Dish dish){

        String dishName = null;
        if(null != dish){
            dishName = dish.getName();
        }

        return dishName;

    }

}
