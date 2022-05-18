package com.sinensia.lambdas;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Melon> melons = Arrays.asList(
                new Melon("Gac", 5500, "Europe"),
                new Melon("Bailan", 6000, "China"),
                new Melon("Watermelon", 1200, "Europe"),
                new Melon("Gac", 3400, "US"),
                new Melon("Bailan", 1300, "China")
        );

        /*
        for (int i = 0; i < melons.size(); ++i) {
            System.out.println(melons.get(i).toString());
        }
         */

        System.out.println("MELONES BAILAN:");
        List<Melon> bailan = Filters.filterByType(melons, "Bailan");
        System.out.println(bailan);

        System.out.println("MELONES DE UN PESO DE 1200g:");
        List<Melon> melons1200 = Filters.filterByWeight(melons,1200);
        System.out.println(melons1200);

        System.out.println("MELONES DE UN PESO IGUAL O SUPERIOR A 4000:");
        List<Melon> melonsMas3000 = Filters.filterByWeightMasgrande(melons,4000);
        System.out.println(melonsMas3000);

        System.out.println("MELONES GAC:");
        List<Melon> melonsGa = Filters.filterMelon(melons, new GacMelonPredicate());
        System.out.println(melonsGa);

        System.out.println("MELONES DE UN PESO IGUAL O SUPERIOR A 4000:");
        List<Melon> melonsHeavy = Filters.filterMelon(melons, new HeavyMelonPredicate());
        System.out.println(melonsHeavy);

        System.out.println("MELONES DE UN SUPER PESO:");
        List<Melon> melonsSuperHeavy = Filters.filterMelon(melons, melon -> melon!=null && melon.getWeight() >= 6000);
        System.out.println(melonsSuperHeavy);

        System.out.println("LISTA DE SANDIAS: ");
        List<Melon> watermelons = Filters.filter(melons, (Melon m)->m.getType().equalsIgnoreCase("watermelon"));
        for(Melon m: watermelons) {
            System.out.println(m);
        }
    }

}
