package com.sinensia.lambdas;

import java.util.ArrayList;
import java.util.List;

public final class Filters {
    public Filters(){
        throw new AssertionError("This class can`t be instantiated");
    }
    public static List<Melon> filterByType(List<Melon> melons, String type)
    {
        if(melons == null || type ==null) {
            throw new IllegalArgumentException("Melons/type cannot be null");
        }

        if (melons.isEmpty()){
            return melons;
        }

        List<Melon> result = new ArrayList<>();

        for (Melon m : melons)
        {
            if(m!=null && type.equalsIgnoreCase(m.getType())) {
                result.add(m);
            }
        }
        return result;
    }

    public static List<Melon> filterByWeight(List<Melon> melons, int weight)
    {
        if (weight < 0){
            System.out.println("Tiene que ser postivo");
            return melons;
        }

        if (melons == null) {
            throw new IllegalArgumentException("Melons/type cannot be null and must be positive");
        }

        if (melons.isEmpty()){
            return melons;
        }

        List<Melon> result = new ArrayList<>();

        for (Melon m : melons)
        {
            if(m!=null && m.getWeight() == weight) {
                result.add(m);
            }
        }
        return result;
    }
    public static List<Melon> filterByWeightMasgrande(List<Melon> melons, int weight)
    {
        if (weight < 0){
            System.out.println("Tiene que ser postivo");
            return melons;
        }

        if(melons == null) {
            throw new IllegalArgumentException("Melons/type cannot be null");
        }

        if (melons.isEmpty()){
            return melons;
        }

        List<Melon> result = new ArrayList<>();

        for (Melon m : melons)
        {
            if(m!=null && m.getWeight() >= weight) {
                result.add(m);
            }
        }
        return result;
    }

    public static List<Melon> filterMelon(List<Melon> melons, MelonPedicate predicate){
        if(melons == null) {
            throw new IllegalArgumentException("Melons/type cannot be null");
        }

        if (melons.isEmpty()){
            return melons;
        }

        List<Melon> result = new ArrayList<>();

        for (Melon m : melons)
        {
            if(m!=null && predicate.Test(m)){
                result.add(m);
            }
        }
        return result;
    }
}
