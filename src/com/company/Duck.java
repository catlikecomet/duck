package com.company;

import java.util.Objects;

public class Duck implements Comparable<Duck> {
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
        if (o.getClass() != o.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ageInMonths);
    }

    @Override
    public int compareTo(Duck other) {
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + ", " + type + ", " + weightInGrams + "g, " + ageInMonths + " months.";
    }
}