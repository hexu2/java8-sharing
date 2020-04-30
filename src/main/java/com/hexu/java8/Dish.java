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


    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", vegetarain=" + vegetarain +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }

    public class Type {
        private int ID;

        private String name;

        public Type() {
        }


        public Type(int ID, String name) {
            this.ID = ID;
            this.name = name;
        }


        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Type{" +
                    "ID=" + ID +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
