package com.hexu.java8;

import java.util.Optional;

public class OptionalInAction {

    public static void main(String[] args) {

        System.out.println(getInsurancesByOptional(null));

    }


    private static String getInsurancesByOptional(Person person){

        return Optional.ofNullable(person).flatMap(Person::getCar).flatMap(Car::getInsurance).map(Insurance::getName).orElse("xxx");

    }
}