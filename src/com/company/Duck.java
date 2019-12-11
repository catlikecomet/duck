package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Duck implements Comparable<Duck>{
    private String name;
    private String type;
    private int weightInGrams;
    private int ageInMonths;

    public Duck(String name, String type, int weightInGrams, int ageInMonths) {
        this.name = name;
        this.type = type;
        this.weightInGrams = weightInGrams;
        this.ageInMonths = ageInMonths;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public int getAgeInMonths() {
        return ageInMonths;
    }

    @Override
    public boolean equals(Object o) {

        if(o.getClass() != o.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public int compareTo(Duck other) {
        return name.compareTo(other.name);
    }

    public static void main(String[] args) {

        List<Duck> ducks = Arrays.asList(
                new Duck("Sir Quackalot", "Mallard", 100, 17),
                new Duck("Duckington","flap bird", 250, 120)
        );

        Collections.sort(ducks);

        System.out.println(ducks.get(0).name);
        System.out.println(ducks.get(1).name);

    }
}