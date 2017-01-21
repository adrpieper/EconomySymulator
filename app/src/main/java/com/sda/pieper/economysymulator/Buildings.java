package com.sda.pieper.economysymulator;


import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Buildings {

    public int countCost() {
        return 100;
    }

    public int countProduction() {
        return 1000;
    }

    @Inject
    public Buildings(){

    }
}
