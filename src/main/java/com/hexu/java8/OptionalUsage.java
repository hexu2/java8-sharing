package com.hexu.java8;

import java.util.Optional;

public class OptionalUsage {


    public static void main(String[] args) {


        Optional<Dish> dishOptional = Optional.empty();
//        dishOptional.get();


        Optional<Dish> dishOptional1 = Optional.of(new Dish("rice", false, 200, Dish.Type.OTHER));

        dishOptional1.get();

        System.out.println(dishOptional1.get());

        Optional<Dish> objectOptional = Optional.ofNullable(null);

        objectOptional.orElseGet(Dish::new);

        objectOptional.orElse(new Dish("rice", false, 200, Dish.Type.OTHER));

//        objectOptional.orElseThrow(RuntimeException::new);


        System.out.println("=================================");
        objectOptional = Optional.of(new Dish("rice", false, 200, Dish.Type.OTHER));
        Dish dish = objectOptional.filter(i -> i.getName() != null).get();

        System.out.println(dish);

        System.out.println("=================================");
        objectOptional = Optional.ofNullable(null);//new Dish("rice", false, 200, Dish.Type.OTHER)

        Optional<String> nameOptional = objectOptional.map(i -> i.getName());

        System.out.println(nameOptional.orElse("no value"));

        System.out.println("=================================");
        objectOptional = Optional.of(new Dish("rice", false, 200, Dish.Type.OTHER));
        System.out.println(objectOptional.isPresent());
        objectOptional.ifPresent(System.out::println);


        System.out.println("=================================");

        System.out.println(getDishName(null));
        System.out.println(getDishNameByOptional(null));


    }

    private static String getDishName(Dish dish){
        String name = null;
        if(null != dish){
            name = dish.getName();
        }

        return name;
    }


    private static String getDishNameByOptional(Dish dish){

        return Optional.ofNullable(dish).map(d -> dish.getName()).orElse("none value");
    }
}
