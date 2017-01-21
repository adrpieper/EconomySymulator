package com.sda.pieper.economysymulator;


import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class State {
    private Economy economy;
    private int gold = 1000;

    @Inject
    public State(Economy economy) {
        this.economy = economy;
    }

    public void countBalance() {
        gold += economy.countGain();
        gold -= economy.countCost();
    }

    public int getGold() {
        return gold;
    }
}
