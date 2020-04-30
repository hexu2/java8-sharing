package com.hexu.java8;

public class Dish {

    private String name;

    private boolean vegetarain;

    private int calories;

    private Type type;

    public Dish() {
    }

    public Dish(String name, boolean vegetarain, int calories, Type type) {
        this.name = name;
        this.vegetarain = vegetarain;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVegetarain() {
        return vegetarain;
    }

    public void setVegetarain(boolean vegetarain) {
        this.vegetarain = vegetarain;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public enum  Type {
        MEAT,
        UNKNOW,
        OTHER
    }
}
