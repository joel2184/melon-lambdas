package com.sinensia.lambdas;

import java.util.ArrayList;
import java.util.List;

public final class Filters {
    public Filters(){
        throw new AssertionError("This class can`t be instantiated");
    }
    public static List<Melon> filterByType(List<Melon> melons, String type)
    {
        if (melons.isEmpty()){
            return melons;
        }

        List<Melon> result = new ArrayList<>();

        for (Melon m : melons)
        {
            if (type != null && m.getType().equals(type))
                result.add(m);
        }
        return result;
    }
}
