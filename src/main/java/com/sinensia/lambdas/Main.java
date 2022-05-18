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

        System.out.println("MELONES DE UN PESO IGUAL O SUPERIOR A 3000:");
        List<Melon> melonsMas3000 = Filters.filterByWeightMasgrande(melons,3000);
        System.out.println(melonsMas3000);
    }

}
