package com.sda.pieper.economysymulator;


import javax.inject.Inject;

public class Population {
    private int count;

    @Inject
    public Population() {
    }

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
