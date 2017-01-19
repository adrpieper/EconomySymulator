package com.sda.pieper.economysymulator;

public class Army {

    private final Population population;

    public Army(Population population) {
        this.population = population;
    }

    public int countCost(){
        int costPerSoldier = 100;
        double percentOfActiveSoldiers = 0.1;
        return (int) (costPerSoldier*percentOfActiveSoldiers*population.getCount());
    }
}
