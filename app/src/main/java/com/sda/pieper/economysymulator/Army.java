package com.sda.pieper.economysymulator;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Army {

    private final Population population;

    @Inject
    public Army(Population population) {
        this.population = population;
    }

    public int countCost(){
        int costPerSoldier = 100;
        double percentOfActiveSoldiers = 0.1;
        return (int) (costPerSoldier*percentOfActiveSoldiers*population.getCount());
    }
}
