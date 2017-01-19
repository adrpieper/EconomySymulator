package com.sda.pieper.economysymulator;



public class State {
    private Economy economy;
    private int gold = 1000;

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
