package com.sinensia.lambdas;

public class GacMelonPredicate implements MelonPedicate {

    @Override
    public boolean Test(Melon melon) {
        return "gac".equalsIgnoreCase(melon.getType());
    }
}
