package com.sinensia.lambdas;

public class HeavyMelonPredicate implements MelonPedicate {
    @Override
    public boolean Test(Melon melon) {
        return melon!=null && melon.getWeight() >= 4000;
    }
}
