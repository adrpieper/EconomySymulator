package com.sda.pieper.economysymulator;


public class Population {
    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
    public int countTaxes() {
        return count*100;
    }
}
