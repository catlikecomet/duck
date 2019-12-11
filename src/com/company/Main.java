package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<Duck, String> duck = new HashMap<Duck, String>();

        duck.put(new Duck("Sir Quackalot","Mallard", 100, 17), "duck1");
        duck.put(new Duck("Trevoir", "Birb", 1000, 216), "thatBitch");
        duck.put(new Duck("Duckington","Flap Bird", 250, 120), "duck2");

        //Sorting the hashmap by using a treemap
        TreeMap<Duck, String> mapCopy = new TreeMap<>(duck);
        Set<Map.Entry<Duck, String>> mappings = mapCopy.entrySet();

        for(Map.Entry<Duck, String> mapping : mappings){
            System.out.println(mapping.getKey().toString());
        }
    }
}
